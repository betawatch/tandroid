package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.e91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l41 extends wf.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.w3 F;
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

    public l41(int i9) {
        super(i9, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static l41 A(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.d = i9;
        l41Var.l = charSequence;
        return l41Var;
    }

    public static l41 B(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.l = charSequence;
        return l41Var;
    }

    public static l41 C(int i9) {
        l41 l41Var = new l41(28);
        l41Var.z = i9;
        return l41Var;
    }

    public static l41 D(int i9, int i10) {
        l41 l41Var = new l41(28);
        l41Var.d = i9;
        l41Var.z = i10;
        return l41Var;
    }

    public static l41 E(int i9, String str) {
        l41 l41Var = new l41(39);
        l41Var.d = i9;
        l41Var.l = str;
        l41Var.z = 1;
        return l41Var;
    }

    public static k41 F(int i9) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (k41) longSparseArray.get(i9);
    }

    public static l41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        k41 k41Var = (k41) L.get(cls);
        if (k41Var != null) {
            return new l41(k41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static l41 b(String str) {
        l41 l41Var = new l41(1);
        l41Var.l = str;
        return l41Var;
    }

    public static l41 c(int i9, int i10, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.k = i10;
        l41Var.l = str;
        return l41Var;
    }

    public static l41 d(int i9, int i10, String str, String str2) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.k = i10;
        l41Var.l = str;
        l41Var.n = str2;
        return l41Var;
    }

    public static l41 e(int i9, String str) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.l = str;
        return l41Var;
    }

    public static l41 f(String str, CharSequence charSequence, int i9) {
        l41 l41Var = new l41(3);
        l41Var.d = i9;
        l41Var.l = str;
        l41Var.n = charSequence;
        return l41Var;
    }

    public static l41 g(CharSequence charSequence) {
        l41 l41Var = new l41(7);
        l41Var.l = charSequence;
        l41Var.q = true;
        return l41Var;
    }

    public static l41 h(int i9, int i10, e91 e91Var) {
        l41 l41Var = new l41(i9 + 18);
        l41Var.z = i10;
        l41Var.G = e91Var;
        return l41Var;
    }

    public static l41 i(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(4);
        l41Var.d = i9;
        l41Var.l = charSequence;
        return l41Var;
    }

    public static l41 j(int i9, View view) {
        l41 l41Var = new l41(-1);
        l41Var.d = i9;
        l41Var.c = view;
        l41Var.z = -1;
        return l41Var;
    }

    public static l41 k(View view) {
        l41 l41Var = new l41(-1);
        l41Var.c = view;
        l41Var.z = -1;
        return l41Var;
    }

    public static l41 l(View view) {
        l41 l41Var = new l41(-4);
        l41Var.c = view;
        l41Var.z = -1;
        return l41Var;
    }

    public static l41 m(int i9, String str, String str2) {
        l41 l41Var = new l41(40);
        l41Var.d = i9;
        l41Var.l = str;
        l41Var.o = str2;
        return l41Var;
    }

    public static l41 n(int i9) {
        l41 l41Var = new l41(34);
        l41Var.z = i9;
        return l41Var;
    }

    public static l41 o(int i9, int i10) {
        l41 l41Var = new l41(34);
        l41Var.d = i9;
        l41Var.z = i10;
        return l41Var;
    }

    public static l41 p(View view, int i9, boolean z10) {
        l41 l41Var = new l41(-3);
        l41Var.c = view;
        l41Var.z = i9;
        l41Var.y = z10 ? 1 : 0;
        return l41Var;
    }

    public static l41 q(String str) {
        l41 l41Var = new l41(31);
        l41Var.l = str;
        return l41Var;
    }

    public static l41 r(String str, String str2, View.OnClickListener onClickListener) {
        l41 l41Var = new l41(31);
        l41Var.l = str;
        l41Var.m = str2;
        l41Var.D = onClickListener;
        return l41Var;
    }

    public static l41 s(int i9, String str) {
        l41 l41Var = new l41(0);
        l41Var.d = i9;
        l41Var.l = str;
        return l41Var;
    }

    public static l41 t(String str) {
        l41 l41Var = new l41(0);
        l41Var.l = str;
        return l41Var;
    }

    public static l41 u(org.telegram.ui.ce ceVar) {
        l41 l41Var = new l41(24);
        l41Var.G = ceVar;
        return l41Var;
    }

    public static l41 v(TLObject tLObject) {
        l41 l41Var = new l41(32);
        l41Var.G = tLObject;
        return l41Var;
    }

    public static l41 w(int i9, String str) {
        l41 l41Var = new l41(10);
        l41Var.d = i9;
        l41Var.l = str;
        return l41Var;
    }

    public static l41 x(int i9, String str, String str2) {
        l41 l41Var = new l41(44);
        l41Var.d = i9;
        l41Var.l = str;
        l41Var.n = str2;
        return l41Var;
    }

    public static l41 y(int i9, CharSequence charSequence) {
        l41 l41Var = new l41(35);
        l41Var.d = i9;
        l41Var.l = charSequence;
        return l41Var;
    }

    public static l41 z(String str, CharSequence charSequence, int i9) {
        l41 l41Var = new l41(41);
        l41Var.d = i9;
        l41Var.l = charSequence;
        l41Var.o = str;
        return l41Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        k41 k41Var;
        return this.a >= 10000 && (hashMap = L) != null && (k41Var = (k41) hashMap.get(cls)) != null && k41Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(l41 l41Var) {
        int i9 = this.a;
        if (i9 != l41Var.a || this.d != l41Var.d || this.g != l41Var.g) {
            return false;
        }
        if (i9 != 0 && i9 != 1) {
            if (i9 != 3) {
                if (i9 != 7) {
                    if (i9 != 26) {
                        if (i9 != 34 || this.z != l41Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != l41Var.G || !TextUtils.equals(this.l, l41Var.l) || !TextUtils.equals(this.n, l41Var.n) || this.k != l41Var.k || this.q != l41Var.q || this.r != l41Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, l41Var.l);
    }

    public final boolean I(l41 l41Var) {
        return this.d == l41Var.d && this.i == l41Var.i && this.x == l41Var.x && this.k == l41Var.k && this.j == l41Var.j && this.s == l41Var.s && this.r == l41Var.r && this.t == l41Var.t && this.q == l41Var.q && this.c == l41Var.c && TextUtils.equals(this.l, l41Var.l) && TextUtils.equals(this.m, l41Var.m) && TextUtils.equals(this.n, l41Var.n) && this.c == l41Var.c && this.z == l41Var.z && Math.abs(this.A - l41Var.A) < 0.01f && this.B == l41Var.B && Objects.equals(this.G, l41Var.G) && Objects.equals(this.H, l41Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // wf.a
    public final boolean a(wf.a aVar) {
        k41 F;
        if (this == aVar) {
            return true;
        }
        if (l41.class != aVar.getClass()) {
            return false;
        }
        l41 l41Var = (l41) aVar;
        int i9 = this.a;
        if (i9 != l41Var.a) {
            return false;
        }
        return i9 == 31 ? TextUtils.equals(this.l, l41Var.l) && TextUtils.equals(this.m, l41Var.m) : i9 == 28 ? this.z == l41Var.z : (i9 == 35 || i9 == 37) ? this.d == l41Var.d && TextUtils.equals(this.l, l41Var.l) && this.e == l41Var.e : (i9 < 10000 || (F = F(i9)) == null) ? H(l41Var) : F.contentsEquals(this, l41Var);
    }

    public final boolean equals(Object obj) {
        k41 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || l41.class != obj.getClass()) {
            return false;
        }
        l41 l41Var = (l41) obj;
        int i9 = this.a;
        if (i9 != l41Var.a) {
            return false;
        }
        return (i9 == 36 || i9 == 35) ? this.d == l41Var.d : i9 == 28 ? this.d == l41Var.d : i9 == 31 ? TextUtils.equals(this.l, l41Var.l) : (i9 < 10000 || (F = F(i9)) == null) ? I(l41Var) : F.equals(this, l41Var);
    }
}
