package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class k9 extends og.a {
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

    public k9(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static k9 b(String str, CharSequence charSequence, int i10) {
        k9 k9Var = new k9(9, false);
        k9Var.e = str;
        k9Var.f = charSequence;
        k9Var.q = i10;
        return k9Var;
    }

    public static k9 c() {
        return new k9(0, false);
    }

    public static k9 d() {
        k9 k9Var = new k9(-1, false);
        k9Var.o = -1;
        return k9Var;
    }

    public static k9 e() {
        return new k9(1, false);
    }

    public static k9 f() {
        return new k9(2, false);
    }

    public static k9 g(CharSequence charSequence) {
        k9 k9Var = new k9(6, false);
        k9Var.e = charSequence;
        return k9Var;
    }

    public static k9 h(int i10, int i11, boolean z10) {
        k9 k9Var = new k9(3, false);
        k9Var.i = i10;
        k9Var.k = z10;
        k9Var.j = i11;
        return k9Var;
    }

    public static k9 i(TLRPC.User user, boolean z10, boolean z11) {
        k9 k9Var = new k9(3, true);
        k9Var.g = user;
        k9Var.k = z10;
        k9Var.l = z11;
        return k9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k9.class != obj.getClass()) {
            return false;
        }
        k9 k9Var = (k9) obj;
        int i10 = this.a;
        if (i10 != k9Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != k9Var.o || this.p != k9Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != k9Var.g || this.h != k9Var.h || this.i != k9Var.i || this.j != k9Var.j || this.k != k9Var.k || this.m != k9Var.m || this.n != k9Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != k9Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, k9Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, k9Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f, k9Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, k9Var.e) || this.c != k9Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != k9Var.c || !TextUtils.equals(this.e, k9Var.e) || this.k != k9Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == k9Var.q && this.d == k9Var.d && TextUtils.equals(this.e, k9Var.e) && TextUtils.equals(this.f, k9Var.f))) {
            return this.a != 10 || this.q == k9Var.q;
        }
        return false;
    }
}
