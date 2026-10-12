package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l61 extends pg.a {
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

    public l61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static l61 A(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.d = i10;
        l61Var.l = charSequence;
        return l61Var;
    }

    public static l61 B(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.l = charSequence;
        return l61Var;
    }

    public static l61 C(int i10) {
        l61 l61Var = new l61(28);
        l61Var.z = i10;
        return l61Var;
    }

    public static l61 D(int i10, int i11) {
        l61 l61Var = new l61(28);
        l61Var.d = i10;
        l61Var.z = i11;
        return l61Var;
    }

    public static l61 E(int i10, String str) {
        l61 l61Var = new l61(39);
        l61Var.d = i10;
        l61Var.l = str;
        l61Var.z = 1;
        return l61Var;
    }

    public static k61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (k61) longSparseArray.get(i10);
    }

    public static l61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        k61 k61Var = (k61) L.get(cls);
        if (k61Var != null) {
            return new l61(k61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l61 b(String str) {
        l61 l61Var = new l61(1);
        l61Var.l = str;
        return l61Var;
    }

    public static l61 c(int i10, int i11, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.k = i11;
        l61Var.l = str;
        return l61Var;
    }

    public static l61 d(int i10, int i11, String str, String str2) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.k = i11;
        l61Var.l = str;
        l61Var.n = str2;
        return l61Var;
    }

    public static l61 e(int i10, String str) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.l = str;
        return l61Var;
    }

    public static l61 f(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(3);
        l61Var.d = i10;
        l61Var.l = str;
        l61Var.n = charSequence;
        return l61Var;
    }

    public static l61 g(CharSequence charSequence) {
        l61 l61Var = new l61(7);
        l61Var.l = charSequence;
        l61Var.q = true;
        return l61Var;
    }

    public static l61 h(int i10, int i11, ta1 ta1Var) {
        l61 l61Var = new l61(i10 + 18);
        l61Var.z = i11;
        l61Var.G = ta1Var;
        return l61Var;
    }

    public static l61 i(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(4);
        l61Var.d = i10;
        l61Var.l = charSequence;
        return l61Var;
    }

    public static l61 j(int i10, View view) {
        l61 l61Var = new l61(-1);
        l61Var.d = i10;
        l61Var.c = view;
        l61Var.z = -1;
        return l61Var;
    }

    public static l61 k(View view) {
        l61 l61Var = new l61(-1);
        l61Var.c = view;
        l61Var.z = -1;
        return l61Var;
    }

    public static l61 l(View view) {
        l61 l61Var = new l61(-4);
        l61Var.c = view;
        l61Var.z = -1;
        return l61Var;
    }

    public static l61 m(int i10, String str, String str2) {
        l61 l61Var = new l61(40);
        l61Var.d = i10;
        l61Var.l = str;
        l61Var.o = str2;
        return l61Var;
    }

    public static l61 n(int i10) {
        l61 l61Var = new l61(34);
        l61Var.z = i10;
        return l61Var;
    }

    public static l61 o(int i10, int i11) {
        l61 l61Var = new l61(34);
        l61Var.d = i10;
        l61Var.z = i11;
        return l61Var;
    }

    public static l61 p(View view, int i10, boolean z10) {
        l61 l61Var = new l61(-3);
        l61Var.c = view;
        l61Var.z = i10;
        l61Var.y = z10 ? 1 : 0;
        return l61Var;
    }

    public static l61 q(String str) {
        l61 l61Var = new l61(31);
        l61Var.l = str;
        return l61Var;
    }

    public static l61 r(String str, String str2, View.OnClickListener onClickListener) {
        l61 l61Var = new l61(31);
        l61Var.l = str;
        l61Var.m = str2;
        l61Var.D = onClickListener;
        return l61Var;
    }

    public static l61 s(int i10, String str) {
        l61 l61Var = new l61(0);
        l61Var.d = i10;
        l61Var.l = str;
        return l61Var;
    }

    public static l61 t(String str) {
        l61 l61Var = new l61(0);
        l61Var.l = str;
        return l61Var;
    }

    public static l61 u(org.telegram.ui.ne neVar) {
        l61 l61Var = new l61(24);
        l61Var.G = neVar;
        return l61Var;
    }

    public static l61 v(TLObject tLObject) {
        l61 l61Var = new l61(32);
        l61Var.G = tLObject;
        return l61Var;
    }

    public static l61 w(int i10, String str) {
        l61 l61Var = new l61(10);
        l61Var.d = i10;
        l61Var.l = str;
        return l61Var;
    }

    public static l61 x(int i10, String str, String str2) {
        l61 l61Var = new l61(44);
        l61Var.d = i10;
        l61Var.l = str;
        l61Var.n = str2;
        return l61Var;
    }

    public static l61 y(int i10, CharSequence charSequence) {
        l61 l61Var = new l61(35);
        l61Var.d = i10;
        l61Var.l = charSequence;
        return l61Var;
    }

    public static l61 z(String str, CharSequence charSequence, int i10) {
        l61 l61Var = new l61(41);
        l61Var.d = i10;
        l61Var.l = charSequence;
        l61Var.o = str;
        return l61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        k61 k61Var;
        return this.a >= 10000 && (hashMap = L) != null && (k61Var = (k61) hashMap.get(cls)) != null && k61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(l61 l61Var) {
        int i10 = this.a;
        if (i10 != l61Var.a || this.d != l61Var.d || this.g != l61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != l61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != l61Var.G || !TextUtils.equals(this.l, l61Var.l) || !TextUtils.equals(this.n, l61Var.n) || this.k != l61Var.k || this.q != l61Var.q || this.r != l61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, l61Var.l);
    }

    public final boolean I(l61 l61Var) {
        return this.d == l61Var.d && this.i == l61Var.i && this.x == l61Var.x && this.k == l61Var.k && this.j == l61Var.j && this.s == l61Var.s && this.r == l61Var.r && this.t == l61Var.t && this.q == l61Var.q && this.c == l61Var.c && TextUtils.equals(this.l, l61Var.l) && TextUtils.equals(this.m, l61Var.m) && TextUtils.equals(this.n, l61Var.n) && this.c == l61Var.c && this.z == l61Var.z && Math.abs(this.A - l61Var.A) < 0.01f && this.B == l61Var.B && Objects.equals(this.G, l61Var.G) && Objects.equals(this.H, l61Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        k61 F;
        if (this == aVar) {
            return true;
        }
        if (l61.class != aVar.getClass()) {
            return false;
        }
        l61 l61Var = (l61) aVar;
        int i10 = this.a;
        if (i10 != l61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, l61Var.l) && TextUtils.equals(this.m, l61Var.m) : i10 == 28 ? this.z == l61Var.z : (i10 == 35 || i10 == 37) ? this.d == l61Var.d && TextUtils.equals(this.l, l61Var.l) && this.e == l61Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(l61Var) : F.contentsEquals(this, l61Var);
    }

    public final boolean equals(Object obj) {
        k61 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || l61.class != obj.getClass()) {
            return false;
        }
        l61 l61Var = (l61) obj;
        int i10 = this.a;
        if (i10 != l61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == l61Var.d : i10 == 28 ? this.d == l61Var.d : i10 == 31 ? TextUtils.equals(this.l, l61Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(l61Var) : F.equals(this, l61Var);
    }
}
