package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int i7 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.d = i7 | (charAt2 << i10);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }
}
