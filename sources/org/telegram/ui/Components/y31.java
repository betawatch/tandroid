package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y31 extends rg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.c20 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.c20 F;
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

    public y31(int i7) {
        super(i7, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static y31 A(String str, CharSequence charSequence, int i7) {
        y31 y31Var = new y31(41);
        y31Var.d = i7;
        y31Var.l = charSequence;
        y31Var.o = str;
        return y31Var;
    }

    public static y31 B(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.d = i7;
        y31Var.l = charSequence;
        return y31Var;
    }

    public static y31 C(CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.l = charSequence;
        return y31Var;
    }

    public static y31 D(int i7) {
        y31 y31Var = new y31(28);
        y31Var.z = i7;
        return y31Var;
    }

    public static y31 E(int i7, int i10) {
        y31 y31Var = new y31(28);
        y31Var.d = i7;
        y31Var.z = i10;
        return y31Var;
    }

    public static y31 F(int i7, String str) {
        y31 y31Var = new y31(39);
        y31Var.d = i7;
        y31Var.l = str;
        y31Var.z = 1;
        return y31Var;
    }

    public static x31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (x31) longSparseArray.get(i7);
    }

    public static y31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        x31 x31Var = (x31) L.get(cls);
        if (x31Var != null) {
            return new y31(x31Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static y31 b(String str) {
        y31 y31Var = new y31(1);
        y31Var.l = str;
        return y31Var;
    }

    public static y31 c(int i7, int i10, String str) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.k = i10;
        y31Var.l = str;
        return y31Var;
    }

    public static y31 d(int i7, int i10, String str, String str2) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.k = i10;
        y31Var.l = str;
        y31Var.n = str2;
        return y31Var;
    }

    public static y31 e(int i7, String str) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.l = str;
        return y31Var;
    }

    public static y31 f(String str, CharSequence charSequence, int i7) {
        y31 y31Var = new y31(3);
        y31Var.d = i7;
        y31Var.l = str;
        y31Var.n = charSequence;
        return y31Var;
    }

    public static y31 g(CharSequence charSequence) {
        y31 y31Var = new y31(7);
        y31Var.l = charSequence;
        y31Var.q = true;
        return y31Var;
    }

    public static y31 h(int i7, int i10, org.telegram.ui.p41 p41Var) {
        y31 y31Var = new y31(i7 + 18);
        y31Var.z = i10;
        y31Var.G = p41Var;
        return y31Var;
    }

    public static y31 i(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(4);
        y31Var.d = i7;
        y31Var.l = charSequence;
        return y31Var;
    }

    public static y31 j(int i7, View view) {
        y31 y31Var = new y31(-1);
        y31Var.d = i7;
        y31Var.c = view;
        y31Var.z = -1;
        return y31Var;
    }

    public static y31 k(View view) {
        y31 y31Var = new y31(-1);
        y31Var.c = view;
        y31Var.z = -1;
        return y31Var;
    }

    public static y31 l(int i7, View view) {
        y31 y31Var = new y31(-4);
        y31Var.d = i7;
        y31Var.c = view;
        y31Var.z = -1;
        return y31Var;
    }

    public static y31 m(View view) {
        y31 y31Var = new y31(-4);
        y31Var.c = view;
        y31Var.z = -1;
        return y31Var;
    }

    public static y31 n(View view, int i7) {
        y31 y31Var = new y31(-4);
        y31Var.c = view;
        y31Var.z = i7;
        return y31Var;
    }

    public static y31 o(int i7, String str, String str2) {
        y31 y31Var = new y31(40);
        y31Var.d = i7;
        y31Var.l = str;
        y31Var.o = str2;
        return y31Var;
    }

    public static y31 p(int i7) {
        y31 y31Var = new y31(34);
        y31Var.z = i7;
        return y31Var;
    }

    public static y31 q(int i7, int i10) {
        y31 y31Var = new y31(34);
        y31Var.d = i7;
        y31Var.z = i10;
        return y31Var;
    }

    public static y31 r(String str) {
        y31 y31Var = new y31(31);
        y31Var.l = str;
        return y31Var;
    }

    public static y31 s(String str, String str2, View.OnClickListener onClickListener) {
        y31 y31Var = new y31(31);
        y31Var.l = str;
        y31Var.m = str2;
        y31Var.D = onClickListener;
        return y31Var;
    }

    public static y31 t(int i7, String str) {
        y31 y31Var = new y31(0);
        y31Var.d = i7;
        y31Var.l = str;
        return y31Var;
    }

    public static y31 u(String str) {
        y31 y31Var = new y31(0);
        y31Var.l = str;
        return y31Var;
    }

    public static y31 v(org.telegram.ui.wd wdVar) {
        y31 y31Var = new y31(24);
        y31Var.G = wdVar;
        return y31Var;
    }

    public static y31 w(TLObject tLObject) {
        y31 y31Var = new y31(32);
        y31Var.G = tLObject;
        return y31Var;
    }

    public static y31 x(int i7, String str) {
        y31 y31Var = new y31(10);
        y31Var.d = i7;
        y31Var.l = str;
        return y31Var;
    }

    public static y31 y(int i7, String str, String str2) {
        y31 y31Var = new y31(44);
        y31Var.d = i7;
        y31Var.l = str;
        y31Var.n = str2;
        return y31Var;
    }

    public static y31 z(int i7, CharSequence charSequence) {
        y31 y31Var = new y31(35);
        y31Var.d = i7;
        y31Var.l = charSequence;
        return y31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        x31 x31Var;
        return this.a >= 10000 && (hashMap = L) != null && (x31Var = (x31) hashMap.get(cls)) != null && x31Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(y31 y31Var) {
        int i7 = this.a;
        if (i7 != y31Var.a || this.d != y31Var.d || this.g != y31Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.z != y31Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != y31Var.G || !TextUtils.equals(this.l, y31Var.l) || !TextUtils.equals(this.n, y31Var.n) || this.k != y31Var.k || this.q != y31Var.q || this.r != y31Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, y31Var.l);
    }

    public final boolean J(y31 y31Var) {
        return this.d == y31Var.d && this.i == y31Var.i && this.x == y31Var.x && this.k == y31Var.k && this.j == y31Var.j && this.s == y31Var.s && this.r == y31Var.r && this.t == y31Var.t && this.q == y31Var.q && this.c == y31Var.c && TextUtils.equals(this.l, y31Var.l) && TextUtils.equals(this.m, y31Var.m) && TextUtils.equals(this.n, y31Var.n) && this.c == y31Var.c && this.z == y31Var.z && Math.abs(this.A - y31Var.A) < 0.01f && this.B == y31Var.B && Objects.equals(this.G, y31Var.G) && Objects.equals(this.H, y31Var.H);
    }

    public final void L(boolean z9) {
        this.e = z9;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        x31 G;
        if (this == aVar) {
            return true;
        }
        if (y31.class != aVar.getClass()) {
            return false;
        }
        y31 y31Var = (y31) aVar;
        int i7 = this.a;
        if (i7 != y31Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.l, y31Var.l) && TextUtils.equals(this.m, y31Var.m) : i7 == 28 ? this.z == y31Var.z : (i7 == 35 || i7 == 37) ? this.d == y31Var.d && TextUtils.equals(this.l, y31Var.l) && this.e == y31Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(y31Var) : G.c(this, y31Var);
    }

    public final boolean equals(Object obj) {
        x31 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || y31.class != obj.getClass()) {
            return false;
        }
        y31 y31Var = (y31) obj;
        int i7 = this.a;
        if (i7 != y31Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == y31Var.d : i7 == 28 ? this.d == y31Var.d : i7 == 31 ? TextUtils.equals(this.l, y31Var.l) : (i7 < 10000 || (G = G(i7)) == null) ? J(y31Var) : G.e(this, y31Var);
    }
}
