package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x31 extends rg.a {
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

    public x31(int i7) {
        super(i7, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static x31 A(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(41);
        x31Var.d = i7;
        x31Var.l = charSequence;
        x31Var.o = str;
        return x31Var;
    }

    public static x31 B(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.d = i7;
        x31Var.l = charSequence;
        return x31Var;
    }

    public static x31 C(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.l = charSequence;
        return x31Var;
    }

    public static x31 D(int i7) {
        x31 x31Var = new x31(28);
        x31Var.z = i7;
        return x31Var;
    }

    public static x31 E(int i7, int i10) {
        x31 x31Var = new x31(28);
        x31Var.d = i7;
        x31Var.z = i10;
        return x31Var;
    }

    public static x31 F(int i7, String str) {
        x31 x31Var = new x31(39);
        x31Var.d = i7;
        x31Var.l = str;
        x31Var.z = 1;
        return x31Var;
    }

    public static w31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (w31) longSparseArray.get(i7);
    }

    public static x31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        w31 w31Var = (w31) L.get(cls);
        if (w31Var != null) {
            return new x31(w31Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static x31 b(String str) {
        x31 x31Var = new x31(1);
        x31Var.l = str;
        return x31Var;
    }

    public static x31 c(int i7, int i10, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.k = i10;
        x31Var.l = str;
        return x31Var;
    }

    public static x31 d(int i7, int i10, String str, String str2) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.k = i10;
        x31Var.l = str;
        x31Var.n = str2;
        return x31Var;
    }

    public static x31 e(int i7, String str) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.l = str;
        return x31Var;
    }

    public static x31 f(String str, CharSequence charSequence, int i7) {
        x31 x31Var = new x31(3);
        x31Var.d = i7;
        x31Var.l = str;
        x31Var.n = charSequence;
        return x31Var;
    }

    public static x31 g(CharSequence charSequence) {
        x31 x31Var = new x31(7);
        x31Var.l = charSequence;
        x31Var.q = true;
        return x31Var;
    }

    public static x31 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        x31 x31Var = new x31(i7 + 18);
        x31Var.z = i10;
        x31Var.G = o41Var;
        return x31Var;
    }

    public static x31 i(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(4);
        x31Var.d = i7;
        x31Var.l = charSequence;
        return x31Var;
    }

    public static x31 j(int i7, View view) {
        x31 x31Var = new x31(-1);
        x31Var.d = i7;
        x31Var.c = view;
        x31Var.z = -1;
        return x31Var;
    }

    public static x31 k(View view) {
        x31 x31Var = new x31(-1);
        x31Var.c = view;
        x31Var.z = -1;
        return x31Var;
    }

    public static x31 l(int i7, View view) {
        x31 x31Var = new x31(-4);
        x31Var.d = i7;
        x31Var.c = view;
        x31Var.z = -1;
        return x31Var;
    }

    public static x31 m(View view) {
        x31 x31Var = new x31(-4);
        x31Var.c = view;
        x31Var.z = -1;
        return x31Var;
    }

    public static x31 n(View view, int i7) {
        x31 x31Var = new x31(-4);
        x31Var.c = view;
        x31Var.z = i7;
        return x31Var;
    }

    public static x31 o(int i7, String str, String str2) {
        x31 x31Var = new x31(40);
        x31Var.d = i7;
        x31Var.l = str;
        x31Var.o = str2;
        return x31Var;
    }

    public static x31 p(int i7) {
        x31 x31Var = new x31(34);
        x31Var.z = i7;
        return x31Var;
    }

    public static x31 q(int i7, int i10) {
        x31 x31Var = new x31(34);
        x31Var.d = i7;
        x31Var.z = i10;
        return x31Var;
    }

    public static x31 r(String str) {
        x31 x31Var = new x31(31);
        x31Var.l = str;
        return x31Var;
    }

    public static x31 s(String str, String str2, View.OnClickListener onClickListener) {
        x31 x31Var = new x31(31);
        x31Var.l = str;
        x31Var.m = str2;
        x31Var.D = onClickListener;
        return x31Var;
    }

    public static x31 t(int i7, String str) {
        x31 x31Var = new x31(0);
        x31Var.d = i7;
        x31Var.l = str;
        return x31Var;
    }

    public static x31 u(String str) {
        x31 x31Var = new x31(0);
        x31Var.l = str;
        return x31Var;
    }

    public static x31 v(org.telegram.ui.wd wdVar) {
        x31 x31Var = new x31(24);
        x31Var.G = wdVar;
        return x31Var;
    }

    public static x31 w(TLObject tLObject) {
        x31 x31Var = new x31(32);
        x31Var.G = tLObject;
        return x31Var;
    }

    public static x31 x(int i7, String str) {
        x31 x31Var = new x31(10);
        x31Var.d = i7;
        x31Var.l = str;
        return x31Var;
    }

    public static x31 y(int i7, String str, String str2) {
        x31 x31Var = new x31(44);
        x31Var.d = i7;
        x31Var.l = str;
        x31Var.n = str2;
        return x31Var;
    }

    public static x31 z(int i7, CharSequence charSequence) {
        x31 x31Var = new x31(35);
        x31Var.d = i7;
        x31Var.l = charSequence;
        return x31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        w31 w31Var;
        return this.a >= 10000 && (hashMap = L) != null && (w31Var = (w31) hashMap.get(cls)) != null && w31Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(x31 x31Var) {
        int i7 = this.a;
        if (i7 != x31Var.a || this.d != x31Var.d || this.g != x31Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.z != x31Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != x31Var.G || !TextUtils.equals(this.l, x31Var.l) || !TextUtils.equals(this.n, x31Var.n) || this.k != x31Var.k || this.q != x31Var.q || this.r != x31Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, x31Var.l);
    }

    public final boolean J(x31 x31Var) {
        return this.d == x31Var.d && this.i == x31Var.i && this.x == x31Var.x && this.k == x31Var.k && this.j == x31Var.j && this.s == x31Var.s && this.r == x31Var.r && this.t == x31Var.t && this.q == x31Var.q && this.c == x31Var.c && TextUtils.equals(this.l, x31Var.l) && TextUtils.equals(this.m, x31Var.m) && TextUtils.equals(this.n, x31Var.n) && this.c == x31Var.c && this.z == x31Var.z && Math.abs(this.A - x31Var.A) < 0.01f && this.B == x31Var.B && Objects.equals(this.G, x31Var.G) && Objects.equals(this.H, x31Var.H);
    }

    public final void L(boolean z9) {
        this.e = z9;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        w31 G;
        if (this == aVar) {
            return true;
        }
        if (x31.class != aVar.getClass()) {
            return false;
        }
        x31 x31Var = (x31) aVar;
        int i7 = this.a;
        if (i7 != x31Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.l, x31Var.l) && TextUtils.equals(this.m, x31Var.m) : i7 == 28 ? this.z == x31Var.z : (i7 == 35 || i7 == 37) ? this.d == x31Var.d && TextUtils.equals(this.l, x31Var.l) && this.e == x31Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(x31Var) : G.c(this, x31Var);
    }

    public final boolean equals(Object obj) {
        w31 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || x31.class != obj.getClass()) {
            return false;
        }
        x31 x31Var = (x31) obj;
        int i7 = this.a;
        if (i7 != x31Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == x31Var.d : i7 == 28 ? this.d == x31Var.d : i7 == 31 ? TextUtils.equals(this.l, x31Var.l) : (i7 < 10000 || (G = G(i7)) == null) ? J(x31Var) : G.e(this, x31Var);
    }
}
