package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class w51 extends og.a {
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

    public w51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static w51 A(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.d = i10;
        w51Var.l = charSequence;
        return w51Var;
    }

    public static w51 B(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.l = charSequence;
        return w51Var;
    }

    public static w51 C(int i10) {
        w51 w51Var = new w51(28);
        w51Var.z = i10;
        return w51Var;
    }

    public static w51 D(int i10, int i11) {
        w51 w51Var = new w51(28);
        w51Var.d = i10;
        w51Var.z = i11;
        return w51Var;
    }

    public static w51 E(int i10, String str) {
        w51 w51Var = new w51(39);
        w51Var.d = i10;
        w51Var.l = str;
        w51Var.z = 1;
        return w51Var;
    }

    public static v51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (v51) longSparseArray.get(i10);
    }

    public static w51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        v51 v51Var = (v51) L.get(cls);
        if (v51Var != null) {
            return new w51(v51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static w51 b(String str) {
        w51 w51Var = new w51(1);
        w51Var.l = str;
        return w51Var;
    }

    public static w51 c(int i10, int i11, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.k = i11;
        w51Var.l = str;
        return w51Var;
    }

    public static w51 d(int i10, int i11, String str, String str2) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.k = i11;
        w51Var.l = str;
        w51Var.n = str2;
        return w51Var;
    }

    public static w51 e(int i10, String str) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.l = str;
        return w51Var;
    }

    public static w51 f(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(3);
        w51Var.d = i10;
        w51Var.l = str;
        w51Var.n = charSequence;
        return w51Var;
    }

    public static w51 g(CharSequence charSequence) {
        w51 w51Var = new w51(7);
        w51Var.l = charSequence;
        w51Var.q = true;
        return w51Var;
    }

    public static w51 h(int i10, int i11, na1 na1Var) {
        w51 w51Var = new w51(i10 + 18);
        w51Var.z = i11;
        w51Var.G = na1Var;
        return w51Var;
    }

    public static w51 i(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(4);
        w51Var.d = i10;
        w51Var.l = charSequence;
        return w51Var;
    }

    public static w51 j(int i10, View view) {
        w51 w51Var = new w51(-1);
        w51Var.d = i10;
        w51Var.c = view;
        w51Var.z = -1;
        return w51Var;
    }

    public static w51 k(View view) {
        w51 w51Var = new w51(-1);
        w51Var.c = view;
        w51Var.z = -1;
        return w51Var;
    }

    public static w51 l(View view) {
        w51 w51Var = new w51(-4);
        w51Var.c = view;
        w51Var.z = -1;
        return w51Var;
    }

    public static w51 m(int i10, String str, String str2) {
        w51 w51Var = new w51(40);
        w51Var.d = i10;
        w51Var.l = str;
        w51Var.o = str2;
        return w51Var;
    }

    public static w51 n(int i10) {
        w51 w51Var = new w51(34);
        w51Var.z = i10;
        return w51Var;
    }

    public static w51 o(int i10, int i11) {
        w51 w51Var = new w51(34);
        w51Var.d = i10;
        w51Var.z = i11;
        return w51Var;
    }

    public static w51 p(View view, int i10, boolean z10) {
        w51 w51Var = new w51(-3);
        w51Var.c = view;
        w51Var.z = i10;
        w51Var.y = z10 ? 1 : 0;
        return w51Var;
    }

    public static w51 q(String str) {
        w51 w51Var = new w51(31);
        w51Var.l = str;
        return w51Var;
    }

    public static w51 r(String str, String str2, View.OnClickListener onClickListener) {
        w51 w51Var = new w51(31);
        w51Var.l = str;
        w51Var.m = str2;
        w51Var.D = onClickListener;
        return w51Var;
    }

    public static w51 s(int i10, String str) {
        w51 w51Var = new w51(0);
        w51Var.d = i10;
        w51Var.l = str;
        return w51Var;
    }

    public static w51 t(String str) {
        w51 w51Var = new w51(0);
        w51Var.l = str;
        return w51Var;
    }

    public static w51 u(org.telegram.ui.he heVar) {
        w51 w51Var = new w51(24);
        w51Var.G = heVar;
        return w51Var;
    }

    public static w51 v(TLObject tLObject) {
        w51 w51Var = new w51(32);
        w51Var.G = tLObject;
        return w51Var;
    }

    public static w51 w(int i10, String str) {
        w51 w51Var = new w51(10);
        w51Var.d = i10;
        w51Var.l = str;
        return w51Var;
    }

    public static w51 x(int i10, String str, String str2) {
        w51 w51Var = new w51(44);
        w51Var.d = i10;
        w51Var.l = str;
        w51Var.n = str2;
        return w51Var;
    }

    public static w51 y(int i10, CharSequence charSequence) {
        w51 w51Var = new w51(35);
        w51Var.d = i10;
        w51Var.l = charSequence;
        return w51Var;
    }

    public static w51 z(String str, CharSequence charSequence, int i10) {
        w51 w51Var = new w51(41);
        w51Var.d = i10;
        w51Var.l = charSequence;
        w51Var.o = str;
        return w51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        v51 v51Var;
        return this.a >= 10000 && (hashMap = L) != null && (v51Var = (v51) hashMap.get(cls)) != null && v51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(w51 w51Var) {
        int i10 = this.a;
        if (i10 != w51Var.a || this.d != w51Var.d || this.g != w51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != w51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != w51Var.G || !TextUtils.equals(this.l, w51Var.l) || !TextUtils.equals(this.n, w51Var.n) || this.k != w51Var.k || this.q != w51Var.q || this.r != w51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, w51Var.l);
    }

    public final boolean I(w51 w51Var) {
        return this.d == w51Var.d && this.i == w51Var.i && this.x == w51Var.x && this.k == w51Var.k && this.j == w51Var.j && this.s == w51Var.s && this.r == w51Var.r && this.t == w51Var.t && this.q == w51Var.q && this.c == w51Var.c && TextUtils.equals(this.l, w51Var.l) && TextUtils.equals(this.m, w51Var.m) && TextUtils.equals(this.n, w51Var.n) && this.c == w51Var.c && this.z == w51Var.z && Math.abs(this.A - w51Var.A) < 0.01f && this.B == w51Var.B && Objects.equals(this.G, w51Var.G) && Objects.equals(this.H, w51Var.H);
    }

    public final void K(boolean z10) {
        this.e = z10;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        v51 F;
        if (this == aVar) {
            return true;
        }
        if (w51.class != aVar.getClass()) {
            return false;
        }
        w51 w51Var = (w51) aVar;
        int i10 = this.a;
        if (i10 != w51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, w51Var.l) && TextUtils.equals(this.m, w51Var.m) : i10 == 28 ? this.z == w51Var.z : (i10 == 35 || i10 == 37) ? this.d == w51Var.d && TextUtils.equals(this.l, w51Var.l) && this.e == w51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(w51Var) : F.contentsEquals(this, w51Var);
    }

    public final boolean equals(Object obj) {
        v51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || w51.class != obj.getClass()) {
            return false;
        }
        w51 w51Var = (w51) obj;
        int i10 = this.a;
        if (i10 != w51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == w51Var.d : i10 == 28 ? this.d == w51Var.d : i10 == 31 ? TextUtils.equals(this.l, w51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(w51Var) : F.equals(this, w51Var);
    }
}
