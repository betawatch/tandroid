package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yz implements a00 {
    public final /* synthetic */ MediaController.SavedFilterState a;

    public yz(MediaController.SavedFilterState savedFilterState) {
        this.a = savedFilterState;
    }

    @Override // org.telegram.ui.Components.a00
    public final ByteBuffer a() {
        MediaController.SavedFilterState savedFilterState = this.a;
        savedFilterState.curvesToolValue.a();
        return savedFilterState.curvesToolValue.e;
    }

    @Override // org.telegram.ui.Components.a00
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.a00
    public final boolean c() {
        return !this.a.curvesToolValue.b();
    }

    @Override // org.telegram.ui.Components.a00
    public final float getBlurAngle() {
        return this.a.blurAngle;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getBlurExcludeBlurSize() {
        return this.a.blurExcludeBlurSize;
    }

    @Override // org.telegram.ui.Components.a00
    public final PointF getBlurExcludePoint() {
        return this.a.blurExcludePoint;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getBlurExcludeSize() {
        return this.a.blurExcludeSize;
    }

    @Override // org.telegram.ui.Components.a00
    public final int getBlurType() {
        return this.a.blurType;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getContrastValue() {
        return a4.a.e(this.a.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    @Override // org.telegram.ui.Components.a00
    public final float getEnhanceValue() {
        return this.a.enhanceValue / 100.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getExposureValue() {
        return this.a.exposureValue / 100.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getFadeValue() {
        return this.a.fadeValue / 100.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getGrainValue() {
        return (this.a.grainValue / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.a.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.a00
    public final float getSaturationValue() {
        float f7 = this.a.saturationValue / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.a.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.a00
    public final float getSharpenValue() {
        return a4.a.e(this.a.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.a00
    public final float getSoftenSkinValue() {
        return this.a.softenSkinValue / 100.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final int getTintHighlightsColor() {
        return this.a.tintHighlightsColor;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getTintHighlightsIntensityValue() {
        return this.a.tintHighlightsColor == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.a00
    public final int getTintShadowsColor() {
        return this.a.tintShadowsColor;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getTintShadowsIntensityValue() {
        return this.a.tintShadowsColor == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getVignetteValue() {
        return this.a.vignetteValue / 100.0f;
    }

    @Override // org.telegram.ui.Components.a00
    public final float getWarmthValue() {
        return this.a.warmthValue / 100.0f;
    }
}
