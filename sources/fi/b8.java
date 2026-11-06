package fi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b8 extends rg.a {
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

    public b8(int i7, boolean z9) {
        super(i7, z9);
        this.p = -1;
    }

    public static b8 b(String str, CharSequence charSequence, int i7) {
        b8 b8Var = new b8(9, false);
        b8Var.e = str;
        b8Var.f = charSequence;
        b8Var.q = i7;
        return b8Var;
    }

    public static b8 c() {
        return new b8(0, false);
    }

    public static b8 d() {
        b8 b8Var = new b8(-1, false);
        b8Var.o = -1;
        return b8Var;
    }

    public static b8 e() {
        return new b8(1, false);
    }

    public static b8 f() {
        return new b8(2, false);
    }

    public static b8 g(CharSequence charSequence) {
        b8 b8Var = new b8(6, false);
        b8Var.e = charSequence;
        return b8Var;
    }

    public static b8 h(int i7, int i10, boolean z9) {
        b8 b8Var = new b8(3, false);
        b8Var.i = i7;
        b8Var.k = z9;
        b8Var.j = i10;
        return b8Var;
    }

    public static b8 i(TLRPC.User user, boolean z9, boolean z10) {
        b8 b8Var = new b8(3, true);
        b8Var.g = user;
        b8Var.k = z9;
        b8Var.l = z10;
        return b8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b8.class != obj.getClass()) {
            return false;
        }
        b8 b8Var = (b8) obj;
        int i7 = this.a;
        if (i7 != b8Var.a) {
            return false;
        }
        if (i7 == -1 && (this.o != b8Var.o || this.p != b8Var.p)) {
            return false;
        }
        if (i7 == 3 && (this.g != b8Var.g || this.h != b8Var.h || this.i != b8Var.i || this.j != b8Var.j || this.k != b8Var.k || this.m != b8Var.m || this.n != b8Var.n)) {
            return false;
        }
        if (i7 == 0 && this.c != b8Var.c) {
            return false;
        }
        if (i7 == 2 && !TextUtils.equals(this.e, b8Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, b8Var.e)) {
            return false;
        }
        int i10 = this.a;
        if ((i10 == 4 || i10 == 11) && !(TextUtils.equals(this.e, b8Var.e) && TextUtils.equals(this.f, b8Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, b8Var.e) || this.c != b8Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != b8Var.c || !TextUtils.equals(this.e, b8Var.e) || this.k != b8Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == b8Var.q && this.d == b8Var.d && TextUtils.equals(this.e, b8Var.e) && TextUtils.equals(this.f, b8Var.f))) {
            return this.a != 10 || this.q == b8Var.q;
        }
        return false;
    }
}
