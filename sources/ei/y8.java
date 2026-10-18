package ei;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class y8 extends pg.a {
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

    public y8(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static y8 b(String str, CharSequence charSequence, int i10) {
        y8 y8Var = new y8(9, false);
        y8Var.e = str;
        y8Var.f = charSequence;
        y8Var.q = i10;
        return y8Var;
    }

    public static y8 c() {
        return new y8(0, false);
    }

    public static y8 d() {
        y8 y8Var = new y8(-1, false);
        y8Var.o = -1;
        return y8Var;
    }

    public static y8 e() {
        return new y8(1, false);
    }

    public static y8 f() {
        return new y8(2, false);
    }

    public static y8 g(CharSequence charSequence) {
        y8 y8Var = new y8(6, false);
        y8Var.e = charSequence;
        return y8Var;
    }

    public static y8 h(int i10, int i11, boolean z10) {
        y8 y8Var = new y8(3, false);
        y8Var.i = i10;
        y8Var.k = z10;
        y8Var.j = i11;
        return y8Var;
    }

    public static y8 i(TLRPC.User user, boolean z10, boolean z11) {
        y8 y8Var = new y8(3, true);
        y8Var.g = user;
        y8Var.k = z10;
        y8Var.l = z11;
        return y8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y8.class != obj.getClass()) {
            return false;
        }
        y8 y8Var = (y8) obj;
        int i10 = this.a;
        if (i10 != y8Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != y8Var.o || this.p != y8Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != y8Var.g || this.h != y8Var.h || this.i != y8Var.i || this.j != y8Var.j || this.k != y8Var.k || this.m != y8Var.m || this.n != y8Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != y8Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, y8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, y8Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f, y8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, y8Var.e) || this.c != y8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != y8Var.c || !TextUtils.equals(this.e, y8Var.e) || this.k != y8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == y8Var.q && this.d == y8Var.d && TextUtils.equals(this.e, y8Var.e) && TextUtils.equals(this.f, y8Var.f))) {
            return this.a != 10 || this.q == y8Var.q;
        }
        return false;
    }
}
