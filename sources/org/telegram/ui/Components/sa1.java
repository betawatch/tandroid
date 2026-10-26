package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Paint;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class sa1 {
    public static final BlendMode[] a;

    static {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        blendMode = BlendMode.SRC_OVER;
        blendMode2 = BlendMode.SRC_IN;
        blendMode3 = BlendMode.DST_IN;
        blendMode4 = BlendMode.PLUS;
        blendMode5 = BlendMode.SCREEN;
        blendMode6 = BlendMode.OVERLAY;
        blendMode7 = BlendMode.COLOR_DODGE;
        blendMode8 = BlendMode.COLOR_BURN;
        blendMode9 = BlendMode.SOFT_LIGHT;
        a = new BlendMode[]{blendMode, blendMode2, BlendMode.SRC_OUT, BlendMode.SRC_ATOP, BlendMode.DST_OVER, blendMode3, BlendMode.DST_OUT, BlendMode.DST_ATOP, blendMode4, BlendMode.SRC, BlendMode.XOR, BlendMode.MULTIPLY, blendMode5, blendMode6, BlendMode.DARKEN, BlendMode.LIGHTEN, blendMode7, blendMode8, BlendMode.HARD_LIGHT, blendMode9, BlendMode.DIFFERENCE, BlendMode.EXCLUSION, BlendMode.HUE, BlendMode.SATURATION, BlendMode.COLOR, BlendMode.LUMINOSITY};
    }

    public static void a(Paint paint, int i10) {
        BlendMode blendMode;
        if (i10 > 0) {
            BlendMode[] blendModeArr = a;
            if (i10 < blendModeArr.length) {
                blendMode = blendModeArr[i10];
                paint.setBlendMode(blendMode);
            }
        }
        blendMode = null;
        paint.setBlendMode(blendMode);
    }
}
