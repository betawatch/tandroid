package org.telegram.ui.Wallet;

import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract class ea {
    public static org.telegram.messenger.q5 a;
    public static final int[] b = new int[ns.N1];

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
