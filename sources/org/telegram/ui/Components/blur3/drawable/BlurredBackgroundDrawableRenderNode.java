package org.telegram.ui.Components.blur3.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.LiquidGlassEffect;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;

/* loaded from: classes5.dex */
public class BlurredBackgroundDrawableRenderNode extends BlurredBackgroundDrawable {
    private LiquidGlassEffect liquidGlassEffect;
    private final Outline outline = new Outline();
    private final Rect outlineRect = new Rect();
    private final Paint paintShadow;
    private final Paint paintStrokeBottom;
    private final Paint paintStrokeTop;
    private final RenderNode renderNode;
    private final RenderNode renderNodeFill;
    private boolean renderNodeInvalidated;
    private final BlurredBackgroundSource source;

    public BlurredBackgroundDrawableRenderNode(BlurredBackgroundSource blurredBackgroundSource) {
        Paint paint = new Paint(1);
        this.paintShadow = paint;
        Paint paint2 = new Paint(1);
        this.paintStrokeTop = paint2;
        Paint paint3 = new Paint(1);
        this.paintStrokeBottom = paint3;
        RenderNode m = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredNode");
        this.renderNode = m;
        this.renderNodeFill = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("BlurredFill");
        m.setClipToOutline(true);
        m.setClipToBounds(true);
        this.source = blurredBackgroundSource;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public void setLiquidGlassEffectAllowed() {
        this.liquidGlassEffect = new LiquidGlassEffect(this.renderNodeFill);
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public BlurredBackgroundSource getSource() {
        return this.source;
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    protected void onBoundPropsChanged() {
        super.onBoundPropsChanged();
        this.paintStrokeTop.setStrokeWidth(this.boundProps.strokeWidthTop);
        this.paintStrokeBottom.setStrokeWidth(this.boundProps.strokeWidthBottom);
        this.outlineRect.set(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        BlurredBackgroundDrawable.getOutline(this.outline, this.outlineRect, this.boundProps.radii);
        this.outline.setAlpha(1.0f);
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        this.renderNodeFill.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setPosition(0, 0, this.boundProps.boundsWithPadding.width(), this.boundProps.boundsWithPadding.height());
        this.renderNode.setOutline(this.outline);
        this.renderNodeInvalidated = true;
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    protected void onSourceOffsetChange(float f, float f2) {
        super.onSourceOffsetChange(f, f2);
        this.renderNodeInvalidated = true;
    }

    public boolean hasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    private void updateDisplayList() {
        RecordingCanvas beginRecording;
        RecordingCanvas beginRecording2;
        float f = this.sourceOffsetX;
        float f2 = this.sourceOffsetY;
        Rect rect = this.boundProps.boundsWithPadding;
        float f3 = rect.left + f;
        float f4 = rect.top + f2;
        float f5 = rect.right + f;
        float f6 = rect.bottom + f2;
        beginRecording = this.renderNodeFill.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f3, -f4);
        LiquidGlassEffect liquidGlassEffect = this.liquidGlassEffect;
        if (liquidGlassEffect != null && Build.VERSION.SDK_INT >= 33) {
            float width = this.boundProps.boundsWithPadding.width();
            float height = this.boundProps.boundsWithPadding.height();
            BlurredBackgroundDrawable.Props props = this.boundProps;
            float[] fArr = props.shaderRadii;
            float f7 = fArr[0];
            float f8 = fArr[2];
            float f9 = fArr[4];
            float f10 = fArr[6];
            int i = props.liquidThickness;
            if (i <= 0) {
                i = AndroidUtilities.dp(11.0f);
            }
            float f11 = i;
            BlurredBackgroundDrawable.Props props2 = this.boundProps;
            liquidGlassEffect.update(0.0f, 0.0f, width, height, f7, f8, f9, f10, f11, props2.liquidIntensity, props2.liquidIndex, this.backgroundColor);
        }
        this.source.draw(beginRecording, f3, f4, f5, f6);
        beginRecording.save();
        this.renderNodeFill.endRecording();
        beginRecording2 = this.renderNode.beginRecording();
        if (Color.alpha(this.backgroundColor) == 255) {
            beginRecording2.drawColor(this.backgroundColor);
        } else {
            beginRecording2.drawRenderNode(this.renderNodeFill);
            if (this.liquidGlassEffect == null && Color.alpha(this.backgroundColor) != 0) {
                beginRecording2.drawColor(this.backgroundColor);
            }
        }
        if (this.strokeColorTop != 0) {
            float width2 = this.boundProps.boundsWithPadding.width();
            float height2 = this.boundProps.boundsWithPadding.height();
            BlurredBackgroundDrawable.Props props3 = this.boundProps;
            BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording2, 0.0f, 0.0f, width2, height2, props3.radii, props3.strokeWidthTop, true, this.paintStrokeTop);
        }
        if (this.strokeColorBottom != 0) {
            float width3 = this.boundProps.boundsWithPadding.width();
            float height3 = this.boundProps.boundsWithPadding.height();
            BlurredBackgroundDrawable.Props props4 = this.boundProps;
            BlurredBackgroundDrawable.drawStroke((Canvas) beginRecording2, 0.0f, 0.0f, width3, height3, props4.radii, props4.strokeWidthBottom, false, this.paintStrokeBottom);
        }
        this.renderNode.endRecording();
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    public void updateColors() {
        super.updateColors();
        this.paintShadow.setShadowLayer(this.shadowLayerRadius, this.shadowLayerDx, this.shadowLayerDy, this.shadowColor);
        this.paintStrokeTop.setColor(this.strokeColorTop);
        this.paintStrokeBottom.setColor(this.strokeColorBottom);
        this.renderNodeInvalidated = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean hasDisplayList;
        float alpha;
        if (this.boundProps.boundsWithPadding.isEmpty()) {
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            drawSource(canvas, this.source);
            return;
        }
        hasDisplayList = this.renderNode.hasDisplayList();
        if (!hasDisplayList) {
            this.source.dispatchOnDrawablesRelativePositionChange();
            updateDisplayList();
        } else if (this.renderNodeInvalidated) {
            updateDisplayList();
        }
        this.renderNodeInvalidated = false;
        int i = this.shadowColor;
        alpha = this.renderNode.getAlpha();
        int multAlpha = Theme.multAlpha(i, alpha * this.shadowAlpha);
        if (Color.alpha(multAlpha) != 0) {
            this.paintShadow.setShadowLayer(this.shadowLayerRadius, this.shadowLayerDx, this.shadowLayerDy, multAlpha);
            this.boundProps.drawShadows(canvas, this.paintShadow, this.inAppKeyboardOptimization);
        }
        canvas.save();
        Rect rect = this.boundProps.boundsWithPadding;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.renderNode);
        canvas.restore();
    }

    public void invalidateDisplayList() {
        this.renderNodeInvalidated = true;
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        int alpha = getAlpha();
        super.setAlpha(i);
        this.renderNode.setAlpha(i / 255.0f);
        this.renderNodeInvalidated = true;
        if (alpha != 0 || i <= 0) {
            return;
        }
        this.source.dispatchOnDrawablesRelativePositionChange();
    }

    @Override // org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable
    protected void onSourceRelativePositionChanged(RectF rectF) {
        super.onSourceRelativePositionChanged(rectF);
        this.source.dispatchOnDrawablesRelativePositionChange();
    }
}
