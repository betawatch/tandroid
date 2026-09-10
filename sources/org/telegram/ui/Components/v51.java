package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v51 extends ng.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.u3 F;
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

    public v51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static v51 A(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.d = i10;
        v51Var.l = charSequence;
        return v51Var;
    }

    public static v51 B(CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.l = charSequence;
        return v51Var;
    }

    public static v51 C(int i10) {
        v51 v51Var = new v51(28);
        v51Var.z = i10;
        return v51Var;
    }

    public static v51 D(int i10, int i11) {
        v51 v51Var = new v51(28);
        v51Var.d = i10;
        v51Var.z = i11;
        return v51Var;
    }

    public static v51 E(int i10, String str) {
        v51 v51Var = new v51(39);
        v51Var.d = i10;
        v51Var.l = str;
        v51Var.z = 1;
        return v51Var;
    }

    public static u51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (u51) longSparseArray.get(i10);
    }

    public static v51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        u51 u51Var = (u51) L.get(cls);
        if (u51Var != null) {
            return new v51(u51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static v51 b(String str) {
        v51 v51Var = new v51(1);
        v51Var.l = str;
        return v51Var;
    }

    public static v51 c(int i10, int i11, String str) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.k = i11;
        v51Var.l = str;
        return v51Var;
    }

    public static v51 d(int i10, int i11, String str, String str2) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.k = i11;
        v51Var.l = str;
        v51Var.n = str2;
        return v51Var;
    }

    public static v51 e(int i10, String str) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.l = str;
        return v51Var;
    }

    public static v51 f(String str, CharSequence charSequence, int i10) {
        v51 v51Var = new v51(3);
        v51Var.d = i10;
        v51Var.l = str;
        v51Var.n = charSequence;
        return v51Var;
    }

    public static v51 g(CharSequence charSequence) {
        v51 v51Var = new v51(7);
        v51Var.l = charSequence;
        v51Var.q = true;
        return v51Var;
    }

    public static v51 h(int i10, int i11, ra1 ra1Var) {
        v51 v51Var = new v51(i10 + 18);
        v51Var.z = i11;
        v51Var.G = ra1Var;
        return v51Var;
    }

    public static v51 i(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(4);
        v51Var.d = i10;
        v51Var.l = charSequence;
        return v51Var;
    }

    public static v51 j(int i10, View view) {
        v51 v51Var = new v51(-1);
        v51Var.d = i10;
        v51Var.c = view;
        v51Var.z = -1;
        return v51Var;
    }

    public static v51 k(View view) {
        v51 v51Var = new v51(-1);
        v51Var.c = view;
        v51Var.z = -1;
        return v51Var;
    }

    public static v51 l(View view) {
        v51 v51Var = new v51(-4);
        v51Var.c = view;
        v51Var.z = -1;
        return v51Var;
    }

    public static v51 m(int i10, String str, String str2) {
        v51 v51Var = new v51(40);
        v51Var.d = i10;
        v51Var.l = str;
        v51Var.o = str2;
        return v51Var;
    }

    public static v51 n(int i10) {
        v51 v51Var = new v51(34);
        v51Var.z = i10;
        return v51Var;
    }

    public static v51 o(int i10, int i11) {
        v51 v51Var = new v51(34);
        v51Var.d = i10;
        v51Var.z = i11;
        return v51Var;
    }

    public static v51 p(View view, int i10, boolean z10) {
        v51 v51Var = new v51(-3);
        v51Var.c = view;
        v51Var.z = i10;
        v51Var.y = z10 ? 1 : 0;
        return v51Var;
    }

    public static v51 q(String str) {
        v51 v51Var = new v51(31);
        v51Var.l = str;
        return v51Var;
    }

    public static v51 r(String str, String str2, View.OnClickListener onClickListener) {
        v51 v51Var = new v51(31);
        v51Var.l = str;
        v51Var.m = str2;
        v51Var.D = onClickListener;
        return v51Var;
    }

    public static v51 s(int i10, String str) {
        v51 v51Var = new v51(0);
        v51Var.d = i10;
        v51Var.l = str;
        return v51Var;
    }

    public static v51 t(String str) {
        v51 v51Var = new v51(0);
        v51Var.l = str;
        return v51Var;
    }

    public static v51 u(org.telegram.ui.ie ieVar) {
        v51 v51Var = new v51(24);
        v51Var.G = ieVar;
        return v51Var;
    }

    public static v51 v(TLObject tLObject) {
        v51 v51Var = new v51(32);
        v51Var.G = tLObject;
        return v51Var;
    }

    public static v51 w(int i10, String str) {
        v51 v51Var = new v51(10);
        v51Var.d = i10;
        v51Var.l = str;
        return v51Var;
    }

    public static v51 x(int i10, String str, String str2) {
        v51 v51Var = new v51(44);
        v51Var.d = i10;
        v51Var.l = str;
        v51Var.n = str2;
        return v51Var;
    }

    public static v51 y(int i10, CharSequence charSequence) {
        v51 v51Var = new v51(35);
        v51Var.d = i10;
        v51Var.l = charSequence;
        return v51Var;
    }

    public static v51 z(String str, CharSequence charSequence, int i10) {
        v51 v51Var = new v51(41);
        v51Var.d = i10;
        v51Var.l = charSequence;
        v51Var.o = str;
        return v51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        u51 u51Var;
        return this.a >= 10000 && (hashMap = L) != null && (u51Var = (u51) hashMap.get(cls)) != null && u51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(v51 v51Var) {
        int i10 = this.a;
        if (i10 != v51Var.a || this.d != v51Var.d || this.g != v51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != v51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != v51Var.G || !TextUtils.equals(this.l, v51Var.l) || !TextUtils.equals(this.n, v51Var.n) || this.k != v51Var.k || this.q != v51Var.q || this.r != v51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, v51Var.l);
    }

    public final boolean I(v51 v51Var) {
        return this.d == v51Var.d && this.i == v51Var.i && this.x == v51Var.x && this.k == v51Var.k && this.j == v51Var.j && this.s == v51Var.s && this.r == v51Var.r && this.t == v51Var.t && this.q == v51Var.q && this.c == v51Var.c && TextUtils.equals(this.l, v51Var.l) && TextUtils.equals(this.m, v51Var.m) && TextUtils.equals(this.n, v51Var.n) && this.c == v51Var.c && this.z == v51Var.z && Math.abs(this.A - v51Var.A) < 0.01f && this.B == v51Var.B && Objects.equals(this.G, v51Var.G) && Objects.equals(this.H, v51Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // ng.a
    public final boolean a(ng.a aVar) {
        u51 F;
        if (this == aVar) {
            return true;
        }
        if (v51.class != aVar.getClass()) {
            return false;
        }
        v51 v51Var = (v51) aVar;
        int i10 = this.a;
        if (i10 != v51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, v51Var.l) && TextUtils.equals(this.m, v51Var.m) : i10 == 28 ? this.z == v51Var.z : (i10 == 35 || i10 == 37) ? this.d == v51Var.d && TextUtils.equals(this.l, v51Var.l) && this.e == v51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(v51Var) : F.contentsEquals(this, v51Var);
    }

    public final boolean equals(Object obj) {
        u51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || v51.class != obj.getClass()) {
            return false;
        }
        v51 v51Var = (v51) obj;
        int i10 = this.a;
        if (i10 != v51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == v51Var.d : i10 == 28 ? this.d == v51Var.d : i10 == 31 ? TextUtils.equals(this.l, v51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(v51Var) : F.equals(this, v51Var);
    }
}
