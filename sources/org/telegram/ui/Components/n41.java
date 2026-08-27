package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.c91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n41 extends xf.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.x3 F;
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

    public n41(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static n41 A(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.d = i10;
        n41Var.l = charSequence;
        return n41Var;
    }

    public static n41 B(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.l = charSequence;
        return n41Var;
    }

    public static n41 C(int i10) {
        n41 n41Var = new n41(28);
        n41Var.z = i10;
        return n41Var;
    }

    public static n41 D(int i10, int i11) {
        n41 n41Var = new n41(28);
        n41Var.d = i10;
        n41Var.z = i11;
        return n41Var;
    }

    public static n41 E(int i10, String str) {
        n41 n41Var = new n41(39);
        n41Var.d = i10;
        n41Var.l = str;
        n41Var.z = 1;
        return n41Var;
    }

    public static m41 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (m41) longSparseArray.get(i10);
    }

    public static n41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        m41 m41Var = (m41) L.get(cls);
        if (m41Var != null) {
            return new n41(m41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static n41 b(String str) {
        n41 n41Var = new n41(1);
        n41Var.l = str;
        return n41Var;
    }

    public static n41 c(int i10, int i11, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.k = i11;
        n41Var.l = str;
        return n41Var;
    }

    public static n41 d(int i10, int i11, String str, String str2) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.k = i11;
        n41Var.l = str;
        n41Var.n = str2;
        return n41Var;
    }

    public static n41 e(int i10, String str) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.l = str;
        return n41Var;
    }

    public static n41 f(String str, CharSequence charSequence, int i10) {
        n41 n41Var = new n41(3);
        n41Var.d = i10;
        n41Var.l = str;
        n41Var.n = charSequence;
        return n41Var;
    }

    public static n41 g(CharSequence charSequence) {
        n41 n41Var = new n41(7);
        n41Var.l = charSequence;
        n41Var.q = true;
        return n41Var;
    }

    public static n41 h(int i10, int i11, c91 c91Var) {
        n41 n41Var = new n41(i10 + 18);
        n41Var.z = i11;
        n41Var.G = c91Var;
        return n41Var;
    }

    public static n41 i(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(4);
        n41Var.d = i10;
        n41Var.l = charSequence;
        return n41Var;
    }

    public static n41 j(int i10, View view) {
        n41 n41Var = new n41(-1);
        n41Var.d = i10;
        n41Var.c = view;
        n41Var.z = -1;
        return n41Var;
    }

    public static n41 k(View view) {
        n41 n41Var = new n41(-1);
        n41Var.c = view;
        n41Var.z = -1;
        return n41Var;
    }

    public static n41 l(View view) {
        n41 n41Var = new n41(-4);
        n41Var.c = view;
        n41Var.z = -1;
        return n41Var;
    }

    public static n41 m(int i10, String str, String str2) {
        n41 n41Var = new n41(40);
        n41Var.d = i10;
        n41Var.l = str;
        n41Var.o = str2;
        return n41Var;
    }

    public static n41 n(int i10) {
        n41 n41Var = new n41(34);
        n41Var.z = i10;
        return n41Var;
    }

    public static n41 o(int i10, int i11) {
        n41 n41Var = new n41(34);
        n41Var.d = i10;
        n41Var.z = i11;
        return n41Var;
    }

    public static n41 p(View view, int i10, boolean z10) {
        n41 n41Var = new n41(-3);
        n41Var.c = view;
        n41Var.z = i10;
        n41Var.y = z10 ? 1 : 0;
        return n41Var;
    }

    public static n41 q(String str) {
        n41 n41Var = new n41(31);
        n41Var.l = str;
        return n41Var;
    }

    public static n41 r(String str, String str2, View.OnClickListener onClickListener) {
        n41 n41Var = new n41(31);
        n41Var.l = str;
        n41Var.m = str2;
        n41Var.D = onClickListener;
        return n41Var;
    }

    public static n41 s(int i10, String str) {
        n41 n41Var = new n41(0);
        n41Var.d = i10;
        n41Var.l = str;
        return n41Var;
    }

    public static n41 t(String str) {
        n41 n41Var = new n41(0);
        n41Var.l = str;
        return n41Var;
    }

    public static n41 u(org.telegram.ui.ce ceVar) {
        n41 n41Var = new n41(24);
        n41Var.G = ceVar;
        return n41Var;
    }

    public static n41 v(TLObject tLObject) {
        n41 n41Var = new n41(32);
        n41Var.G = tLObject;
        return n41Var;
    }

    public static n41 w(int i10, String str) {
        n41 n41Var = new n41(10);
        n41Var.d = i10;
        n41Var.l = str;
        return n41Var;
    }

    public static n41 x(int i10, String str, String str2) {
        n41 n41Var = new n41(44);
        n41Var.d = i10;
        n41Var.l = str;
        n41Var.n = str2;
        return n41Var;
    }

    public static n41 y(int i10, CharSequence charSequence) {
        n41 n41Var = new n41(35);
        n41Var.d = i10;
        n41Var.l = charSequence;
        return n41Var;
    }

    public static n41 z(String str, CharSequence charSequence, int i10) {
        n41 n41Var = new n41(41);
        n41Var.d = i10;
        n41Var.l = charSequence;
        n41Var.o = str;
        return n41Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        m41 m41Var;
        return this.a >= 10000 && (hashMap = L) != null && (m41Var = (m41) hashMap.get(cls)) != null && m41Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(n41 n41Var) {
        int i10 = this.a;
        if (i10 != n41Var.a || this.d != n41Var.d || this.g != n41Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != n41Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != n41Var.G || !TextUtils.equals(this.l, n41Var.l) || !TextUtils.equals(this.n, n41Var.n) || this.k != n41Var.k || this.q != n41Var.q || this.r != n41Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, n41Var.l);
    }

    public final boolean I(n41 n41Var) {
        return this.d == n41Var.d && this.i == n41Var.i && this.x == n41Var.x && this.k == n41Var.k && this.j == n41Var.j && this.s == n41Var.s && this.r == n41Var.r && this.t == n41Var.t && this.q == n41Var.q && this.c == n41Var.c && TextUtils.equals(this.l, n41Var.l) && TextUtils.equals(this.m, n41Var.m) && TextUtils.equals(this.n, n41Var.n) && this.c == n41Var.c && this.z == n41Var.z && Math.abs(this.A - n41Var.A) < 0.01f && this.B == n41Var.B && Objects.equals(this.G, n41Var.G) && Objects.equals(this.H, n41Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // xf.a
    public final boolean a(xf.a aVar) {
        m41 F;
        if (this == aVar) {
            return true;
        }
        if (n41.class != aVar.getClass()) {
            return false;
        }
        n41 n41Var = (n41) aVar;
        int i10 = this.a;
        if (i10 != n41Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, n41Var.l) && TextUtils.equals(this.m, n41Var.m) : i10 == 28 ? this.z == n41Var.z : (i10 == 35 || i10 == 37) ? this.d == n41Var.d && TextUtils.equals(this.l, n41Var.l) && this.e == n41Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(n41Var) : F.contentsEquals(this, n41Var);
    }

    public final boolean equals(Object obj) {
        m41 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || n41.class != obj.getClass()) {
            return false;
        }
        n41 n41Var = (n41) obj;
        int i10 = this.a;
        if (i10 != n41Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == n41Var.d : i10 == 28 ? this.d == n41Var.d : i10 == 31 ? TextUtils.equals(this.l, n41Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(n41Var) : F.equals(this, n41Var);
    }
}
