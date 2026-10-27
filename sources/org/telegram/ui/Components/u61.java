package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u61 extends qg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public Utilities.Callback F;
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

    public u61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static u61 A(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(41);
        u61Var.d = i10;
        u61Var.l = charSequence;
        u61Var.o = str;
        return u61Var;
    }

    public static u61 B(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.d = i10;
        u61Var.l = charSequence;
        return u61Var;
    }

    public static u61 C(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.l = charSequence;
        return u61Var;
    }

    public static u61 D(int i10) {
        u61 u61Var = new u61(28);
        u61Var.z = i10;
        return u61Var;
    }

    public static u61 E(int i10, int i11) {
        u61 u61Var = new u61(28);
        u61Var.d = i10;
        u61Var.z = i11;
        return u61Var;
    }

    public static u61 F(int i10, String str) {
        u61 u61Var = new u61(39);
        u61Var.d = i10;
        u61Var.l = str;
        u61Var.z = 1;
        return u61Var;
    }

    public static t61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (t61) longSparseArray.get(i10);
    }

    public static u61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        t61 t61Var = (t61) L.get(cls);
        if (t61Var != null) {
            return new u61(t61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static u61 b(String str) {
        u61 u61Var = new u61(1);
        u61Var.l = str;
        return u61Var;
    }

    public static u61 c(int i10, int i11, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.k = i11;
        u61Var.l = str;
        return u61Var;
    }

    public static u61 d(int i10, int i11, String str, String str2) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.k = i11;
        u61Var.l = str;
        u61Var.n = str2;
        return u61Var;
    }

    public static u61 e(int i10, String str) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.l = str;
        return u61Var;
    }

    public static u61 f(String str, CharSequence charSequence, int i10) {
        u61 u61Var = new u61(3);
        u61Var.d = i10;
        u61Var.l = str;
        u61Var.n = charSequence;
        return u61Var;
    }

    public static u61 g(CharSequence charSequence) {
        u61 u61Var = new u61(7);
        u61Var.l = charSequence;
        u61Var.q = true;
        return u61Var;
    }

    public static u61 h(int i10, int i11, org.telegram.ui.k91 k91Var) {
        u61 u61Var = new u61(i10 + 18);
        u61Var.z = i11;
        u61Var.G = k91Var;
        return u61Var;
    }

    public static u61 i(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(4);
        u61Var.d = i10;
        u61Var.l = charSequence;
        return u61Var;
    }

    public static u61 j(int i10, View view) {
        u61 u61Var = new u61(-1);
        u61Var.d = i10;
        u61Var.c = view;
        u61Var.z = -1;
        return u61Var;
    }

    public static u61 k(View view) {
        u61 u61Var = new u61(-1);
        u61Var.c = view;
        u61Var.z = -1;
        return u61Var;
    }

    public static u61 l(int i10, View view) {
        u61 u61Var = new u61(-4);
        u61Var.d = i10;
        u61Var.c = view;
        u61Var.z = -1;
        return u61Var;
    }

    public static u61 m(View view) {
        u61 u61Var = new u61(-4);
        u61Var.c = view;
        u61Var.z = -1;
        return u61Var;
    }

    public static u61 n(View view, int i10) {
        u61 u61Var = new u61(-4);
        u61Var.c = view;
        u61Var.z = i10;
        return u61Var;
    }

    public static u61 o(int i10, String str, String str2) {
        u61 u61Var = new u61(40);
        u61Var.d = i10;
        u61Var.l = str;
        u61Var.o = str2;
        return u61Var;
    }

    public static u61 p(int i10) {
        u61 u61Var = new u61(34);
        u61Var.z = i10;
        return u61Var;
    }

    public static u61 q(int i10, int i11) {
        u61 u61Var = new u61(34);
        u61Var.d = i10;
        u61Var.z = i11;
        return u61Var;
    }

    public static u61 r(String str) {
        u61 u61Var = new u61(31);
        u61Var.l = str;
        return u61Var;
    }

    public static u61 s(String str, String str2, View.OnClickListener onClickListener) {
        u61 u61Var = new u61(31);
        u61Var.l = str;
        u61Var.m = str2;
        u61Var.D = onClickListener;
        return u61Var;
    }

    public static u61 t(int i10, String str) {
        u61 u61Var = new u61(0);
        u61Var.d = i10;
        u61Var.l = str;
        return u61Var;
    }

    public static u61 u(String str) {
        u61 u61Var = new u61(0);
        u61Var.l = str;
        return u61Var;
    }

    public static u61 v(org.telegram.ui.he heVar) {
        u61 u61Var = new u61(24);
        u61Var.G = heVar;
        return u61Var;
    }

    public static u61 w(TLObject tLObject) {
        u61 u61Var = new u61(32);
        u61Var.G = tLObject;
        return u61Var;
    }

    public static u61 x(int i10, String str) {
        u61 u61Var = new u61(10);
        u61Var.d = i10;
        u61Var.l = str;
        return u61Var;
    }

    public static u61 y(int i10, String str, String str2) {
        u61 u61Var = new u61(44);
        u61Var.d = i10;
        u61Var.l = str;
        u61Var.n = str2;
        return u61Var;
    }

    public static u61 z(int i10, CharSequence charSequence) {
        u61 u61Var = new u61(35);
        u61Var.d = i10;
        u61Var.l = charSequence;
        return u61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        t61 t61Var;
        return this.a >= 10000 && (hashMap = L) != null && (t61Var = (t61) hashMap.get(cls)) != null && t61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(u61 u61Var) {
        int i10 = this.a;
        if (i10 != u61Var.a || this.d != u61Var.d || this.g != u61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != u61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != u61Var.G || !TextUtils.equals(this.l, u61Var.l) || !TextUtils.equals(this.n, u61Var.n) || this.k != u61Var.k || this.q != u61Var.q || this.r != u61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, u61Var.l);
    }

    public final boolean J(u61 u61Var) {
        return this.d == u61Var.d && this.i == u61Var.i && this.x == u61Var.x && this.k == u61Var.k && this.j == u61Var.j && this.s == u61Var.s && this.r == u61Var.r && this.t == u61Var.t && this.q == u61Var.q && this.c == u61Var.c && TextUtils.equals(this.l, u61Var.l) && TextUtils.equals(this.m, u61Var.m) && TextUtils.equals(this.n, u61Var.n) && this.c == u61Var.c && this.z == u61Var.z && Math.abs(this.A - u61Var.A) < 0.01f && this.B == u61Var.B && Objects.equals(this.G, u61Var.G) && Objects.equals(this.H, u61Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // qg.a
    public final boolean a(qg.a aVar) {
        t61 G;
        if (this == aVar) {
            return true;
        }
        if (u61.class != aVar.getClass()) {
            return false;
        }
        u61 u61Var = (u61) aVar;
        int i10 = this.a;
        if (i10 != u61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, u61Var.l) && TextUtils.equals(this.m, u61Var.m) : i10 == 28 ? this.z == u61Var.z : (i10 == 35 || i10 == 37) ? this.d == u61Var.d && TextUtils.equals(this.l, u61Var.l) && this.e == u61Var.e : (i10 < 10000 || (G = G(i10)) == null) ? I(u61Var) : G.contentsEquals(this, u61Var);
    }

    public final boolean equals(Object obj) {
        t61 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || u61.class != obj.getClass()) {
            return false;
        }
        u61 u61Var = (u61) obj;
        int i10 = this.a;
        if (i10 != u61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == u61Var.d : i10 == 28 ? this.d == u61Var.d : i10 == 31 ? TextUtils.equals(this.l, u61Var.l) : (i10 < 10000 || (G = G(i10)) == null) ? J(u61Var) : G.equals(this, u61Var);
    }
}
