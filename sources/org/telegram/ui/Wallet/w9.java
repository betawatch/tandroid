package org.telegram.ui.Wallet;

import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public abstract class w9 {
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
