package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class x51 extends og.a {
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

    public x51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static x51 A(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.d = i10;
        x51Var.l = charSequence;
        return x51Var;
    }

    public static x51 B(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.l = charSequence;
        return x51Var;
    }

    public static x51 C(int i10) {
        x51 x51Var = new x51(28);
        x51Var.z = i10;
        return x51Var;
    }

    public static x51 D(int i10, int i11) {
        x51 x51Var = new x51(28);
        x51Var.d = i10;
        x51Var.z = i11;
        return x51Var;
    }

    public static x51 E(int i10, String str) {
        x51 x51Var = new x51(39);
        x51Var.d = i10;
        x51Var.l = str;
        x51Var.z = 1;
        return x51Var;
    }

    public static w51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (w51) longSparseArray.get(i10);
    }

    public static x51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        w51 w51Var = (w51) L.get(cls);
        if (w51Var != null) {
            return new x51(w51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static x51 b(String str) {
        x51 x51Var = new x51(1);
        x51Var.l = str;
        return x51Var;
    }

    public static x51 c(int i10, int i11, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.k = i11;
        x51Var.l = str;
        return x51Var;
    }

    public static x51 d(int i10, int i11, String str, String str2) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.k = i11;
        x51Var.l = str;
        x51Var.n = str2;
        return x51Var;
    }

    public static x51 e(int i10, String str) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.l = str;
        return x51Var;
    }

    public static x51 f(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(3);
        x51Var.d = i10;
        x51Var.l = str;
        x51Var.n = charSequence;
        return x51Var;
    }

    public static x51 g(CharSequence charSequence) {
        x51 x51Var = new x51(7);
        x51Var.l = charSequence;
        x51Var.q = true;
        return x51Var;
    }

    public static x51 h(int i10, int i11, la1 la1Var) {
        x51 x51Var = new x51(i10 + 18);
        x51Var.z = i11;
        x51Var.G = la1Var;
        return x51Var;
    }

    public static x51 i(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(4);
        x51Var.d = i10;
        x51Var.l = charSequence;
        return x51Var;
    }

    public static x51 j(int i10, View view) {
        x51 x51Var = new x51(-1);
        x51Var.d = i10;
        x51Var.c = view;
        x51Var.z = -1;
        return x51Var;
    }

    public static x51 k(View view) {
        x51 x51Var = new x51(-1);
        x51Var.c = view;
        x51Var.z = -1;
        return x51Var;
    }

    public static x51 l(View view) {
        x51 x51Var = new x51(-4);
        x51Var.c = view;
        x51Var.z = -1;
        return x51Var;
    }

    public static x51 m(int i10, String str, String str2) {
        x51 x51Var = new x51(40);
        x51Var.d = i10;
        x51Var.l = str;
        x51Var.o = str2;
        return x51Var;
    }

    public static x51 n(int i10) {
        x51 x51Var = new x51(34);
        x51Var.z = i10;
        return x51Var;
    }

    public static x51 o(int i10, int i11) {
        x51 x51Var = new x51(34);
        x51Var.d = i10;
        x51Var.z = i11;
        return x51Var;
    }

    public static x51 p(View view, int i10, boolean z10) {
        x51 x51Var = new x51(-3);
        x51Var.c = view;
        x51Var.z = i10;
        x51Var.y = z10 ? 1 : 0;
        return x51Var;
    }

    public static x51 q(String str) {
        x51 x51Var = new x51(31);
        x51Var.l = str;
        return x51Var;
    }

    public static x51 r(String str, String str2, View.OnClickListener onClickListener) {
        x51 x51Var = new x51(31);
        x51Var.l = str;
        x51Var.m = str2;
        x51Var.D = onClickListener;
        return x51Var;
    }

    public static x51 s(int i10, String str) {
        x51 x51Var = new x51(0);
        x51Var.d = i10;
        x51Var.l = str;
        return x51Var;
    }

    public static x51 t(String str) {
        x51 x51Var = new x51(0);
        x51Var.l = str;
        return x51Var;
    }

    public static x51 u(org.telegram.ui.he heVar) {
        x51 x51Var = new x51(24);
        x51Var.G = heVar;
        return x51Var;
    }

    public static x51 v(TLObject tLObject) {
        x51 x51Var = new x51(32);
        x51Var.G = tLObject;
        return x51Var;
    }

    public static x51 w(int i10, String str) {
        x51 x51Var = new x51(10);
        x51Var.d = i10;
        x51Var.l = str;
        return x51Var;
    }

    public static x51 x(int i10, String str, String str2) {
        x51 x51Var = new x51(44);
        x51Var.d = i10;
        x51Var.l = str;
        x51Var.n = str2;
        return x51Var;
    }

    public static x51 y(int i10, CharSequence charSequence) {
        x51 x51Var = new x51(35);
        x51Var.d = i10;
        x51Var.l = charSequence;
        return x51Var;
    }

    public static x51 z(String str, CharSequence charSequence, int i10) {
        x51 x51Var = new x51(41);
        x51Var.d = i10;
        x51Var.l = charSequence;
        x51Var.o = str;
        return x51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        w51 w51Var;
        return this.a >= 10000 && (hashMap = L) != null && (w51Var = (w51) hashMap.get(cls)) != null && w51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(x51 x51Var) {
        int i10 = this.a;
        if (i10 != x51Var.a || this.d != x51Var.d || this.g != x51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != x51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != x51Var.G || !TextUtils.equals(this.l, x51Var.l) || !TextUtils.equals(this.n, x51Var.n) || this.k != x51Var.k || this.q != x51Var.q || this.r != x51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, x51Var.l);
    }

    public final boolean I(x51 x51Var) {
        return this.d == x51Var.d && this.i == x51Var.i && this.x == x51Var.x && this.k == x51Var.k && this.j == x51Var.j && this.s == x51Var.s && this.r == x51Var.r && this.t == x51Var.t && this.q == x51Var.q && this.c == x51Var.c && TextUtils.equals(this.l, x51Var.l) && TextUtils.equals(this.m, x51Var.m) && TextUtils.equals(this.n, x51Var.n) && this.c == x51Var.c && this.z == x51Var.z && Math.abs(this.A - x51Var.A) < 0.01f && this.B == x51Var.B && Objects.equals(this.G, x51Var.G) && Objects.equals(this.H, x51Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        w51 F;
        if (this == aVar) {
            return true;
        }
        if (x51.class != aVar.getClass()) {
            return false;
        }
        x51 x51Var = (x51) aVar;
        int i10 = this.a;
        if (i10 != x51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, x51Var.l) && TextUtils.equals(this.m, x51Var.m) : i10 == 28 ? this.z == x51Var.z : (i10 == 35 || i10 == 37) ? this.d == x51Var.d && TextUtils.equals(this.l, x51Var.l) && this.e == x51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(x51Var) : F.contentsEquals(this, x51Var);
    }

    public final boolean equals(Object obj) {
        w51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || x51.class != obj.getClass()) {
            return false;
        }
        x51 x51Var = (x51) obj;
        int i10 = this.a;
        if (i10 != x51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == x51Var.d : i10 == 28 ? this.d == x51Var.d : i10 == 31 ? TextUtils.equals(this.l, x51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(x51Var) : F.equals(this, x51Var);
    }
}
