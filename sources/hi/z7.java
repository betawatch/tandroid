package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z7 extends rg.a {
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

    public z7(int i7, boolean z10) {
        super(i7, z10);
        this.p = -1;
    }

    public static z7 b(String str, CharSequence charSequence, int i7) {
        z7 z7Var = new z7(9, false);
        z7Var.e = str;
        z7Var.f = charSequence;
        z7Var.q = i7;
        return z7Var;
    }

    public static z7 c() {
        return new z7(0, false);
    }

    public static z7 d() {
        z7 z7Var = new z7(-1, false);
        z7Var.o = -1;
        return z7Var;
    }

    public static z7 e() {
        return new z7(1, false);
    }

    public static z7 f() {
        return new z7(2, false);
    }

    public static z7 g(CharSequence charSequence) {
        z7 z7Var = new z7(6, false);
        z7Var.e = charSequence;
        return z7Var;
    }

    public static z7 h(int i7, int i10, boolean z10) {
        z7 z7Var = new z7(3, false);
        z7Var.i = i7;
        z7Var.k = z10;
        z7Var.j = i10;
        return z7Var;
    }

    public static z7 i(TLRPC.User user, boolean z10, boolean z11) {
        z7 z7Var = new z7(3, true);
        z7Var.g = user;
        z7Var.k = z10;
        z7Var.l = z11;
        return z7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.class != obj.getClass()) {
            return false;
        }
        z7 z7Var = (z7) obj;
        int i7 = this.a;
        if (i7 != z7Var.a) {
            return false;
        }
        if (i7 == -1 && (this.o != z7Var.o || this.p != z7Var.p)) {
            return false;
        }
        if (i7 == 3 && (this.g != z7Var.g || this.h != z7Var.h || this.i != z7Var.i || this.j != z7Var.j || this.k != z7Var.k || this.m != z7Var.m || this.n != z7Var.n)) {
            return false;
        }
        if (i7 == 0 && this.c != z7Var.c) {
            return false;
        }
        if (i7 == 2 && !TextUtils.equals(this.e, z7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, z7Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, z7Var.e) && TextUtils.equals(this.f, z7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, z7Var.e) || this.c != z7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != z7Var.c || !TextUtils.equals(this.e, z7Var.e) || this.k != z7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == z7Var.q && this.d == z7Var.d && TextUtils.equals(this.e, z7Var.e) && TextUtils.equals(this.f, z7Var.f))) {
            return this.a != 10 || this.q == z7Var.q;
        }
        return false;
    }
}
