package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h51 extends pg.a {
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

    public h51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static h51 A(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.d = i10;
        h51Var.l = charSequence;
        return h51Var;
    }

    public static h51 B(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.l = charSequence;
        return h51Var;
    }

    public static h51 C(int i10) {
        h51 h51Var = new h51(28);
        h51Var.z = i10;
        return h51Var;
    }

    public static h51 D(int i10, int i11) {
        h51 h51Var = new h51(28);
        h51Var.d = i10;
        h51Var.z = i11;
        return h51Var;
    }

    public static h51 E(int i10, String str) {
        h51 h51Var = new h51(39);
        h51Var.d = i10;
        h51Var.l = str;
        h51Var.z = 1;
        return h51Var;
    }

    public static g51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (g51) longSparseArray.get(i10);
    }

    public static h51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        g51 g51Var = (g51) L.get(cls);
        if (g51Var != null) {
            return new h51(g51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static h51 b(String str) {
        h51 h51Var = new h51(1);
        h51Var.l = str;
        return h51Var;
    }

    public static h51 c(int i10, int i11, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.k = i11;
        h51Var.l = str;
        return h51Var;
    }

    public static h51 d(int i10, int i11, String str, String str2) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.k = i11;
        h51Var.l = str;
        h51Var.n = str2;
        return h51Var;
    }

    public static h51 e(int i10, String str) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.l = str;
        return h51Var;
    }

    public static h51 f(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(3);
        h51Var.d = i10;
        h51Var.l = str;
        h51Var.n = charSequence;
        return h51Var;
    }

    public static h51 g(CharSequence charSequence) {
        h51 h51Var = new h51(7);
        h51Var.l = charSequence;
        h51Var.q = true;
        return h51Var;
    }

    public static h51 h(int i10, int i11, na1 na1Var) {
        h51 h51Var = new h51(i10 + 18);
        h51Var.z = i11;
        h51Var.G = na1Var;
        return h51Var;
    }

    public static h51 i(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(4);
        h51Var.d = i10;
        h51Var.l = charSequence;
        return h51Var;
    }

    public static h51 j(int i10, View view) {
        h51 h51Var = new h51(-1);
        h51Var.d = i10;
        h51Var.c = view;
        h51Var.z = -1;
        return h51Var;
    }

    public static h51 k(View view) {
        h51 h51Var = new h51(-1);
        h51Var.c = view;
        h51Var.z = -1;
        return h51Var;
    }

    public static h51 l(View view) {
        h51 h51Var = new h51(-4);
        h51Var.c = view;
        h51Var.z = -1;
        return h51Var;
    }

    public static h51 m(int i10, String str, String str2) {
        h51 h51Var = new h51(40);
        h51Var.d = i10;
        h51Var.l = str;
        h51Var.o = str2;
        return h51Var;
    }

    public static h51 n(int i10) {
        h51 h51Var = new h51(34);
        h51Var.z = i10;
        return h51Var;
    }

    public static h51 o(int i10, int i11) {
        h51 h51Var = new h51(34);
        h51Var.d = i10;
        h51Var.z = i11;
        return h51Var;
    }

    public static h51 p(View view, int i10, boolean z10) {
        h51 h51Var = new h51(-3);
        h51Var.c = view;
        h51Var.z = i10;
        h51Var.y = z10 ? 1 : 0;
        return h51Var;
    }

    public static h51 q(String str) {
        h51 h51Var = new h51(31);
        h51Var.l = str;
        return h51Var;
    }

    public static h51 r(String str, String str2, View.OnClickListener onClickListener) {
        h51 h51Var = new h51(31);
        h51Var.l = str;
        h51Var.m = str2;
        h51Var.D = onClickListener;
        return h51Var;
    }

    public static h51 s(int i10, String str) {
        h51 h51Var = new h51(0);
        h51Var.d = i10;
        h51Var.l = str;
        return h51Var;
    }

    public static h51 t(String str) {
        h51 h51Var = new h51(0);
        h51Var.l = str;
        return h51Var;
    }

    public static h51 u(org.telegram.ui.he heVar) {
        h51 h51Var = new h51(24);
        h51Var.G = heVar;
        return h51Var;
    }

    public static h51 v(TLObject tLObject) {
        h51 h51Var = new h51(32);
        h51Var.G = tLObject;
        return h51Var;
    }

    public static h51 w(int i10, String str) {
        h51 h51Var = new h51(10);
        h51Var.d = i10;
        h51Var.l = str;
        return h51Var;
    }

    public static h51 x(int i10, String str, String str2) {
        h51 h51Var = new h51(44);
        h51Var.d = i10;
        h51Var.l = str;
        h51Var.n = str2;
        return h51Var;
    }

    public static h51 y(int i10, CharSequence charSequence) {
        h51 h51Var = new h51(35);
        h51Var.d = i10;
        h51Var.l = charSequence;
        return h51Var;
    }

    public static h51 z(String str, CharSequence charSequence, int i10) {
        h51 h51Var = new h51(41);
        h51Var.d = i10;
        h51Var.l = charSequence;
        h51Var.o = str;
        return h51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        g51 g51Var;
        return this.a >= 10000 && (hashMap = L) != null && (g51Var = (g51) hashMap.get(cls)) != null && g51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(h51 h51Var) {
        int i10 = this.a;
        if (i10 != h51Var.a || this.d != h51Var.d || this.g != h51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != h51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != h51Var.G || !TextUtils.equals(this.l, h51Var.l) || !TextUtils.equals(this.n, h51Var.n) || this.k != h51Var.k || this.q != h51Var.q || this.r != h51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, h51Var.l);
    }

    public final boolean I(h51 h51Var) {
        return this.d == h51Var.d && this.i == h51Var.i && this.x == h51Var.x && this.k == h51Var.k && this.j == h51Var.j && this.s == h51Var.s && this.r == h51Var.r && this.t == h51Var.t && this.q == h51Var.q && this.c == h51Var.c && TextUtils.equals(this.l, h51Var.l) && TextUtils.equals(this.m, h51Var.m) && TextUtils.equals(this.n, h51Var.n) && this.c == h51Var.c && this.z == h51Var.z && Math.abs(this.A - h51Var.A) < 0.01f && this.B == h51Var.B && Objects.equals(this.G, h51Var.G) && Objects.equals(this.H, h51Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        g51 F;
        if (this == aVar) {
            return true;
        }
        if (h51.class != aVar.getClass()) {
            return false;
        }
        h51 h51Var = (h51) aVar;
        int i10 = this.a;
        if (i10 != h51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, h51Var.l) && TextUtils.equals(this.m, h51Var.m) : i10 == 28 ? this.z == h51Var.z : (i10 == 35 || i10 == 37) ? this.d == h51Var.d && TextUtils.equals(this.l, h51Var.l) && this.e == h51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(h51Var) : F.contentsEquals(this, h51Var);
    }

    public final boolean equals(Object obj) {
        g51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || h51.class != obj.getClass()) {
            return false;
        }
        h51 h51Var = (h51) obj;
        int i10 = this.a;
        if (i10 != h51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == h51Var.d : i10 == 28 ? this.d == h51Var.d : i10 == 31 ? TextUtils.equals(this.l, h51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(h51Var) : F.equals(this, h51Var);
    }
}
