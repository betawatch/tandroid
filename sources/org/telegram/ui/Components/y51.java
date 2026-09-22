package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y51 extends og.a {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.s3 F;
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

    public y51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static y51 A(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.d = i10;
        y51Var.l = charSequence;
        return y51Var;
    }

    public static y51 B(CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.l = charSequence;
        return y51Var;
    }

    public static y51 C(int i10) {
        y51 y51Var = new y51(28);
        y51Var.z = i10;
        return y51Var;
    }

    public static y51 D(int i10, int i11) {
        y51 y51Var = new y51(28);
        y51Var.d = i10;
        y51Var.z = i11;
        return y51Var;
    }

    public static y51 E(int i10, String str) {
        y51 y51Var = new y51(39);
        y51Var.d = i10;
        y51Var.l = str;
        y51Var.z = 1;
        return y51Var;
    }

    public static x51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (x51) longSparseArray.get(i10);
    }

    public static y51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        x51 x51Var = (x51) L.get(cls);
        if (x51Var != null) {
            return new y51(x51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static y51 b(String str) {
        y51 y51Var = new y51(1);
        y51Var.l = str;
        return y51Var;
    }

    public static y51 c(int i10, int i11, String str) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.k = i11;
        y51Var.l = str;
        return y51Var;
    }

    public static y51 d(int i10, int i11, String str, String str2) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.k = i11;
        y51Var.l = str;
        y51Var.n = str2;
        return y51Var;
    }

    public static y51 e(int i10, String str) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.l = str;
        return y51Var;
    }

    public static y51 f(String str, CharSequence charSequence, int i10) {
        y51 y51Var = new y51(3);
        y51Var.d = i10;
        y51Var.l = str;
        y51Var.n = charSequence;
        return y51Var;
    }

    public static y51 g(CharSequence charSequence) {
        y51 y51Var = new y51(7);
        y51Var.l = charSequence;
        y51Var.q = true;
        return y51Var;
    }

    public static y51 h(int i10, int i11, na1 na1Var) {
        y51 y51Var = new y51(i10 + 18);
        y51Var.z = i11;
        y51Var.G = na1Var;
        return y51Var;
    }

    public static y51 i(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(4);
        y51Var.d = i10;
        y51Var.l = charSequence;
        return y51Var;
    }

    public static y51 j(int i10, View view) {
        y51 y51Var = new y51(-1);
        y51Var.d = i10;
        y51Var.c = view;
        y51Var.z = -1;
        return y51Var;
    }

    public static y51 k(View view) {
        y51 y51Var = new y51(-1);
        y51Var.c = view;
        y51Var.z = -1;
        return y51Var;
    }

    public static y51 l(View view) {
        y51 y51Var = new y51(-4);
        y51Var.c = view;
        y51Var.z = -1;
        return y51Var;
    }

    public static y51 m(int i10, String str, String str2) {
        y51 y51Var = new y51(40);
        y51Var.d = i10;
        y51Var.l = str;
        y51Var.o = str2;
        return y51Var;
    }

    public static y51 n(int i10) {
        y51 y51Var = new y51(34);
        y51Var.z = i10;
        return y51Var;
    }

    public static y51 o(int i10, int i11) {
        y51 y51Var = new y51(34);
        y51Var.d = i10;
        y51Var.z = i11;
        return y51Var;
    }

    public static y51 p(View view, int i10, boolean z10) {
        y51 y51Var = new y51(-3);
        y51Var.c = view;
        y51Var.z = i10;
        y51Var.y = z10 ? 1 : 0;
        return y51Var;
    }

    public static y51 q(String str) {
        y51 y51Var = new y51(31);
        y51Var.l = str;
        return y51Var;
    }

    public static y51 r(String str, String str2, View.OnClickListener onClickListener) {
        y51 y51Var = new y51(31);
        y51Var.l = str;
        y51Var.m = str2;
        y51Var.D = onClickListener;
        return y51Var;
    }

    public static y51 s(int i10, String str) {
        y51 y51Var = new y51(0);
        y51Var.d = i10;
        y51Var.l = str;
        return y51Var;
    }

    public static y51 t(String str) {
        y51 y51Var = new y51(0);
        y51Var.l = str;
        return y51Var;
    }

    public static y51 u(org.telegram.ui.he heVar) {
        y51 y51Var = new y51(24);
        y51Var.G = heVar;
        return y51Var;
    }

    public static y51 v(TLObject tLObject) {
        y51 y51Var = new y51(32);
        y51Var.G = tLObject;
        return y51Var;
    }

    public static y51 w(int i10, String str) {
        y51 y51Var = new y51(10);
        y51Var.d = i10;
        y51Var.l = str;
        return y51Var;
    }

    public static y51 x(int i10, String str, String str2) {
        y51 y51Var = new y51(44);
        y51Var.d = i10;
        y51Var.l = str;
        y51Var.n = str2;
        return y51Var;
    }

    public static y51 y(int i10, CharSequence charSequence) {
        y51 y51Var = new y51(35);
        y51Var.d = i10;
        y51Var.l = charSequence;
        return y51Var;
    }

    public static y51 z(String str, CharSequence charSequence, int i10) {
        y51 y51Var = new y51(41);
        y51Var.d = i10;
        y51Var.l = charSequence;
        y51Var.o = str;
        return y51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        x51 x51Var;
        return this.a >= 10000 && (hashMap = L) != null && (x51Var = (x51) hashMap.get(cls)) != null && x51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(y51 y51Var) {
        int i10 = this.a;
        if (i10 != y51Var.a || this.d != y51Var.d || this.g != y51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != y51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != y51Var.G || !TextUtils.equals(this.l, y51Var.l) || !TextUtils.equals(this.n, y51Var.n) || this.k != y51Var.k || this.q != y51Var.q || this.r != y51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, y51Var.l);
    }

    public final boolean I(y51 y51Var) {
        return this.d == y51Var.d && this.i == y51Var.i && this.x == y51Var.x && this.k == y51Var.k && this.j == y51Var.j && this.s == y51Var.s && this.r == y51Var.r && this.t == y51Var.t && this.q == y51Var.q && this.c == y51Var.c && TextUtils.equals(this.l, y51Var.l) && TextUtils.equals(this.m, y51Var.m) && TextUtils.equals(this.n, y51Var.n) && this.c == y51Var.c && this.z == y51Var.z && Math.abs(this.A - y51Var.A) < 0.01f && this.B == y51Var.B && Objects.equals(this.G, y51Var.G) && Objects.equals(this.H, y51Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        x51 F;
        if (this == aVar) {
            return true;
        }
        if (y51.class != aVar.getClass()) {
            return false;
        }
        y51 y51Var = (y51) aVar;
        int i10 = this.a;
        if (i10 != y51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, y51Var.l) && TextUtils.equals(this.m, y51Var.m) : i10 == 28 ? this.z == y51Var.z : (i10 == 35 || i10 == 37) ? this.d == y51Var.d && TextUtils.equals(this.l, y51Var.l) && this.e == y51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(y51Var) : F.contentsEquals(this, y51Var);
    }

    public final boolean equals(Object obj) {
        x51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || y51.class != obj.getClass()) {
            return false;
        }
        y51 y51Var = (y51) obj;
        int i10 = this.a;
        if (i10 != y51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == y51Var.d : i10 == 28 ? this.d == y51Var.d : i10 == 31 ? TextUtils.equals(this.l, y51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(y51Var) : F.equals(this, y51Var);
    }
}
