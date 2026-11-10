package org.telegram.ui.Components;

import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class h9 {
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
