package org.telegram.ui.Components.Paint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.core.graphics.ColorUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Size;

/* loaded from: classes5.dex */
public class Painting {
    private Path activePath;
    private Shape activeShape;
    private RectF activeStrokeBounds;
    private Slice backupSlice;
    private Texture bitmapBlurTexture;
    private Texture bitmapTexture;
    private final BlurringShader.BlurManager blurManager;
    private Bitmap bluredBitmap;
    private Texture bluredTexture;
    private Brush brush;
    private ByteBuffer dataBuffer;
    private PaintingDelegate delegate;
    public boolean hasBlur;
    private float helperAlpha;
    private ValueAnimator helperAnimator;
    private float helperApplyAlpha;
    private ValueAnimator helperApplyAnimator;
    private Shape helperShape;
    private boolean helperShown;
    private int helperTexture;
    private Bitmap imageBitmap;
    private Paint imageBitmapPaint;
    private int imageBitmapRotation;
    private Texture originalBitmapTexture;
    private int paintTexture;
    private boolean paused;
    private float[] projection;
    private float[] renderProjection;
    private RenderView renderView;
    private int reusableFramebuffer;
    private Map shaders;
    private Size size;
    private int suppressChangesCounter;
    private ByteBuffer textureBuffer;
    private ByteBuffer vertexBuffer;
    private HashMap brushTextures = new HashMap();
    private int[] buffers = new int[1];
    public boolean masking = false;
    private RenderState renderState = new RenderState();

    public interface PaintingDelegate {
        void contentChanged();

        DispatchQueue requestDispatchQueue();

        UndoStore requestUndoStore();
    }

    public static class PaintingData {
        public Bitmap bitmap;
        public ByteBuffer data;

        PaintingData(Bitmap bitmap, ByteBuffer byteBuffer) {
            this.bitmap = bitmap;
            this.data = byteBuffer;
        }
    }

    public Painting(Size size, Bitmap bitmap, int i, BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
        this.size = size;
        this.imageBitmap = bitmap;
        this.imageBitmapRotation = i;
        this.dataBuffer = ByteBuffer.allocateDirect(((int) size.width) * ((int) size.height) * 4);
        Size size2 = this.size;
        this.projection = GLMatrix.LoadOrtho(0.0f, size2.width, 0.0f, size2.height, -1.0f, 1.0f);
        if (this.vertexBuffer == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.vertexBuffer = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(this.size.width);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(this.size.height);
        this.vertexBuffer.putFloat(this.size.width);
        this.vertexBuffer.putFloat(this.size.height);
        this.vertexBuffer.rewind();
        if (this.textureBuffer == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.textureBuffer = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            this.textureBuffer.putFloat(0.0f);
            this.textureBuffer.putFloat(0.0f);
            this.textureBuffer.putFloat(1.0f);
            this.textureBuffer.putFloat(0.0f);
            this.textureBuffer.putFloat(0.0f);
            this.textureBuffer.putFloat(1.0f);
            this.textureBuffer.putFloat(1.0f);
            this.textureBuffer.putFloat(1.0f);
            this.textureBuffer.rewind();
        }
    }

    public Painting asMask() {
        this.masking = true;
        return this;
    }

    public void setDelegate(PaintingDelegate paintingDelegate) {
        this.delegate = paintingDelegate;
    }

    public void setRenderView(RenderView renderView) {
        this.renderView = renderView;
    }

    public Size getSize() {
        return this.size;
    }

    public RectF getBounds() {
        Size size = this.size;
        return new RectF(0.0f, 0.0f, size.width, size.height);
    }

    private boolean isSuppressingChanges() {
        return this.suppressChangesCounter > 0;
    }

    private void beginSuppressingChanges() {
        this.suppressChangesCounter++;
    }

    private void endSuppressingChanges() {
        this.suppressChangesCounter--;
    }

    public void setBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (this.bitmapTexture == null) {
            this.bitmapTexture = new Texture(bitmap);
        }
        if (this.bitmapBlurTexture == null) {
            this.bitmapBlurTexture = new Texture(bitmap2);
        }
        if (this.masking && this.originalBitmapTexture == null) {
            this.originalBitmapTexture = new Texture(this.imageBitmap);
        }
    }

