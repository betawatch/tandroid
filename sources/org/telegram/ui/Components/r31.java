package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r31 extends rg.a {
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

    public r31(int i7) {
        super(i7, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static r31 A(String str, CharSequence charSequence, int i7) {
        r31 r31Var = new r31(41);
        r31Var.d = i7;
        r31Var.l = charSequence;
        r31Var.o = str;
        return r31Var;
    }

    public static r31 B(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.d = i7;
        r31Var.l = charSequence;
        return r31Var;
    }

    public static r31 C(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.l = charSequence;
        return r31Var;
    }

    public static r31 D(int i7) {
        r31 r31Var = new r31(28);
        r31Var.z = i7;
        return r31Var;
    }

    public static r31 E(int i7, int i10) {
        r31 r31Var = new r31(28);
        r31Var.d = i7;
        r31Var.z = i10;
        return r31Var;
    }

    public static r31 F(int i7, String str) {
        r31 r31Var = new r31(39);
        r31Var.d = i7;
        r31Var.l = str;
        r31Var.z = 1;
        return r31Var;
    }

    public static q31 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (q31) longSparseArray.get(i7);
    }

    public static r31 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        q31 q31Var = (q31) L.get(cls);
        if (q31Var != null) {
            return new r31(q31Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static r31 b(String str) {
        r31 r31Var = new r31(1);
        r31Var.l = str;
        return r31Var;
    }

    public static r31 c(int i7, int i10, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.k = i10;
        r31Var.l = str;
        return r31Var;
    }

    public static r31 d(int i7, int i10, String str, String str2) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.k = i10;
        r31Var.l = str;
        r31Var.n = str2;
        return r31Var;
    }

    public static r31 e(int i7, String str) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.l = str;
        return r31Var;
    }

    public static r31 f(String str, CharSequence charSequence, int i7) {
        r31 r31Var = new r31(3);
        r31Var.d = i7;
        r31Var.l = str;
        r31Var.n = charSequence;
        return r31Var;
    }

    public static r31 g(CharSequence charSequence) {
        r31 r31Var = new r31(7);
        r31Var.l = charSequence;
        r31Var.q = true;
        return r31Var;
    }

    public static r31 h(int i7, int i10, org.telegram.ui.o41 o41Var) {
        r31 r31Var = new r31(i7 + 18);
        r31Var.z = i10;
        r31Var.G = o41Var;
        return r31Var;
    }

    public static r31 i(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(4);
        r31Var.d = i7;
        r31Var.l = charSequence;
        return r31Var;
    }

    public static r31 j(int i7, View view) {
        r31 r31Var = new r31(-1);
        r31Var.d = i7;
        r31Var.c = view;
        r31Var.z = -1;
        return r31Var;
    }

    public static r31 k(View view) {
        r31 r31Var = new r31(-1);
        r31Var.c = view;
        r31Var.z = -1;
        return r31Var;
    }

    public static r31 l(int i7, View view) {
        r31 r31Var = new r31(-4);
        r31Var.d = i7;
        r31Var.c = view;
        r31Var.z = -1;
        return r31Var;
    }

    public static r31 m(View view) {
        r31 r31Var = new r31(-4);
        r31Var.c = view;
        r31Var.z = -1;
        return r31Var;
    }

    public static r31 n(View view, int i7) {
        r31 r31Var = new r31(-4);
        r31Var.c = view;
        r31Var.z = i7;
        return r31Var;
    }

    public static r31 o(int i7, String str, String str2) {
        r31 r31Var = new r31(40);
        r31Var.d = i7;
        r31Var.l = str;
        r31Var.o = str2;
        return r31Var;
    }

    public static r31 p(int i7) {
        r31 r31Var = new r31(34);
        r31Var.z = i7;
        return r31Var;
    }

    public static r31 q(int i7, int i10) {
        r31 r31Var = new r31(34);
        r31Var.d = i7;
        r31Var.z = i10;
        return r31Var;
    }

    public static r31 r(String str) {
        r31 r31Var = new r31(31);
        r31Var.l = str;
        return r31Var;
    }

    public static r31 s(String str, String str2, View.OnClickListener onClickListener) {
        r31 r31Var = new r31(31);
        r31Var.l = str;
        r31Var.m = str2;
        r31Var.D = onClickListener;
        return r31Var;
    }

    public static r31 t(int i7, String str) {
        r31 r31Var = new r31(0);
        r31Var.d = i7;
        r31Var.l = str;
        return r31Var;
    }

    public static r31 u(String str) {
        r31 r31Var = new r31(0);
        r31Var.l = str;
        return r31Var;
    }

    public static r31 v(org.telegram.ui.wd wdVar) {
        r31 r31Var = new r31(24);
        r31Var.G = wdVar;
        return r31Var;
    }

    public static r31 w(TLObject tLObject) {
        r31 r31Var = new r31(32);
        r31Var.G = tLObject;
        return r31Var;
    }

    public static r31 x(int i7, String str) {
        r31 r31Var = new r31(10);
        r31Var.d = i7;
        r31Var.l = str;
        return r31Var;
    }

    public static r31 y(int i7, String str, String str2) {
        r31 r31Var = new r31(44);
        r31Var.d = i7;
        r31Var.l = str;
        r31Var.n = str2;
        return r31Var;
    }

    public static r31 z(int i7, CharSequence charSequence) {
        r31 r31Var = new r31(35);
        r31Var.d = i7;
        r31Var.l = charSequence;
        return r31Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        q31 q31Var;
        return this.a >= 10000 && (hashMap = L) != null && (q31Var = (q31) hashMap.get(cls)) != null && q31Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(r31 r31Var) {
        int i7 = this.a;
        if (i7 != r31Var.a || this.d != r31Var.d || this.g != r31Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.z != r31Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != r31Var.G || !TextUtils.equals(this.l, r31Var.l) || !TextUtils.equals(this.n, r31Var.n) || this.k != r31Var.k || this.q != r31Var.q || this.r != r31Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, r31Var.l);
    }

    public final boolean J(r31 r31Var) {
        return this.d == r31Var.d && this.i == r31Var.i && this.x == r31Var.x && this.k == r31Var.k && this.j == r31Var.j && this.s == r31Var.s && this.r == r31Var.r && this.t == r31Var.t && this.q == r31Var.q && this.c == r31Var.c && TextUtils.equals(this.l, r31Var.l) && TextUtils.equals(this.m, r31Var.m) && TextUtils.equals(this.n, r31Var.n) && this.c == r31Var.c && this.z == r31Var.z && Math.abs(this.A - r31Var.A) < 0.01f && this.B == r31Var.B && Objects.equals(this.G, r31Var.G) && Objects.equals(this.H, r31Var.H);
    }

    public final void L(boolean z9) {
        this.e = z9;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        q31 G;
        if (this == aVar) {
            return true;
        }
        if (r31.class != aVar.getClass()) {
            return false;
        }
        r31 r31Var = (r31) aVar;
        int i7 = this.a;
        if (i7 != r31Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.l, r31Var.l) && TextUtils.equals(this.m, r31Var.m) : i7 == 28 ? this.z == r31Var.z : (i7 == 35 || i7 == 37) ? this.d == r31Var.d && TextUtils.equals(this.l, r31Var.l) && this.e == r31Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(r31Var) : G.c(this, r31Var);
    }

    public final boolean equals(Object obj) {
        q31 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || r31.class != obj.getClass()) {
            return false;
        }
        r31 r31Var = (r31) obj;
        int i7 = this.a;
        if (i7 != r31Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == r31Var.d : i7 == 28 ? this.d == r31Var.d : i7 == 31 ? TextUtils.equals(this.l, r31Var.l) : (i7 < 10000 || (G = G(i7)) == null) ? J(r31Var) : G.e(this, r31Var);
    }
}
