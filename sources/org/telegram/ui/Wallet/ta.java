package org.telegram.ui.Wallet;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class ta {
    public static org.telegram.messenger.r5 a;
    public static final int[] b = new int[ks.N1];

    static {
        int i7 = 0;
        while (true) {
            int[] iArr = b;
            if (i7 >= iArr.length) {
                return;
            }
            iArr[i7] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i7))) * 255.0d);
            i7++;
        }
    }
}
