package org.telegram.ui.Wallet;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class sa {
    public static org.telegram.messenger.r5 a;
    public static final int[] b = new int[ls.N1];

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
