package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a51 extends hg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.q20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.q20 F;
    public Object G;
    public Object H;
    public boolean I;
    public View c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public CharSequence o;
    public String[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public long x;
    public int y;
    public int z;

    public a51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static a51 A(String str, CharSequence charSequence, int i10) {
        a51 a51Var = new a51(41);
        a51Var.d = i10;
        a51Var.l = charSequence;
        a51Var.o = str;
        return a51Var;
    }

    public static a51 B(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.d = i10;
        a51Var.l = charSequence;
        return a51Var;
    }

    public static a51 C(CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.l = charSequence;
        return a51Var;
    }

    public static a51 D(int i10) {
        a51 a51Var = new a51(28);
        a51Var.z = i10;
        return a51Var;
    }

    public static a51 E(int i10, int i11) {
        a51 a51Var = new a51(28);
        a51Var.d = i10;
        a51Var.z = i11;
        return a51Var;
    }

    public static a51 F(int i10, String str) {
        a51 a51Var = new a51(39);
        a51Var.d = i10;
        a51Var.l = str;
        a51Var.z = 1;
        return a51Var;
    }

    public static z41 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (z41) longSparseArray.get(i10);
    }

    public static a51 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        z41 z41Var = (z41) L.get(cls);
        if (z41Var != null) {
            return new a51(z41Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static a51 b(String str) {
        a51 a51Var = new a51(1);
        a51Var.l = str;
        return a51Var;
    }

    public static a51 c(int i10, int i11, String str) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.k = i11;
        a51Var.l = str;
        return a51Var;
    }

    public static a51 d(int i10, int i11, String str, String str2) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.k = i11;
        a51Var.l = str;
        a51Var.n = str2;
        return a51Var;
    }

    public static a51 e(int i10, String str) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.l = str;
        return a51Var;
    }

    public static a51 f(String str, CharSequence charSequence, int i10) {
        a51 a51Var = new a51(3);
        a51Var.d = i10;
        a51Var.l = str;
        a51Var.n = charSequence;
        return a51Var;
    }

    public static a51 g(CharSequence charSequence) {
        a51 a51Var = new a51(7);
        a51Var.l = charSequence;
        a51Var.q = true;
        return a51Var;
    }

    public static a51 h(int i10, int i11, org.telegram.ui.g61 g61Var) {
        a51 a51Var = new a51(i10 + 18);
        a51Var.z = i11;
        a51Var.G = g61Var;
        return a51Var;
    }

    public static a51 i(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(4);
        a51Var.d = i10;
        a51Var.l = charSequence;
        return a51Var;
    }

    public static a51 j(int i10, View view) {
        a51 a51Var = new a51(-1);
        a51Var.d = i10;
        a51Var.c = view;
        a51Var.z = -1;
        return a51Var;
    }

    public static a51 k(View view) {
        a51 a51Var = new a51(-1);
        a51Var.c = view;
        a51Var.z = -1;
        return a51Var;
    }

    public static a51 l(int i10, View view) {
        a51 a51Var = new a51(-4);
        a51Var.d = i10;
        a51Var.c = view;
        a51Var.z = -1;
        return a51Var;
    }

    public static a51 m(View view) {
        a51 a51Var = new a51(-4);
        a51Var.c = view;
        a51Var.z = -1;
        return a51Var;
    }

    public static a51 n(View view, int i10) {
        a51 a51Var = new a51(-4);
        a51Var.c = view;
        a51Var.z = i10;
        return a51Var;
    }

    public static a51 o(int i10, String str, String str2) {
        a51 a51Var = new a51(40);
        a51Var.d = i10;
        a51Var.l = str;
        a51Var.o = str2;
        return a51Var;
    }

    public static a51 p(int i10) {
        a51 a51Var = new a51(34);
        a51Var.z = i10;
        return a51Var;
    }

    public static a51 q(int i10, int i11) {
        a51 a51Var = new a51(34);
        a51Var.d = i10;
        a51Var.z = i11;
        return a51Var;
    }

    public static a51 r(String str) {
        a51 a51Var = new a51(31);
        a51Var.l = str;
        return a51Var;
    }

    public static a51 s(String str, String str2, View.OnClickListener onClickListener) {
        a51 a51Var = new a51(31);
        a51Var.l = str;
        a51Var.m = str2;
        a51Var.D = onClickListener;
        return a51Var;
    }

    public static a51 t(int i10, String str) {
        a51 a51Var = new a51(0);
        a51Var.d = i10;
        a51Var.l = str;
        return a51Var;
    }

    public static a51 u(String str) {
        a51 a51Var = new a51(0);
        a51Var.l = str;
        return a51Var;
    }

    public static a51 v(org.telegram.ui.ie ieVar) {
        a51 a51Var = new a51(24);
        a51Var.G = ieVar;
        return a51Var;
    }

    public static a51 w(TLObject tLObject) {
        a51 a51Var = new a51(32);
        a51Var.G = tLObject;
        return a51Var;
    }

    public static a51 x(int i10, String str) {
        a51 a51Var = new a51(10);
        a51Var.d = i10;
        a51Var.l = str;
        return a51Var;
    }

    public static a51 y(int i10, String str, String str2) {
        a51 a51Var = new a51(44);
        a51Var.d = i10;
        a51Var.l = str;
        a51Var.n = str2;
        return a51Var;
    }

    public static a51 z(int i10, CharSequence charSequence) {
        a51 a51Var = new a51(35);
        a51Var.d = i10;
        a51Var.l = charSequence;
        return a51Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        z41 z41Var;
        return this.a >= 10000 && (hashMap = L) != null && (z41Var = (z41) hashMap.get(cls)) != null && z41Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(a51 a51Var) {
        int i10 = this.a;
        if (i10 != a51Var.a || this.d != a51Var.d || this.g != a51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != a51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != a51Var.G || !TextUtils.equals(this.l, a51Var.l) || !TextUtils.equals(this.n, a51Var.n) || this.k != a51Var.k || this.q != a51Var.q || this.r != a51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, a51Var.l);
    }

    public final boolean J(a51 a51Var) {
        return this.d == a51Var.d && this.i == a51Var.i && this.x == a51Var.x && this.k == a51Var.k && this.j == a51Var.j && this.s == a51Var.s && this.r == a51Var.r && this.t == a51Var.t && this.q == a51Var.q && this.c == a51Var.c && TextUtils.equals(this.l, a51Var.l) && TextUtils.equals(this.m, a51Var.m) && TextUtils.equals(this.n, a51Var.n) && this.c == a51Var.c && this.z == a51Var.z && Math.abs(this.A - a51Var.A) < 0.01f && this.B == a51Var.B && Objects.equals(this.G, a51Var.G) && Objects.equals(this.H, a51Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // hg.b
    public final boolean a(hg.b bVar) {
        z41 G;
        if (this == bVar) {
            return true;
        }
        if (a51.class != bVar.getClass()) {
            return false;
        }
        a51 a51Var = (a51) bVar;
        int i10 = this.a;
        if (i10 != a51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, a51Var.l) && TextUtils.equals(this.m, a51Var.m) : i10 == 28 ? this.z == a51Var.z : (i10 == 35 || i10 == 37) ? this.d == a51Var.d && TextUtils.equals(this.l, a51Var.l) && this.e == a51Var.e : (i10 < 10000 || (G = G(i10)) == null) ? I(a51Var) : G.c(this, a51Var);
    }

    public final boolean equals(Object obj) {
        z41 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || a51.class != obj.getClass()) {
            return false;
        }
        a51 a51Var = (a51) obj;
        int i10 = this.a;
        if (i10 != a51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == a51Var.d : i10 == 28 ? this.d == a51Var.d : i10 == 31 ? TextUtils.equals(this.l, a51Var.l) : (i10 < 10000 || (G = G(i10)) == null) ? J(a51Var) : G.e(this, a51Var);
    }
}
