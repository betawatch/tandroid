package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.f91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w41 extends zf.a {
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

    public w41(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static w41 A(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.d = i10;
        w41Var.l = charSequence;
        return w41Var;
    }

    public static w41 B(CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.l = charSequence;
        return w41Var;
    }

    public static w41 C(int i10) {
        w41 w41Var = new w41(28);
        w41Var.z = i10;
        return w41Var;
    }

    public static w41 D(int i10, int i11) {
        w41 w41Var = new w41(28);
        w41Var.d = i10;
        w41Var.z = i11;
        return w41Var;
    }

    public static w41 E(int i10, String str) {
        w41 w41Var = new w41(39);
        w41Var.d = i10;
        w41Var.l = str;
        w41Var.z = 1;
        return w41Var;
    }

    public static v41 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (v41) longSparseArray.get(i10);
    }

    public static w41 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        v41 v41Var = (v41) L.get(cls);
        if (v41Var != null) {
            return new w41(v41Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static w41 b(String str) {
        w41 w41Var = new w41(1);
        w41Var.l = str;
        return w41Var;
    }

    public static w41 c(int i10, int i11, String str) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.k = i11;
        w41Var.l = str;
        return w41Var;
    }

    public static w41 d(int i10, int i11, String str, String str2) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.k = i11;
        w41Var.l = str;
        w41Var.n = str2;
        return w41Var;
    }

    public static w41 e(int i10, String str) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.l = str;
        return w41Var;
    }

    public static w41 f(String str, CharSequence charSequence, int i10) {
        w41 w41Var = new w41(3);
        w41Var.d = i10;
        w41Var.l = str;
        w41Var.n = charSequence;
        return w41Var;
    }

    public static w41 g(CharSequence charSequence) {
        w41 w41Var = new w41(7);
        w41Var.l = charSequence;
        w41Var.q = true;
        return w41Var;
    }

    public static w41 h(int i10, int i11, f91 f91Var) {
        w41 w41Var = new w41(i10 + 18);
        w41Var.z = i11;
        w41Var.G = f91Var;
        return w41Var;
    }

    public static w41 i(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(4);
        w41Var.d = i10;
        w41Var.l = charSequence;
        return w41Var;
    }

    public static w41 j(int i10, View view) {
        w41 w41Var = new w41(-1);
        w41Var.d = i10;
        w41Var.c = view;
        w41Var.z = -1;
        return w41Var;
    }

    public static w41 k(View view) {
        w41 w41Var = new w41(-1);
        w41Var.c = view;
        w41Var.z = -1;
        return w41Var;
    }

    public static w41 l(View view) {
        w41 w41Var = new w41(-4);
        w41Var.c = view;
        w41Var.z = -1;
        return w41Var;
    }

    public static w41 m(int i10, String str, String str2) {
        w41 w41Var = new w41(40);
        w41Var.d = i10;
        w41Var.l = str;
        w41Var.o = str2;
        return w41Var;
    }

    public static w41 n(int i10) {
        w41 w41Var = new w41(34);
        w41Var.z = i10;
        return w41Var;
    }

    public static w41 o(int i10, int i11) {
        w41 w41Var = new w41(34);
        w41Var.d = i10;
        w41Var.z = i11;
        return w41Var;
    }

    public static w41 p(View view, int i10, boolean z10) {
        w41 w41Var = new w41(-3);
        w41Var.c = view;
        w41Var.z = i10;
        w41Var.y = z10 ? 1 : 0;
        return w41Var;
    }

    public static w41 q(String str) {
        w41 w41Var = new w41(31);
        w41Var.l = str;
        return w41Var;
    }

    public static w41 r(String str, String str2, View.OnClickListener onClickListener) {
        w41 w41Var = new w41(31);
        w41Var.l = str;
        w41Var.m = str2;
        w41Var.D = onClickListener;
        return w41Var;
    }

    public static w41 s(int i10, String str) {
        w41 w41Var = new w41(0);
        w41Var.d = i10;
        w41Var.l = str;
        return w41Var;
    }

    public static w41 t(String str) {
        w41 w41Var = new w41(0);
        w41Var.l = str;
        return w41Var;
    }

    public static w41 u(org.telegram.ui.ae aeVar) {
        w41 w41Var = new w41(24);
        w41Var.G = aeVar;
        return w41Var;
    }

    public static w41 v(TLObject tLObject) {
        w41 w41Var = new w41(32);
        w41Var.G = tLObject;
        return w41Var;
    }

    public static w41 w(int i10, String str) {
        w41 w41Var = new w41(10);
        w41Var.d = i10;
        w41Var.l = str;
        return w41Var;
    }

    public static w41 x(int i10, String str, String str2) {
        w41 w41Var = new w41(44);
        w41Var.d = i10;
        w41Var.l = str;
        w41Var.n = str2;
        return w41Var;
    }

    public static w41 y(int i10, CharSequence charSequence) {
        w41 w41Var = new w41(35);
        w41Var.d = i10;
        w41Var.l = charSequence;
        return w41Var;
    }

    public static w41 z(String str, CharSequence charSequence, int i10) {
        w41 w41Var = new w41(41);
        w41Var.d = i10;
        w41Var.l = charSequence;
        w41Var.o = str;
        return w41Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        v41 v41Var;
        return this.a >= 10000 && (hashMap = L) != null && (v41Var = (v41) hashMap.get(cls)) != null && v41Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(w41 w41Var) {
        int i10 = this.a;
        if (i10 != w41Var.a || this.d != w41Var.d || this.g != w41Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != w41Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != w41Var.G || !TextUtils.equals(this.l, w41Var.l) || !TextUtils.equals(this.n, w41Var.n) || this.k != w41Var.k || this.q != w41Var.q || this.r != w41Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, w41Var.l);
    }

    public final boolean I(w41 w41Var) {
        return this.d == w41Var.d && this.i == w41Var.i && this.x == w41Var.x && this.k == w41Var.k && this.j == w41Var.j && this.s == w41Var.s && this.r == w41Var.r && this.t == w41Var.t && this.q == w41Var.q && this.c == w41Var.c && TextUtils.equals(this.l, w41Var.l) && TextUtils.equals(this.m, w41Var.m) && TextUtils.equals(this.n, w41Var.n) && this.c == w41Var.c && this.z == w41Var.z && Math.abs(this.A - w41Var.A) < 0.01f && this.B == w41Var.B && Objects.equals(this.G, w41Var.G) && Objects.equals(this.H, w41Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // zf.a
    public final boolean a(zf.a aVar) {
        v41 F;
        if (this == aVar) {
            return true;
        }
        if (w41.class != aVar.getClass()) {
            return false;
        }
        w41 w41Var = (w41) aVar;
        int i10 = this.a;
        if (i10 != w41Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, w41Var.l) && TextUtils.equals(this.m, w41Var.m) : i10 == 28 ? this.z == w41Var.z : (i10 == 35 || i10 == 37) ? this.d == w41Var.d && TextUtils.equals(this.l, w41Var.l) && this.e == w41Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(w41Var) : F.contentsEquals(this, w41Var);
    }

    public final boolean equals(Object obj) {
        v41 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || w41.class != obj.getClass()) {
            return false;
        }
        w41 w41Var = (w41) obj;
        int i10 = this.a;
        if (i10 != w41Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == w41Var.d : i10 == 28 ? this.d == w41Var.d : i10 == 31 ? TextUtils.equals(this.l, w41Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(w41Var) : F.equals(this, w41Var);
    }
}
