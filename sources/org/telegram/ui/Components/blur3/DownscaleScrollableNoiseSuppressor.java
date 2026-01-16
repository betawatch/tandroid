package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.pip.source.PipSourceSnapshot$$ExternalSyntheticApiModelOutline0;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;

/* loaded from: classes5.dex */
public class DownscaleScrollableNoiseSuppressor {
    public final boolean isLiquidGlassEnabled;
    private int recordingIndex;
    private RectF recordingPos;
    private final ArrayList rectRenderNodes;
    private int rectRenderNodesCount;
    private final RenderNode[] resultRenderNodes;
    private final RenderEffect saturationUpEffect;
    private final boolean simpleMode;

    public static float convertRadiusToSigma(float f) {
        if (f > 0.0f) {
            return 0.5f + (f * 0.57735f);
        }
        return 0.0f;
    }

    public static float convertSigmaToRadius(float f) {
        if (f > 0.5f) {
            return (f - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }

    public DownscaleScrollableNoiseSuppressor() {
        this(true);
    }

    public DownscaleScrollableNoiseSuppressor(boolean z) {
        RenderEffect createColorFilterEffect;
        this.rectRenderNodes = new ArrayList();
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.isLiquidGlassEnabled = isEnabled;
        this.simpleMode = z;
        this.resultRenderNodes = new RenderNode[(isEnabled || !z) ? 2 : 1];
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i < renderNodeArr.length) {
                renderNodeArr[i] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
                i++;
            } else {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(2.0f);
                createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                this.saturationUpEffect = createColorFilterEffect;
                return;
            }
        }
    }

