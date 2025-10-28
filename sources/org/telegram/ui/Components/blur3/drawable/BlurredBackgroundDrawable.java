package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;

/* loaded from: classes5.dex */
public abstract class BlurredBackgroundDrawable extends Drawable {
    private static Path tmpPath = new Path();
    protected int alpha;
    private final Paint backgroundBitmapPaint;
    protected int backgroundColor;
    private final Paint backgroundColorPaint;
    private final WeakReference bitmapInShader;
    private BitmapShader bitmapShader;
    private final Matrix bitmapShaderMatrix;
    protected final Props boundProps;
    protected BlurredBackgroundColorProvider colorProvider;
    protected boolean inAppKeyboardOptimization;
    private final Paint paintStrokeBottom;
    private final Paint paintStrokeTop;
    protected int shadowColor;
    protected float sourceOffsetX;
    protected float sourceOffsetY;
    protected int strokeColorBottom;
    protected int strokeColorTop;
    private ViewOutlineProvider viewOutlineProvider;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public abstract BlurredBackgroundSource getSource();

    protected void onBoundPropsChanged() {
    }

    protected void onSourceOffsetChange(float f, float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurredBackgroundDrawable() {
        Props props = new Props();
        this.boundProps = props;
        this.alpha = NotificationCenter.didReplacedPhotoInMemCache;
        this.backgroundColorPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.paintStrokeTop = paint;
        Paint paint2 = new Paint(1);
        this.paintStrokeBottom = paint2;
        Paint paint3 = new Paint(1);
        this.backgroundBitmapPaint = paint3;
        this.bitmapShaderMatrix = new Matrix();
        this.bitmapInShader = new WeakReference(null);
        paint3.setFilterBitmap(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        props.strokeWidthTop = AndroidUtilities.dpf2(1.0f);
        props.strokeWidthBottom = AndroidUtilities.dpf2(0.6666667f);
    }

    public void setSourceOffset(float f, float f2) {
        if (this.sourceOffsetX == f && this.sourceOffsetY == f2) {
            return;
        }
        this.sourceOffsetX = f;
        this.sourceOffsetY = f2;
        onSourceOffsetChange(f, f2);
    }

    public void setPadding(int i) {
        Props props = this.boundProps;
        if (props.padding != i) {
            props.padding = i;
            props.build();
            onBoundPropsChanged();
        }
    }

    public void setRadius(float f) {
        Arrays.fill(this.boundProps.radii, f);
        this.boundProps.build();
        onBoundPropsChanged();
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        Props props = this.boundProps;
        float[] fArr = props.radii;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
        props.build();
        onBoundPropsChanged();
    }

    public void setThickness(int i) {
        this.boundProps.liquidThickness = i;
        onBoundPropsChanged();
    }

    public void setIntensity(float f) {
        this.boundProps.liquidIntensity = f;
        onBoundPropsChanged();
    }

    public Rect getPaddedBounds() {
        return this.boundProps.boundsWithPadding;
    }

    public Path getPath() {
        return this.boundProps.path;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.boundProps.bounds.set(rect);
        this.boundProps.build();
        onBoundPropsChanged();
    }

    public BlurredBackgroundSource getUnwrappedSource() {
        BlurredBackgroundSource source = getSource();
        while (source instanceof BlurredBackgroundSourceWrapped) {
            source = ((BlurredBackgroundSourceWrapped) source).getSource();
        }
        return source;
    }

    public void setColorProvider(BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        this.colorProvider = blurredBackgroundColorProvider;
        updateColors();
    }

    public void updateColors() {
        BlurredBackgroundColorProvider blurredBackgroundColorProvider = this.colorProvider;
        if (blurredBackgroundColorProvider == null) {
            return;
        }
        this.backgroundColor = blurredBackgroundColorProvider.getBackgroundColor();
        this.shadowColor = this.colorProvider.getShadowColor();
        this.strokeColorTop = this.colorProvider.getStrokeColorTop();
        this.strokeColorBottom = this.colorProvider.getStrokeColorBottom();
    }

    protected static class Props {
        public int liquidThickness;
        public int padding;
        public float strokeWidthBottom;
        public float strokeWidthTop;
        public final Rect bounds = new Rect();
        public final float[] radii = new float[8];
        public float liquidIntensity = 0.75f;
        public float liquidIndex = 1.5f;
        public float fillAlpha = 1.0f;
        public final Path path = new Path();
        public boolean radiiAreSame = true;
        public final Rect boundsWithPadding = new Rect();

        protected Props() {
        }

        public void build() {
            this.radiiAreSame = BlurredBackgroundDrawable.radiiAreSame(this.radii);
            this.boundsWithPadding.set(this.bounds);
            Rect rect = this.boundsWithPadding;
            int i = this.padding;
            rect.inset(i, i);
            this.path.rewind();
            Path path = this.path;
            Rect rect2 = this.boundsWithPadding;
            path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.radii, Path.Direction.CW);
            this.path.close();
        }
    }

    public ViewOutlineProvider getViewOutlineProvider() {
        if (this.viewOutlineProvider == null) {
            this.viewOutlineProvider = new ViewOutlineProvider() { // from class: org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    Props props = BlurredBackgroundDrawable.this.boundProps;
                    BlurredBackgroundDrawable.getOutline(outline, props.boundsWithPadding, props.radii);
                }
            };
        }
        return this.viewOutlineProvider;
    }

