package org.telegram.ui.Wallet;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class da {
    public static org.telegram.messenger.q5 a;
    public static final int[] b = new int[qs.N1];

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
