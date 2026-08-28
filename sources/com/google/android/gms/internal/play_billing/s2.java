package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s2 {
    public final e1 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public s2(e1 e1Var, String str, Object[] objArr) {
        this.a = e1Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.d = i9 | (charAt2 << i11);
                return;
            } else {
                i9 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i9 = this.d;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }
}
