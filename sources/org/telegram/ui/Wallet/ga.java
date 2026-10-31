package org.telegram.ui.Wallet;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ga {
    public static org.telegram.messenger.s5 a;
    public static final int[] b = new int[zs.N1];

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = b;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i10))) * 255.0d);
            i10++;
        }
    }
}