    public void setHelperShape(final Shape shape) {
        if (this.helperApplyAnimator != null) {
            return;
        }
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$HnpW7_pJL_0aYt1ui_aPbxF2g6w(Painting.this, shape);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$HnpW7_pJL_0aYt1ui_aPbxF2g6w(final Painting painting, Shape shape) {
        if (shape != null && painting.helperTexture == 0) {
            painting.helperTexture = Texture.generateTexture(painting.size);
        }
        if (painting.helperShown != (shape != null)) {
            painting.helperShown = shape != null;
            ValueAnimator valueAnimator = painting.helperAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                painting.helperAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(painting.helperAlpha, painting.helperShown ? 1.0f : 0.0f);
            painting.helperAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    r0.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda14
                        @Override // java.lang.Runnable
                        public final void run() {
                            Painting.$r8$lambda$9XyceSV8btCEil5MQI-4naFiOdQ(Painting.this, valueAnimator2);
                        }
                    });
                }
            });
            painting.helperAnimator.addListener(painting.new 1());
            painting.helperAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            painting.helperAnimator.start();
            painting.helperShape = shape;
            PaintingDelegate paintingDelegate = painting.delegate;
            if (paintingDelegate != null) {
                paintingDelegate.contentChanged();
            }
            if (painting.helperShown) {
                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                return;
            }
            return;
        }
        if (shape != painting.helperShape) {
            painting.helperShape = shape;
            PaintingDelegate paintingDelegate2 = painting.delegate;
            if (paintingDelegate2 != null) {
                paintingDelegate2.contentChanged();
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$9XyceSV8btCEil5MQI-4naFiOdQ(Painting painting, ValueAnimator valueAnimator) {
        painting.getClass();
        painting.helperAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PaintingDelegate paintingDelegate = painting.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
    }

    class 1 extends AnimatorListenerAdapter {
        1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Painting.this.helperAnimator = null;
            Painting.this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Painting.1.$r8$lambda$Bvg8vy1mCO7AEU9TV83zkXlvZ-A(Painting.1.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Bvg8vy1mCO7AEU9TV83zkXlvZ-A(1 r1) {
            if (Painting.this.delegate != null) {
                Painting.this.delegate.contentChanged();
            }
        }
    }

    public boolean applyHelperShape() {
        if (this.helperShape == null || !this.helperShown || this.helperTexture == 0) {
            return false;
        }
        ValueAnimator valueAnimator = this.helperApplyAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.helperApplyAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                r0.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        Painting.$r8$lambda$IGldvW9jX_bPArw7im2mBZZaeTc(Painting.this, valueAnimator2);
                    }
                });
            }
        });
        this.helperApplyAnimator.addListener(new 2());
        this.helperApplyAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.helperApplyAnimator.setDuration(350L);
        this.helperApplyAnimator.start();
        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
        return true;
    }

    public static /* synthetic */ void $r8$lambda$IGldvW9jX_bPArw7im2mBZZaeTc(Painting painting, ValueAnimator valueAnimator) {
        painting.getClass();
        painting.helperApplyAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PaintingDelegate paintingDelegate = painting.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
    }

    class 2 extends AnimatorListenerAdapter {
        2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Painting.this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Painting.2.$r8$lambda$hGEJGcoJEtkqnGrNzN9mvQO9YpQ(Painting.2.this);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$hGEJGcoJEtkqnGrNzN9mvQO9YpQ(2 r8) {
            if (Painting.this.helperShape == null) {
                Painting.this.helperApplyAnimator = null;
                return;
            }
            int currentColor = Painting.this.renderView.getCurrentColor();
            Painting painting = Painting.this;
            painting.paintStrokeInternal(painting.activePath, false, false);
            Painting painting2 = Painting.this;
            Slice commitPathInternal = painting2.commitPathInternal(painting2.activePath, currentColor, new RectF(Painting.this.activeStrokeBounds));
            Painting.this.clearStrokeInternal();
            Shape shape = Painting.this.helperShape;
            shape.getBounds(Painting.this.activeStrokeBounds = new RectF());
            Painting.this.restoreSliceInternal(Painting.this.commitShapeInternal(shape, currentColor, new RectF(Painting.this.activeStrokeBounds)), false);
            Painting.this.restoreSliceInternal(commitPathInternal, false);
            Painting.this.commitShapeInternal(shape, currentColor, null);
            Painting.this.helperShape = null;
            Painting.this.helperApplyAlpha = 0.0f;
            Painting.this.helperApplyAnimator = null;
        }
    }

    public void paintShape(final Shape shape, final Runnable runnable) {
        if (shape == null) {
            return;
        }
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$6zDD4jlqPTunAMqdAHpiFV8uMrg(Painting.this, shape, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$6zDD4jlqPTunAMqdAHpiFV8uMrg(Painting painting, Shape shape, Runnable runnable) {
        painting.activeShape = shape;
        if (painting.activeStrokeBounds == null) {
            painting.activeStrokeBounds = new RectF();
        }
        painting.activeShape.getBounds(painting.activeStrokeBounds);
        PaintingDelegate paintingDelegate = painting.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void paintStroke(final Path path, final boolean z, final boolean z2, final Runnable runnable) {
        if (this.helperApplyAnimator != null) {
            return;
        }
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$yYL8uXL_KDMVVUwpVkzxx_aYrtE(Painting.this, path, z, z2, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$yYL8uXL_KDMVVUwpVkzxx_aYrtE(Painting painting, Path path, boolean z, boolean z2, Runnable runnable) {
        painting.paintStrokeInternal(path, z, z2);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void paintStrokeInternal(Path path, boolean z, boolean z2) {
        RectF rectF;
        this.activePath = path;
        if (path == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getPaintTexture(), 0);
        Utils.HasGLError();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            Size size = this.size;
            GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            if (this.shaders == null) {
                return;
            }
            Brush brush = path.getBrush();
            Shader shader = (Shader) this.shaders.get(brush.getShaderName(2));
            if (shader == null) {
                return;
            }
            GLES20.glUseProgram(shader.program);
            Texture texture = (Texture) this.brushTextures.get(Integer.valueOf(brush.getStampResId()));
            if (texture == null) {
                texture = new Texture(brush.getStamp());
                this.brushTextures.put(Integer.valueOf(brush.getStampResId()), texture);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, texture.texture());
            GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.projection));
            GLES20.glUniform1i(shader.getUniform("texture"), 0);
            if (!z2) {
                this.renderState.viewportScale = this.renderView.getScaleX();
            } else {
                this.renderState.viewportScale = 1.0f;
            }
            rectF = Render.RenderPath(path, this.renderState, z2);
        } else {
            rectF = null;
        }
        GLES20.glBindFramebuffer(36160, 0);
        PaintingDelegate paintingDelegate = this.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
        RectF rectF2 = this.activeStrokeBounds;
        if (rectF2 != null) {
            rectF2.union(rectF);
        } else {
            this.activeStrokeBounds = rectF;
        }
    }

    public void commitShape(final Shape shape, final int i) {
        if (shape == null || this.shaders == null) {
            return;
        }
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$PSP75msXOeHsFeQNbu5ktyDEClQ(Painting.this, shape, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$PSP75msXOeHsFeQNbu5ktyDEClQ(Painting painting, Shape shape, int i) {
        painting.commitShapeInternal(shape, i, painting.activeStrokeBounds);
        painting.activeStrokeBounds = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Slice commitShapeInternal(Shape shape, int i, RectF rectF) {
        Brush brush = shape.brush;
        if (brush == null) {
            brush = this.brush;
        }
        Slice registerUndo = registerUndo(rectF, this.blurManager != null && (brush instanceof Brush.Blurer));
        beginSuppressingChanges();
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getTexture(), 0);
        Size size = this.size;
        GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
        Shader shader = (Shader) this.shaders.get(brush.getShaderName(1));
        if (shader == null) {
            return null;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.projection));
        GLES20.glUniform1i(shader.getUniform("texture"), 0);
        GLES20.glUniform1i(shader.getUniform("mask"), 1);
        Shader.SetColorUniform(shader.getUniform("color"), i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, getPaintTexture());
        if ((brush instanceof Brush.Blurer) && this.bluredTexture != null) {
            GLES20.glUniform1i(shader.getUniform("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.bluredTexture.texture());
        }
        if (brush instanceof Brush.Shape) {
            GLES20.glUniform1i(shader.getUniform(TeXSymbolParser.TYPE_ATTR), shape.getType());
            int uniform = shader.getUniform("resolution");
            Size size2 = this.size;
            GLES20.glUniform2f(uniform, size2.width, size2.height);
            GLES20.glUniform2f(shader.getUniform("center"), shape.centerX, shape.centerY);
            GLES20.glUniform2f(shader.getUniform("radius"), shape.radiusX, shape.radiusY);
            GLES20.glUniform1f(shader.getUniform("thickness"), shape.thickness);
            GLES20.glUniform1f(shader.getUniform("rounding"), shape.rounding);
            GLES20.glUniform2f(shader.getUniform("middle"), shape.middleX, shape.middleY);
            GLES20.glUniform1f(shader.getUniform("rotation"), shape.rotation);
            GLES20.glUniform1i(shader.getUniform("fill"), shape.fill ? 1 : 0);
            GLES20.glUniform1f(shader.getUniform("arrowTriangleLength"), shape.arrowTriangleLength);
            GLES20.glUniform1i(shader.getUniform("composite"), 1);
            GLES20.glUniform1i(shader.getUniform("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        if (this.delegate != null && !isSuppressingChanges()) {
            this.delegate.contentChanged();
        }
        endSuppressingChanges();
        this.renderState.reset();
        this.helperApplyAlpha = 0.0f;
        this.helperShown = false;
        this.helperAlpha = 0.0f;
        this.helperShape = null;
        this.activePath = null;
        this.activeShape = null;
        return registerUndo;
    }

    public void commitPath(Path path, int i) {
        commitPath(path, i, true, null);
    }

    public void commitPath(final Path path, final int i, final boolean z, final Runnable runnable) {
        if (this.shaders == null || this.brush == null) {
            return;
        }
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$or8U5pfVR601M6r9_0wpQULHpqI(Painting.this, path, i, z, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$or8U5pfVR601M6r9_0wpQULHpqI(Painting painting, Path path, int i, boolean z, Runnable runnable) {
        painting.commitPathInternal(path, i, z ? painting.activeStrokeBounds : null);
        if (z) {
            painting.activeStrokeBounds = null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Slice commitPathInternal(Path path, int i, RectF rectF) {
        Slice registerUndo;
        PaintingDelegate paintingDelegate;
        boolean z;
        Brush brush = this.brush;
        if (path != null) {
            brush = path.getBrush();
        }
        if (this.blurManager != null && (((z = brush instanceof Brush.Blurer)) || (brush instanceof Brush.Eraser))) {
            registerUndo = registerDoubleUndo(rectF, this.hasBlur);
            this.hasBlur = z;
        } else {
            registerUndo = registerUndo(rectF, false);
        }
        beginSuppressingChanges();
        int i2 = (this.blurManager == null || !((brush instanceof Brush.Blurer) || (brush instanceof Brush.Eraser))) ? 1 : 2;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 < i2) {
                GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
                int texture = getTexture();
                if (this.blurManager != null && (((brush instanceof Brush.Blurer) && i3 == 0) || ((brush instanceof Brush.Eraser) && i3 == 1))) {
                    Texture texture2 = this.bitmapBlurTexture;
                    texture = texture2 != null ? texture2.texture() : 0;
                }
                if (i3 == 1 && (brush instanceof Brush.Blurer)) {
                    brush = new Brush.Eraser();
                }
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, texture, 0);
                Size size = this.size;
                GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
                Shader shader = (Shader) this.shaders.get(brush.getShaderName(1));
                if (shader == null) {
                    return null;
                }
                GLES20.glUseProgram(shader.program);
                GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.projection));
                GLES20.glUniform1i(shader.getUniform("texture"), 0);
                GLES20.glUniform1i(shader.getUniform("mask"), 1);
                Shader.SetColorUniform(shader.getUniform("color"), ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * brush.getOverrideAlpha())));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, texture);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, getPaintTexture());
                if (brush instanceof Brush.Blurer) {
                    GLES20.glUniform1i(shader.getUniform("blured"), 2);
                    GLES20.glActiveTexture(33986);
                    BlurringShader.BlurManager blurManager = this.blurManager;
                    if (blurManager != null) {
                        obj = blurManager.getTextureLock();
                        GLES20.glBindTexture(3553, this.blurManager.getTexture());
                    } else {
                        GLES20.glBindTexture(3553, this.bluredTexture.texture());
                    }
                }
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                GLES20.glEnableVertexAttribArray(1);
                if (obj != null) {
                    synchronized (obj) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                } else {
                    GLES20.glDrawArrays(5, 0, 4);
                }
                GLES20.glBindTexture(3553, getTexture());
                GLES20.glTexParameteri(3553, 10241, 9729);
                i3++;
            } else {
                GLES20.glBindFramebuffer(36160, 0);
                if (!isSuppressingChanges() && (paintingDelegate = this.delegate) != null) {
                    paintingDelegate.contentChanged();
                }
                endSuppressingChanges();
                this.renderState.reset();
                this.activePath = null;
                this.activeShape = null;
                return registerUndo;
            }
        }
    }

    public void clearStroke() {
        clearStroke(null);
    }

    public void clearStroke(final Runnable runnable) {
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$w92sp96oNqgdnWgKuIR4acJZNdg(Painting.this, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$w92sp96oNqgdnWgKuIR4acJZNdg(Painting painting, Runnable runnable) {
        painting.clearStrokeInternal();
        if (runnable != null) {
            runnable.run();
        }
    }

    public void clearShape() {
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$aPEe6Qt50ZlzdFIQGSCmLJ_dW4Q(Painting.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$aPEe6Qt50ZlzdFIQGSCmLJ_dW4Q(Painting painting) {
        painting.activeShape = null;
        PaintingDelegate paintingDelegate = painting.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrokeInternal() {
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getPaintTexture(), 0);
        Utils.HasGLError();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            Size size = this.size;
            GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        PaintingDelegate paintingDelegate = this.delegate;
        if (paintingDelegate != null) {
            paintingDelegate.contentChanged();
        }
        this.renderState.reset();
        this.activeStrokeBounds = null;
        this.activePath = null;
        this.helperApplyAlpha = 0.0f;
    }

    private Slice registerUndo(RectF rectF, boolean z) {
        if (rectF == null || !rectF.setIntersect(rectF, getBounds())) {
            return null;
        }
        final Slice slice = new Slice(getPaintingData(rectF, true, z, false).data, z ? 1 : 0, rectF, this.delegate.requestDispatchQueue());
        this.delegate.requestUndoStore().registerUndo(UUID.randomUUID(), new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Painting.this.restoreSlice(slice);
            }
        });
        return slice;
    }

    private Slice registerDoubleUndo(RectF rectF, final boolean z) {
        if (rectF == null || !rectF.setIntersect(rectF, getBounds())) {
            return null;
        }
        final Slice slice = new Slice(getPaintingData(rectF, true, false, false).data, 0, rectF, this.delegate.requestDispatchQueue());
        final Slice slice2 = new Slice(getPaintingData(rectF, true, true, false).data, 1, rectF, this.delegate.requestDispatchQueue());
        this.delegate.requestUndoStore().registerUndo(UUID.randomUUID(), new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$hh3hQW4dPckP-JR7byoIR2JGsJ4(Painting.this, slice, slice2, z);
            }
        });
        return slice;
    }

    public static /* synthetic */ void $r8$lambda$hh3hQW4dPckP-JR7byoIR2JGsJ4(Painting painting, Slice slice, Slice slice2, boolean z) {
        painting.restoreSlice(slice);
        painting.restoreSlice(slice2);
        painting.hasBlur = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSlice(final Slice slice) {
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Painting.this.restoreSliceInternal(slice, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSliceInternal(Slice slice, boolean z) {
        PaintingDelegate paintingDelegate;
        Texture texture;
        if (slice == null) {
            return;
        }
        ByteBuffer data = slice.getData();
        int texture2 = getTexture();
        if (slice.getTexture() == 1 && (texture = this.bitmapBlurTexture) != null) {
            texture2 = texture.texture();
        }
        GLES20.glBindTexture(3553, texture2);
        GLES20.glTexSubImage2D(3553, 0, slice.getX(), slice.getY(), slice.getWidth(), slice.getHeight(), 6408, 5121, data);
        if (!isSuppressingChanges() && (paintingDelegate = this.delegate) != null) {
            paintingDelegate.contentChanged();
        }
        if (z) {
            slice.cleanResources();
        }
    }

    public void setRenderProjection(float[] fArr) {
        this.renderProjection = fArr;
    }

    public void render() {
        if (this.shaders == null) {
            return;
        }
        if (this.bitmapBlurTexture != null) {
            renderBlur();
        }
        if (this.activePath != null) {
            renderBlitPath(getPaintTexture(), this.activePath, (1.0f - (this.helperAlpha * 0.5f)) - (this.helperApplyAlpha * 0.5f));
        } else if (this.activeShape != null) {
            renderBlitShape(getTexture(), getPaintTexture(), this.activeShape, 1.0f);
        } else {
            renderBlit(getTexture(), 1.0f);
        }
        int i = this.helperTexture;
        if (i == 0 || this.helperShape == null || this.helperAlpha <= 0.0f) {
            return;
        }
        renderBlitShape(i, getPaintTexture(), this.helperShape, (this.helperAlpha * 0.5f) + (this.helperApplyAlpha * 0.5f));
    }

    private void renderBlur() {
        if (this.blurManager == null || this.bitmapBlurTexture == null || !this.hasBlur) {
            return;
        }
        GLES20.glBindFramebuffer(36160, 0);
        Shader shader = (Shader) this.shaders.get("videoBlur");
        if (shader == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1f(shader.getUniform("flipy"), 0.0f);
        GLES20.glUniform1i(shader.getUniform("texture"), 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.bitmapBlurTexture.texture());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glUniform1i(shader.getUniform("blured"), 1);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.blurManager.getTexture());
        if (this.activePath != null && (this.brush instanceof Brush.Eraser)) {
            GLES20.glUniform1f(shader.getUniform("eraser"), 1.0f);
            GLES20.glUniform1i(shader.getUniform("mask"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, getPaintTexture());
        } else {
            GLES20.glUniform1f(shader.getUniform("eraser"), 0.0f);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        synchronized (this.blurManager.getTextureLock()) {
            GLES20.glDrawArrays(5, 0, 4);
        }
    }

    private void renderBlitShape(int i, int i2, Shape shape, float f) {
        Shader shader;
        if (shape == null) {
            return;
        }
        Brush brush = this.brush;
        Brush.Shape shape2 = shape.brush;
        if (shape2 != null && i == this.helperTexture) {
            brush = shape2;
        }
        if (brush == null || this.renderView == null || (shader = (Shader) this.shaders.get(brush.getShaderName(0))) == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1i(shader.getUniform("texture"), 0);
        GLES20.glUniform1i(shader.getUniform("mask"), 1);
        Shader.SetColorUniform(shader.getUniform("color"), ColorUtils.setAlphaComponent(this.renderView.getCurrentColor(), (int) (Color.alpha(r6) * f)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i2);
        if (brush instanceof Brush.Shape) {
            GLES20.glUniform1i(shader.getUniform(TeXSymbolParser.TYPE_ATTR), ((Brush.Shape) brush).getShapeShaderType());
            int uniform = shader.getUniform("resolution");
            Size size = this.size;
            GLES20.glUniform2f(uniform, size.width, size.height);
            GLES20.glUniform2f(shader.getUniform("center"), shape.centerX, shape.centerY);
            GLES20.glUniform2f(shader.getUniform("radius"), shape.radiusX, shape.radiusY);
            GLES20.glUniform1f(shader.getUniform("thickness"), shape.thickness);
            GLES20.glUniform1f(shader.getUniform("rounding"), shape.rounding);
            GLES20.glUniform2f(shader.getUniform("middle"), shape.middleX, shape.middleY);
            GLES20.glUniform1f(shader.getUniform("rotation"), shape.rotation);
            GLES20.glUniform1i(shader.getUniform("fill"), shape.fill ? 1 : 0);
            GLES20.glUniform1f(shader.getUniform("arrowTriangleLength"), shape.arrowTriangleLength);
            GLES20.glUniform1i(shader.getUniform("composite"), 0);
            GLES20.glUniform1i(shader.getUniform("clear"), shape == this.helperShape ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        Utils.HasGLError();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void renderBlitPath(int i, Path path, float f) {
        Object obj;
        Object obj2;
        if (path == null) {
            return;
        }
        Brush brush = path.getBrush();
        if (brush == null) {
            brush = this.brush;
        }
        boolean z = this.masking && ((brush instanceof Brush.Radial) || (brush instanceof Brush.Eraser));
        Map map = this.shaders;
        StringBuilder sb = new StringBuilder();
        sb.append(brush.getShaderName(0));
        sb.append(z ? "_masking" : "");
        Shader shader = (Shader) map.get(sb.toString());
        if (shader == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1i(shader.getUniform("texture"), 0);
        GLES20.glUniform1i(shader.getUniform("mask"), 1);
        Shader.SetColorUniform(shader.getUniform("color"), ColorUtils.setAlphaComponent(path.getColor(), (int) (Color.alpha(r6) * brush.getOverrideAlpha() * f)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i);
        if (z) {
            GLES20.glUniform1i(shader.getUniform("otexture"), 2);
            GLES20.glUniform1f(shader.getUniform("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.originalBitmapTexture.texture());
        }
        if (brush instanceof Brush.Blurer) {
            GLES20.glUniform1i(shader.getUniform("blured"), 2);
            GLES20.glActiveTexture(33986);
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (blurManager != null) {
                obj = blurManager.getTextureLock();
                GLES20.glBindTexture(3553, this.blurManager.getTexture());
                obj2 = obj;
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                GLES20.glEnableVertexAttribArray(1);
                if (obj2 == null) {
                    synchronized (obj2) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                } else {
                    GLES20.glDrawArrays(5, 0, 4);
                }
                Utils.HasGLError();
            }
            Texture texture = this.bluredTexture;
            if (texture != null) {
                GLES20.glBindTexture(3553, texture.texture());
            }
        }
        obj = null;
        obj2 = obj;
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        if (obj2 == null) {
        }
        Utils.HasGLError();
    }

    private void renderBlit(int i, float f) {
        Shader shader = (Shader) this.shaders.get(this.masking ? "maskingBlit" : "blit");
        if (i == 0 || shader == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1f(shader.getUniform("alpha"), f);
        if (this.masking) {
            GLES20.glUniform1i(shader.getUniform("texture"), 1);
            GLES20.glUniform1i(shader.getUniform("mask"), 0);
            GLES20.glUniform1f(shader.getUniform("preview"), 0.4f);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.originalBitmapTexture.texture());
        } else {
            GLES20.glUniform1i(shader.getUniform("texture"), 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        Utils.HasGLError();
    }

    public PaintingData getPaintingData(RectF rectF, boolean z, boolean z2, boolean z3) {
        String str;
        Texture texture;
        PaintingData paintingData;
        Shader shader;
        Texture texture2;
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.buffers, 0);
        int i3 = this.buffers[0];
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glGenTextures(1, this.buffers, 0);
        int i4 = this.buffers[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
        Size size = this.size;
        GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
        Map map = this.shaders;
        if (map == null) {
            return null;
        }
        if (z) {
            str = "nonPremultipliedBlit";
        } else {
            str = this.masking ? "maskingBlit" : "blit";
        }
        Shader shader2 = (Shader) map.get(str);
        if (shader2 == null) {
            return null;
        }
        GLES20.glUseProgram(shader2.program);
        Matrix matrix = new Matrix();
        matrix.preTranslate(-i, -i2);
        float[] MultiplyMat4f = GLMatrix.MultiplyMat4f(this.projection, GLMatrix.LoadGraphicsMatrix(matrix));
        GLES20.glUniformMatrix4fv(shader2.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(MultiplyMat4f));
        if (!z && this.masking) {
            GLES20.glUniform1i(shader2.getUniform("texture"), 1);
            GLES20.glUniform1i(shader2.getUniform("mask"), 0);
            GLES20.glUniform1f(shader2.getUniform("preview"), 0.0f);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, (!z2 || (texture2 = this.bitmapBlurTexture) == null) ? getTexture() : texture2.texture());
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.originalBitmapTexture.texture());
        } else {
            GLES20.glUniform1i(shader2.getUniform("texture"), 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, (!z2 || (texture = this.bitmapBlurTexture) == null) ? getTexture() : texture.texture());
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        if (z3 && !z2 && (shader = (Shader) this.shaders.get("videoBlur")) != null && this.blurManager != null) {
            GLES20.glUseProgram(shader.program);
            GLES20.glUniformMatrix4fv(shader.getUniform("mvpMatrix"), 1, false, FloatBuffer.wrap(MultiplyMat4f));
            GLES20.glUniform1f(shader.getUniform("flipy"), 0.0f);
            GLES20.glUniform1i(shader.getUniform("texture"), 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.bitmapBlurTexture.texture());
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glUniform1i(shader.getUniform("blured"), 1);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.blurManager.getTexture());
            GLES20.glUniform1f(shader.getUniform("eraser"), 0.0f);
            GLES20.glUniform1i(shader.getUniform("mask"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, getTexture());
            GLES20.glBlendFunc(1, 771);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(1);
            synchronized (this.blurManager.getTextureLock()) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        this.dataBuffer.limit(width * height * 4);
        GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.dataBuffer);
        if (z) {
            paintingData = new PaintingData(null, this.dataBuffer);
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(this.dataBuffer);
            paintingData = new PaintingData(createBitmap, null);
        }
        this.dataBuffer.rewind();
        int[] iArr = this.buffers;
        iArr[0] = i3;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        int[] iArr2 = this.buffers;
        iArr2[0] = i4;
        GLES20.glDeleteTextures(1, iArr2, 0);
        return paintingData;
    }

    public void setBrush(Brush brush) {
        Bitmap bitmap;
        Bitmap resultBitmap;
        this.brush = brush;
        if ((brush instanceof Brush.Blurer) && (bitmap = this.imageBitmap) != null && this.blurManager == null) {
            int width = bitmap.getWidth();
            int height = this.imageBitmap.getHeight();
            int i = this.imageBitmapRotation;
            if (i == 90 || i == 270 || i == -90) {
                height = width;
                width = height;
            }
            if (this.bluredBitmap == null) {
                this.bluredBitmap = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.bluredBitmap);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.imageBitmapPaint != null) {
                this.imageBitmapPaint = new Paint(1);
            }
            canvas.save();
            canvas.rotate(this.imageBitmapRotation);
            int i2 = this.imageBitmapRotation;
            if (i2 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i2 == 180) {
                canvas.translate(-width, -height);
            } else if (i2 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(this.imageBitmap, 0.0f, 0.0f, this.imageBitmapPaint);
            canvas.restore();
            RenderView renderView = this.renderView;
            if (renderView != null && (resultBitmap = renderView.getResultBitmap(false, false)) != null) {
                canvas.scale(width / resultBitmap.getWidth(), height / resultBitmap.getHeight());
                canvas.drawBitmap(resultBitmap, 0.0f, 0.0f, this.imageBitmapPaint);
                resultBitmap.recycle();
            }
            Utilities.stackBlurBitmap(this.bluredBitmap, (int) 8.0f);
            Texture texture = this.bluredTexture;
            if (texture != null) {
                texture.cleanResources(false);
            }
            this.bluredTexture = new Texture(this.bluredBitmap);
        }
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void onPause(final Runnable runnable) {
        this.renderView.performInContext(new Runnable() { // from class: org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                Painting.$r8$lambda$lAmJn3eH4Lar4LAspVh7gM2wKoQ(Painting.this, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$lAmJn3eH4Lar4LAspVh7gM2wKoQ(Painting painting, Runnable runnable) {
        painting.paused = true;
        painting.backupSlice = new Slice(painting.getPaintingData(painting.getBounds(), true, false, false).data, 0, painting.getBounds(), painting.delegate.requestDispatchQueue());
        painting.cleanResources(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onResume() {
        restoreSlice(this.backupSlice);
        this.backupSlice = null;
        this.paused = false;
    }

    public void cleanResources(boolean z) {
        int i = this.reusableFramebuffer;
        if (i != 0) {
            int[] iArr = this.buffers;
            iArr[0] = i;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.reusableFramebuffer = 0;
        }
        Texture texture = this.bitmapTexture;
        if (texture != null) {
            texture.cleanResources(z);
        }
        Texture texture2 = this.bitmapBlurTexture;
        if (texture2 != null) {
            texture2.cleanResources(z);
        }
        int i2 = this.paintTexture;
        if (i2 != 0) {
            int[] iArr2 = this.buffers;
            iArr2[0] = i2;
            GLES20.glDeleteTextures(1, iArr2, 0);
            this.paintTexture = 0;
        }
        for (Texture texture3 : this.brushTextures.values()) {
            if (texture3 != null) {
                texture3.cleanResources(true);
            }
        }
        this.brushTextures.clear();
        int i3 = this.helperTexture;
        if (i3 != 0) {
            int[] iArr3 = this.buffers;
            iArr3[0] = i3;
            GLES20.glDeleteTextures(1, iArr3, 0);
            this.helperTexture = 0;
        }
        Texture texture4 = this.bluredTexture;
        if (texture4 != null) {
            texture4.cleanResources(true);
        }
        Texture texture5 = this.originalBitmapTexture;
        if (texture5 != null) {
            texture5.cleanResources(true);
        }
        Map map = this.shaders;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Shader) it.next()).cleanResources();
            }
            this.shaders = null;
        }
    }

    private int getReusableFramebuffer() {
        if (this.reusableFramebuffer == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.reusableFramebuffer = iArr[0];
            Utils.HasGLError();
        }
        return this.reusableFramebuffer;
    }

    private int getTexture() {
        Texture texture = this.bitmapTexture;
        if (texture != null) {
            return texture.texture();
        }
        return 0;
    }

    private int getPaintTexture() {
        if (this.paintTexture == 0) {
            this.paintTexture = Texture.generateTexture(this.size);
        }
        return this.paintTexture;
    }

    public void setupShaders() {
        this.shaders = ShaderSet.setup();
    }
}
