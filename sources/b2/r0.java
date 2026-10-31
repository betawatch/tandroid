package b2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public e9.n0 J;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public g1 i;
    public g1 j;
    public byte[] k;
    public m l;
    public Integer m;
    public Uri n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Boolean r;
    public Boolean s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public CharSequence z;

    public r0() {
        e9.l0 l0Var = e9.n0.b;
        this.J = e9.x1.e;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.k == null || i10 == 3 || !Objects.equals(this.m, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = null;
            this.m = Integer.valueOf(i10);
        }
    }

    public final void b(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = null;
        this.m = num;
    }
}
