package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

/* loaded from: classes4.dex */
public final class MultiLayoutTypingAnimator implements Choreographer.FrameCallback {
    private static final LinearGradient GRADIENT;
    private static final Matrix GRAD_MTX = new Matrix();
    private static final Paint MASK_PAINT;
    private View invalidateTarget;
    private View lastInvalidatedView;
    private Runnable onFinishRunnable;
    private final Choreographer choreo = Choreographer.getInstance();
    private List blocks = new ArrayList();
    private final ArrayList blockAlphas = new ArrayList();
    private int curBlockIdx = 0;
    private int curLineIdx = 0;
    private float xPosition = 0.0f;
    private boolean running = false;
    private boolean finished = true;
    private long lastFrameNs = 0;
    private float speedPxPerSec = AndroidUtilities.dp(40.0f);

    public interface Block {
        Layout getLayout();

        View getParentView();
    }

    public interface Renderer {
        void draw(Canvas canvas);
    }

    private void applyBlockAlphas(float f) {
        int size = this.blocks.size();
        View view = null;
        int i = 0;
        while (i < size) {
            Block block = (Block) this.blocks.get(i);
            float f2 = (this.finished || i <= this.curBlockIdx) ? 1.0f : 0.0f;
            float floatValue = i < this.blockAlphas.size() ? ((Float) this.blockAlphas.get(i)).floatValue() : f2;
            if (floatValue == f2) {
                f2 = floatValue;
            } else if (f > 0.0f) {
                float f3 = f / 0.2f;
                f2 = f2 > floatValue ? Math.min(f2, f3 + floatValue) : Math.max(f2, floatValue - f3);
            }
            if (i < this.blockAlphas.size() && f2 != floatValue) {
                this.blockAlphas.set(i, Float.valueOf(f2));
            }
            View parentView = block.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f2) {
                    parentView.setAlpha(f2);
                }
                view = parentView;
            }
            i++;
        }
    }

    private void resetBlockAlphas() {
        int size = this.blockAlphas.size();
        for (int i = 0; i < size; i++) {
            this.blockAlphas.set(i, Float.valueOf(1.0f));
        }
        int size2 = this.blocks.size();
        View view = null;
        for (int i2 = 0; i2 < size2; i2++) {
            View parentView = ((Block) this.blocks.get(i2)).getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != 1.0f) {
                    parentView.setAlpha(1.0f);
                }
                view = parentView;
            }
        }
    }

    public float getBlockAlpha(Block block) {
        int indexOf = indexOf(block);
        if (indexOf < 0 || indexOf >= this.blockAlphas.size()) {
            return 1.0f;
        }
        return ((Float) this.blockAlphas.get(indexOf)).floatValue();
    }

    private void invalidate() {
        Block block;
        int i = this.curBlockIdx;
        View parentView = (i < 0 || i >= this.blocks.size() || (block = (Block) this.blocks.get(this.curBlockIdx)) == null) ? null : block.getParentView();
        if (parentView != null) {
            parentView.invalidate();
            View view = this.lastInvalidatedView;
            if (view != null && view != parentView) {
                view.invalidate();
            }
            this.lastInvalidatedView = parentView;
            return;
        }
        View view2 = this.invalidateTarget;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    public void setBlocks(List list) {
        if (!this.blocks.isEmpty() && this.curBlockIdx >= this.blocks.size()) {
            int size = this.blocks.size() - 1;
            this.curBlockIdx = size;
            Layout layout = ((Block) this.blocks.get(size)).getLayout();
            int max = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.curLineIdx = max;
            this.xPosition = layout == null ? 0.0f : layout.getLineWidth(max);
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.blocks = list;
        recalcSpeed();
        this.finished = isAtAbsoluteEnd();
        while (this.blockAlphas.size() > this.blocks.size()) {
            this.blockAlphas.remove(r5.size() - 1);
        }
        int size2 = this.blockAlphas.size();
        while (size2 < this.blocks.size()) {
            this.blockAlphas.add(Float.valueOf((this.finished || size2 <= this.curBlockIdx) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.finished && !this.running) {
            start();
        }
        applyBlockAlphas(0.0f);
        invalidate();
    }

    public void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        if (isAtAbsoluteEnd()) {
            this.finished = true;
        }
        this.lastFrameNs = 0L;
        this.choreo.postFrameCallback(this);
    }

    public boolean isRunning() {
        return this.running;
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinishRunnable = runnable;
    }

    public int getFadeLineIndex(Block block) {
        if (isFadeBlock(block)) {
            return this.curLineIdx;
        }
        return -1;
    }

    public float getFadeXPosition(Block block) {
        if (isFadeBlock(block)) {
            return this.xPosition;
        }
        return 0.0f;
    }

    public boolean needDraw(Block block) {
        int indexOf = indexOf(block);
        if (indexOf < 0 || this.blocks.isEmpty()) {
            return false;
        }
        int i = this.curBlockIdx;
        return indexOf < i || indexOf <= i;
    }

    public boolean isFadeBlock(Block block) {
        Layout layout;
        return indexOf(block) == this.curBlockIdx && (layout = block.getLayout()) != null && this.curLineIdx < layout.getLineCount();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float f;
        if (this.running) {
            if (this.lastFrameNs != 0) {
                f = (j - r0) * 1.0E-9f;
                advance(f);
            } else {
                f = 0.0f;
            }
            this.lastFrameNs = j;
            applyBlockAlphas(f);
            invalidate();
            if (this.finished) {
                this.running = false;
                resetBlockAlphas();
                Runnable runnable = this.onFinishRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.onFinishRunnable = null;
                    return;
                }
                return;
            }
            this.choreo.postFrameCallback(this);
        }
    }

    private void advance(float f) {
        if (this.blocks.isEmpty() || f <= 0.0f) {
            this.finished = this.blocks.isEmpty();
            return;
        }
        float f2 = this.speedPxPerSec * f;
        while (true) {
            if (f2 <= 0.0f) {
                break;
            }
            if (this.curBlockIdx >= this.blocks.size()) {
                this.finished = true;
                break;
            }
            Layout layout = ((Block) this.blocks.get(this.curBlockIdx)).getLayout();
            if (layout == null || layout.getLineCount() == 0) {
                this.curBlockIdx++;
                this.curLineIdx = 0;
                this.xPosition = 0.0f;
            } else {
                if (this.curLineIdx >= layout.getLineCount()) {
                    int lineCount = layout.getLineCount() - 1;
                    this.curLineIdx = lineCount;
                    this.xPosition = lineWidth(layout, lineCount);
                }
                float lineWidth = lineWidth(layout, this.curLineIdx);
                if (lineWidth <= 0.001f) {
                    if (nextLineOrBlock(layout)) {
                        break;
                    }
                } else {
                    float f3 = this.xPosition;
                    float f4 = lineWidth - f3;
                    if (f4 <= 0.001f) {
                        if (nextLineOrBlock(layout)) {
                            break;
                        }
                    } else {
                        if (f2 < f4) {
                            f4 = f2;
                        }
                        float f5 = f3 + f4;
                        this.xPosition = f5;
                        f2 -= f4;
                        if (lineWidth - f5 <= 0.001f && !nextLineOrBlock(layout)) {
                            f2 = 0.0f;
                        }
                    }
                }
            }
        }
        this.finished = isAtAbsoluteEnd();
    }

    private boolean nextLineOrBlock(Layout layout) {
        int i = this.curLineIdx + 1;
        this.curLineIdx = i;
        this.xPosition = 0.0f;
        if (i >= layout.getLineCount()) {
            int i2 = this.curBlockIdx + 1;
            this.curBlockIdx = i2;
            this.curLineIdx = 0;
            this.xPosition = 0.0f;
            if (i2 >= this.blocks.size()) {
                return true;
            }
        }
        return false;
    }

    private void recalcSpeed() {
        float computeRemainingPixels = computeRemainingPixels();
        float dp = AndroidUtilities.dp(40.0f);
        if (computeRemainingPixels <= 0.001f) {
            this.speedPxPerSec = dp;
        } else {
            this.speedPxPerSec = Math.max(dp, computeRemainingPixels / 1.05f);
        }
    }

    private float computeRemainingPixels() {
        float f = 0.0f;
        if (this.blocks.isEmpty()) {
            return 0.0f;
        }
        int i = this.curBlockIdx;
        while (i < this.blocks.size()) {
            Layout layout = ((Block) this.blocks.get(i)).getLayout();
            if (layout != null) {
                int min = i == this.curBlockIdx ? Math.min(Math.max(this.curLineIdx, 0), Math.max(0, layout.getLineCount() - 1)) : 0;
                for (int i2 = min; i2 < layout.getLineCount(); i2++) {
                    float lineWidth = lineWidth(layout, i2);
                    if (lineWidth > 0.001f) {
                        if (i == this.curBlockIdx && i2 == min) {
                            lineWidth -= this.xPosition;
                            if (lineWidth <= 0.001f) {
                            }
                        }
                        f += lineWidth;
                    }
                }
            }
            i++;
        }
        return f;
    }

    private boolean isAtAbsoluteEnd() {
        if (this.blocks.isEmpty()) {
            return true;
        }
        int size = this.blocks.size() - 1;
        Layout layout = null;
        while (size >= 0) {
            layout = ((Block) this.blocks.get(size)).getLayout();
            if (layout != null && layout.getLineCount() > 0) {
                break;
            }
            size--;
        }
        if (size < 0 || layout == null) {
            return true;
        }
        int i = this.curBlockIdx;
        if (i < size) {
            return false;
        }
        if (i > size) {
            return true;
        }
        int lineCount = layout.getLineCount() - 1;
        return this.curLineIdx >= lineCount && this.xPosition >= lineWidth(layout, lineCount) - 0.001f;
    }

    private float lineWidth(Layout layout, int i) {
        float lineRight = layout.getLineRight(i) - layout.getLineLeft(i);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public int indexOf(Block block) {
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            if (this.blocks.get(i) == block) {
                return i;
            }
        }
        return -1;
    }

    static {
        Paint paint = new Paint(1);
        MASK_PAINT = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        GRADIENT = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, Layout layout, int i, float f) {
        drawLayoutWithLastLineFade(canvas, layout, i, f, null);
    }

    public static void drawLayoutWithLastLineFade(Canvas canvas, final Layout layout, int i, float f, Renderer renderer) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i < 0 || i >= lineCount) {
            return;
        }
        Renderer renderer2 = renderer != null ? renderer : new Renderer() { // from class: org.telegram.ui.MultiLayoutTypingAnimator$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.MultiLayoutTypingAnimator.Renderer
            public final void draw(Canvas canvas2) {
                layout.draw(canvas2);
            }
        };
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            renderer2.draw(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i);
        float lineRight = layout.getLineRight(i);
        float min = Math.min(lineLeft, lineRight);
        float max = Math.max(lineLeft, lineRight);
        if (max <= min) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i);
        float f2 = max - min;
        float clamp = MathUtils.clamp(f, 0.0f, f2);
        float f3 = clamp / f2;
        if (clamp <= 0.0f) {
            return;
        }
        if (clamp >= f2) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            renderer2.draw(canvas);
            canvas.restore();
            return;
        }
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f2, f3);
        AndroidUtilities.dp(50.0f);
        float f4 = lineTop;
        float f5 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f4, max, f5, null);
        canvas.save();
        canvas.clipRect(min, f4, max, f5);
        renderer2.draw(canvas);
        canvas.restore();
        Matrix matrix = GRAD_MTX;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(lerp, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(f2 - lerp, 0.0f);
        }
        GRADIENT.setLocalMatrix(matrix);
        canvas.drawRect(min, f4, max, f5, MASK_PAINT);
        canvas.restoreToCount(saveLayer);
    }
}
