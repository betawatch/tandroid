package org.telegram.ui.Wallet;

import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public abstract class x9 {
    public static DispatchQueue a;
    public static final int[] b = new int[129];

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
