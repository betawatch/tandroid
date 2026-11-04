package gi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a8 extends sg.a {
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

    public a8(int i3, boolean z10) {
        super(i3, z10);
        this.p = -1;
    }

    public static a8 b(String str, CharSequence charSequence, int i3) {
        a8 a8Var = new a8(9, false);
        a8Var.e = str;
        a8Var.f = charSequence;
        a8Var.q = i3;
        return a8Var;
    }

    public static a8 c() {
        return new a8(0, false);
    }

    public static a8 d() {
        a8 a8Var = new a8(-1, false);
        a8Var.o = -1;
        return a8Var;
    }

    public static a8 e() {
        return new a8(1, false);
    }

    public static a8 f() {
        return new a8(2, false);
    }

    public static a8 g(CharSequence charSequence) {
        a8 a8Var = new a8(6, false);
        a8Var.e = charSequence;
        return a8Var;
    }

    public static a8 h(int i3, int i10, boolean z10) {
        a8 a8Var = new a8(3, false);
        a8Var.i = i3;
        a8Var.k = z10;
        a8Var.j = i10;
        return a8Var;
    }

    public static a8 i(TLRPC.User user, boolean z10, boolean z11) {
        a8 a8Var = new a8(3, true);
        a8Var.g = user;
        a8Var.k = z10;
        a8Var.l = z11;
        return a8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a8.class != obj.getClass()) {
            return false;
        }
        a8 a8Var = (a8) obj;
        int i3 = this.a;
        if (i3 != a8Var.a) {
            return false;
        }
        if (i3 == -1 && (this.o != a8Var.o || this.p != a8Var.p)) {
            return false;
        }
        if (i3 == 3 && (this.g != a8Var.g || this.h != a8Var.h || this.i != a8Var.i || this.j != a8Var.j || this.k != a8Var.k || this.m != a8Var.m || this.n != a8Var.n)) {
            return false;
        }
        if (i3 == 0 && this.c != a8Var.c) {
            return false;
        }
        if (i3 == 2 && !TextUtils.equals(this.e, a8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, a8Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, a8Var.e) && TextUtils.equals(this.f, a8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, a8Var.e) || this.c != a8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != a8Var.c || !TextUtils.equals(this.e, a8Var.e) || this.k != a8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == a8Var.q && this.d == a8Var.d && TextUtils.equals(this.e, a8Var.e) && TextUtils.equals(this.f, a8Var.f))) {
            return this.a != 10 || this.q == a8Var.q;
        }
        return false;
    }
}
