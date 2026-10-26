package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t61 extends qg.a {
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

    public t61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static t61 A(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(41);
        t61Var.d = i10;
        t61Var.l = charSequence;
        t61Var.o = str;
        return t61Var;
    }

    public static t61 B(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.d = i10;
        t61Var.l = charSequence;
        return t61Var;
    }

    public static t61 C(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.l = charSequence;
        return t61Var;
    }

    public static t61 D(int i10) {
        t61 t61Var = new t61(28);
        t61Var.z = i10;
        return t61Var;
    }

    public static t61 E(int i10, int i11) {
        t61 t61Var = new t61(28);
        t61Var.d = i10;
        t61Var.z = i11;
        return t61Var;
    }

    public static t61 F(int i10, String str) {
        t61 t61Var = new t61(39);
        t61Var.d = i10;
        t61Var.l = str;
        t61Var.z = 1;
        return t61Var;
    }

    public static s61 G(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (s61) longSparseArray.get(i10);
    }

    public static t61 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        s61 s61Var = (s61) L.get(cls);
        if (s61Var != null) {
            return new t61(s61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static t61 b(String str) {
        t61 t61Var = new t61(1);
        t61Var.l = str;
        return t61Var;
    }

    public static t61 c(int i10, int i11, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.k = i11;
        t61Var.l = str;
        return t61Var;
    }

    public static t61 d(int i10, int i11, String str, String str2) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.k = i11;
        t61Var.l = str;
        t61Var.n = str2;
        return t61Var;
    }

    public static t61 e(int i10, String str) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.l = str;
        return t61Var;
    }

    public static t61 f(String str, CharSequence charSequence, int i10) {
        t61 t61Var = new t61(3);
        t61Var.d = i10;
        t61Var.l = str;
        t61Var.n = charSequence;
        return t61Var;
    }

    public static t61 g(CharSequence charSequence) {
        t61 t61Var = new t61(7);
        t61Var.l = charSequence;
        t61Var.q = true;
        return t61Var;
    }

    public static t61 h(int i10, int i11, org.telegram.ui.i91 i91Var) {
        t61 t61Var = new t61(i10 + 18);
        t61Var.z = i11;
        t61Var.G = i91Var;
        return t61Var;
    }

    public static t61 i(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(4);
        t61Var.d = i10;
        t61Var.l = charSequence;
        return t61Var;
    }

    public static t61 j(int i10, View view) {
        t61 t61Var = new t61(-1);
        t61Var.d = i10;
        t61Var.c = view;
        t61Var.z = -1;
        return t61Var;
    }

    public static t61 k(View view) {
        t61 t61Var = new t61(-1);
        t61Var.c = view;
        t61Var.z = -1;
        return t61Var;
    }

    public static t61 l(int i10, View view) {
        t61 t61Var = new t61(-4);
        t61Var.d = i10;
        t61Var.c = view;
        t61Var.z = -1;
        return t61Var;
    }

    public static t61 m(View view) {
        t61 t61Var = new t61(-4);
        t61Var.c = view;
        t61Var.z = -1;
        return t61Var;
    }

    public static t61 n(View view, int i10) {
        t61 t61Var = new t61(-4);
        t61Var.c = view;
        t61Var.z = i10;
        return t61Var;
    }

    public static t61 o(int i10, String str, String str2) {
        t61 t61Var = new t61(40);
        t61Var.d = i10;
        t61Var.l = str;
        t61Var.o = str2;
        return t61Var;
    }

    public static t61 p(int i10) {
        t61 t61Var = new t61(34);
        t61Var.z = i10;
        return t61Var;
    }

    public static t61 q(int i10, int i11) {
        t61 t61Var = new t61(34);
        t61Var.d = i10;
        t61Var.z = i11;
        return t61Var;
    }

    public static t61 r(String str) {
        t61 t61Var = new t61(31);
        t61Var.l = str;
        return t61Var;
    }

    public static t61 s(String str, String str2, View.OnClickListener onClickListener) {
        t61 t61Var = new t61(31);
        t61Var.l = str;
        t61Var.m = str2;
        t61Var.D = onClickListener;
        return t61Var;
    }

    public static t61 t(int i10, String str) {
        t61 t61Var = new t61(0);
        t61Var.d = i10;
        t61Var.l = str;
        return t61Var;
    }

    public static t61 u(String str) {
        t61 t61Var = new t61(0);
        t61Var.l = str;
        return t61Var;
    }

    public static t61 v(org.telegram.ui.he heVar) {
        t61 t61Var = new t61(24);
        t61Var.G = heVar;
        return t61Var;
    }

    public static t61 w(TLObject tLObject) {
        t61 t61Var = new t61(32);
        t61Var.G = tLObject;
        return t61Var;
    }

    public static t61 x(int i10, String str) {
        t61 t61Var = new t61(10);
        t61Var.d = i10;
        t61Var.l = str;
        return t61Var;
    }

    public static t61 y(int i10, String str, String str2) {
        t61 t61Var = new t61(44);
        t61Var.d = i10;
        t61Var.l = str;
        t61Var.n = str2;
        return t61Var;
    }

    public static t61 z(int i10, CharSequence charSequence) {
        t61 t61Var = new t61(35);
        t61Var.d = i10;
        t61Var.l = charSequence;
        return t61Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        s61 s61Var;
        return this.a >= 10000 && (hashMap = L) != null && (s61Var = (s61) hashMap.get(cls)) != null && s61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(t61 t61Var) {
        int i10 = this.a;
        if (i10 != t61Var.a || this.d != t61Var.d || this.g != t61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != t61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != t61Var.G || !TextUtils.equals(this.l, t61Var.l) || !TextUtils.equals(this.n, t61Var.n) || this.k != t61Var.k || this.q != t61Var.q || this.r != t61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, t61Var.l);
    }

    public final boolean J(t61 t61Var) {
        return this.d == t61Var.d && this.i == t61Var.i && this.x == t61Var.x && this.k == t61Var.k && this.j == t61Var.j && this.s == t61Var.s && this.r == t61Var.r && this.t == t61Var.t && this.q == t61Var.q && this.c == t61Var.c && TextUtils.equals(this.l, t61Var.l) && TextUtils.equals(this.m, t61Var.m) && TextUtils.equals(this.n, t61Var.n) && this.c == t61Var.c && this.z == t61Var.z && Math.abs(this.A - t61Var.A) < 0.01f && this.B == t61Var.B && Objects.equals(this.G, t61Var.G) && Objects.equals(this.H, t61Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // qg.a
    public final boolean a(qg.a aVar) {
        s61 G;
        if (this == aVar) {
            return true;
        }
        if (t61.class != aVar.getClass()) {
            return false;
        }
        t61 t61Var = (t61) aVar;
        int i10 = this.a;
        if (i10 != t61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, t61Var.l) && TextUtils.equals(this.m, t61Var.m) : i10 == 28 ? this.z == t61Var.z : (i10 == 35 || i10 == 37) ? this.d == t61Var.d && TextUtils.equals(this.l, t61Var.l) && this.e == t61Var.e : (i10 < 10000 || (G = G(i10)) == null) ? I(t61Var) : G.contentsEquals(this, t61Var);
    }

    public final boolean equals(Object obj) {
        s61 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || t61.class != obj.getClass()) {
            return false;
        }
        t61 t61Var = (t61) obj;
        int i10 = this.a;
        if (i10 != t61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == t61Var.d : i10 == 28 ? this.d == t61Var.d : i10 == 31 ? TextUtils.equals(this.l, t61Var.l) : (i10 < 10000 || (G = G(i10)) == null) ? J(t61Var) : G.equals(this, t61Var);
    }
}
