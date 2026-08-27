package lh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x8 extends xf.a {
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

    public x8(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static x8 b(String str, CharSequence charSequence, int i10) {
        x8 x8Var = new x8(9, false);
        x8Var.e = str;
        x8Var.f = charSequence;
        x8Var.q = i10;
        return x8Var;
    }

    public static x8 c() {
        return new x8(0, false);
    }

    public static x8 d() {
        x8 x8Var = new x8(-1, false);
        x8Var.o = -1;
        return x8Var;
    }

    public static x8 e() {
        return new x8(1, false);
    }

    public static x8 f() {
        return new x8(2, false);
    }

    public static x8 g(CharSequence charSequence) {
        x8 x8Var = new x8(6, false);
        x8Var.e = charSequence;
        return x8Var;
    }

    public static x8 h(int i10, int i11, boolean z10) {
        x8 x8Var = new x8(3, false);
        x8Var.i = i10;
        x8Var.k = z10;
        x8Var.j = i11;
        return x8Var;
    }

    public static x8 i(TLRPC.User user, boolean z10, boolean z11) {
        x8 x8Var = new x8(3, true);
        x8Var.g = user;
        x8Var.k = z10;
        x8Var.l = z11;
        return x8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x8.class != obj.getClass()) {
            return false;
        }
        x8 x8Var = (x8) obj;
        int i10 = this.a;
        if (i10 != x8Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != x8Var.o || this.p != x8Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != x8Var.g || this.h != x8Var.h || this.i != x8Var.i || this.j != x8Var.j || this.k != x8Var.k || this.m != x8Var.m || this.n != x8Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != x8Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, x8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, x8Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, x8Var.e) && TextUtils.equals(this.f, x8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, x8Var.e) || this.c != x8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != x8Var.c || !TextUtils.equals(this.e, x8Var.e) || this.k != x8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == x8Var.q && this.d == x8Var.d && TextUtils.equals(this.e, x8Var.e) && TextUtils.equals(this.f, x8Var.f))) {
            return this.a != 10 || this.q == x8Var.q;
        }
        return false;
    }
}
