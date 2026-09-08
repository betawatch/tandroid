package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i6 {
    public final v4 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public i6(v4 v4Var, String str, Object[] objArr) {
        this.a = v4Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.d = i10 | (charAt2 << i12);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final int a() {
        int i10 = this.d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
