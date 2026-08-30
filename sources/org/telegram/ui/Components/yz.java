package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public interface yz {
    ByteBuffer a();

    boolean b();

    boolean c();

    float getBlurAngle();

    float getBlurExcludeBlurSize();

    PointF getBlurExcludePoint();

    float getBlurExcludeSize();

    int getBlurType();

    float getContrastValue();

    float getEnhanceValue();

    float getExposureValue();

    float getFadeValue();

    float getGrainValue();

    float getHighlightsValue();

    float getSaturationValue();

    float getShadowsValue();

    float getSharpenValue();

    float getSoftenSkinValue();

    int getTintHighlightsColor();

    float getTintHighlightsIntensityValue();

    int getTintShadowsColor();

    float getTintShadowsIntensityValue();

    float getVignetteValue();

    float getWarmthValue();
}
