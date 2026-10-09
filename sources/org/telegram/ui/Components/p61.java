package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p61 extends og.a {
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

    public p61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static p61 A(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.d = i10;
        p61Var.l = charSequence;
        return p61Var;
    }

    public static p61 B(CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.l = charSequence;
        return p61Var;
    }

    public static p61 C(int i10) {
        p61 p61Var = new p61(28);
        p61Var.z = i10;
        return p61Var;
    }

    public static p61 D(int i10, int i11) {
        p61 p61Var = new p61(28);
        p61Var.d = i10;
        p61Var.z = i11;
        return p61Var;
    }

    public static p61 E(int i10, String str) {
        p61 p61Var = new p61(39);
        p61Var.d = i10;
        p61Var.l = str;
        p61Var.z = 1;
        return p61Var;
    }

    public static o61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (o61) longSparseArray.get(i10);
    }

    public static p61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        o61 o61Var = (o61) L.get(cls);
        if (o61Var != null) {
            return new p61(o61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static p61 b(String str) {
        p61 p61Var = new p61(1);
        p61Var.l = str;
        return p61Var;
    }

    public static p61 c(int i10, int i11, String str) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.k = i11;
        p61Var.l = str;
        return p61Var;
    }

    public static p61 d(int i10, int i11, String str, String str2) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.k = i11;
        p61Var.l = str;
        p61Var.n = str2;
        return p61Var;
    }

    public static p61 e(int i10, String str) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.l = str;
        return p61Var;
    }

    public static p61 f(String str, CharSequence charSequence, int i10) {
        p61 p61Var = new p61(3);
        p61Var.d = i10;
        p61Var.l = str;
        p61Var.n = charSequence;
        return p61Var;
    }

    public static p61 g(CharSequence charSequence) {
        p61 p61Var = new p61(7);
        p61Var.l = charSequence;
        p61Var.q = true;
        return p61Var;
    }

    public static p61 h(int i10, int i11, na1 na1Var) {
        p61 p61Var = new p61(i10 + 18);
        p61Var.z = i11;
        p61Var.G = na1Var;
        return p61Var;
    }

    public static p61 i(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(4);
        p61Var.d = i10;
        p61Var.l = charSequence;
        return p61Var;
    }

    public static p61 j(int i10, View view) {
        p61 p61Var = new p61(-1);
        p61Var.d = i10;
        p61Var.c = view;
        p61Var.z = -1;
        return p61Var;
    }

    public static p61 k(View view) {
        p61 p61Var = new p61(-1);
        p61Var.c = view;
        p61Var.z = -1;
        return p61Var;
    }

    public static p61 l(View view) {
        p61 p61Var = new p61(-4);
        p61Var.c = view;
        p61Var.z = -1;
        return p61Var;
    }

    public static p61 m(int i10, String str, String str2) {
        p61 p61Var = new p61(40);
        p61Var.d = i10;
        p61Var.l = str;
        p61Var.o = str2;
        return p61Var;
    }

    public static p61 n(int i10) {
        p61 p61Var = new p61(34);
        p61Var.z = i10;
        return p61Var;
    }

    public static p61 o(int i10, int i11) {
        p61 p61Var = new p61(34);
        p61Var.d = i10;
        p61Var.z = i11;
        return p61Var;
    }

    public static p61 p(View view, int i10, boolean z10) {
        p61 p61Var = new p61(-3);
        p61Var.c = view;
        p61Var.z = i10;
        p61Var.y = z10 ? 1 : 0;
        return p61Var;
    }

    public static p61 q(String str) {
        p61 p61Var = new p61(31);
        p61Var.l = str;
        return p61Var;
    }

    public static p61 r(String str, String str2, View.OnClickListener onClickListener) {
        p61 p61Var = new p61(31);
        p61Var.l = str;
        p61Var.m = str2;
        p61Var.D = onClickListener;
        return p61Var;
    }

    public static p61 s(int i10, String str) {
        p61 p61Var = new p61(0);
        p61Var.d = i10;
        p61Var.l = str;
        return p61Var;
    }

    public static p61 t(String str) {
        p61 p61Var = new p61(0);
        p61Var.l = str;
        return p61Var;
    }

    public static p61 u(org.telegram.ui.he heVar) {
        p61 p61Var = new p61(24);
        p61Var.G = heVar;
        return p61Var;
    }

    public static p61 v(TLObject tLObject) {
        p61 p61Var = new p61(32);
        p61Var.G = tLObject;
        return p61Var;
    }

    public static p61 w(int i10, String str) {
        p61 p61Var = new p61(10);
        p61Var.d = i10;
        p61Var.l = str;
        return p61Var;
    }

    public static p61 x(int i10, String str, String str2) {
        p61 p61Var = new p61(44);
        p61Var.d = i10;
        p61Var.l = str;
        p61Var.n = str2;
        return p61Var;
    }

    public static p61 y(int i10, CharSequence charSequence) {
        p61 p61Var = new p61(35);
        p61Var.d = i10;
        p61Var.l = charSequence;
        return p61Var;
    }

    public static p61 z(String str, CharSequence charSequence, int i10) {
        p61 p61Var = new p61(41);
        p61Var.d = i10;
        p61Var.l = charSequence;
        p61Var.o = str;
        return p61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        o61 o61Var;
        return this.a >= 10000 && (hashMap = L) != null && (o61Var = (o61) hashMap.get(cls)) != null && o61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(p61 p61Var) {
        int i10 = this.a;
        if (i10 != p61Var.a || this.d != p61Var.d || this.g != p61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != p61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != p61Var.G || !TextUtils.equals(this.l, p61Var.l) || !TextUtils.equals(this.n, p61Var.n) || this.k != p61Var.k || this.q != p61Var.q || this.r != p61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, p61Var.l);
    }

    public final boolean I(p61 p61Var) {
        return this.d == p61Var.d && this.i == p61Var.i && this.x == p61Var.x && this.k == p61Var.k && this.j == p61Var.j && this.s == p61Var.s && this.r == p61Var.r && this.t == p61Var.t && this.q == p61Var.q && this.c == p61Var.c && TextUtils.equals(this.l, p61Var.l) && TextUtils.equals(this.m, p61Var.m) && TextUtils.equals(this.n, p61Var.n) && this.c == p61Var.c && this.z == p61Var.z && Math.abs(this.A - p61Var.A) < 0.01f && this.B == p61Var.B && Objects.equals(this.G, p61Var.G) && Objects.equals(this.H, p61Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        o61 F;
        if (this == aVar) {
            return true;
        }
        if (p61.class != aVar.getClass()) {
            return false;
        }
        p61 p61Var = (p61) aVar;
        int i10 = this.a;
        if (i10 != p61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, p61Var.l) && TextUtils.equals(this.m, p61Var.m) : i10 == 28 ? this.z == p61Var.z : (i10 == 35 || i10 == 37) ? this.d == p61Var.d && TextUtils.equals(this.l, p61Var.l) && this.e == p61Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(p61Var) : F.contentsEquals(this, p61Var);
    }

    public final boolean equals(Object obj) {
        o61 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || p61.class != obj.getClass()) {
            return false;
        }
        p61 p61Var = (p61) obj;
        int i10 = this.a;
        if (i10 != p61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == p61Var.d : i10 == 28 ? this.d == p61Var.d : i10 == 31 ? TextUtils.equals(this.l, p61Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(p61Var) : F.equals(this, p61Var);
    }
}
