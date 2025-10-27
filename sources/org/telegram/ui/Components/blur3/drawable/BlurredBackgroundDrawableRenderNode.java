package org.telegram.ui.Components.blur3.drawable;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;

/* loaded from: classes5.dex */
public class BlurredBackgroundDrawableRenderNode extends BlurredBackgroundDrawable {
    private final BlurredBackgroundDrawable fallbackDrawable;
    private int lastBackgroundColor;
    private final LiquidGlassEffect liquidGlassEffect;
    private final Outline outline = new Outline();
    private final Rect outlineRect = new Rect();
    private final Paint paintFill;
    private final Paint paintShadow;
    private final Paint paintStrokeBottom;
    private final Paint paintStrokeTop;
    private final RenderNode renderNode;
    private final RenderNode renderNodeFill;
    private boolean renderNodeInvalidated;
    private final RenderNode renderNodeStroke;
    private final BlurredBackgroundSourceRenderNode source;

    public BlurredBackgroundDrawableRenderNode(BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode, BlurredBackgroundDrawable blurredBackgroundDrawable) {
        Paint paint = new Paint(1);
        this.paintShadow = paint;
        this.paintFill = new Paint(1);
        Paint paint2 = new Paint(1);
        this.paintStrokeTop = paint2;
        Paint paint3 = new Paint(1);
        this.paintStrokeBottom = paint3;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode");
        this.renderNode = m;
        RenderNode m2 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode.Fill");
        this.renderNodeFill = m2;
        this.renderNodeStroke = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredBackgroundDrawableRenderNode.Stroke");
        m.setClipToOutline(true);
        m.setClipToBounds(true);
        this.fallbackDrawable = blurredBackgroundDrawable;
        this.source = blurredBackgroundSourceRenderNode;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
        if (Build.VERSION.SDK_INT >= 33 && LiteMode.isEnabled(262144)) {
            this.liquidGlassEffect = new LiquidGlassEffect(m2);
        } else {
            this.liquidGlassEffect = null;
        }
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    protected void onBoundPropsChanged() {
        this.paintStrokeTop.setStrokeWidth(this.boundProps.strokeWidthTop);
        this.paintStrokeBottom.setStrokeWidth(this.boundProps.strokeWidthBottom);
        this.outlineRect.set(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        BlurredBackgroundDrawable.getOutline(this.outline, this.outlineRect, this.boundProps.radii);
        this.outline.setAlpha(1.0f);
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        this.renderNodeFill.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNodeStroke.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setOutline(this.outline);
        this.renderNodeInvalidated = true;
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    protected void onSourceOffsetChange(float f, float f2) {
        this.renderNodeInvalidated = true;
    }

    private void updateDisplayList() {
        RecordingCanvas beginRecording;
        RecordingCanvas beginRecording2;
        RecordingCanvas beginRecording3;
        float f = this.sourceOffsetX;
        float f2 = this.sourceOffsetY;
        beginRecording = this.renderNodeFill.beginRecording();
        beginRecording.save();
        Rect rect = this.boundProps.boundsWithPadding;
        beginRecording.translate(-(rect.left + f), -(rect.top + f2));
        LiquidGlassEffect liquidGlassEffect = this.liquidGlassEffect;
        if (liquidGlassEffect != null && Build.VERSION.SDK_INT >= 33) {
            liquidGlassEffect.update(0.0f, 0.0f, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height(), this.boundProps.radii[0], AndroidUtilities.dp(10.0f));
        }
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.source;
        Rect rect2 = this.boundProps.boundsWithPadding;
        blurredBackgroundSourceRenderNode.draw(beginRecording, rect2.left + f, rect2.top + f2, rect2.right + f, rect2.bottom + f2);
        beginRecording.restore();
        this.renderNodeFill.endRecording();
        boolean z = (this.strokeColorTop == 0 && this.strokeColorBottom == 0) ? false : true;
        if (z) {
            beginRecording3 = this.renderNodeStroke.beginRecording();
            if (this.strokeColorTop != 0) {
                float width = this.boundProps.boundsWithPadding.width();
                float height = this.boundProps.boundsWithPadding.height();
                BlurredBackgroundDrawable.Props props = this.boundProps;
                BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording3, 0.0f, 0.0f, width, height, props.radii, props.strokeWidthTop, true, this.paintStrokeTop);
            }
            if (this.strokeColorBottom != 0) {
                float width2 = this.boundProps.boundsWithPadding.width();
                float height2 = this.boundProps.boundsWithPadding.height();
                BlurredBackgroundDrawable.Props props2 = this.boundProps;
                BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording3, 0.0f, 0.0f, width2, height2, props2.radii, props2.strokeWidthBottom, false, this.paintStrokeBottom);
            }
            this.renderNodeStroke.endRecording();
        }
        beginRecording2 = this.renderNode.beginRecording();
        beginRecording2.drawRenderNode(this.renderNodeFill);
        if ((Build.VERSION.SDK_INT < 31 || this.liquidGlassEffect != null) && this.backgroundColor != 0) {
            beginRecording2.drawPaint(this.paintFill);
        }
        if (z) {
            beginRecording2.drawRenderNode(this.renderNodeStroke);
        }
        this.renderNode.endRecording();
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void updateColors() {
        BlendMode blendMode;
        RenderEffect createColorFilterEffect;
        super.updateColors();
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
        }
        int i = this.lastBackgroundColor;
        int i2 = this.backgroundColor;
        if (i != i2) {
            this.lastBackgroundColor = i2;
            if (this.liquidGlassEffect == null && Build.VERSION.SDK_INT >= 31) {
                if (Color.alpha(i2) != 0) {
                    RenderNode renderNode = this.renderNodeFill;
                    BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline1.m();
                    int i3 = this.backgroundColor;
                    blendMode = BlendMode.SRC_OVER;
                    createColorFilterEffect = RenderEffect.createColorFilterEffect(BlurredBackgroundDrawableRenderNode$$ExternalSyntheticApiModelOutline0.m(i3, blendMode));
                    renderNode.setRenderEffect(createColorFilterEffect);
                } else {
                    this.renderNodeFill.setRenderEffect(null);
                }
            }
        }
        this.paintShadow.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33333334f), this.shadowColor);
        this.paintFill.setColor(this.backgroundColor);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
        this.renderNodeInvalidated = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r0 == false) goto L15;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean hasDisplayList;
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (!this.renderNodeInvalidated) {
            hasDisplayList = this.renderNode.hasDisplayList();
        }
        updateDisplayList();
        if (this.shadowColor != 0) {
            if (this.inAppKeyboardOptimization) {
                BlurredBackgroundDrawable.Props props = this.boundProps;
                Rect rect = props.boundsWithPadding;
                float f = rect.left;
                float f2 = rect.top;
                float f3 = rect.right;
                float clamp = MathUtils.clamp((props.radii[0] * 2.0f) + f2, f2, rect.bottom);
                float f4 = this.boundProps.radii[0];
                canvas.drawRoundRect(f, f2, f3, clamp, f4, f4, this.paintShadow);
            } else {
                BlurredBackgroundDrawable.Props props2 = this.boundProps;
                if (props2.radiiAreSame) {
                    Rect rect2 = props2.boundsWithPadding;
                    float f5 = rect2.left;
                    float f6 = rect2.top;
                    float f7 = rect2.right;
                    float f8 = rect2.bottom;
                    float f9 = props2.radii[0];
                    canvas.drawRoundRect(f5, f6, f7, f8, f9, f9, this.paintShadow);
                } else {
                    canvas.drawPath(props2.path, this.paintShadow);
                }
            }
        }
        canvas.save();
        Rect rect3 = this.boundProps.boundsWithPadding;
        canvas.translate(rect3.left, rect3.top);
        canvas.drawRenderNode(this.renderNode);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void setRadius(float f) {
        super.setRadius(f);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setRadius(f);
        }
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void setRadius(float f, float f2, float f3, float f4) {
        super.setRadius(f, f2, f3, f4);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setRadius(f, f2, f3, f4);
        }
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void setPadding(int i) {
        super.setPadding(i);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setPadding(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.renderNode.setAlpha(i);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha(i);
        }
        this.renderNodeInvalidated = true;
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void setSourceOffset(float f, float f2) {
        super.setSourceOffset(f, f2);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.fallbackDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setSourceOffset(f, f2);
        }
    }
}
