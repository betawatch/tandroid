package org.telegram.ui.Wallet;

import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ba {
    public static org.telegram.messenger.q5 a;
    public static final int[] b = new int[hs.N1];

    static {
        int i3 = 0;
        while (true) {
            int[] iArr = b;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i3))) * 255.0d);
            i3++;
        }
    }
}
