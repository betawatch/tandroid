package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.pip.source.PipSourceSnapshot$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.utils.RenderNodeEffects;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;

/* loaded from: classes5.dex */
public class DownscaleScrollableNoiseSuppressor {
    public final boolean allowNoiseSuppress;
    private final Blur3HashImpl builder;
    public final boolean isLiquidGlassEnabled;
    private final int k;
    long lastHash;
    private int recordingIndex;
    private Rect recordingPos;
    private final ArrayList rectRenderNodes;
    private int rectRenderNodesCount;
    private final RenderNode[] resultRenderNodes;
    private final boolean simpleMode;
    private final RectF tmpRectF;

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
        this(true, false);
    }

    public DownscaleScrollableNoiseSuppressor(boolean z, boolean z2) {
        this.tmpRectF = new RectF();
        this.builder = new Blur3HashImpl();
        this.rectRenderNodes = new ArrayList();
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.isLiquidGlassEnabled = isEnabled;
        this.simpleMode = z;
        this.k = (isEnabled || z2) ? 1 : 8;
        this.allowNoiseSuppress = z2;
        this.resultRenderNodes = new RenderNode[(isEnabled || !z) ? 2 : 1];
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i] = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            i++;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawInline(Canvas canvas, int i) {
        int i2;
        boolean quickReject;
        boolean z = this.isLiquidGlassEnabled;
        if (z || !this.simpleMode) {
            i2 = 1;
            if (i == -2) {
                i2 = 1 ^ (z ? 1 : 0);
            } else if (i != -4) {
                if (i != -3) {
                    return;
                }
            }
            for (int i3 = 0; i3 < this.rectRenderNodesCount; i3++) {
                SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i3);
                Rect rect = sourcePart.position;
                quickReject = canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom);
                if (!quickReject) {
                    canvas.save();
                    Rect rect2 = sourcePart.position;
                    canvas.translate(rect2.left, rect2.top);
                    canvas.drawRenderNode(getRenderNode(i2, i3));
                    canvas.restore();
                }
            }
        }
        i2 = 0;
        while (i3 < this.rectRenderNodesCount) {
        }
    }

    public class DownscaledRenderNode {
        long lastHash;
        private final RenderNode[] renderNodeDownsampled;
        private final RenderNode renderNodeOriginalWithOffset;
        private final RenderNode[] renderNodeRestored;
        private int scaleX;
        private int scaleY;
        private float scrollX;
        private float scrollY;
        private final boolean simpleMode;

        public DownscaledRenderNode(DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor, String str, int i) {
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

        /* JADX WARN: Removed duplicated region for block: B:15:0x009e A[EDGE_INSN: B:15:0x009e->B:16:0x009e BREAK  A[LOOP:0: B:7:0x007f->B:13:0x009a], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0151 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void invalidateRenderNodes(RenderNode renderNode) {
            int width;
            int height;
            long uniqueId;
            boolean hasDisplayList;
            boolean z;
            int i;
            RenderNode[] renderNodeArr;
            int i2;
            RecordingCanvas beginRecording;
            RecordingCanvas beginRecording2;
            int i3;
            RenderNode[] renderNodeArr2;
            RecordingCanvas beginRecording3;
            RecordingCanvas beginRecording4;
            boolean hasDisplayList2;
            boolean hasDisplayList3;
            boolean hasDisplayList4;
            width = renderNode.getWidth();
            height = renderNode.getHeight();
            float f = width;
            int round = Math.round((DownscaleScrollableNoiseSuppressor.this.k * f) / this.scaleX);
            float f2 = height;
            int round2 = Math.round((DownscaleScrollableNoiseSuppressor.this.k * f2) / this.scaleY);
            float f3 = round;
            float f4 = f3 / f;
            float f5 = round2;
            float f6 = f5 / f2;
            float f7 = (f * DownscaleScrollableNoiseSuppressor.this.k) / f3;
            float f8 = (f2 * DownscaleScrollableNoiseSuppressor.this.k) / f5;
            uniqueId = renderNode.getUniqueId();
            long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, uniqueId), round), round2), width), height);
            hasDisplayList = this.renderNodeOriginalWithOffset.hasDisplayList();
            if (hasDisplayList) {
                hasDisplayList4 = this.renderNodeDownsampled[0].hasDisplayList();
                if (hasDisplayList4) {
                    z = false;
                    i = 0;
                    while (true) {
                        renderNodeArr = this.renderNodeDownsampled;
                        if (i < renderNodeArr.length) {
                            break;
                        }
                        hasDisplayList2 = renderNodeArr[i].hasDisplayList();
                        z |= !hasDisplayList2;
                        if (!this.simpleMode) {
                            hasDisplayList3 = this.renderNodeRestored[i].hasDisplayList();
                            z |= !hasDisplayList3;
                        }
                        i++;
                    }
                    if (this.lastHash != calcHash && !z) {
                        return;
                    }
                    this.lastHash = calcHash;
                    i2 = 0;
                    this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
                    beginRecording = this.renderNodeOriginalWithOffset.beginRecording(width, height);
                    beginRecording.drawRenderNode(renderNode);
                    this.renderNodeOriginalWithOffset.endRecording();
                    this.renderNodeDownsampled[0].setPosition(0, 0, round, round2);
                    beginRecording2 = this.renderNodeDownsampled[0].beginRecording(round, round2);
                    beginRecording2.scale(f4, f6);
                    beginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
                    this.renderNodeDownsampled[0].endRecording();
                    i3 = 0;
                    while (true) {
                        renderNodeArr2 = this.renderNodeDownsampled;
                        if (i3 < renderNodeArr2.length) {
                            return;
                        }
                        renderNodeArr2[i3].setPosition(i2, i2, round, round2);
                        beginRecording3 = this.renderNodeDownsampled[i3].beginRecording(round, round2);
                        if (i3 > 0) {
                            beginRecording3.drawRenderNode(this.renderNodeDownsampled[i2]);
                        } else {
                            beginRecording3.scale(f4, f6);
                            beginRecording3.drawRenderNode(this.renderNodeOriginalWithOffset);
                        }
                        this.renderNodeDownsampled[i3].endRecording();
                        if (this.simpleMode) {
                            this.renderNodeDownsampled[i3].setScaleX(f7);
                            this.renderNodeDownsampled[i3].setScaleY(f8);
                            this.renderNodeDownsampled[i3].setPivotX(0.0f);
                            this.renderNodeDownsampled[i3].setPivotY(0.0f);
                        } else {
                            this.renderNodeRestored[i3].setPosition(0, 0, width, height);
                            beginRecording4 = this.renderNodeRestored[i3].beginRecording(width, height);
                            beginRecording4.scale(f7, f8);
                            beginRecording4.drawRenderNode(this.renderNodeDownsampled[i3]);
                            this.renderNodeRestored[i3].endRecording();
                        }
                        i3++;
                        i2 = 0;
                    }
                }
            }
            z = true;
            i = 0;
            while (true) {
                renderNodeArr = this.renderNodeDownsampled;
                if (i < renderNodeArr.length) {
                }
                i++;
            }
            if (this.lastHash != calcHash) {
            }
            this.lastHash = calcHash;
            i2 = 0;
            this.renderNodeOriginalWithOffset.setPosition(0, 0, width, height);
            beginRecording = this.renderNodeOriginalWithOffset.beginRecording(width, height);
            beginRecording.drawRenderNode(renderNode);
            this.renderNodeOriginalWithOffset.endRecording();
            this.renderNodeDownsampled[0].setPosition(0, 0, round, round2);
            beginRecording2 = this.renderNodeDownsampled[0].beginRecording(round, round2);
            beginRecording2.scale(f4, f6);
            beginRecording2.drawRenderNode(this.renderNodeOriginalWithOffset);
            this.renderNodeDownsampled[0].endRecording();
            i3 = 0;
            while (true) {
                renderNodeArr2 = this.renderNodeDownsampled;
                if (i3 < renderNodeArr2.length) {
                }
                i3++;
                i2 = 0;
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
            if (DownscaleScrollableNoiseSuppressor.this.allowNoiseSuppress) {
                this.renderNodeOriginalWithOffset.setTranslationX(f3);
                this.renderNodeOriginalWithOffset.setTranslationY(this.scrollY);
                for (RenderNode renderNode : this.renderNodeRestored) {
                    renderNode.setTranslationX(-this.scrollX);
                    renderNode.setTranslationY(-this.scrollY);
                }
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

    private boolean invalidateResultRenderNodes(int i, int i2) {
        RecordingCanvas beginRecording;
        long uniqueId;
        boolean hasDisplayList;
        long uniqueId2;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i), i2);
        int i3 = 0;
        boolean z = false;
        while (true) {
            RenderNode[] renderNodeArr = this.resultRenderNodes;
            if (i3 >= renderNodeArr.length) {
                break;
            }
            RenderNode renderNode = renderNodeArr[i3];
            uniqueId = renderNode.getUniqueId();
            calcHash = MediaDataController.calcHash(calcHash, uniqueId);
            for (int i4 = 0; i4 < this.rectRenderNodesCount; i4++) {
                SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i4);
                RenderNode renderNode2 = getRenderNode(i3, i4);
                long calcHash2 = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, sourcePart.position.left), sourcePart.position.top), sourcePart.position.right), sourcePart.position.bottom);
                uniqueId2 = renderNode2.getUniqueId();
                calcHash = MediaDataController.calcHash(calcHash2, uniqueId2);
            }
            hasDisplayList = renderNode.hasDisplayList();
            if (!hasDisplayList) {
                z = true;
            }
            i3++;
        }
        if (calcHash == this.lastHash && !z) {
            return false;
        }
        this.lastHash = calcHash;
        int i5 = 0;
        while (true) {
            RenderNode[] renderNodeArr2 = this.resultRenderNodes;
            if (i5 >= renderNodeArr2.length) {
                return true;
            }
            RenderNode renderNode3 = renderNodeArr2[i5];
            renderNode3.setPosition(0, 0, i, i2);
            beginRecording = renderNode3.beginRecording(i, i2);
            for (int i6 = 0; i6 < this.rectRenderNodesCount; i6++) {
                SourcePart sourcePart2 = (SourcePart) this.rectRenderNodes.get(i6);
                beginRecording.save();
                Rect rect = sourcePart2.position;
                beginRecording.translate(rect.left, rect.top);
                beginRecording.drawRenderNode(getRenderNode(i5, i6));
                beginRecording.restore();
            }
            renderNode3.endRecording();
            i5++;
        }
    }

    private RenderNode getRenderNode(int i, int i2) {
        DownscaledRenderNode downscaledRenderNode;
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i2);
        if (!this.isLiquidGlassEnabled || (downscaledRenderNode = sourcePart.renderNodesForGlass) == null) {
            return sourcePart.renderNodesForBlur.renderNodeRestored[Math.min(i, sourcePart.renderNodesForBlur.renderNodeRestored.length - 1)];
        }
        return i == 0 ? downscaledRenderNode.renderNodeRestored[0] : sourcePart.renderNodesForBlur.renderNodeRestored[0];
    }

    public boolean invalidateResultRenderNodes(IBlur3Capture iBlur3Capture, int i, int i2) {
        int i3;
        boolean hasDisplayList;
        int i4 = 0;
        while (i3 < this.rectRenderNodesCount) {
            SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i3);
            this.tmpRectF.set(sourcePart.position);
            this.builder.start();
            iBlur3Capture.captureCalculateHash(this.builder, this.tmpRectF);
            long j = this.builder.get();
            if (!this.builder.isUnsupported() && sourcePart.lastHash == j) {
                hasDisplayList = sourcePart.renderNode.hasDisplayList();
                i3 = hasDisplayList ? i3 + 1 : 0;
            }
            sourcePart.lastHash = j;
            RecordingCanvas beginRecordingRect = beginRecordingRect(i3);
            beginRecordingRect.save();
            beginRecordingRect.translate(-r4.left, -r4.top);
            iBlur3Capture.capture(beginRecordingRect, this.tmpRectF);
            beginRecordingRect.restore();
            endRecordingRect();
            i4++;
        }
        if (i4 > 0) {
            return invalidateResultRenderNodes(i, i2);
        }
        return false;
    }

    private class SourcePart {
        long lastHash;
        final Rect position;
        final RenderNode renderNode;
        final DownscaledRenderNode renderNodesForBlur;
        final DownscaledRenderNode renderNodesForGlass;

        private SourcePart() {
            this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m(null);
            this.position = new Rect();
            if (!DownscaleScrollableNoiseSuppressor.this.isLiquidGlassEnabled) {
                if (DownscaleScrollableNoiseSuppressor.this.simpleMode) {
                    DownscaledRenderNode downscaledRenderNode = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 0);
                    this.renderNodesForBlur = downscaledRenderNode;
                    boolean z = DownscaleScrollableNoiseSuppressor.this.allowNoiseSuppress;
                    downscaledRenderNode.setScale(z ? 16 : 8, z ? 16 : 8);
                    downscaledRenderNode.setPrimaryEffectBlur(AndroidUtilities.dpf2(40.0f), RenderNodeEffects.getSaturationX2RenderEffect());
                    this.renderNodesForGlass = null;
                    return;
                }
                DownscaledRenderNode downscaledRenderNode2 = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 1);
                this.renderNodesForBlur = downscaledRenderNode2;
                downscaledRenderNode2.setScale(8, 8);
                downscaledRenderNode2.setPrimaryEffectBlur(AndroidUtilities.dpf2(40.0f));
                downscaledRenderNode2.setSecondaryEffect(0, RenderNodeEffects.getSaturationX2RenderEffect());
                this.renderNodesForGlass = null;
                return;
            }
            DownscaledRenderNode downscaledRenderNode3 = DownscaleScrollableNoiseSuppressor.this.new DownscaledRenderNode("glass", 0, true);
            this.renderNodesForGlass = downscaledRenderNode3;
            downscaledRenderNode3.setScale(4, 4);
            downscaledRenderNode3.setPrimaryEffectBlur(AndroidUtilities.dpf2(1.66f), RenderNodeEffects.getSaturationX2RenderEffect());
            DownscaledRenderNode downscaledRenderNode4 = new DownscaledRenderNode(DownscaleScrollableNoiseSuppressor.this, "blur", 0);
            this.renderNodesForBlur = downscaledRenderNode4;
            downscaledRenderNode4.setScale(8, 8);
            downscaledRenderNode4.setPrimaryEffectBlur(AndroidUtilities.dpf2(38.34f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(RectF rectF) {
            this.position.left = DownscaleScrollableNoiseSuppressor.roundDown(rectF.left, 16);
            this.position.top = DownscaleScrollableNoiseSuppressor.roundDown(rectF.top, 16);
            this.position.right = DownscaleScrollableNoiseSuppressor.roundUp(rectF.right, 16);
            this.position.bottom = DownscaleScrollableNoiseSuppressor.roundUp(rectF.bottom, 16);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int roundDown(float f, int i) {
        return Math.round(f - (f % i));
    }

    public static int roundUp(float f, int i) {
        float f2 = i;
        return Math.round(f + (f2 - (f % f2)));
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

    private RecordingCanvas beginRecordingRect(int i) {
        RecordingCanvas beginRecording;
        if (this.recordingPos != null) {
            throw new IllegalStateException();
        }
        SourcePart sourcePart = (SourcePart) this.rectRenderNodes.get(i);
        Rect rect = sourcePart.position;
        this.recordingPos = rect;
        this.recordingIndex = i;
        int width = rect.width() / this.k;
        int height = rect.height() / this.k;
        sourcePart.renderNode.setPosition(0, 0, width, height);
        beginRecording = sourcePart.renderNode.beginRecording(width, height);
        float f = 1.0f / this.k;
        beginRecording.scale(f, f);
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
