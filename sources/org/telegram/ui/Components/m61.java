package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m61 extends pg.a {
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

    public m61(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static m61 A(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.d = i10;
        m61Var.l = charSequence;
        return m61Var;
    }

    public static m61 B(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.l = charSequence;
        return m61Var;
    }

    public static m61 C(int i10) {
        m61 m61Var = new m61(28);
        m61Var.z = i10;
        return m61Var;
    }

    public static m61 D(int i10, int i11) {
        m61 m61Var = new m61(28);
        m61Var.d = i10;
        m61Var.z = i11;
        return m61Var;
    }

    public static m61 E(int i10, String str) {
        m61 m61Var = new m61(39);
        m61Var.d = i10;
        m61Var.l = str;
        m61Var.z = 1;
        return m61Var;
    }

    public static l61 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (l61) longSparseArray.get(i10);
    }

    public static m61 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        l61 l61Var = (l61) L.get(cls);
        if (l61Var != null) {
            return new m61(l61Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static m61 b(String str) {
        m61 m61Var = new m61(1);
        m61Var.l = str;
        return m61Var;
    }

    public static m61 c(int i10, int i11, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.k = i11;
        m61Var.l = str;
        return m61Var;
    }

    public static m61 d(int i10, int i11, String str, String str2) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.k = i11;
        m61Var.l = str;
        m61Var.n = str2;
        return m61Var;
    }

    public static m61 e(int i10, String str) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.l = str;
        return m61Var;
    }

    public static m61 f(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(3);
        m61Var.d = i10;
        m61Var.l = str;
        m61Var.n = charSequence;
        return m61Var;
    }

    public static m61 g(CharSequence charSequence) {
        m61 m61Var = new m61(7);
        m61Var.l = charSequence;
        m61Var.q = true;
        return m61Var;
    }

    public static m61 h(int i10, int i11, ta1 ta1Var) {
        m61 m61Var = new m61(i10 + 18);
        m61Var.z = i11;
        m61Var.G = ta1Var;
        return m61Var;
    }

    public static m61 i(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(4);
        m61Var.d = i10;
        m61Var.l = charSequence;
        return m61Var;
    }

    public static m61 j(int i10, View view) {
        m61 m61Var = new m61(-1);
        m61Var.d = i10;
        m61Var.c = view;
        m61Var.z = -1;
        return m61Var;
    }

    public static m61 k(View view) {
        m61 m61Var = new m61(-1);
        m61Var.c = view;
        m61Var.z = -1;
        return m61Var;
    }

    public static m61 l(View view) {
        m61 m61Var = new m61(-4);
        m61Var.c = view;
        m61Var.z = -1;
        return m61Var;
    }

    public static m61 m(int i10, String str, String str2) {
        m61 m61Var = new m61(40);
        m61Var.d = i10;
        m61Var.l = str;
        m61Var.o = str2;
        return m61Var;
    }

    public static m61 n(int i10) {
        m61 m61Var = new m61(34);
        m61Var.z = i10;
        return m61Var;
    }

    public static m61 o(int i10, int i11) {
        m61 m61Var = new m61(34);
        m61Var.d = i10;
        m61Var.z = i11;
        return m61Var;
    }

    public static m61 p(View view, int i10, boolean z10) {
        m61 m61Var = new m61(-3);
        m61Var.c = view;
        m61Var.z = i10;
        m61Var.y = z10 ? 1 : 0;
        return m61Var;
    }

    public static m61 q(String str) {
        m61 m61Var = new m61(31);
        m61Var.l = str;
        return m61Var;
    }

    public static m61 r(String str, String str2, View.OnClickListener onClickListener) {
        m61 m61Var = new m61(31);
        m61Var.l = str;
        m61Var.m = str2;
        m61Var.D = onClickListener;
        return m61Var;
    }

    public static m61 s(int i10, String str) {
        m61 m61Var = new m61(0);
        m61Var.d = i10;
        m61Var.l = str;
        return m61Var;
    }

    public static m61 t(String str) {
        m61 m61Var = new m61(0);
        m61Var.l = str;
        return m61Var;
    }

    public static m61 u(org.telegram.ui.ne neVar) {
        m61 m61Var = new m61(24);
        m61Var.G = neVar;
        return m61Var;
    }

    public static m61 v(TLObject tLObject) {
        m61 m61Var = new m61(32);
        m61Var.G = tLObject;
        return m61Var;
    }

    public static m61 w(int i10, String str) {
        m61 m61Var = new m61(10);
        m61Var.d = i10;
        m61Var.l = str;
        return m61Var;
    }

    public static m61 x(int i10, String str, String str2) {
        m61 m61Var = new m61(44);
        m61Var.d = i10;
        m61Var.l = str;
        m61Var.n = str2;
        return m61Var;
    }

    public static m61 y(int i10, CharSequence charSequence) {
        m61 m61Var = new m61(35);
        m61Var.d = i10;
        m61Var.l = charSequence;
        return m61Var;
    }

    public static m61 z(String str, CharSequence charSequence, int i10) {
        m61 m61Var = new m61(41);
        m61Var.d = i10;
        m61Var.l = charSequence;
        m61Var.o = str;
        return m61Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        l61 l61Var;
        return this.a >= 10000 && (hashMap = L) != null && (l61Var = (l61) hashMap.get(cls)) != null && l61Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(m61 m61Var) {
        int i10 = this.a;
        if (i10 != m61Var.a || this.d != m61Var.d || this.g != m61Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != m61Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != m61Var.G || !TextUtils.equals(this.l, m61Var.l) || !TextUtils.equals(this.n, m61Var.n) || this.k != m61Var.k || this.q != m61Var.q || this.r != m61Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, m61Var.l);
    }

    public final boolean I(m61 m61Var) {
        return this.d == m61Var.d && this.i == m61Var.i && this.x == m61Var.x && this.k == m61Var.k && this.j == m61Var.j && this.s == m61Var.s && this.r == m61Var.r && this.t == m61Var.t && this.q == m61Var.q && this.c == m61Var.c && TextUtils.equals(this.l, m61Var.l) && TextUtils.equals(this.m, m61Var.m) && TextUtils.equals(this.n, m61Var.n) && this.c == m61Var.c && this.z == m61Var.z && Math.abs(this.A - m61Var.A) < 0.01f && this.B == m61Var.B && Objects.equals(this.G, m61Var.G) && Objects.equals(this.H, m61Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        l61 F;
        if (this == aVar) {
            return true;
        }
        if (m61.class != aVar.getClass()) {
            return false;
        }
        m61 m61Var = (m61) aVar;
        int i10 = this.a;
        if (i10 != m61Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, m61Var.l) && TextUtils.equals(this.m, m61Var.m) : i10 == 28 ? this.z == m61Var.z : (i10 == 35 || i10 == 37) ? this.d == m61Var.d && TextUtils.equals(this.l, m61Var.l) && this.e == m61Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(m61Var) : F.contentsEquals(this, m61Var);
    }

    public final boolean equals(Object obj) {
        l61 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || m61.class != obj.getClass()) {
            return false;
        }
        m61 m61Var = (m61) obj;
        int i10 = this.a;
        if (i10 != m61Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == m61Var.d : i10 == 28 ? this.d == m61Var.d : i10 == 31 ? TextUtils.equals(this.l, m61Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(m61Var) : F.equals(this, m61Var);
    }
}
