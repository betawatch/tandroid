package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;

/* loaded from: classes3.dex */
public abstract class RenderNodeEffects {
    private static RenderEffect saturationUpX4Effect;

    public static RenderEffect getSaturationX4RenderEffect() {
        RenderEffect createColorFilterEffect;
        if (saturationUpX4Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(4.0f);
            createColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            saturationUpX4Effect = createColorFilterEffect;
        }
        return saturationUpX4Effect;
    }
}
