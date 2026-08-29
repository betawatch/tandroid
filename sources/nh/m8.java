package nh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m8 extends zf.a {
    public int c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f;
    public TLRPC.User g;
    public TLRPC.Chat h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    public m8(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static m8 b(String str, CharSequence charSequence, int i10) {
        m8 m8Var = new m8(9, false);
        m8Var.e = str;
        m8Var.f = charSequence;
        m8Var.q = i10;
        return m8Var;
    }

    public static m8 c() {
        return new m8(0, false);
    }

    public static m8 d() {
        m8 m8Var = new m8(-1, false);
        m8Var.o = -1;
        return m8Var;
    }

    public static m8 e() {
        return new m8(1, false);
    }

    public static m8 f() {
        return new m8(2, false);
    }

    public static m8 g(CharSequence charSequence) {
        m8 m8Var = new m8(6, false);
        m8Var.e = charSequence;
        return m8Var;
    }

    public static m8 h(int i10, int i11, boolean z10) {
        m8 m8Var = new m8(3, false);
        m8Var.i = i10;
        m8Var.k = z10;
        m8Var.j = i11;
        return m8Var;
    }

    public static m8 i(TLRPC.User user, boolean z10, boolean z11) {
        m8 m8Var = new m8(3, true);
        m8Var.g = user;
        m8Var.k = z10;
        m8Var.l = z11;
        return m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m8.class != obj.getClass()) {
            return false;
        }
        m8 m8Var = (m8) obj;
        int i10 = this.a;
        if (i10 != m8Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != m8Var.o || this.p != m8Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != m8Var.g || this.h != m8Var.h || this.i != m8Var.i || this.j != m8Var.j || this.k != m8Var.k || this.m != m8Var.m || this.n != m8Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != m8Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, m8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, m8Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, m8Var.e) && TextUtils.equals(this.f, m8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, m8Var.e) || this.c != m8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != m8Var.c || !TextUtils.equals(this.e, m8Var.e) || this.k != m8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == m8Var.q && this.d == m8Var.d && TextUtils.equals(this.e, m8Var.e) && TextUtils.equals(this.f, m8Var.f))) {
            return this.a != 10 || this.q == m8Var.q;
        }
        return false;
    }
}
