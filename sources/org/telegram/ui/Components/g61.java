package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ha1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class g61 extends og.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.t3 F;
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

    public g61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static g61 A(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.d = i10;
        g61Var.l = charSequence;
        return g61Var;
    }

    public static g61 B(CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.l = charSequence;
        return g61Var;
    }

    public static g61 C(int i10) {
        g61 g61Var = new g61(28);
        g61Var.z = i10;
        return g61Var;
    }

    public static g61 D(int i10, int i11) {
        g61 g61Var = new g61(28);
        g61Var.d = i10;
        g61Var.z = i11;
        return g61Var;
    }

    public static g61 E(int i10, String str) {
        g61 g61Var = new g61(39);
        g61Var.d = i10;
        g61Var.l = str;
        g61Var.z = 1;
        return g61Var;
    }

    public static f61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (f61) longSparseArray.get(i10);
    }

    public static g61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        f61 f61Var = (f61) L.get(cls);
        if (f61Var != null) {
            return new g61(f61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static g61 b(String str) {
        g61 g61Var = new g61(1);
        g61Var.l = str;
        return g61Var;
    }

    public static g61 c(int i10, int i11, String str) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.k = i11;
        g61Var.l = str;
        return g61Var;
    }

    public static g61 d(int i10, int i11, String str, String str2) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.k = i11;
        g61Var.l = str;
        g61Var.n = str2;
        return g61Var;
    }

    public static g61 e(int i10, String str) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.l = str;
        return g61Var;
    }

    public static g61 f(String str, CharSequence charSequence, int i10) {
        g61 g61Var = new g61(3);
        g61Var.d = i10;
        g61Var.l = str;
        g61Var.n = charSequence;
        return g61Var;
    }

    public static g61 g(CharSequence charSequence) {
        g61 g61Var = new g61(7);
        g61Var.l = charSequence;
        g61Var.q = true;
        return g61Var;
    }

    public static g61 h(int i10, int i11, ha1 ha1Var) {
        g61 g61Var = new g61(i10 + 18);
        g61Var.z = i11;
        g61Var.G = ha1Var;
        return g61Var;
    }

    public static g61 i(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(4);
        g61Var.d = i10;
        g61Var.l = charSequence;
        return g61Var;
    }

    public static g61 j(int i10, View view) {
        g61 g61Var = new g61(-1);
        g61Var.d = i10;
        g61Var.c = view;
        g61Var.z = -1;
        return g61Var;
    }

    public static g61 k(View view) {
        g61 g61Var = new g61(-1);
        g61Var.c = view;
        g61Var.z = -1;
        return g61Var;
    }

    public static g61 l(int i10, View view) {
        g61 g61Var = new g61(-4);
        g61Var.c = view;
        g61Var.z = i10;
        return g61Var;
    }

    public static g61 m(View view) {
        g61 g61Var = new g61(-4);
        g61Var.c = view;
        g61Var.z = -1;
        return g61Var;
    }

    public static g61 n(int i10, String str, String str2) {
        g61 g61Var = new g61(40);
        g61Var.d = i10;
        g61Var.l = str;
        g61Var.o = str2;
        return g61Var;
    }

    public static g61 o(int i10) {
        g61 g61Var = new g61(34);
        g61Var.z = i10;
        return g61Var;
    }

    public static g61 p(int i10, int i11) {
        g61 g61Var = new g61(34);
        g61Var.d = i10;
        g61Var.z = i11;
        return g61Var;
    }

    public static g61 q(String str) {
        g61 g61Var = new g61(31);
        g61Var.l = str;
        return g61Var;
    }

    public static g61 r(String str, String str2, View.OnClickListener onClickListener) {
        g61 g61Var = new g61(31);
        g61Var.l = str;
        g61Var.m = str2;
        g61Var.D = onClickListener;
        return g61Var;
    }

    public static g61 s(int i10, String str) {
        g61 g61Var = new g61(0);
        g61Var.d = i10;
        g61Var.l = str;
        return g61Var;
    }

    public static g61 t(String str) {
        g61 g61Var = new g61(0);
        g61Var.l = str;
        return g61Var;
    }

    public static g61 u(org.telegram.ui.je jeVar) {
        g61 g61Var = new g61(24);
        g61Var.G = jeVar;
        return g61Var;
    }

    public static g61 v(TLObject tLObject) {
        g61 g61Var = new g61(32);
        g61Var.G = tLObject;
        return g61Var;
    }

    public static g61 w(int i10, String str) {
        g61 g61Var = new g61(10);
        g61Var.d = i10;
        g61Var.l = str;
        return g61Var;
    }

    public static g61 x(int i10, String str, String str2) {
        g61 g61Var = new g61(44);
        g61Var.d = i10;
        g61Var.l = str;
        g61Var.n = str2;
        return g61Var;
    }

    public static g61 y(int i10, CharSequence charSequence) {
        g61 g61Var = new g61(35);
        g61Var.d = i10;
        g61Var.l = charSequence;
        return g61Var;
    }

    public static g61 z(String str, CharSequence charSequence, int i10) {
        g61 g61Var = new g61(41);
        g61Var.d = i10;
        g61Var.l = charSequence;
        g61Var.o = str;
        return g61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        f61 f61Var;
        return this.a >= 10000 && (hashMap = L) != null && (f61Var = (f61) hashMap.get(cls)) != null && f61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(g61 g61Var) {
        int i10 = this.a;
        if (i10 != g61Var.a || this.d != g61Var.d || this.g != g61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != g61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != g61Var.G || !TextUtils.equals(this.l, g61Var.l) || !TextUtils.equals(this.n, g61Var.n) || this.k != g61Var.k || this.q != g61Var.q || this.r != g61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, g61Var.l);
    }

    public final boolean I(g61 g61Var) {
        return this.d == g61Var.d && this.i == g61Var.i && this.x == g61Var.x && this.k == g61Var.k && this.j == g61Var.j && this.s == g61Var.s && this.r == g61Var.r && this.t == g61Var.t && this.q == g61Var.q && this.c == g61Var.c && TextUtils.equals(this.l, g61Var.l) && TextUtils.equals(this.m, g61Var.m) && TextUtils.equals(this.n, g61Var.n) && this.c == g61Var.c && this.z == g61Var.z && Math.abs(this.A - g61Var.A) < 0.01f && this.B == g61Var.B && Objects.equals(this.G, g61Var.G) && Objects.equals(this.H, g61Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        f61 F;
        if (this == aVar) {
            return true;
        }
        if (g61.class != aVar.getClass()) {
            return false;
        }
        g61 g61Var = (g61) aVar;
        int i10 = this.a;
        if (i10 != g61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, g61Var.l) && TextUtils.equals(this.m, g61Var.m) : i10 == 28 ? this.z == g61Var.z : (i10 == 35 || i10 == 37) ? this.d == g61Var.d && TextUtils.equals(this.l, g61Var.l) && this.e == g61Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(g61Var) : F.contentsEquals(this, g61Var);
    }

    public final boolean equals(Object obj) {
        f61 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || g61.class != obj.getClass()) {
            return false;
        }
        g61 g61Var = (g61) obj;
        int i10 = this.a;
        if (i10 != g61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == g61Var.d : i10 == 28 ? this.d == g61Var.d : i10 == 31 ? TextUtils.equals(this.l, g61Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(g61Var) : F.equals(this, g61Var);
    }
}
