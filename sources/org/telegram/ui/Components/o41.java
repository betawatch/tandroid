package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o41 extends rg.a {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public org.telegram.messenger.x10 D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public org.telegram.messenger.x10 G;
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

    public o41(int i7) {
        super(i7, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static o41 A(String str, CharSequence charSequence, int i7) {
        o41 o41Var = new o41(41);
        o41Var.d = i7;
        o41Var.m = charSequence;
        o41Var.p = str;
        return o41Var;
    }

    public static o41 B(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.d = i7;
        o41Var.m = charSequence;
        return o41Var;
    }

    public static o41 C(CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.m = charSequence;
        return o41Var;
    }

    public static o41 D(int i7) {
        o41 o41Var = new o41(28);
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 E(int i7, int i10) {
        o41 o41Var = new o41(28);
        o41Var.d = i7;
        o41Var.A = i10;
        return o41Var;
    }

    public static o41 F(int i7, String str) {
        o41 o41Var = new o41(39);
        o41Var.d = i7;
        o41Var.m = str;
        o41Var.A = 1;
        return o41Var;
    }

    public static n41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (n41) longSparseArray.get(i7);
    }

    public static o41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        n41 n41Var = (n41) M.get(cls);
        if (n41Var != null) {
            return new o41(n41Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static o41 b(String str) {
        o41 o41Var = new o41(1);
        o41Var.m = str;
        return o41Var;
    }

    public static o41 c(int i7, int i10, String str) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.k = i10;
        o41Var.m = str;
        return o41Var;
    }

    public static o41 d(int i7, int i10, String str, String str2) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.k = i10;
        o41Var.m = str;
        o41Var.o = str2;
        return o41Var;
    }

    public static o41 e(int i7, String str) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.m = str;
        return o41Var;
    }

    public static o41 f(String str, CharSequence charSequence, int i7) {
        o41 o41Var = new o41(3);
        o41Var.d = i7;
        o41Var.m = str;
        o41Var.o = charSequence;
        return o41Var;
    }

    public static o41 g(CharSequence charSequence) {
        o41 o41Var = new o41(7);
        o41Var.m = charSequence;
        o41Var.r = true;
        return o41Var;
    }

    public static o41 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        o41 o41Var2 = new o41(i7 + 18);
        o41Var2.A = i10;
        o41Var2.H = o41Var;
        return o41Var2;
    }

    public static o41 i(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(4);
        o41Var.d = i7;
        o41Var.m = charSequence;
        return o41Var;
    }

    public static o41 j(int i7, View view) {
        o41 o41Var = new o41(-1);
        o41Var.d = i7;
        o41Var.c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 k(View view) {
        o41 o41Var = new o41(-1);
        o41Var.c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 l(int i7, View view) {
        o41 o41Var = new o41(-4);
        o41Var.d = i7;
        o41Var.c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 m(View view) {
        o41 o41Var = new o41(-4);
        o41Var.c = view;
        o41Var.A = -1;
        return o41Var;
    }

    public static o41 n(View view, int i7) {
        o41 o41Var = new o41(-4);
        o41Var.c = view;
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 o(int i7, String str, String str2) {
        o41 o41Var = new o41(40);
        o41Var.d = i7;
        o41Var.m = str;
        o41Var.p = str2;
        return o41Var;
    }

    public static o41 p(int i7) {
        o41 o41Var = new o41(34);
        o41Var.A = i7;
        return o41Var;
    }

    public static o41 q(int i7, int i10) {
        o41 o41Var = new o41(34);
        o41Var.d = i7;
        o41Var.A = i10;
        return o41Var;
    }

    public static o41 r(String str) {
        o41 o41Var = new o41(31);
        o41Var.m = str;
        return o41Var;
    }

    public static o41 s(String str, String str2, View.OnClickListener onClickListener) {
        o41 o41Var = new o41(31);
        o41Var.m = str;
        o41Var.n = str2;
        o41Var.E = onClickListener;
        return o41Var;
    }

    public static o41 t(int i7, String str) {
        o41 o41Var = new o41(0);
        o41Var.d = i7;
        o41Var.m = str;
        return o41Var;
    }

    public static o41 u(CharSequence charSequence) {
        o41 o41Var = new o41(0);
        o41Var.m = charSequence;
        return o41Var;
    }

    public static o41 v(org.telegram.ui.ud udVar) {
        o41 o41Var = new o41(24);
        o41Var.H = udVar;
        return o41Var;
    }

    public static o41 w(TLObject tLObject) {
        o41 o41Var = new o41(32);
        o41Var.H = tLObject;
        return o41Var;
    }

    public static o41 x(int i7, String str) {
        o41 o41Var = new o41(10);
        o41Var.d = i7;
        o41Var.m = str;
        return o41Var;
    }

    public static o41 y(int i7, String str, String str2) {
        o41 o41Var = new o41(44);
        o41Var.d = i7;
        o41Var.m = str;
        o41Var.o = str2;
        return o41Var;
    }

    public static o41 z(int i7, CharSequence charSequence) {
        o41 o41Var = new o41(35);
        o41Var.d = i7;
        o41Var.m = charSequence;
        return o41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        n41 n41Var;
        return this.a >= 10000 && (hashMap = M) != null && (n41Var = (n41) hashMap.get(cls)) != null && n41Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.m == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(o41 o41Var) {
        int i7 = this.a;
        if (i7 != o41Var.a || this.d != o41Var.d || this.g != o41Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.A != o41Var.A) {
                            return false;
                        }
                    }
                } else if (this.m == null) {
                }
            } else if (this.H != o41Var.H || !TextUtils.equals(this.m, o41Var.m) || !TextUtils.equals(this.o, o41Var.o) || this.k != o41Var.k || this.r != o41Var.r || this.s != o41Var.s) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.m, o41Var.m);
    }

    public final boolean J(o41 o41Var) {
        return this.d == o41Var.d && this.i == o41Var.i && this.y == o41Var.y && this.k == o41Var.k && this.j == o41Var.j && this.t == o41Var.t && this.s == o41Var.s && this.u == o41Var.u && this.r == o41Var.r && this.c == o41Var.c && TextUtils.equals(this.m, o41Var.m) && TextUtils.equals(this.n, o41Var.n) && TextUtils.equals(this.o, o41Var.o) && this.c == o41Var.c && this.A == o41Var.A && Math.abs(this.B - o41Var.B) < 0.01f && this.C == o41Var.C && this.l == o41Var.l && Objects.equals(this.H, o41Var.H) && Objects.equals(this.I, o41Var.I);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        n41 G;
        if (this == aVar) {
            return true;
        }
        if (o41.class != aVar.getClass()) {
            return false;
        }
        o41 o41Var = (o41) aVar;
        int i7 = this.a;
        if (i7 != o41Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.m, o41Var.m) && TextUtils.equals(this.n, o41Var.n) : i7 == 28 ? this.A == o41Var.A : (i7 == 35 || i7 == 37) ? this.d == o41Var.d && TextUtils.equals(this.m, o41Var.m) && this.e == o41Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(o41Var) : G.c(this, o41Var);
    }

    public final boolean equals(Object obj) {
        n41 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || o41.class != obj.getClass()) {
            return false;
        }
        o41 o41Var = (o41) obj;
        int i7 = this.a;
        if (i7 != o41Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == o41Var.d : i7 == 28 ? this.d == o41Var.d : i7 == 31 ? TextUtils.equals(this.m, o41Var.m) : (i7 < 10000 || (G = G(i7)) == null) ? J(o41Var) : G.e(this, o41Var);
    }
}
