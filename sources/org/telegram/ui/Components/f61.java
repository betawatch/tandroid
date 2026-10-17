package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class f61 extends pg.a {
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

    public f61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static f61 A(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.d = i10;
        f61Var.l = charSequence;
        return f61Var;
    }

    public static f61 B(CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.l = charSequence;
        return f61Var;
    }

    public static f61 C(int i10) {
        f61 f61Var = new f61(28);
        f61Var.z = i10;
        return f61Var;
    }

    public static f61 D(int i10, int i11) {
        f61 f61Var = new f61(28);
        f61Var.d = i10;
        f61Var.z = i11;
        return f61Var;
    }

    public static f61 E(int i10, String str) {
        f61 f61Var = new f61(39);
        f61Var.d = i10;
        f61Var.l = str;
        f61Var.z = 1;
        return f61Var;
    }

    public static e61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (e61) longSparseArray.get(i10);
    }

    public static f61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        e61 e61Var = (e61) L.get(cls);
        if (e61Var != null) {
            return new f61(e61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static f61 b(String str) {
        f61 f61Var = new f61(1);
        f61Var.l = str;
        return f61Var;
    }

    public static f61 c(int i10, int i11, String str) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.k = i11;
        f61Var.l = str;
        return f61Var;
    }

    public static f61 d(int i10, int i11, String str, String str2) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.k = i11;
        f61Var.l = str;
        f61Var.n = str2;
        return f61Var;
    }

    public static f61 e(int i10, String str) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.l = str;
        return f61Var;
    }

    public static f61 f(String str, CharSequence charSequence, int i10) {
        f61 f61Var = new f61(3);
        f61Var.d = i10;
        f61Var.l = str;
        f61Var.n = charSequence;
        return f61Var;
    }

    public static f61 g(CharSequence charSequence) {
        f61 f61Var = new f61(7);
        f61Var.l = charSequence;
        f61Var.q = true;
        return f61Var;
    }

    public static f61 h(int i10, int i11, org.telegram.ui.d91 d91Var) {
        f61 f61Var = new f61(i10 + 18);
        f61Var.z = i11;
        f61Var.G = d91Var;
        return f61Var;
    }

    public static f61 i(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(4);
        f61Var.d = i10;
        f61Var.l = charSequence;
        return f61Var;
    }

    public static f61 j(int i10, View view) {
        f61 f61Var = new f61(-1);
        f61Var.d = i10;
        f61Var.c = view;
        f61Var.z = -1;
        return f61Var;
    }

    public static f61 k(View view) {
        f61 f61Var = new f61(-1);
        f61Var.c = view;
        f61Var.z = -1;
        return f61Var;
    }

    public static f61 l(View view) {
        f61 f61Var = new f61(-4);
        f61Var.c = view;
        f61Var.z = -1;
        return f61Var;
    }

    public static f61 m(int i10, String str, String str2) {
        f61 f61Var = new f61(40);
        f61Var.d = i10;
        f61Var.l = str;
        f61Var.o = str2;
        return f61Var;
    }

    public static f61 n(int i10) {
        f61 f61Var = new f61(34);
        f61Var.z = i10;
        return f61Var;
    }

    public static f61 o(int i10, int i11) {
        f61 f61Var = new f61(34);
        f61Var.d = i10;
        f61Var.z = i11;
        return f61Var;
    }

    public static f61 p(View view, int i10, boolean z10) {
        f61 f61Var = new f61(-3);
        f61Var.c = view;
        f61Var.z = i10;
        f61Var.y = z10 ? 1 : 0;
        return f61Var;
    }

    public static f61 q(String str) {
        f61 f61Var = new f61(31);
        f61Var.l = str;
        return f61Var;
    }

    public static f61 r(String str, String str2, View.OnClickListener onClickListener) {
        f61 f61Var = new f61(31);
        f61Var.l = str;
        f61Var.m = str2;
        f61Var.D = onClickListener;
        return f61Var;
    }

    public static f61 s(int i10, String str) {
        f61 f61Var = new f61(0);
        f61Var.d = i10;
        f61Var.l = str;
        return f61Var;
    }

    public static f61 t(String str) {
        f61 f61Var = new f61(0);
        f61Var.l = str;
        return f61Var;
    }

    public static f61 u(org.telegram.ui.he heVar) {
        f61 f61Var = new f61(24);
        f61Var.G = heVar;
        return f61Var;
    }

    public static f61 v(TLObject tLObject) {
        f61 f61Var = new f61(32);
        f61Var.G = tLObject;
        return f61Var;
    }

    public static f61 w(int i10, String str) {
        f61 f61Var = new f61(10);
        f61Var.d = i10;
        f61Var.l = str;
        return f61Var;
    }

    public static f61 x(int i10, String str, String str2) {
        f61 f61Var = new f61(44);
        f61Var.d = i10;
        f61Var.l = str;
        f61Var.n = str2;
        return f61Var;
    }

    public static f61 y(int i10, CharSequence charSequence) {
        f61 f61Var = new f61(35);
        f61Var.d = i10;
        f61Var.l = charSequence;
        return f61Var;
    }

    public static f61 z(String str, CharSequence charSequence, int i10) {
        f61 f61Var = new f61(41);
        f61Var.d = i10;
        f61Var.l = charSequence;
        f61Var.o = str;
        return f61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        e61 e61Var;
        return this.a >= 10000 && (hashMap = L) != null && (e61Var = (e61) hashMap.get(cls)) != null && e61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(f61 f61Var) {
        int i10 = this.a;
        if (i10 != f61Var.a || this.d != f61Var.d || this.g != f61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != f61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != f61Var.G || !TextUtils.equals(this.l, f61Var.l) || !TextUtils.equals(this.n, f61Var.n) || this.k != f61Var.k || this.q != f61Var.q || this.r != f61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, f61Var.l);
    }

    public final boolean I(f61 f61Var) {
        return this.d == f61Var.d && this.i == f61Var.i && this.x == f61Var.x && this.k == f61Var.k && this.j == f61Var.j && this.s == f61Var.s && this.r == f61Var.r && this.t == f61Var.t && this.q == f61Var.q && this.c == f61Var.c && TextUtils.equals(this.l, f61Var.l) && TextUtils.equals(this.m, f61Var.m) && TextUtils.equals(this.n, f61Var.n) && this.c == f61Var.c && this.z == f61Var.z && Math.abs(this.A - f61Var.A) < 0.01f && this.B == f61Var.B && Objects.equals(this.G, f61Var.G) && Objects.equals(this.H, f61Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        e61 F;
        if (this == aVar) {
            return true;
        }
        if (f61.class != aVar.getClass()) {
            return false;
        }
        f61 f61Var = (f61) aVar;
        int i10 = this.a;
        if (i10 != f61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, f61Var.l) && TextUtils.equals(this.m, f61Var.m) : i10 == 28 ? this.z == f61Var.z : (i10 == 35 || i10 == 37) ? this.d == f61Var.d && TextUtils.equals(this.l, f61Var.l) && this.e == f61Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(f61Var) : F.contentsEquals(this, f61Var);
    }

    public final boolean equals(Object obj) {
        e61 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || f61.class != obj.getClass()) {
            return false;
        }
        f61 f61Var = (f61) obj;
        int i10 = this.a;
        if (i10 != f61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == f61Var.d : i10 == 28 ? this.d == f61Var.d : i10 == 31 ? TextUtils.equals(this.l, f61Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(f61Var) : F.equals(this, f61Var);
    }
}
