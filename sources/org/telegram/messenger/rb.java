package org.telegram.messenger;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rb {
    public static final /* synthetic */ int[] a;

    static {
        Bitmap.CompressFormat compressFormat;
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        a = iArr;
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            int[] iArr2 = a;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            iArr2[compressFormat.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
