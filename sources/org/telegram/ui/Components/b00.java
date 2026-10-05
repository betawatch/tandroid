package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public interface b00 {
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