    protected static void getOutline(Outline outline, Rect rect, float[] fArr) {
        if (radiiAreSame(fArr)) {
            outline.setRoundRect(rect, fArr[0]);
            return;
        }
        Path path = tmpPath;
        if (path == null) {
            tmpPath = new Path();
        } else {
            path.rewind();
        }
        tmpPath.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(tmpPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean radiiAreSame(float[] fArr) {
        float f = fArr[0];
        return f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7];
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public static void drawStroke(Canvas canvas, Rect rect, float[] fArr, float f, boolean z, Paint paint) {
        drawStroke(canvas, rect.left, rect.top, rect.right, rect.bottom, fArr, f, z, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        if (r7 == r16[7]) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7 == r16[3]) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void drawStroke(Canvas canvas, float f, float f2, float f3, float f4, float[] fArr, float f5, boolean z, Paint paint) {
        boolean z2 = true;
        if (z) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            if (f6 == f7) {
                float f8 = fArr[2];
                if (f7 == f8) {
                }
            }
            z2 = false;
        } else {
            float f9 = fArr[4];
            float f10 = fArr[5];
            if (f9 == f10) {
                float f11 = fArr[6];
                if (f10 == f11) {
                }
            }
            z2 = false;
        }
        float f12 = f5 / 2.0f;
        if (z) {
            if (z2) {
                canvas.save();
                if (canvas.clipRect(f, f2, f3, MathUtils.clamp((fArr[0] * 2.0f) + f2, f2, f4))) {
                    float f13 = fArr[0];
                    canvas.drawRoundRect(f - f12, f2 + f12, f3 + f12, f12 + f4, f13, f13, paint);
                }
                canvas.restore();
                return;
            }
            return;
        }
        if (z2) {
            canvas.save();
            if (canvas.clipRect(f, MathUtils.clamp(f4 - (fArr[4] * 2.0f), f2, f4), f3, f4)) {
                float f14 = fArr[4];
                canvas.drawRoundRect(f - f12, f2 - f12, f3 + f12, f4 - f12, f14, f14, paint);
            }
            canvas.restore();
        }
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        drawStroke(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, f, f2, z, paint);
    }

    public static void drawStroke(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        float f7 = f6 / 2.0f;
        canvas.save();
        if (z) {
            float f8 = f - f7;
            float f9 = f3 + f7;
            if (canvas.clipRect(f8, f2, f9, MathUtils.clamp(f2 + f5, f2, f4))) {
                canvas.drawRoundRect(f8, f2 + f7, f9, f4 + f7, f5, f5, paint);
            }
        } else {
            float f10 = f - f7;
            float f11 = f3 + f7;
            if (canvas.clipRect(f10, MathUtils.clamp(f4 - f5, f2, f4), f11, f4)) {
                canvas.drawRoundRect(f10, f2 - f7, f11, f4 - f7, f5, f5, paint);
            }
        }
        canvas.restore();
    }

    public void enableInAppKeyboardOptimization() {
        this.inAppKeyboardOptimization = true;
    }

    protected void drawSource(Canvas canvas, BlurredBackgroundSource blurredBackgroundSource) {
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceColor) {
            drawSourceColor(canvas, (BlurredBackgroundSourceColor) blurredBackgroundSource);
            return;
        }
        if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
            drawSourceBitmap(canvas, (BlurredBackgroundSourceBitmap) blurredBackgroundSource);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (blurredBackgroundSource instanceof BlurredBackgroundSourceRenderNode)) {
            drawSourceRenderNode(canvas, (BlurredBackgroundSourceRenderNode) blurredBackgroundSource);
        } else if (blurredBackgroundSource instanceof BlurredBackgroundSourceWrapped) {
            drawSource(canvas, ((BlurredBackgroundSourceWrapped) blurredBackgroundSource).getSource());
        }
    }

