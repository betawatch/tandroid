package org.telegram.ui.Wallet;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
