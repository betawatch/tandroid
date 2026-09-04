package di;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class m9 extends pg.a {
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

    public m9(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static m9 b(String str, CharSequence charSequence, int i10) {
        m9 m9Var = new m9(9, false);
        m9Var.e = str;
        m9Var.f = charSequence;
        m9Var.q = i10;
        return m9Var;
    }

    public static m9 c() {
        return new m9(0, false);
    }

    public static m9 d() {
        m9 m9Var = new m9(-1, false);
        m9Var.o = -1;
        return m9Var;
    }

    public static m9 e() {
        return new m9(1, false);
    }

    public static m9 f() {
        return new m9(2, false);
    }

    public static m9 g(CharSequence charSequence) {
        m9 m9Var = new m9(6, false);
        m9Var.e = charSequence;
        return m9Var;
    }

    public static m9 h(int i10, int i11, boolean z10) {
        m9 m9Var = new m9(3, false);
        m9Var.i = i10;
        m9Var.k = z10;
        m9Var.j = i11;
        return m9Var;
    }

    public static m9 i(TLRPC.User user, boolean z10, boolean z11) {
        m9 m9Var = new m9(3, true);
        m9Var.g = user;
        m9Var.k = z10;
        m9Var.l = z11;
        return m9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m9.class != obj.getClass()) {
            return false;
        }
        m9 m9Var = (m9) obj;
        int i10 = this.a;
        if (i10 != m9Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != m9Var.o || this.p != m9Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != m9Var.g || this.h != m9Var.h || this.i != m9Var.i || this.j != m9Var.j || this.k != m9Var.k || this.m != m9Var.m || this.n != m9Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != m9Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, m9Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, m9Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, m9Var.e) && TextUtils.equals(this.f, m9Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, m9Var.e) || this.c != m9Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != m9Var.c || !TextUtils.equals(this.e, m9Var.e) || this.k != m9Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == m9Var.q && this.d == m9Var.d && TextUtils.equals(this.e, m9Var.e) && TextUtils.equals(this.f, m9Var.f))) {
            return this.a != 10 || this.q == m9Var.q;
        }
        return false;
    }
}
