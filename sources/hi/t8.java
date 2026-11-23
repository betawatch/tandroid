package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t8 extends rg.a {
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

    public t8(int i7, boolean z10) {
        super(i7, z10);
        this.p = -1;
    }

    public static t8 b(String str, CharSequence charSequence, int i7) {
        t8 t8Var = new t8(9, false);
        t8Var.e = str;
        t8Var.f = charSequence;
        t8Var.q = i7;
        return t8Var;
    }

    public static t8 c() {
        return new t8(0, false);
    }

    public static t8 d() {
        t8 t8Var = new t8(-1, false);
        t8Var.o = -1;
        return t8Var;
    }

    public static t8 e() {
        return new t8(1, false);
    }

    public static t8 f() {
        return new t8(2, false);
    }

    public static t8 g(CharSequence charSequence) {
        t8 t8Var = new t8(6, false);
        t8Var.e = charSequence;
        return t8Var;
    }

    public static t8 h(int i7, int i10, boolean z10) {
        t8 t8Var = new t8(3, false);
        t8Var.i = i7;
        t8Var.k = z10;
        t8Var.j = i10;
        return t8Var;
    }

    public static t8 i(TLRPC.User user, boolean z10, boolean z11) {
        t8 t8Var = new t8(3, true);
        t8Var.g = user;
        t8Var.k = z10;
        t8Var.l = z11;
        return t8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t8.class != obj.getClass()) {
            return false;
        }
        t8 t8Var = (t8) obj;
        int i7 = this.a;
        if (i7 != t8Var.a) {
            return false;
        }
        if (i7 == -1 && (this.o != t8Var.o || this.p != t8Var.p)) {
            return false;
        }
        if (i7 == 3 && (this.g != t8Var.g || this.h != t8Var.h || this.i != t8Var.i || this.j != t8Var.j || this.k != t8Var.k || this.m != t8Var.m || this.n != t8Var.n)) {
            return false;
        }
        if (i7 == 0 && this.c != t8Var.c) {
            return false;
        }
        if (i7 == 2 && !TextUtils.equals(this.e, t8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, t8Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, t8Var.e) && TextUtils.equals(this.f, t8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, t8Var.e) || this.c != t8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != t8Var.c || !TextUtils.equals(this.e, t8Var.e) || this.k != t8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == t8Var.q && this.d == t8Var.d && TextUtils.equals(this.e, t8Var.e) && TextUtils.equals(this.f, t8Var.f))) {
            return this.a != 10 || this.q == t8Var.q;
        }
        return false;
    }
}
