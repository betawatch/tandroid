package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n41 extends rg.a {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public org.telegram.messenger.w10 D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public org.telegram.messenger.w10 G;
    public Object H;
    public Object I;
    public boolean J;
    public View c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public Drawable l;
    public CharSequence m;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    public String[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public int z;

    public n41(int i7) {
        super(i7, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static n41 A(String str, CharSequence charSequence, int i7) {
        n41 n41Var = new n41(41);
        n41Var.d = i7;
        n41Var.m = charSequence;
        n41Var.p = str;
        return n41Var;
    }

    public static n41 B(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.d = i7;
        n41Var.m = charSequence;
        return n41Var;
    }

    public static n41 C(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.m = charSequence;
        return n41Var;
    }

    public static n41 D(int i7) {
        n41 n41Var = new n41(28);
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 E(int i7, int i10) {
        n41 n41Var = new n41(28);
        n41Var.d = i7;
        n41Var.A = i10;
        return n41Var;
    }

    public static n41 F(int i7, String str) {
        n41 n41Var = new n41(39);
        n41Var.d = i7;
        n41Var.m = str;
        n41Var.A = 1;
        return n41Var;
    }

    public static m41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (m41) longSparseArray.get(i7);
    }

    public static n41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        m41 m41Var = (m41) M.get(cls);
        if (m41Var != null) {
            return new n41(m41Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static n41 b(String str) {
        n41 n41Var = new n41(1);
        n41Var.m = str;
        return n41Var;
    }

    public static n41 c(int i7, int i10, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.k = i10;
        n41Var.m = str;
        return n41Var;
    }

    public static n41 d(int i7, int i10, String str, String str2) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.k = i10;
        n41Var.m = str;
        n41Var.o = str2;
        return n41Var;
    }

    public static n41 e(int i7, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.m = str;
        return n41Var;
    }

    public static n41 f(String str, CharSequence charSequence, int i7) {
        n41 n41Var = new n41(3);
        n41Var.d = i7;
        n41Var.m = str;
        n41Var.o = charSequence;
        return n41Var;
    }

    public static n41 g(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.m = charSequence;
        n41Var.r = true;
        return n41Var;
    }

    public static n41 h(int i7, int i10, org.telegram.ui.n41 n41Var) {
        n41 n41Var2 = new n41(i7 + 18);
        n41Var2.A = i10;
        n41Var2.H = n41Var;
        return n41Var2;
    }

    public static n41 i(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(4);
        n41Var.d = i7;
        n41Var.m = charSequence;
        return n41Var;
    }

    public static n41 j(int i7, View view) {
        n41 n41Var = new n41(-1);
        n41Var.d = i7;
        n41Var.c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 k(View view) {
        n41 n41Var = new n41(-1);
        n41Var.c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 l(int i7, View view) {
        n41 n41Var = new n41(-4);
        n41Var.d = i7;
        n41Var.c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 m(View view) {
        n41 n41Var = new n41(-4);
        n41Var.c = view;
        n41Var.A = -1;
        return n41Var;
    }

    public static n41 n(View view, int i7) {
        n41 n41Var = new n41(-4);
        n41Var.c = view;
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 o(int i7, String str, String str2) {
        n41 n41Var = new n41(40);
        n41Var.d = i7;
        n41Var.m = str;
        n41Var.p = str2;
        return n41Var;
    }

    public static n41 p(int i7) {
        n41 n41Var = new n41(34);
        n41Var.A = i7;
        return n41Var;
    }

    public static n41 q(int i7, int i10) {
        n41 n41Var = new n41(34);
        n41Var.d = i7;
        n41Var.A = i10;
        return n41Var;
    }

    public static n41 r(String str) {
        n41 n41Var = new n41(31);
        n41Var.m = str;
        return n41Var;
    }

    public static n41 s(String str, String str2, View.OnClickListener onClickListener) {
        n41 n41Var = new n41(31);
        n41Var.m = str;
        n41Var.n = str2;
        n41Var.E = onClickListener;
        return n41Var;
    }

    public static n41 t(int i7, String str) {
        n41 n41Var = new n41(0);
        n41Var.d = i7;
        n41Var.m = str;
        return n41Var;
    }

    public static n41 u(CharSequence charSequence) {
        n41 n41Var = new n41(0);
        n41Var.m = charSequence;
        return n41Var;
    }

    public static n41 v(org.telegram.ui.ud udVar) {
        n41 n41Var = new n41(24);
        n41Var.H = udVar;
        return n41Var;
    }

    public static n41 w(TLObject tLObject) {
        n41 n41Var = new n41(32);
        n41Var.H = tLObject;
        return n41Var;
    }

    public static n41 x(int i7, String str) {
        n41 n41Var = new n41(10);
        n41Var.d = i7;
        n41Var.m = str;
        return n41Var;
    }

    public static n41 y(int i7, String str, String str2) {
        n41 n41Var = new n41(44);
        n41Var.d = i7;
        n41Var.m = str;
        n41Var.o = str2;
        return n41Var;
    }

    public static n41 z(int i7, CharSequence charSequence) {
        n41 n41Var = new n41(35);
        n41Var.d = i7;
        n41Var.m = charSequence;
        return n41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        m41 m41Var;
        return this.a >= 10000 && (hashMap = M) != null && (m41Var = (m41) hashMap.get(cls)) != null && m41Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.m == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(n41 n41Var) {
        int i7 = this.a;
        if (i7 != n41Var.a || this.d != n41Var.d || this.g != n41Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.A != n41Var.A) {
                            return false;
                        }
                    }
                } else if (this.m == null) {
                }
            } else if (this.H != n41Var.H || !TextUtils.equals(this.m, n41Var.m) || !TextUtils.equals(this.o, n41Var.o) || this.k != n41Var.k || this.r != n41Var.r || this.s != n41Var.s) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.m, n41Var.m);
    }

    public final boolean J(n41 n41Var) {
        return this.d == n41Var.d && this.i == n41Var.i && this.y == n41Var.y && this.k == n41Var.k && this.j == n41Var.j && this.t == n41Var.t && this.s == n41Var.s && this.u == n41Var.u && this.r == n41Var.r && this.c == n41Var.c && TextUtils.equals(this.m, n41Var.m) && TextUtils.equals(this.n, n41Var.n) && TextUtils.equals(this.o, n41Var.o) && this.c == n41Var.c && this.A == n41Var.A && Math.abs(this.B - n41Var.B) < 0.01f && this.C == n41Var.C && this.l == n41Var.l && Objects.equals(this.H, n41Var.H) && Objects.equals(this.I, n41Var.I);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        m41 G;
        if (this == aVar) {
            return true;
        }
        if (n41.class != aVar.getClass()) {
            return false;
        }
        n41 n41Var = (n41) aVar;
        int i7 = this.a;
        if (i7 != n41Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.m, n41Var.m) && TextUtils.equals(this.n, n41Var.n) : i7 == 28 ? this.A == n41Var.A : (i7 == 35 || i7 == 37) ? this.d == n41Var.d && TextUtils.equals(this.m, n41Var.m) && this.e == n41Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(n41Var) : G.c(this, n41Var);
    }

    public final boolean equals(Object obj) {
        m41 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || n41.class != obj.getClass()) {
            return false;
        }
        n41 n41Var = (n41) obj;
        int i7 = this.a;
        if (i7 != n41Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == n41Var.d : i7 == 28 ? this.d == n41Var.d : i7 == 31 ? TextUtils.equals(this.m, n41Var.m) : (i7 < 10000 || (G = G(i7)) == null) ? J(n41Var) : G.e(this, n41Var);
    }
}
