package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
