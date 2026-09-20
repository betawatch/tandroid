package org.telegram.ui.Components;

import android.graphics.PointF;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