    public void draw(Canvas canvas, int i) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z = this.isLiquidGlassEnabled;
        if (!z && this.simpleMode) {
            canvas.drawRenderNode(this.resultRenderNodes[0]);
            return;
        }
        if (i == -2) {
            canvas.drawRenderNode(this.resultRenderNodes[!z ? 1 : 0]);
        } else if (i == -4) {
            canvas.drawRenderNode(this.resultRenderNodes[0]);
        } else if (i == -3) {
            canvas.drawRenderNode(this.resultRenderNodes[1]);
        }
    }

    public static class DownscaledRenderNode {
        private final RenderNode[] renderNodeDownsampled;
        private final RenderNode renderNodeOriginalWithOffset;
        private final RenderNode[] renderNodeRestored;
        private int scaleX;
        private int scaleY;
        private float scrollX;
        private float scrollY;
        private final boolean simpleMode;

        public DownscaledRenderNode(String str, int i) {
            this(str, i, false);
        }

        public DownscaledRenderNode(String str, int i, boolean z) {
            this.renderNodeOriginalWithOffset = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            int i2 = i + 1;
            this.renderNodeDownsampled = new RenderNode[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                PipSourceSnapshot$$ExternalSyntheticApiModelOutline0.m();
                renderNodeArr[i3] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(str + "_down_" + i);
            }
            if (i > 0 || z) {
                this.renderNodeRestored = new RenderNode[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    this.renderNodeRestored[i4] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
                }
            } else {
                this.renderNodeRestored = this.renderNodeDownsampled;
            }
            this.simpleMode = this.renderNodeRestored == this.renderNodeDownsampled;
            this.scaleY = 1;
            this.scaleX = 1;
        }

        public void setPrimaryEffect(RenderEffect renderEffect) {
            this.renderNodeDownsampled[0].setRenderEffect(renderEffect);
        }

        public void setPrimaryEffectBlur(float f) {
            RenderEffect createBlurEffect;
            createBlurEffect = RenderEffect.createBlurEffect(DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleX), DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleY), Shader.TileMode.CLAMP);
            setPrimaryEffect(createBlurEffect);
        }

        public void setPrimaryEffectBlur(float f, RenderEffect renderEffect) {
            RenderEffect createBlurEffect;
            RenderEffect createChainEffect;
            createBlurEffect = RenderEffect.createBlurEffect(DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleX), DownscaleScrollableNoiseSuppressor.downscaleRadius(f, this.scaleY), Shader.TileMode.CLAMP);
            createChainEffect = RenderEffect.createChainEffect(createBlurEffect, renderEffect);
            setPrimaryEffect(createChainEffect);
        }

        public void setSecondaryEffect(int i, RenderEffect renderEffect) {
            this.renderNodeDownsampled[i + 1].setRenderEffect(renderEffect);
        }

        public void invalidateRenderNodes(RenderNode renderNode) {
            int width;
            int height;
            RecordingCanvas beginRecording;
            RecordingCanvas beginRecording2;
            RecordingCanvas beginRecording3;
            RecordingCanvas beginRecording4;
            width = renderNode.getWidth();
            height = renderNode.getHeight();
            float f = width;
            int round = Math.round(f / this.scaleX);
            float f2 = height;
            int round2 = Math.round(f2 / this.scaleY);
            float f3 = round;
            float f4 = f3 / f;
            float f5 = round2;
            float f6 = f5 / f2;
            float f7 = f / f3;
            float f8 = f2 / f5;
            this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
            beginRecording = this.renderNodeOriginalWithOffset.beginRecording(width, height);
            beginRecording.drawRenderNode(renderNode);
            this.renderNodeOriginalWithOffset.endRecording();
            this.renderNodeDownsampled[0].setPosition(0, 0, round, round2);
            beginRecording2 = this.renderNodeDownsampled[0].beginRecording(round, round2);
            beginRecording2.scale(f4, f6);
            beginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
            this.renderNodeDownsampled[0].endRecording();
            int i = 0;
            while (true) {
                RenderNode[] renderNodeArr = this.renderNodeDownsampled;
                if (i >= renderNodeArr.length) {
                    return;
                }
                renderNodeArr[i].setPosition(0, 0, round, round2);
                beginRecording3 = this.renderNodeDownsampled[i].beginRecording(round, round2);
                if (i > 0) {
                    beginRecording3.drawRenderNode(this.renderNodeDownsampled[0]);
                } else {
                    beginRecording3.scale(f4, f6);
                    beginRecording3.drawRenderNode(this.renderNodeOriginalWithOffset);
                }
                this.renderNodeDownsampled[i].endRecording();
                if (this.simpleMode) {
                    this.renderNodeDownsampled[i].setScaleX(f7);
                    this.renderNodeDownsampled[i].setScaleY(f8);
                    this.renderNodeDownsampled[i].setPivotX(0.0f);
                    this.renderNodeDownsampled[i].setPivotY(0.0f);
                } else {
                    this.renderNodeRestored[i].setPosition(0, 0, width, height);
                    beginRecording4 = this.renderNodeRestored[i].beginRecording(width, height);
                    beginRecording4.scale(f7, f8);
                    beginRecording4.drawRenderNode(this.renderNodeDownsampled[i]);
                    this.renderNodeRestored[i].endRecording();
                }
                i++;
            }
        }

        public void setScale(int i, int i2) {
            this.scaleX = i;
            this.scaleY = i2;
        }

        public void onScrolled(float f, float f2) {
            int i = this.scaleX;
            float f3 = i >= 2 ? (this.scrollX + f) % i : 0.0f;
            this.scrollX = f3;
            int i2 = this.scaleY;
            this.scrollY = i2 >= 2 ? (this.scrollY + f2) % i2 : 0.0f;
            this.renderNodeOriginalWithOffset.setTranslationX(f3);
            this.renderNodeOriginalWithOffset.setTranslationY(this.scrollY);
            for (RenderNode renderNode : this.renderNodeRestored) {
                renderNode.setTranslationX(-this.scrollX);
                renderNode.setTranslationY(-this.scrollY);
            }
        }
    }

    public static float downscaleRadius(float f, float f2) {
        return Math.max(1.0f, convertSigmaToRadius(convertRadiusToSigma(f) / f2));
    }

    public void onScrolled(float f, float f2) {
        for (int i = 0; i < this.rectRenderNodesCount; i++) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
            sourcePart.renderNodesForBlur.onScrolled(f, f2);
            DownscaledRenderNode downscaledRenderNode = sourcePart.renderNodesForGlass;
            if (downscaledRenderNode != null) {
                downscaledRenderNode.onScrolled(f, f2);
            }
        }
    }

    private void invalidateResultRenderNodes(int i, int i2) {
        RecordingCanvas beginRecording;
        DownscaledRenderNode downscaledRenderNode;
        int i3 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i3 >= renderNodeArr.length) {
                return;
            }
            RenderNode renderNode = renderNodeArr[i3];
            renderNode.setPosition(0, 0, i, i2);
            beginRecording = renderNode.beginRecording(i, i2);
            for (int i4 = 0; i4 < this.rectRenderNodesCount; i4++) {
                SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i4);
                beginRecording.save();
                RectF rectF = sourcePart.position;
                beginRecording.translate(rectF.left, rectF.top);
                if (!this.isLiquidGlassEnabled || (downscaledRenderNode = sourcePart.renderNodesForGlass) == null) {
                    beginRecording.drawRenderNode(sourcePart.renderNodesForBlur.renderNodeRestored[Math.min(i3, sourcePart.renderNodesForBlur.renderNodeRestored.length - 1)]);
                } else if (i3 == 0) {
                    beginRecording.drawRenderNode(downscaledRenderNode.renderNodeRestored[0]);
                } else {
                    beginRecording.drawRenderNode(sourcePart.renderNodesForBlur.renderNodeRestored[0]);
                }
                beginRecording.restore();
            }
            renderNode.endRecording();
            i3++;
        }
    }

    public void invalidateResultRenderNodes(IBlur3Capture iBlur3Capture, int i, int i2) {
        for (int i3 = 0; i3 < this.rectRenderNodesCount; i3++) {
            RectF position = getPosition(i3);
            RecordingCanvas beginRecordingRect = beginRecordingRect(i3);
            beginRecordingRect.save();
            beginRecordingRect.translate(-position.left, -position.top);
            iBlur3Capture.capture(beginRecordingRect, position);
            beginRecordingRect.restore();
            endRecordingRect();
        }
        invalidateResultRenderNodes(i, i2);
    }

    private class SourcePart {
        final RectF position;
        final RenderNode renderNode;
        final DownscaledRenderNode renderNodesForBlur;
        final DownscaledRenderNode renderNodesForGlass;

        private SourcePart() {
            this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.position = new RectF();
            if (!DownscaleScrollableNoiseSuppressor.this.isLiquidGlassEnabled) {
                if (DownscaleScrollableNoiseSuppressor.this.simpleMode) {
                    DownscaledRenderNode downscaledRenderNode = new DownscaledRenderNode("blur", 0);
                    this.renderNodesForBlur = downscaledRenderNode;
                    downscaledRenderNode.setScale(16, 16);
                    downscaledRenderNode.setPrimaryEffectBlur(AndroidUtilities.dpf2(28.34f), DownscaleScrollableNoiseSuppressor.this.saturationUpEffect);
                    this.renderNodesForGlass = null;
                    return;
                }
                DownscaledRenderNode downscaledRenderNode2 = new DownscaledRenderNode("blur", 1);
                this.renderNodesForBlur = downscaledRenderNode2;
                downscaledRenderNode2.setScale(16, 16);
                downscaledRenderNode2.setPrimaryEffectBlur(AndroidUtilities.dpf2(30.0f));
                downscaledRenderNode2.setSecondaryEffect(0, DownscaleScrollableNoiseSuppressor.this.saturationUpEffect);
                this.renderNodesForGlass = null;
                return;
            }
            DownscaledRenderNode downscaledRenderNode3 = new DownscaledRenderNode("glass", 0, true);
            this.renderNodesForGlass = downscaledRenderNode3;
            downscaledRenderNode3.setScale(4, 4);
            downscaledRenderNode3.setPrimaryEffectBlur(AndroidUtilities.dpf2(1.66f), DownscaleScrollableNoiseSuppressor.this.saturationUpEffect);
            DownscaledRenderNode downscaledRenderNode4 = new DownscaledRenderNode("blur", 0);
            this.renderNodesForBlur = downscaledRenderNode4;
            downscaledRenderNode4.setScale(16, 16);
            downscaledRenderNode4.setPrimaryEffectBlur(AndroidUtilities.dpf2(28.34f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(RectF rectF) {
            RectF rectF2 = this.position;
            float f = rectF.left;
            rectF2.left = f - (f % 16.0f);
            float f2 = rectF.top;
            rectF2.top = f2 - (f2 % 16.0f);
            float f3 = rectF.right;
            rectF2.right = f3 + (16.0f - (f3 % 16.0f));
            float f4 = rectF.bottom;
            rectF2.bottom = f4 + (16.0f - (f4 % 16.0f));
        }

        public void invalidate() {
            DownscaledRenderNode downscaledRenderNode = this.renderNodesForGlass;
            if (downscaledRenderNode != null) {
                downscaledRenderNode.invalidateRenderNodes(this.renderNode);
                this.renderNodesForBlur.invalidateRenderNodes(this.renderNodesForGlass.renderNodeRestored[0]);
            } else {
                this.renderNodesForBlur.invalidateRenderNodes(this.renderNode);
            }
        }
    }

    public int getRenderNodesCount() {
        return this.rectRenderNodesCount;
    }

    public void setupRenderNodes(List list, int i) {
        this.rectRenderNodesCount = i;
        while (this.rectRenderNodesCount > this.rectRenderNodes.size()) {
            this.rectRenderNodes.add(new SourcePart());
        }
        for (int i2 = 0; i2 < this.rectRenderNodesCount; i2++) {
            ((SourcePart) this.rectRenderNodes.get(i2)).setPosition((RectF) list.get(i2));
        }
    }

    private RectF getPosition(int i) {
        return ((SourcePart) this.rectRenderNodes.get(i)).position;
    }

    private RecordingCanvas beginRecordingRect(int i) {
        RecordingCanvas beginRecording;
        if (this.recordingPos != null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
        this.recordingPos = sourcePart.position;
        this.recordingIndex = i;
        int ceil = (int) Math.ceil(r1.width());
        int ceil2 = (int) Math.ceil(r1.height());
        sourcePart.renderNode.setPosition(0, 0, ceil, ceil2);
        beginRecording = sourcePart.renderNode.beginRecording(ceil, ceil2);
        return beginRecording;
    }

    private void endRecordingRect() {
        if (this.recordingPos == null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(this.recordingIndex);
        sourcePart.renderNode.endRecording();
        sourcePart.invalidate();
        this.recordingPos = null;
    }
}
