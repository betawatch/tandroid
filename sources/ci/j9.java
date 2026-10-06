package ci;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class j9 extends og.a {
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

    public j9(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static j9 b(String str, CharSequence charSequence, int i10) {
        j9 j9Var = new j9(9, false);
        j9Var.e = str;
        j9Var.f = charSequence;
        j9Var.q = i10;
        return j9Var;
    }

    public static j9 c() {
        return new j9(0, false);
    }

    public static j9 d() {
        j9 j9Var = new j9(-1, false);
        j9Var.o = -1;
        return j9Var;
    }

    public static j9 e() {
        return new j9(1, false);
    }

    public static j9 f() {
        return new j9(2, false);
    }

    public static j9 g(CharSequence charSequence) {
        j9 j9Var = new j9(6, false);
        j9Var.e = charSequence;
        return j9Var;
    }

    public static j9 h(int i10, int i11, boolean z10) {
        j9 j9Var = new j9(3, false);
        j9Var.i = i10;
        j9Var.k = z10;
        j9Var.j = i11;
        return j9Var;
    }

    public static j9 i(TLRPC.User user, boolean z10, boolean z11) {
        j9 j9Var = new j9(3, true);
        j9Var.g = user;
        j9Var.k = z10;
        j9Var.l = z11;
        return j9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j9.class != obj.getClass()) {
            return false;
        }
        j9 j9Var = (j9) obj;
        int i10 = this.a;
        if (i10 != j9Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != j9Var.o || this.p != j9Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != j9Var.g || this.h != j9Var.h || this.i != j9Var.i || this.j != j9Var.j || this.k != j9Var.k || this.m != j9Var.m || this.n != j9Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != j9Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, j9Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, j9Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f, j9Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, j9Var.e) || this.c != j9Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != j9Var.c || !TextUtils.equals(this.e, j9Var.e) || this.k != j9Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == j9Var.q && this.d == j9Var.d && TextUtils.equals(this.e, j9Var.e) && TextUtils.equals(this.f, j9Var.f))) {
            return this.a != 10 || this.q == j9Var.q;
        }
        return false;
    }
}
