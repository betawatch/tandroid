package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l41 extends rg.a {
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

    public l41(int i7) {
        super(i7, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static l41 A(String str, CharSequence charSequence, int i7) {
        l41 l41Var = new l41(41);
        l41Var.d = i7;
        l41Var.m = charSequence;
        l41Var.p = str;
        return l41Var;
    }

    public static l41 B(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.d = i7;
        l41Var.m = charSequence;
        return l41Var;
    }

    public static l41 C(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.m = charSequence;
        return l41Var;
    }

    public static l41 D(int i7) {
        l41 l41Var = new l41(28);
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 E(int i7, int i10) {
        l41 l41Var = new l41(28);
        l41Var.d = i7;
        l41Var.A = i10;
        return l41Var;
    }

    public static l41 F(int i7, String str) {
        l41 l41Var = new l41(39);
        l41Var.d = i7;
        l41Var.m = str;
        l41Var.A = 1;
        return l41Var;
    }

    public static k41 G(int i7) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (k41) longSparseArray.get(i7);
    }

    public static l41 K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        k41 k41Var = (k41) M.get(cls);
        if (k41Var != null) {
            return new l41(k41Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l41 b(String str) {
        l41 l41Var = new l41(1);
        l41Var.m = str;
        return l41Var;
    }

    public static l41 c(int i7, int i10, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.k = i10;
        l41Var.m = str;
        return l41Var;
    }

    public static l41 d(int i7, int i10, String str, String str2) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.k = i10;
        l41Var.m = str;
        l41Var.o = str2;
        return l41Var;
    }

    public static l41 e(int i7, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.m = str;
        return l41Var;
    }

    public static l41 f(String str, CharSequence charSequence, int i7) {
        l41 l41Var = new l41(3);
        l41Var.d = i7;
        l41Var.m = str;
        l41Var.o = charSequence;
        return l41Var;
    }

    public static l41 g(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.m = charSequence;
        l41Var.r = true;
        return l41Var;
    }

    public static l41 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        l41 l41Var = new l41(i7 + 18);
        l41Var.A = i10;
        l41Var.H = o41Var;
        return l41Var;
    }

    public static l41 i(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(4);
        l41Var.d = i7;
        l41Var.m = charSequence;
        return l41Var;
    }

    public static l41 j(int i7, View view) {
        l41 l41Var = new l41(-1);
        l41Var.d = i7;
        l41Var.c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 k(View view) {
        l41 l41Var = new l41(-1);
        l41Var.c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 l(int i7, View view) {
        l41 l41Var = new l41(-4);
        l41Var.d = i7;
        l41Var.c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 m(View view) {
        l41 l41Var = new l41(-4);
        l41Var.c = view;
        l41Var.A = -1;
        return l41Var;
    }

    public static l41 n(View view, int i7) {
        l41 l41Var = new l41(-4);
        l41Var.c = view;
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 o(int i7, String str, String str2) {
        l41 l41Var = new l41(40);
        l41Var.d = i7;
        l41Var.m = str;
        l41Var.p = str2;
        return l41Var;
    }

    public static l41 p(int i7) {
        l41 l41Var = new l41(34);
        l41Var.A = i7;
        return l41Var;
    }

    public static l41 q(int i7, int i10) {
        l41 l41Var = new l41(34);
        l41Var.d = i7;
        l41Var.A = i10;
        return l41Var;
    }

    public static l41 r(String str) {
        l41 l41Var = new l41(31);
        l41Var.m = str;
        return l41Var;
    }

    public static l41 s(String str, String str2, View.OnClickListener onClickListener) {
        l41 l41Var = new l41(31);
        l41Var.m = str;
        l41Var.n = str2;
        l41Var.E = onClickListener;
        return l41Var;
    }

    public static l41 t(int i7, String str) {
        l41 l41Var = new l41(0);
        l41Var.d = i7;
        l41Var.m = str;
        return l41Var;
    }

    public static l41 u(CharSequence charSequence) {
        l41 l41Var = new l41(0);
        l41Var.m = charSequence;
        return l41Var;
    }

    public static l41 v(org.telegram.ui.ud udVar) {
        l41 l41Var = new l41(24);
        l41Var.H = udVar;
        return l41Var;
    }

    public static l41 w(TLObject tLObject) {
        l41 l41Var = new l41(32);
        l41Var.H = tLObject;
        return l41Var;
    }

    public static l41 x(int i7, String str) {
        l41 l41Var = new l41(10);
        l41Var.d = i7;
        l41Var.m = str;
        return l41Var;
    }

    public static l41 y(int i7, String str, String str2) {
        l41 l41Var = new l41(44);
        l41Var.d = i7;
        l41Var.m = str;
        l41Var.o = str2;
        return l41Var;
    }

    public static l41 z(int i7, CharSequence charSequence) {
        l41 l41Var = new l41(35);
        l41Var.d = i7;
        l41Var.m = charSequence;
        return l41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        k41 k41Var;
        return this.a >= 10000 && (hashMap = M) != null && (k41Var = (k41) hashMap.get(cls)) != null && k41Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.m == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(l41 l41Var) {
        int i7 = this.a;
        if (i7 != l41Var.a || this.d != l41Var.d || this.g != l41Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.A != l41Var.A) {
                            return false;
                        }
                    }
                } else if (this.m == null) {
                }
            } else if (this.H != l41Var.H || !TextUtils.equals(this.m, l41Var.m) || !TextUtils.equals(this.o, l41Var.o) || this.k != l41Var.k || this.r != l41Var.r || this.s != l41Var.s) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.m, l41Var.m);
    }

    public final boolean J(l41 l41Var) {
        return this.d == l41Var.d && this.i == l41Var.i && this.y == l41Var.y && this.k == l41Var.k && this.j == l41Var.j && this.t == l41Var.t && this.s == l41Var.s && this.u == l41Var.u && this.r == l41Var.r && this.c == l41Var.c && TextUtils.equals(this.m, l41Var.m) && TextUtils.equals(this.n, l41Var.n) && TextUtils.equals(this.o, l41Var.o) && this.c == l41Var.c && this.A == l41Var.A && Math.abs(this.B - l41Var.B) < 0.01f && this.C == l41Var.C && this.l == l41Var.l && Objects.equals(this.H, l41Var.H) && Objects.equals(this.I, l41Var.I);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        k41 G;
        if (this == aVar) {
            return true;
        }
        if (l41.class != aVar.getClass()) {
            return false;
        }
        l41 l41Var = (l41) aVar;
        int i7 = this.a;
        if (i7 != l41Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.m, l41Var.m) && TextUtils.equals(this.n, l41Var.n) : i7 == 28 ? this.A == l41Var.A : (i7 == 35 || i7 == 37) ? this.d == l41Var.d && TextUtils.equals(this.m, l41Var.m) && this.e == l41Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(l41Var) : G.c(this, l41Var);
    }

    public final boolean equals(Object obj) {
        k41 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || l41.class != obj.getClass()) {
            return false;
        }
        l41 l41Var = (l41) obj;
        int i7 = this.a;
        if (i7 != l41Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == l41Var.d : i7 == 28 ? this.d == l41Var.d : i7 == 31 ? TextUtils.equals(this.m, l41Var.m) : (i7 < 10000 || (G = G(i7)) == null) ? J(l41Var) : G.e(this, l41Var);
    }
}
