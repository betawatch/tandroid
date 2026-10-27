package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u8 extends qg.a {
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

    public u8(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static u8 b(String str, CharSequence charSequence, int i10) {
        u8 u8Var = new u8(9, false);
        u8Var.e = str;
        u8Var.f = charSequence;
        u8Var.q = i10;
        return u8Var;
    }

    public static u8 c() {
        return new u8(0, false);
    }

    public static u8 d() {
        u8 u8Var = new u8(-1, false);
        u8Var.o = -1;
        return u8Var;
    }

    public static u8 e() {
        return new u8(1, false);
    }

    public static u8 f() {
        return new u8(2, false);
    }

    public static u8 g(CharSequence charSequence) {
        u8 u8Var = new u8(6, false);
        u8Var.e = charSequence;
        return u8Var;
    }

    public static u8 h(int i10, int i11, boolean z10) {
        u8 u8Var = new u8(3, false);
        u8Var.i = i10;
        u8Var.k = z10;
        u8Var.j = i11;
        return u8Var;
    }

    public static u8 i(TLRPC.User user, boolean z10, boolean z11) {
        u8 u8Var = new u8(3, true);
        u8Var.g = user;
        u8Var.k = z10;
        u8Var.l = z11;
        return u8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u8.class != obj.getClass()) {
            return false;
        }
        u8 u8Var = (u8) obj;
        int i10 = this.a;
        if (i10 != u8Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != u8Var.o || this.p != u8Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != u8Var.g || this.h != u8Var.h || this.i != u8Var.i || this.j != u8Var.j || this.k != u8Var.k || this.m != u8Var.m || this.n != u8Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != u8Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, u8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, u8Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f, u8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, u8Var.e) || this.c != u8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != u8Var.c || !TextUtils.equals(this.e, u8Var.e) || this.k != u8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == u8Var.q && this.d == u8Var.d && TextUtils.equals(this.e, u8Var.e) && TextUtils.equals(this.f, u8Var.f))) {
            return this.a != 10 || this.q == u8Var.q;
        }
        return false;
    }
}
