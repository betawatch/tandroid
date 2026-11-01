package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b51 extends hg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.r20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.r20 F;
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

    public b51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static b51 A(String str, CharSequence charSequence, int i10) {
        b51 b51Var = new b51(41);
        b51Var.d = i10;
        b51Var.l = charSequence;
        b51Var.o = str;
        return b51Var;
    }

    public static b51 B(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.d = i10;
        b51Var.l = charSequence;
        return b51Var;
    }

    public static b51 C(CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.l = charSequence;
        return b51Var;
    }

    public static b51 D(int i10) {
        b51 b51Var = new b51(28);
        b51Var.z = i10;
        return b51Var;
    }

    public static b51 E(int i10, int i11) {
        b51 b51Var = new b51(28);
        b51Var.d = i10;
        b51Var.z = i11;
        return b51Var;
    }

    public static b51 F(int i10, String str) {
        b51 b51Var = new b51(39);
        b51Var.d = i10;
        b51Var.l = str;
        b51Var.z = 1;
        return b51Var;
    }

    public static a51 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (a51) longSparseArray.get(i10);
    }

    public static b51 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        a51 a51Var = (a51) L.get(cls);
        if (a51Var != null) {
            return new b51(a51Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static b51 b(String str) {
        b51 b51Var = new b51(1);
        b51Var.l = str;
        return b51Var;
    }

    public static b51 c(int i10, int i11, String str) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.k = i11;
        b51Var.l = str;
        return b51Var;
    }

    public static b51 d(int i10, int i11, String str, String str2) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.k = i11;
        b51Var.l = str;
        b51Var.n = str2;
        return b51Var;
    }

    public static b51 e(int i10, String str) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.l = str;
        return b51Var;
    }

    public static b51 f(String str, CharSequence charSequence, int i10) {
        b51 b51Var = new b51(3);
        b51Var.d = i10;
        b51Var.l = str;
        b51Var.n = charSequence;
        return b51Var;
    }

    public static b51 g(CharSequence charSequence) {
        b51 b51Var = new b51(7);
        b51Var.l = charSequence;
        b51Var.q = true;
        return b51Var;
    }

    public static b51 h(int i10, int i11, org.telegram.ui.e61 e61Var) {
        b51 b51Var = new b51(i10 + 18);
        b51Var.z = i11;
        b51Var.G = e61Var;
        return b51Var;
    }

    public static b51 i(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(4);
        b51Var.d = i10;
        b51Var.l = charSequence;
        return b51Var;
    }

    public static b51 j(int i10, View view) {
        b51 b51Var = new b51(-1);
        b51Var.d = i10;
        b51Var.c = view;
        b51Var.z = -1;
        return b51Var;
    }

    public static b51 k(View view) {
        b51 b51Var = new b51(-1);
        b51Var.c = view;
        b51Var.z = -1;
        return b51Var;
    }

    public static b51 l(int i10, View view) {
        b51 b51Var = new b51(-4);
        b51Var.d = i10;
        b51Var.c = view;
        b51Var.z = -1;
        return b51Var;
    }

    public static b51 m(View view) {
        b51 b51Var = new b51(-4);
        b51Var.c = view;
        b51Var.z = -1;
        return b51Var;
    }

    public static b51 n(View view, int i10) {
        b51 b51Var = new b51(-4);
        b51Var.c = view;
        b51Var.z = i10;
        return b51Var;
    }

    public static b51 o(int i10, String str, String str2) {
        b51 b51Var = new b51(40);
        b51Var.d = i10;
        b51Var.l = str;
        b51Var.o = str2;
        return b51Var;
    }

    public static b51 p(int i10) {
        b51 b51Var = new b51(34);
        b51Var.z = i10;
        return b51Var;
    }

    public static b51 q(int i10, int i11) {
        b51 b51Var = new b51(34);
        b51Var.d = i10;
        b51Var.z = i11;
        return b51Var;
    }

    public static b51 r(String str) {
        b51 b51Var = new b51(31);
        b51Var.l = str;
        return b51Var;
    }

    public static b51 s(String str, String str2, View.OnClickListener onClickListener) {
        b51 b51Var = new b51(31);
        b51Var.l = str;
        b51Var.m = str2;
        b51Var.D = onClickListener;
        return b51Var;
    }

    public static b51 t(int i10, String str) {
        b51 b51Var = new b51(0);
        b51Var.d = i10;
        b51Var.l = str;
        return b51Var;
    }

    public static b51 u(String str) {
        b51 b51Var = new b51(0);
        b51Var.l = str;
        return b51Var;
    }

    public static b51 v(org.telegram.ui.ie ieVar) {
        b51 b51Var = new b51(24);
        b51Var.G = ieVar;
        return b51Var;
    }

    public static b51 w(TLObject tLObject) {
        b51 b51Var = new b51(32);
        b51Var.G = tLObject;
        return b51Var;
    }

    public static b51 x(int i10, String str) {
        b51 b51Var = new b51(10);
        b51Var.d = i10;
        b51Var.l = str;
        return b51Var;
    }

    public static b51 y(int i10, String str, String str2) {
        b51 b51Var = new b51(44);
        b51Var.d = i10;
        b51Var.l = str;
        b51Var.n = str2;
        return b51Var;
    }

    public static b51 z(int i10, CharSequence charSequence) {
        b51 b51Var = new b51(35);
        b51Var.d = i10;
        b51Var.l = charSequence;
        return b51Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a51 a51Var;
        return this.a >= 10000 && (hashMap = L) != null && (a51Var = (a51) hashMap.get(cls)) != null && a51Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(b51 b51Var) {
        int i10 = this.a;
        if (i10 != b51Var.a || this.d != b51Var.d || this.g != b51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != b51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != b51Var.G || !TextUtils.equals(this.l, b51Var.l) || !TextUtils.equals(this.n, b51Var.n) || this.k != b51Var.k || this.q != b51Var.q || this.r != b51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, b51Var.l);
    }

    public final boolean J(b51 b51Var) {
        return this.d == b51Var.d && this.i == b51Var.i && this.x == b51Var.x && this.k == b51Var.k && this.j == b51Var.j && this.s == b51Var.s && this.r == b51Var.r && this.t == b51Var.t && this.q == b51Var.q && this.c == b51Var.c && TextUtils.equals(this.l, b51Var.l) && TextUtils.equals(this.m, b51Var.m) && TextUtils.equals(this.n, b51Var.n) && this.c == b51Var.c && this.z == b51Var.z && Math.abs(this.A - b51Var.A) < 0.01f && this.B == b51Var.B && Objects.equals(this.G, b51Var.G) && Objects.equals(this.H, b51Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // hg.b
    public final boolean a(hg.b bVar) {
        a51 G;
        if (this == bVar) {
            return true;
        }
        if (b51.class != bVar.getClass()) {
            return false;
        }
        b51 b51Var = (b51) bVar;
        int i10 = this.a;
        if (i10 != b51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, b51Var.l) && TextUtils.equals(this.m, b51Var.m) : i10 == 28 ? this.z == b51Var.z : (i10 == 35 || i10 == 37) ? this.d == b51Var.d && TextUtils.equals(this.l, b51Var.l) && this.e == b51Var.e : (i10 < 10000 || (G = G(i10)) == null) ? I(b51Var) : G.c(this, b51Var);
    }

    public final boolean equals(Object obj) {
        a51 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || b51.class != obj.getClass()) {
            return false;
        }
        b51 b51Var = (b51) obj;
        int i10 = this.a;
        if (i10 != b51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == b51Var.d : i10 == 28 ? this.d == b51Var.d : i10 == 31 ? TextUtils.equals(this.l, b51Var.l) : (i10 < 10000 || (G = G(i10)) == null) ? J(b51Var) : G.e(this, b51Var);
    }
}
