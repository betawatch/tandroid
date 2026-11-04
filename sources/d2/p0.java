package d2;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 {
    public CharSequence A;
    public CharSequence B;
    public Integer C;
    public Integer D;
    public CharSequence E;
    public CharSequence F;
    public CharSequence G;
    public Integer H;
    public Bundle I;
    public g9.i0 J;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Long h;
    public f1 i;
    public f1 j;
    public byte[] k;
    public l l;
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

    public p0() {
        g9.g0 g0Var = g9.i0.b;
        this.J = g9.s1.e;
    }

    public final void a(int i3, byte[] bArr) {
        if (this.k == null || i3 == 3 || !Objects.equals(this.m, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = null;
            this.m = Integer.valueOf(i3);
        }
    }

    public final void b(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = null;
        this.m = num;
    }
}
