package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.aa1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i51 extends bg.b {
    public static int J = 10000;
    public static LongSparseArray K;
    public static HashMap L;
    public float A;
    public long B;
    public Utilities.Callback C;
    public View.OnClickListener D;
    public View.OnClickListener E;
    public org.telegram.ui.y3 F;
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

    public i51(int i10) {
        super(i10, false);
        this.g = true;
        this.u = -1;
        this.I = true;
    }

    public static i51 A(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.d = i10;
        i51Var.l = charSequence;
        return i51Var;
    }

    public static i51 B(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.l = charSequence;
        return i51Var;
    }

    public static i51 C(int i10) {
        i51 i51Var = new i51(28);
        i51Var.z = i10;
        return i51Var;
    }

    public static i51 D(int i10, int i11) {
        i51 i51Var = new i51(28);
        i51Var.d = i10;
        i51Var.z = i11;
        return i51Var;
    }

    public static i51 E(int i10, String str) {
        i51 i51Var = new i51(39);
        i51Var.d = i10;
        i51Var.l = str;
        i51Var.z = 1;
        return i51Var;
    }

    public static h51 F(int i10) {
        LongSparseArray longSparseArray = K;
        if (longSparseArray == null) {
            return null;
        }
        return (h51) longSparseArray.get(i10);
    }

    public static i51 J(Class cls) {
        if (L == null) {
            L = new HashMap();
        }
        if (K == null) {
            K = new LongSparseArray();
        }
        h51 h51Var = (h51) L.get(cls);
        if (h51Var != null) {
            return new i51(h51Var.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    public static i51 b(String str) {
        i51 i51Var = new i51(1);
        i51Var.l = str;
        return i51Var;
    }

    public static i51 c(int i10, int i11, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.k = i11;
        i51Var.l = str;
        return i51Var;
    }

    public static i51 d(int i10, int i11, String str, String str2) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.k = i11;
        i51Var.l = str;
        i51Var.n = str2;
        return i51Var;
    }

    public static i51 e(int i10, String str) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.l = str;
        return i51Var;
    }

    public static i51 f(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(3);
        i51Var.d = i10;
        i51Var.l = str;
        i51Var.n = charSequence;
        return i51Var;
    }

    public static i51 g(CharSequence charSequence) {
        i51 i51Var = new i51(7);
        i51Var.l = charSequence;
        i51Var.q = true;
        return i51Var;
    }

    public static i51 h(int i10, int i11, aa1 aa1Var) {
        i51 i51Var = new i51(i10 + 18);
        i51Var.z = i11;
        i51Var.G = aa1Var;
        return i51Var;
    }

    public static i51 i(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(4);
        i51Var.d = i10;
        i51Var.l = charSequence;
        return i51Var;
    }

    public static i51 j(int i10, View view) {
        i51 i51Var = new i51(-1);
        i51Var.d = i10;
        i51Var.c = view;
        i51Var.z = -1;
        return i51Var;
    }

    public static i51 k(View view) {
        i51 i51Var = new i51(-1);
        i51Var.c = view;
        i51Var.z = -1;
        return i51Var;
    }

    public static i51 l(View view) {
        i51 i51Var = new i51(-4);
        i51Var.c = view;
        i51Var.z = -1;
        return i51Var;
    }

    public static i51 m(int i10, String str, String str2) {
        i51 i51Var = new i51(40);
        i51Var.d = i10;
        i51Var.l = str;
        i51Var.o = str2;
        return i51Var;
    }

    public static i51 n(int i10) {
        i51 i51Var = new i51(34);
        i51Var.z = i10;
        return i51Var;
    }

    public static i51 o(int i10, int i11) {
        i51 i51Var = new i51(34);
        i51Var.d = i10;
        i51Var.z = i11;
        return i51Var;
    }

    public static i51 p(View view, int i10, boolean z4) {
        i51 i51Var = new i51(-3);
        i51Var.c = view;
        i51Var.z = i10;
        i51Var.y = z4 ? 1 : 0;
        return i51Var;
    }

    public static i51 q(String str) {
        i51 i51Var = new i51(31);
        i51Var.l = str;
        return i51Var;
    }

    public static i51 r(String str, String str2, View.OnClickListener onClickListener) {
        i51 i51Var = new i51(31);
        i51Var.l = str;
        i51Var.m = str2;
        i51Var.D = onClickListener;
        return i51Var;
    }

    public static i51 s(int i10, String str) {
        i51 i51Var = new i51(0);
        i51Var.d = i10;
        i51Var.l = str;
        return i51Var;
    }

    public static i51 t(String str) {
        i51 i51Var = new i51(0);
        i51Var.l = str;
        return i51Var;
    }

    public static i51 u(org.telegram.ui.je jeVar) {
        i51 i51Var = new i51(24);
        i51Var.G = jeVar;
        return i51Var;
    }

    public static i51 v(TLObject tLObject) {
        i51 i51Var = new i51(32);
        i51Var.G = tLObject;
        return i51Var;
    }

    public static i51 w(int i10, String str) {
        i51 i51Var = new i51(10);
        i51Var.d = i10;
        i51Var.l = str;
        return i51Var;
    }

    public static i51 x(int i10, String str, String str2) {
        i51 i51Var = new i51(44);
        i51Var.d = i10;
        i51Var.l = str;
        i51Var.n = str2;
        return i51Var;
    }

    public static i51 y(int i10, CharSequence charSequence) {
        i51 i51Var = new i51(35);
        i51Var.d = i10;
        i51Var.l = charSequence;
        return i51Var;
    }

    public static i51 z(String str, CharSequence charSequence, int i10) {
        i51 i51Var = new i51(41);
        i51Var.d = i10;
        i51Var.l = charSequence;
        i51Var.o = str;
        return i51Var;
    }

    public final boolean G(Class cls) {
        HashMap hashMap;
        h51 h51Var;
        return this.a >= 10000 && (hashMap = L) != null && (h51Var = (h51) hashMap.get(cls)) != null && h51Var.viewType == this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r4.l == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(i51 i51Var) {
        int i10 = this.a;
        if (i10 != i51Var.a || this.d != i51Var.d || this.g != i51Var.g) {
            return false;
        }
        if (i10 != 0 && i10 != 1) {
            if (i10 != 3) {
                if (i10 != 7) {
                    if (i10 != 26) {
                        if (i10 != 34 || this.z != i51Var.z) {
                            return false;
                        }
                    }
                } else if (this.l == null) {
                }
            } else if (this.G != i51Var.G || !TextUtils.equals(this.l, i51Var.l) || !TextUtils.equals(this.n, i51Var.n) || this.k != i51Var.k || this.q != i51Var.q || this.r != i51Var.r) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(this.l, i51Var.l);
    }

    public final boolean I(i51 i51Var) {
        return this.d == i51Var.d && this.i == i51Var.i && this.x == i51Var.x && this.k == i51Var.k && this.j == i51Var.j && this.s == i51Var.s && this.r == i51Var.r && this.t == i51Var.t && this.q == i51Var.q && this.c == i51Var.c && TextUtils.equals(this.l, i51Var.l) && TextUtils.equals(this.m, i51Var.m) && TextUtils.equals(this.n, i51Var.n) && this.c == i51Var.c && this.z == i51Var.z && Math.abs(this.A - i51Var.A) < 0.01f && this.B == i51Var.B && Objects.equals(this.G, i51Var.G) && Objects.equals(this.H, i51Var.H);
    }

    public final void K(boolean z4) {
        this.e = z4;
        if (this.a == 11) {
            this.a = 12;
        }
    }

    @Override // bg.b
    public final boolean a(bg.b bVar) {
        h51 F;
        if (this == bVar) {
            return true;
        }
        if (i51.class != bVar.getClass()) {
            return false;
        }
        i51 i51Var = (i51) bVar;
        int i10 = this.a;
        if (i10 != i51Var.a) {
            return false;
        }
        return i10 == 31 ? TextUtils.equals(this.l, i51Var.l) && TextUtils.equals(this.m, i51Var.m) : i10 == 28 ? this.z == i51Var.z : (i10 == 35 || i10 == 37) ? this.d == i51Var.d && TextUtils.equals(this.l, i51Var.l) && this.e == i51Var.e : (i10 < 10000 || (F = F(i10)) == null) ? H(i51Var) : F.contentsEquals(this, i51Var);
    }

    public final boolean equals(Object obj) {
        h51 F;
        if (this == obj) {
            return true;
        }
        if (obj == null || i51.class != obj.getClass()) {
            return false;
        }
        i51 i51Var = (i51) obj;
        int i10 = this.a;
        if (i10 != i51Var.a) {
            return false;
        }
        return (i10 == 36 || i10 == 35) ? this.d == i51Var.d : i10 == 28 ? this.d == i51Var.d : i10 == 31 ? TextUtils.equals(this.l, i51Var.l) : (i10 < 10000 || (F = F(i10)) == null) ? I(i51Var) : F.equals(this, i51Var);
    }
}
