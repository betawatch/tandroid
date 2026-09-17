package org.telegram.ui.Components;

import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class u9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GradientDrawable.Orientation.values().length];
        a = iArr;
        try {
            iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
