package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j51 extends cg.b {
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

    public j51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static j51 A(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.d = i10;
        j51Var.l = charSequence;
        return j51Var;
    }

    public static j51 B(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.l = charSequence;
        return j51Var;
    }

    public static j51 C(int i10) {
        j51 j51Var = new j51(28);
        j51Var.z = i10;
        return j51Var;
    }

    public static j51 D(int i10, int i11) {
        j51 j51Var = new j51(28);
        j51Var.d = i10;
        j51Var.z = i11;
        return j51Var;
    }

    public static j51 E(int i10, String str) {
        j51 j51Var = new j51(39);
        j51Var.d = i10;
        j51Var.l = str;
        j51Var.z = 1;
        return j51Var;
    }

    public static i51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (i51) longSparseArray.get(i10);
    }

    public static j51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        i51 i51Var = (i51) L.get(cls);
        if (i51Var != null) {
            return new j51(i51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static j51 b(String str) {
        j51 j51Var = new j51(1);
        j51Var.l = str;
        return j51Var;
    }

    public static j51 c(int i10, int i11, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.k = i11;
        j51Var.l = str;
        return j51Var;
    }

    public static j51 d(int i10, int i11, String str, String str2) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.k = i11;
        j51Var.l = str;
        j51Var.n = str2;
        return j51Var;
    }

    public static j51 e(int i10, String str) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.l = str;
        return j51Var;
    }

    public static j51 f(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(3);
        j51Var.d = i10;
        j51Var.l = str;
        j51Var.n = charSequence;
        return j51Var;
    }

    public static j51 g(CharSequence charSequence) {
        j51 j51Var = new j51(7);
        j51Var.l = charSequence;
        j51Var.q = true;
        return j51Var;
    }

    public static j51 h(int i10, int i11, t91 t91Var) {
        j51 j51Var = new j51(i10 + 18);
        j51Var.z = i11;
        j51Var.G = t91Var;
        return j51Var;
    }

    public static j51 i(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(4);
        j51Var.d = i10;
        j51Var.l = charSequence;
        return j51Var;
    }

    public static j51 j(int i10, View view) {
        j51 j51Var = new j51(-1);
        j51Var.d = i10;
        j51Var.c = view;
        j51Var.z = -1;
        return j51Var;
    }

    public static j51 k(View view) {
        j51 j51Var = new j51(-1);
        j51Var.c = view;
        j51Var.z = -1;
        return j51Var;
    }

    public static j51 l(View view) {
        j51 j51Var = new j51(-4);
        j51Var.c = view;
        j51Var.z = -1;
        return j51Var;
    }

    public static j51 m(int i10, String str, String str2) {
        j51 j51Var = new j51(40);
        j51Var.d = i10;
        j51Var.l = str;
        j51Var.o = str2;
        return j51Var;
    }

    public static j51 n(int i10) {
        j51 j51Var = new j51(34);
        j51Var.z = i10;
        return j51Var;
    }

    public static j51 o(int i10, int i11) {
        j51 j51Var = new j51(34);
        j51Var.d = i10;
        j51Var.z = i11;
        return j51Var;
    }

    public static j51 p(View view, int i10, boolean z4) {
        j51 j51Var = new j51(-3);
        j51Var.c = view;
        j51Var.z = i10;
        j51Var.y = z4 ? 1 : 0;
        return j51Var;
    }

    public static j51 q(String str) {
        j51 j51Var = new j51(31);
        j51Var.l = str;
        return j51Var;
    }

    public static j51 r(String str, String str2, View.OnClickListener onClickListener) {
        j51 j51Var = new j51(31);
        j51Var.l = str;
        j51Var.m = str2;
        j51Var.D = onClickListener;
        return j51Var;
    }

    public static j51 s(int i10, String str) {
        j51 j51Var = new j51(0);
        j51Var.d = i10;
        j51Var.l = str;
        return j51Var;
    }

    public static j51 t(String str) {
        j51 j51Var = new j51(0);
        j51Var.l = str;
        return j51Var;
    }

    public static j51 u(org.telegram.ui.he heVar) {
        j51 j51Var = new j51(24);
        j51Var.G = heVar;
        return j51Var;
    }

    public static j51 v(TLObject tLObject) {
        j51 j51Var = new j51(32);
        j51Var.G = tLObject;
        return j51Var;
    }

    public static j51 w(int i10, String str) {
        j51 j51Var = new j51(10);
        j51Var.d = i10;
        j51Var.l = str;
        return j51Var;
    }

    public static j51 x(int i10, String str, String str2) {
        j51 j51Var = new j51(44);
        j51Var.d = i10;
        j51Var.l = str;
        j51Var.n = str2;
        return j51Var;
    }

    public static j51 y(int i10, CharSequence charSequence) {
        j51 j51Var = new j51(35);
        j51Var.d = i10;
        j51Var.l = charSequence;
        return j51Var;
    }

    public static j51 z(String str, CharSequence charSequence, int i10) {
        j51 j51Var = new j51(41);
        j51Var.d = i10;
        j51Var.l = charSequence;
        j51Var.o = str;
        return j51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        i51 i51Var;
        return this.a >= 10000 && (hashMap = L) != null && (i51Var = (i51) hashMap.get(cls)) != null && i51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(j51 j51Var) {
        int i10 = this.a;
        if (i10 != j51Var.a || this.d != j51Var.d || this.g != j51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != j51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != j51Var.G || !TextUtils.equals(this.l, j51Var.l) || !TextUtils.equals(this.n, j51Var.n) || this.k != j51Var.k || this.q != j51Var.q || this.r != j51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, j51Var.l);
    }

    public final boolean I(j51 j51Var) {
        return this.d == j51Var.d && this.i == j51Var.i && this.x == j51Var.x && this.k == j51Var.k && this.j == j51Var.j && this.s == j51Var.s && this.r == j51Var.r && this.t == j51Var.t && this.q == j51Var.q && this.c == j51Var.c && TextUtils.equals(this.l, j51Var.l) && TextUtils.equals(this.m, j51Var.m) && TextUtils.equals(this.n, j51Var.n) && this.c == j51Var.c && this.z == j51Var.z && Math.abs(this.A - j51Var.A) < 0.01f && this.B == j51Var.B && Objects.equals(this.G, j51Var.G) && Objects.equals(this.H, j51Var.H);
    }

    public final void K(boolean z4) {
        this.e = z4;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // cg.b
    public final boolean a(cg.b bVar) {
        i51 F;
        if (this == bVar) {
            return true;
        }
        if (j51.class != bVar.getClass()) {
            return false;
        }
        j51 j51Var = (j51) bVar;
        int i10 = this.a;
        if (i10 != j51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, j51Var.l) && TextUtils.equals(this.m, j51Var.m) : i10 == 28 ? this.z == j51Var.z : (i10 == 35 || i10 == 37) ? this.d == j51Var.d && TextUtils.equals(this.l, j51Var.l) && this.e == j51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(j51Var) : F.contentsEquals(this, j51Var);
    }

    public final boolean equals(Object obj) {
        i51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || j51.class != obj.getClass()) {
            return false;
        }
        j51 j51Var = (j51) obj;
        int i10 = this.a;
        if (i10 != j51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == j51Var.d : i10 == 28 ? this.d == j51Var.d : i10 == 31 ? TextUtils.equals(this.l, j51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(j51Var) : F.equals(this, j51Var);
    }
}