    private void drawSourceColor(Canvas canvas, BlurredBackgroundSourceColor blurredBackgroundSourceColor) {
        int compositeColors = ColorUtils.compositeColors(this.backgroundColor, blurredBackgroundSourceColor.getColor());
        this.backgroundColorPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f), this.shadowColor);
        this.backgroundColorPaint.setColor(compositeColors);
        this.backgroundColorPaint.setAlpha(this.alpha);
        canvas.drawPath(this.boundProps.path, this.backgroundColorPaint);
        drawStrokeInternalIfNeeded(canvas);
    }

    private void drawSourceBitmap(Canvas canvas, BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap) {
        Bitmap bitmap = blurredBackgroundSourceBitmap.getBitmap();
        Bitmap bitmap2 = (Bitmap) this.bitmapInShader.get();
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (this.bitmapShader == null || bitmap != bitmap2) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            this.backgroundBitmapPaint.setShader(bitmapShader);
        }
        this.backgroundBitmapPaint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f), this.shadowColor);
        this.backgroundBitmapPaint.setAlpha(this.alpha);
        this.backgroundColorPaint.setColor(this.backgroundColor);
        this.backgroundColorPaint.setAlpha(this.alpha);
        this.bitmapShaderMatrix.set(blurredBackgroundSourceBitmap.getMatrix());
        this.bitmapShaderMatrix.postTranslate(-this.sourceOffsetX, -this.sourceOffsetY);
        this.bitmapShader.setLocalMatrix(this.bitmapShaderMatrix);
        canvas.drawPath(this.boundProps.path, this.backgroundBitmapPaint);
        if (Color.alpha(this.backgroundColor) > 0) {
            canvas.drawPath(this.boundProps.path, this.backgroundColorPaint);
        }
        drawStrokeInternalIfNeeded(canvas);
    }

    private void drawStrokeInternalIfNeeded(Canvas canvas) {
        if (this.strokeColorTop == 0 && this.strokeColorBottom == 0) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.boundProps.path);
        int i = this.strokeColorTop;
        if (i != 0) {
            this.paintStrokeTop.setColor(i);
            this.paintStrokeTop.setStrokeWidth(this.boundProps.strokeWidthTop);
            Props props = this.boundProps;
            drawStroke(canvas, props.boundsWithPadding, props.radii, props.strokeWidthTop, true, this.paintStrokeTop);
        }
        int i2 = this.strokeColorBottom;
        if (i2 != 0) {
            this.paintStrokeBottom.setColor(i2);
            this.paintStrokeBottom.setStrokeWidth(this.boundProps.strokeWidthBottom);
            Props props2 = this.boundProps;
            drawStroke(canvas, props2.boundsWithPadding, props2.radii, props2.strokeWidthBottom, false, this.paintStrokeBottom);
        }
        canvas.restore();
    }

    private void drawSourceRenderNode(Canvas canvas, BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode) {
        if (canvas.isHardwareAccelerated()) {
            return;
        }
        drawSource(canvas, blurredBackgroundSourceRenderNode.getFallbackSource());
    }
}
