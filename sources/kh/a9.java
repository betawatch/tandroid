package kh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a9 extends wf.a {
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

    public a9(int i9, boolean z10) {
        super(i9, z10);
        this.p = -1;
    }

    public static a9 b(String str, CharSequence charSequence, int i9) {
        a9 a9Var = new a9(9, false);
        a9Var.e = str;
        a9Var.f = charSequence;
        a9Var.q = i9;
        return a9Var;
    }

    public static a9 c() {
        return new a9(0, false);
    }

    public static a9 d() {
        a9 a9Var = new a9(-1, false);
        a9Var.o = -1;
        return a9Var;
    }

    public static a9 e() {
        return new a9(1, false);
    }

    public static a9 f() {
        return new a9(2, false);
    }

    public static a9 g(CharSequence charSequence) {
        a9 a9Var = new a9(6, false);
        a9Var.e = charSequence;
        return a9Var;
    }

    public static a9 h(int i9, int i10, boolean z10) {
        a9 a9Var = new a9(3, false);
        a9Var.i = i9;
        a9Var.k = z10;
        a9Var.j = i10;
        return a9Var;
    }

    public static a9 i(TLRPC.User user, boolean z10, boolean z11) {
        a9 a9Var = new a9(3, true);
        a9Var.g = user;
        a9Var.k = z10;
        a9Var.l = z11;
        return a9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a9.class != obj.getClass()) {
            return false;
        }
        a9 a9Var = (a9) obj;
        int i9 = this.a;
        if (i9 != a9Var.a) {
            return false;
        }
        if (i9 == -1 && (this.o != a9Var.o || this.p != a9Var.p)) {
            return false;
        }
        if (i9 == 3 && (this.g != a9Var.g || this.h != a9Var.h || this.i != a9Var.i || this.j != a9Var.j || this.k != a9Var.k || this.m != a9Var.m || this.n != a9Var.n)) {
            return false;
        }
        if (i9 == 0 && this.c != a9Var.c) {
            return false;
        }
        if (i9 == 2 && !TextUtils.equals(this.e, a9Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, a9Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, a9Var.e) && TextUtils.equals(this.f, a9Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, a9Var.e) || this.c != a9Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != a9Var.c || !TextUtils.equals(this.e, a9Var.e) || this.k != a9Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == a9Var.q && this.d == a9Var.d && TextUtils.equals(this.e, a9Var.e) && TextUtils.equals(this.f, a9Var.f))) {
            return this.a != 10 || this.q == a9Var.q;
        }
        return false;
    }
}
