package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m2 {
    public final l0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public m2(l0 l0Var, String str, Object[] objArr) {
        this.a = l0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.d = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}
