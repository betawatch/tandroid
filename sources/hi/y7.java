package hi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class y7 extends rg.a {
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

    public y7(int i7, boolean z10) {
        super(i7, z10);
        this.p = -1;
    }

    public static y7 b(String str, CharSequence charSequence, int i7) {
        y7 y7Var = new y7(9, false);
        y7Var.e = str;
        y7Var.f = charSequence;
        y7Var.q = i7;
        return y7Var;
    }

    public static y7 c() {
        return new y7(0, false);
    }

    public static y7 d() {
        y7 y7Var = new y7(-1, false);
        y7Var.o = -1;
        return y7Var;
    }

    public static y7 e() {
        return new y7(1, false);
    }

    public static y7 f() {
        return new y7(2, false);
    }

    public static y7 g(CharSequence charSequence) {
        y7 y7Var = new y7(6, false);
        y7Var.e = charSequence;
        return y7Var;
    }

    public static y7 h(int i7, int i10, boolean z10) {
        y7 y7Var = new y7(3, false);
        y7Var.i = i7;
        y7Var.k = z10;
        y7Var.j = i10;
        return y7Var;
    }

    public static y7 i(TLRPC.User user, boolean z10, boolean z11) {
        y7 y7Var = new y7(3, true);
        y7Var.g = user;
        y7Var.k = z10;
        y7Var.l = z11;
        return y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y7.class != obj.getClass()) {
            return false;
        }
        y7 y7Var = (y7) obj;
        int i7 = this.a;
        if (i7 != y7Var.a) {
            return false;
        }
        if (i7 == -1 && (this.o != y7Var.o || this.p != y7Var.p)) {
            return false;
        }
        if (i7 == 3 && (this.g != y7Var.g || this.h != y7Var.h || this.i != y7Var.i || this.j != y7Var.j || this.k != y7Var.k || this.m != y7Var.m || this.n != y7Var.n)) {
            return false;
        }
        if (i7 == 0 && this.c != y7Var.c) {
            return false;
        }
        if (i7 == 2 && !TextUtils.equals(this.e, y7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, y7Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, y7Var.e) && TextUtils.equals(this.f, y7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, y7Var.e) || this.c != y7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != y7Var.c || !TextUtils.equals(this.e, y7Var.e) || this.k != y7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == y7Var.q && this.d == y7Var.d && TextUtils.equals(this.e, y7Var.e) && TextUtils.equals(this.f, y7Var.f))) {
            return this.a != 10 || this.q == y7Var.q;
        }
        return false;
    }
}
