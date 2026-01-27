package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

/* loaded from: classes3.dex */
public abstract class RenderNodeEffects {
    private static RenderEffect saturationUpX2Effect;

    public static RenderEffect getSaturationX2RenderEffect() {
        RenderEffect createColorFilterEffect;
        if (saturationUpX2Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(2.0f);
            createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            saturationUpX2Effect = createColorFilterEffect;
        }
        return saturationUpX2Effect;
    }
}
