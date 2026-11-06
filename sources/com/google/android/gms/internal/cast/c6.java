package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c6 {
    public final q4 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public c6(q4 q4Var, String str, Object[] objArr) {
        this.a = q4Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.d = i7 | (charAt2 << i11);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final int a() {
        int i7 = this.d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }
}
