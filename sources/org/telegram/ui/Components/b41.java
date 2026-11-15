package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b41 extends rg.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public org.telegram.messenger.z10 C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.messenger.z10 F;
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

    public b41(int i7) {
        super(i7, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static b41 A(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(41);
        b41Var.d = i7;
        b41Var.l = charSequence;
        b41Var.o = str;
        return b41Var;
    }

    public static b41 B(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.d = i7;
        b41Var.l = charSequence;
        return b41Var;
    }

    public static b41 C(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.l = charSequence;
        return b41Var;
    }

    public static b41 D(int i7) {
        b41 b41Var = new b41(28);
        b41Var.z = i7;
        return b41Var;
    }

    public static b41 E(int i7, int i10) {
        b41 b41Var = new b41(28);
        b41Var.d = i7;
        b41Var.z = i10;
        return b41Var;
    }

    public static b41 F(int i7, String str) {
        b41 b41Var = new b41(39);
        b41Var.d = i7;
        b41Var.l = str;
        b41Var.z = 1;
        return b41Var;
    }

    public static a41 G(int i7) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (a41) longSparseArray.get(i7);
    }

    public static b41 K(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        a41 a41Var = (a41) L.get(cls);
        if (a41Var != null) {
            return new b41(a41Var.a);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static b41 b(String str) {
        b41 b41Var = new b41(1);
        b41Var.l = str;
        return b41Var;
    }

    public static b41 c(int i7, int i10, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.k = i10;
        b41Var.l = str;
        return b41Var;
    }

    public static b41 d(int i7, int i10, String str, String str2) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.k = i10;
        b41Var.l = str;
        b41Var.n = str2;
        return b41Var;
    }

    public static b41 e(int i7, String str) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.l = str;
        return b41Var;
    }

    public static b41 f(String str, CharSequence charSequence, int i7) {
        b41 b41Var = new b41(3);
        b41Var.d = i7;
        b41Var.l = str;
        b41Var.n = charSequence;
        return b41Var;
    }

    public static b41 g(CharSequence charSequence) {
        b41 b41Var = new b41(7);
        b41Var.l = charSequence;
        b41Var.q = true;
        return b41Var;
    }

    public static b41 h(int i7, int i10, org.telegram.ui.l41 l41Var) {
        b41 b41Var = new b41(i7 + 18);
        b41Var.z = i10;
        b41Var.G = l41Var;
        return b41Var;
    }

    public static b41 i(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(4);
        b41Var.d = i7;
        b41Var.l = charSequence;
        return b41Var;
    }

    public static b41 j(int i7, View view) {
        b41 b41Var = new b41(-1);
        b41Var.d = i7;
        b41Var.c = view;
        b41Var.z = -1;
        return b41Var;
    }

    public static b41 k(View view) {
        b41 b41Var = new b41(-1);
        b41Var.c = view;
        b41Var.z = -1;
        return b41Var;
    }

    public static b41 l(int i7, View view) {
        b41 b41Var = new b41(-4);
        b41Var.d = i7;
        b41Var.c = view;
        b41Var.z = -1;
        return b41Var;
    }

    public static b41 m(View view) {
        b41 b41Var = new b41(-4);
        b41Var.c = view;
        b41Var.z = -1;
        return b41Var;
    }

    public static b41 n(View view, int i7) {
        b41 b41Var = new b41(-4);
        b41Var.c = view;
        b41Var.z = i7;
        return b41Var;
    }

    public static b41 o(int i7, String str, String str2) {
        b41 b41Var = new b41(40);
        b41Var.d = i7;
        b41Var.l = str;
        b41Var.o = str2;
        return b41Var;
    }

    public static b41 p(int i7) {
        b41 b41Var = new b41(34);
        b41Var.z = i7;
        return b41Var;
    }

    public static b41 q(int i7, int i10) {
        b41 b41Var = new b41(34);
        b41Var.d = i7;
        b41Var.z = i10;
        return b41Var;
    }

    public static b41 r(String str) {
        b41 b41Var = new b41(31);
        b41Var.l = str;
        return b41Var;
    }

    public static b41 s(String str, String str2, View.OnClickListener onClickListener) {
        b41 b41Var = new b41(31);
        b41Var.l = str;
        b41Var.m = str2;
        b41Var.D = onClickListener;
        return b41Var;
    }

    public static b41 t(int i7, String str) {
        b41 b41Var = new b41(0);
        b41Var.d = i7;
        b41Var.l = str;
        return b41Var;
    }

    public static b41 u(String str) {
        b41 b41Var = new b41(0);
        b41Var.l = str;
        return b41Var;
    }

    public static b41 v(org.telegram.ui.ud udVar) {
        b41 b41Var = new b41(24);
        b41Var.G = udVar;
        return b41Var;
    }

    public static b41 w(TLObject tLObject) {
        b41 b41Var = new b41(32);
        b41Var.G = tLObject;
        return b41Var;
    }

    public static b41 x(int i7, String str) {
        b41 b41Var = new b41(10);
        b41Var.d = i7;
        b41Var.l = str;
        return b41Var;
    }

    public static b41 y(int i7, String str, String str2) {
        b41 b41Var = new b41(44);
        b41Var.d = i7;
        b41Var.l = str;
        b41Var.n = str2;
        return b41Var;
    }

    public static b41 z(int i7, CharSequence charSequence) {
        b41 b41Var = new b41(35);
        b41Var.d = i7;
        b41Var.l = charSequence;
        return b41Var;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a41 a41Var;
        return this.a >= 10000 && (hashMap = L) != null && (a41Var = (a41) hashMap.get(cls)) != null && a41Var.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(b41 b41Var) {
        int i7 = this.a;
        if (i7 != b41Var.a || this.d != b41Var.d || this.g != b41Var.g) {
            return false;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 != 3) {
                if (i7 != 7) {
                    if (i7 != 26) {
                        if (i7 != 34 || this.z != b41Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != b41Var.G || !TextUtils.equals(this.l, b41Var.l) || !TextUtils.equals(this.n, b41Var.n) || this.k != b41Var.k || this.q != b41Var.q || this.r != b41Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, b41Var.l);
    }

    public final boolean J(b41 b41Var) {
        return this.d == b41Var.d && this.i == b41Var.i && this.x == b41Var.x && this.k == b41Var.k && this.j == b41Var.j && this.s == b41Var.s && this.r == b41Var.r && this.t == b41Var.t && this.q == b41Var.q && this.c == b41Var.c && TextUtils.equals(this.l, b41Var.l) && TextUtils.equals(this.m, b41Var.m) && TextUtils.equals(this.n, b41Var.n) && this.c == b41Var.c && this.z == b41Var.z && Math.abs(this.A - b41Var.A) < 0.01f && this.B == b41Var.B && Objects.equals(this.G, b41Var.G) && Objects.equals(this.H, b41Var.H);
    }

    public final void L(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        a41 G;
        if (this == aVar) {
            return true;
        }
        if (b41.class != aVar.getClass()) {
            return false;
        }
        b41 b41Var = (b41) aVar;
        int i7 = this.a;
        if (i7 != b41Var.a) {
            return false;
        }
        return i7 == 31 ? TextUtils.equals(this.l, b41Var.l) && TextUtils.equals(this.m, b41Var.m) : i7 == 28 ? this.z == b41Var.z : (i7 == 35 || i7 == 37) ? this.d == b41Var.d && TextUtils.equals(this.l, b41Var.l) && this.e == b41Var.e : (i7 < 10000 || (G = G(i7)) == null) ? I(b41Var) : G.c(this, b41Var);
    }

    public final boolean equals(Object obj) {
        a41 G;
        if (this == obj) {
            return true;
        }
        if (obj == null || b41.class != obj.getClass()) {
            return false;
        }
        b41 b41Var = (b41) obj;
        int i7 = this.a;
        if (i7 != b41Var.a) {
            return false;
        }
        return (i7 == 36 || i7 == 35) ? this.d == b41Var.d : i7 == 28 ? this.d == b41Var.d : i7 == 31 ? TextUtils.equals(this.l, b41Var.l) : (i7 < 10000 || (G = G(i7)) == null) ? J(b41Var) : G.e(this, b41Var);
    }
}
