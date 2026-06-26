package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

/* loaded from: classes3.dex */
public abstract class RenderNodeEffects {
    private static RenderEffect saturationUpX3Effect;

    public static RenderEffect getSaturationX3RenderEffect() {
        RenderEffect createColorFilterEffect;
        if (saturationUpX3Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            saturationUpX3Effect = createColorFilterEffect;
        }
        return saturationUpX3Effect;
    }

    public static RenderEffect createSaturationXRenderEffect(float f) {
        RenderEffect createColorFilterEffect;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f);
        createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        return createColorFilterEffect;
    }
}
