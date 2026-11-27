// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b8c extends ka {
    public static int K = 10000;
    public static LongSparseArray L;
    public static HashMap M;
    public int A;
    public float B;
    public long C;
    public pcc D;
    public View.OnClickListener E;
    public View.OnClickListener F;
    public pcc G;
    public Object H;
    public Object I;
    public boolean J;
    public View c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public zm2 l;
    public CharSequence m;
    public CharSequence n;
    public CharSequence o;
    public CharSequence p;
    public String[] q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public int z;

    public b8c(int i) {
        super(i, false);
        this.g = true;
        this.v = -1;
        this.J = true;
    }

    public static b8c A(String str, CharSequence charSequence, int i) {
        b8c b8cVar = new b8c(41);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        b8cVar.p = str;
        return b8cVar;
    }

    public static b8c B(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c C(CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c D(int i) {
        b8c b8cVar = new b8c(28);
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c E(int i, int i2) {
        b8c b8cVar = new b8c(28);
        b8cVar.d = i;
        b8cVar.A = i2;
        return b8cVar;
    }

    public static b8c F(int i, String str) {
        b8c b8cVar = new b8c(39);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.A = 1;
        return b8cVar;
    }

    public static a8c G(int i) {
        LongSparseArray longSparseArray = L;
        if (longSparseArray == null) {
            return null;
        }
        return (a8c) longSparseArray.get(i);
    }

    public static b8c K(Class cls) {
        if (M == null) {
            M = new HashMap();
        }
        if (L == null) {
            L = new LongSparseArray();
        }
        a8c a8cVar = (a8c) M.get(cls);
        if (a8cVar != null) {
            return new b8c(a8cVar.a);
        }
        grb.h(cls, "UItemFactory was not setuped: ");
        return null;
    }

    public static b8c b(String str) {
        b8c b8cVar = new b8c(1);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c c(int i, int i2, String str) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.k = i2;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c d(int i, int i2, String str, String str2) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.k = i2;
        b8cVar.m = str;
        b8cVar.o = str2;
        return b8cVar;
    }

    public static b8c e(int i, String str) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c f(String str, CharSequence charSequence, int i) {
        b8c b8cVar = new b8c(3);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.o = charSequence;
        return b8cVar;
    }

    public static b8c g(CharSequence charSequence) {
        b8c b8cVar = new b8c(7);
        b8cVar.m = charSequence;
        b8cVar.r = true;
        return b8cVar;
    }

    public static b8c h(int i, int i2, i1b i1bVar) {
        b8c b8cVar = new b8c(i + 18);
        b8cVar.A = i2;
        b8cVar.H = i1bVar;
        return b8cVar;
    }

    public static b8c i(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(4);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c j(int i, View view) {
        b8c b8cVar = new b8c(-1);
        b8cVar.d = i;
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c k(View view) {
        b8c b8cVar = new b8c(-1);
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c l(int i, View view) {
        b8c b8cVar = new b8c(-4);
        b8cVar.d = i;
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c m(View view) {
        b8c b8cVar = new b8c(-4);
        b8cVar.c = view;
        b8cVar.A = -1;
        return b8cVar;
    }

    public static b8c n(View view, int i) {
        b8c b8cVar = new b8c(-4);
        b8cVar.c = view;
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c o(int i, String str, String str2) {
        b8c b8cVar = new b8c(40);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.p = str2;
        return b8cVar;
    }

    public static b8c p(int i) {
        b8c b8cVar = new b8c(34);
        b8cVar.A = i;
        return b8cVar;
    }

    public static b8c q(int i, int i2) {
        b8c b8cVar = new b8c(34);
        b8cVar.d = i;
        b8cVar.A = i2;
        return b8cVar;
    }

    public static b8c r(String str) {
        b8c b8cVar = new b8c(31);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c s(String str, String str2, View.OnClickListener onClickListener) {
        b8c b8cVar = new b8c(31);
        b8cVar.m = str;
        b8cVar.n = str2;
        b8cVar.E = onClickListener;
        return b8cVar;
    }

    public static b8c t(int i, String str) {
        b8c b8cVar = new b8c(0);
        b8cVar.d = i;
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c u(String str) {
        b8c b8cVar = new b8c(0);
        b8cVar.m = str;
        return b8cVar;
    }

    public static b8c v(fj1 fj1Var) {
        b8c b8cVar = new b8c(24);
        b8cVar.H = fj1Var;
        return b8cVar;
    }

    public static b8c w(TLObject tLObject) {
        b8c b8cVar = new b8c(32);
        b8cVar.H = tLObject;
        return b8cVar;
    }

    public static b8c x(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(10);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public static b8c y(int i, String str, String str2) {
        b8c b8cVar = new b8c(44);
        b8cVar.d = i;
        b8cVar.m = str;
        b8cVar.o = str2;
        return b8cVar;
    }

    public static b8c z(int i, CharSequence charSequence) {
        b8c b8cVar = new b8c(35);
        b8cVar.d = i;
        b8cVar.m = charSequence;
        return b8cVar;
    }

    public final boolean H(Class cls) {
        HashMap hashMap;
        a8c a8cVar;
        return this.a >= 10000 && (hashMap = M) != null && (a8cVar = (a8c) hashMap.get(cls)) != null && a8cVar.a == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r4.m == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(b8c b8cVar) {
        int i = this.a;
        if (i != b8cVar.a || this.d != b8cVar.d || this.g != b8cVar.g) {
            return false;
        }
        if (i != 0 && i != 1) {
            if (i != 3) {
                if (i != 7) {
                    if (i != 26) {
                        if (i != 34 || this.A != b8cVar.A) {
                            return false;
                        }
                    }
                } else if (this.m == null) {
                }
            } else if (this.H != b8cVar.H || !TextUtils.equals(this.m, b8cVar.m) || !TextUtils.equals(this.o, b8cVar.o) || this.k != b8cVar.k || this.r != b8cVar.r || this.s != b8cVar.s) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.m, b8cVar.m);
    }

    public final boolean J(b8c b8cVar) {
        return this.d == b8cVar.d && this.i == b8cVar.i && this.y == b8cVar.y && this.k == b8cVar.k && this.j == b8cVar.j && this.t == b8cVar.t && this.s == b8cVar.s && this.u == b8cVar.u && this.r == b8cVar.r && this.c == b8cVar.c && TextUtils.equals(this.m, b8cVar.m) && TextUtils.equals(this.n, b8cVar.n) && TextUtils.equals(this.o, b8cVar.o) && this.c == b8cVar.c && this.A == b8cVar.A && Math.abs(this.B - b8cVar.B) < 0.01f && this.C == b8cVar.C && this.l == b8cVar.l && Objects.equals(this.H, b8cVar.H) && Objects.equals(this.I, b8cVar.I);
    }

    public final void L(boolean z) {
        this.e = z;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // ka
    public final boolean a(ka kaVar) {
        a8c G;
        if (this == kaVar) {
            return true;
        }
        if (b8c.class != kaVar.getClass()) {
            return false;
        }
        b8c b8cVar = (b8c) kaVar;
        int i = this.a;
        if (i == b8cVar.a) {
            return i == 31 ? TextUtils.equals(this.m, b8cVar.m) && TextUtils.equals(this.n, b8cVar.n) : i == 28 ? this.A == b8cVar.A : (i == 35 || i == 37) ? this.d == b8cVar.d && TextUtils.equals(this.m, b8cVar.m) && this.e == b8cVar.e : (i < 10000 || (G = G(i)) == null) ? I(b8cVar) : G.c(this, b8cVar);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        a8c G;
        if (this == obj) {
            return true;
        }
        if (obj == null || b8c.class != obj.getClass()) {
            return false;
        }
        b8c b8cVar = (b8c) obj;
        int i = this.a;
        if (i == b8cVar.a) {
            return (i == 36 || i == 35) ? this.d == b8cVar.d : i == 28 ? this.d == b8cVar.d : i == 31 ? TextUtils.equals(this.m, b8cVar.m) : (i < 10000 || (G = G(i)) == null) ? J(b8cVar) : G.e(this, b8cVar);
        }
        return false;
    }
}
