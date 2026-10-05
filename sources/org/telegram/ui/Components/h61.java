package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.fa1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h61 extends og.a {
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

    public h61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static h61 A(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(41);
        h61Var.d = i10;
        h61Var.l = charSequence;
        h61Var.o = str;
        return h61Var;
    }

    public static h61 B(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.d = i10;
        h61Var.l = charSequence;
        return h61Var;
    }

    public static h61 C(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.l = charSequence;
        return h61Var;
    }

    public static h61 D(int i10) {
        h61 h61Var = new h61(28);
        h61Var.z = i10;
        return h61Var;
    }

    public static h61 E(int i10, int i11) {
        h61 h61Var = new h61(28);
        h61Var.d = i10;
        h61Var.z = i11;
        return h61Var;
    }

    public static h61 F(int i10, String str) {
        h61 h61Var = new h61(39);
        h61Var.d = i10;
        h61Var.l = str;
        h61Var.z = 1;
        return h61Var;
    }

    public static g61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g61) longSparseArray.get(i10);
    }

    public static h61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g61 g61Var = (g61) L.get(cls);
        if (g61Var != null) {
            return new h61(g61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h61 b(String str) {
        h61 h61Var = new h61(1);
        h61Var.l = str;
        return h61Var;
    }

    public static h61 c(int i10, int i11, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.k = i11;
        h61Var.l = str;
        return h61Var;
    }

    public static h61 d(int i10, int i11, String str, String str2) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.k = i11;
        h61Var.l = str;
        h61Var.n = str2;
        return h61Var;
    }

    public static h61 e(int i10, String str) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.l = str;
        return h61Var;
    }

    public static h61 f(String str, CharSequence charSequence, int i10) {
        h61 h61Var = new h61(3);
        h61Var.d = i10;
        h61Var.l = str;
        h61Var.n = charSequence;
        return h61Var;
    }

    public static h61 g(CharSequence charSequence) {
        h61 h61Var = new h61(7);
        h61Var.l = charSequence;
        h61Var.q = true;
        return h61Var;
    }

    public static h61 h(int i10, int i11, fa1 fa1Var) {
        h61 h61Var = new h61(i10 + 18);
        h61Var.z = i11;
        h61Var.G = fa1Var;
        return h61Var;
    }

    public static h61 i(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(4);
        h61Var.d = i10;
        h61Var.l = charSequence;
        return h61Var;
    }

    public static h61 j(int i10, View view) {
        h61 h61Var = new h61(-1);
        h61Var.d = i10;
        h61Var.c = view;
        h61Var.z = -1;
        return h61Var;
    }

    public static h61 k(View view) {
        h61 h61Var = new h61(-1);
        h61Var.c = view;
        h61Var.z = -1;
        return h61Var;
    }

    public static h61 l(int i10, View view) {
        h61 h61Var = new h61(-4);
        h61Var.d = i10;
        h61Var.c = view;
        h61Var.z = -1;
        return h61Var;
    }

    public static h61 m(View view) {
        h61 h61Var = new h61(-4);
        h61Var.c = view;
        h61Var.z = -1;
        return h61Var;
    }

    public static h61 n(View view, int i10) {
        h61 h61Var = new h61(-4);
        h61Var.c = view;
        h61Var.z = i10;
        return h61Var;
    }

    public static h61 o(int i10, String str, String str2) {
        h61 h61Var = new h61(40);
        h61Var.d = i10;
        h61Var.l = str;
        h61Var.o = str2;
        return h61Var;
    }

    public static h61 p(int i10) {
        h61 h61Var = new h61(34);
        h61Var.z = i10;
        return h61Var;
    }

    public static h61 q(int i10, int i11) {
        h61 h61Var = new h61(34);
        h61Var.d = i10;
        h61Var.z = i11;
        return h61Var;
    }

    public static h61 r(String str) {
        h61 h61Var = new h61(31);
        h61Var.l = str;
        return h61Var;
    }

    public static h61 s(String str, String str2, View.OnClickListener onClickListener) {
        h61 h61Var = new h61(31);
        h61Var.l = str;
        h61Var.m = str2;
        h61Var.D = onClickListener;
        return h61Var;
    }

    public static h61 t(int i10, String str) {
        h61 h61Var = new h61(0);
        h61Var.d = i10;
        h61Var.l = str;
        return h61Var;
    }

    public static h61 u(String str) {
        h61 h61Var = new h61(0);
        h61Var.l = str;
        return h61Var;
    }

    public static h61 v(org.telegram.ui.je jeVar) {
        h61 h61Var = new h61(24);
        h61Var.G = jeVar;
        return h61Var;
    }

    public static h61 w(TLObject tLObject) {
        h61 h61Var = new h61(32);
        h61Var.G = tLObject;
        return h61Var;
    }

    public static h61 x(int i10, String str) {
        h61 h61Var = new h61(10);
        h61Var.d = i10;
        h61Var.l = str;
        return h61Var;
    }

    public static h61 y(int i10, String str, String str2) {
        h61 h61Var = new h61(44);
        h61Var.d = i10;
        h61Var.l = str;
        h61Var.n = str2;
        return h61Var;
    }

    public static h61 z(int i10, CharSequence charSequence) {
        h61 h61Var = new h61(35);
        h61Var.d = i10;
        h61Var.l = charSequence;
        return h61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        g61 g61Var;
        return this.a >= 10000 && (hashMap = L) != null && (g61Var = (g61) hashMap.get(cls)) != null && g61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(h61 h61Var) {
        int i10 = this.a;
        if (i10 != h61Var.a || this.d != h61Var.d || this.g != h61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != h61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != h61Var.G || !TextUtils.equals(this.l, h61Var.l) || !TextUtils.equals(this.n, h61Var.n) || this.k != h61Var.k || this.q != h61Var.q || this.r != h61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, h61Var.l);
    }

    public final boolean J(h61 h61Var) {
        return this.d == h61Var.d && this.i == h61Var.i && this.x == h61Var.x && this.k == h61Var.k && this.j == h61Var.j && this.s == h61Var.s && this.r == h61Var.r && this.t == h61Var.t && this.q == h61Var.q && this.c == h61Var.c && TextUtils.equals(this.l, h61Var.l) && TextUtils.equals(this.m, h61Var.m) && TextUtils.equals(this.n, h61Var.n) && this.c == h61Var.c && this.z == h61Var.z && Math.abs(this.A - h61Var.A) < 0.01f && this.B == h61Var.B && Objects.equals(this.G, h61Var.G) && Objects.equals(this.H, h61Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        g61 G;
        if (this == aVar) {
            return true;
        }
        if (h61.class != aVar.getClass()) {
            return false;
        }
        h61 h61Var = (h61) aVar;
        int i10 = this.a;
        if (i10 != h61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, h61Var.l) && TextUtils.equals(this.m, h61Var.m) : i10 == 28 ? this.z == h61Var.z : (i10 == 35 || i10 == 37) ? this.d == h61Var.d && TextUtils.equals(this.l, h61Var.l) && this.e == h61Var.e : (i10 < 10000 || (G = G(i10)) == null) ? I(h61Var) : G.contentsEquals(this, h61Var);
    }

    public final boolean equals(Object obj) {
        g61 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || h61.class != obj.getClass()) {
            return false;
        }
        h61 h61Var = (h61) obj;
        int i10 = this.a;
        if (i10 != h61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == h61Var.d : i10 == 28 ? this.d == h61Var.d : i10 == 31 ? TextUtils.equals(this.l, h61Var.l) : (i10 < 10000 || (G = G(i10)) == null) ? J(h61Var) : G.equals(this, h61Var);
    }
}
