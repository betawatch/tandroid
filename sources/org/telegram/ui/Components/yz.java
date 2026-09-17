package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
