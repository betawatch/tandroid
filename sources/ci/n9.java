package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class n9 extends og.a {
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

    public n9(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static n9 b(String str, CharSequence charSequence, int i10) {
        n9 n9Var = new n9(9, false);
        n9Var.e = str;
        n9Var.f = charSequence;
        n9Var.q = i10;
        return n9Var;
    }

    public static n9 c() {
        return new n9(0, false);
    }

    public static n9 d() {
        n9 n9Var = new n9(-1, false);
        n9Var.o = -1;
        return n9Var;
    }

    public static n9 e() {
        return new n9(1, false);
    }

    public static n9 f() {
        return new n9(2, false);
    }

    public static n9 g(CharSequence charSequence) {
        n9 n9Var = new n9(6, false);
        n9Var.e = charSequence;
        return n9Var;
    }

    public static n9 h(int i10, int i11, boolean z10) {
        n9 n9Var = new n9(3, false);
        n9Var.i = i10;
        n9Var.k = z10;
        n9Var.j = i11;
        return n9Var;
    }

    public static n9 i(TLRPC.User user, boolean z10, boolean z11) {
        n9 n9Var = new n9(3, true);
        n9Var.g = user;
        n9Var.k = z10;
        n9Var.l = z11;
        return n9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n9.class != obj.getClass()) {
            return false;
        }
        n9 n9Var = (n9) obj;
        int i10 = this.a;
        if (i10 != n9Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != n9Var.o || this.p != n9Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != n9Var.g || this.h != n9Var.h || this.i != n9Var.i || this.j != n9Var.j || this.k != n9Var.k || this.m != n9Var.m || this.n != n9Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != n9Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, n9Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, n9Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f, n9Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, n9Var.e) || this.c != n9Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != n9Var.c || !TextUtils.equals(this.e, n9Var.e) || this.k != n9Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == n9Var.q && this.d == n9Var.d && TextUtils.equals(this.e, n9Var.e) && TextUtils.equals(this.f, n9Var.f))) {
            return this.a != 10 || this.q == n9Var.q;
        }
        return false;
    }
}
