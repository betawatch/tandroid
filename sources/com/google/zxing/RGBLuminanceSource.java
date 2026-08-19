package com.google.zxing;

import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class RGBLuminanceSource extends GrayscaleLuminanceSource {
    public RGBLuminanceSource(int i, int i2, int[] iArr) {
        super(i, i2, toGrayscale(i, i2, iArr));
    }

    private static byte[] toGrayscale(int i, int i2, int[] iArr) {
        int i3 = i * i2;
        if (iArr == null || iArr.length < i3) {
            throw new IllegalArgumentException("Pixel array length is less than width * height");
        }
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            bArr[i4] = (byte) (((((i5 >> 16) & NotificationCenter.didReceiveSmsCode) + ((i5 >> 7) & 510)) + (i5 & NotificationCenter.didReceiveSmsCode)) / 4);
        }
        return bArr;
    }
}
