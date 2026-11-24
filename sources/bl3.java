// default package

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class bl3 extends n39 {
    public boolean A0;
    public qe4 B0;
    public int C0;
    public boolean D0;
    public String E;
    public int E0;
    public pkb F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public ji3 V;
    public final byte W;
    public boolean X;
    public boolean Y;
    public String a0;
    public byte b0;
    public String c0;
    public boolean d;
    public int d0;
    public final Activity e;
    public int e0;
    public mk3 f;
    public int f0;
    public int g0;
    public mk3 h;
    public int h0;
    public final int i0;
    public final gb3 j0;
    public final uk3 k0;
    public rkb l0;
    public final long m0;
    public long o0;
    public View p0;
    public wc3 q0;
    public va7 r;
    public ArrayList r0;
    public final cj3 s0;
    public final int t0;
    public ArrayList u0;
    public final ArrayList v0;
    public int w;
    public final ArrayList w0;
    public int x;
    public String x0;
    public vf6 y0;
    public final ArrayList z0;
    public yk3 c = yk3.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashSet M = new HashSet();
    public int P = 0;
    public int R = 0;
    public int Z = -1;
    public boolean n0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    public bl3(Activity activity, cj3 cj3Var, int i, int i2, gb3 gb3Var, boolean z) {
        int i3 = y6c.t0;
        this.t0 = i3;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = null;
        this.y0 = new vf6();
        this.z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.j0 = gb3Var;
        this.s0 = cj3Var;
        mt9 mt9Var = (mt9) this;
        uk3 uk3Var = new uk3(mt9Var);
        this.k0 = uk3Var;
        uk3Var.a = new i4d(mt9Var);
        uk3Var.p = z;
        this.e = activity;
        this.W = i;
        this.i0 = i2;
        this.m0 = y6c.h(i3).e();
        if (i2 != 15) {
            ad7.Y(i3).a.c(new bt(i3, i2, (Object) new rk3(this), (byte) 6));
        }
        hq6.d0(i3).O0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i = 0; i < split.length; i++) {
                String str3 = split[i];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 1 || i == 4 || i == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb;
        boolean z = this.O;
        ArrayList arrayList = this.v0;
        ArrayList arrayList2 = this.w0;
        if (z) {
            sb = null;
            while (arrayList2.size() > 0) {
                al3 al3Var = (al3) arrayList2.remove(0);
                this.u0.remove(al3Var);
                arrayList.remove(al3Var);
                this.y0.l(al3Var.c);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(al3Var.c);
                } else {
                    sb.append(", ");
                    sb.append(al3Var.c);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.u0.clear();
            this.y0.b();
            sb = new StringBuilder("1");
        }
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        boolean z2 = this.O;
        int i = this.t0;
        if (z2) {
            ad7.Y(i).a.c(new wc3((mt9) this, sb, (byte) 12));
        } else {
            ad7.Y(i).a.c(new xv0(i, (byte) 4));
        }
    }

    public final boolean F(Object obj) {
        if (this.i0 != 14) {
            return true;
        }
        boolean z = obj instanceof TLRPC.User;
        cj3 cj3Var = this.s0;
        if (z) {
            return ((TLRPC.User) obj).bot ? cj3Var.C2 : cj3Var.B2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return hc2.T(chat) ? cj3Var.A2 : hc2.n0(chat) ? cj3Var.x2 || cj3Var.y2 : cj3Var.x2 || cj3Var.z2;
    }

    public final void G(String str) {
        ji3 ji3Var;
        String str2;
        String str3;
        this.x0 = str;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.v0;
            arrayList2.clear();
            int size = this.u0.size();
            for (int i = 0; i < size; i++) {
                ji3 ji3Var2 = this.V;
                if ((ji3Var2 == null || ji3Var2.a() != ((al3) this.u0.get(i)).c) && F(((al3) this.u0.get(i)).a)) {
                    arrayList2.add((al3) this.u0.get(i));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.u0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            al3 al3Var = (al3) this.u0.get(i2);
            if (al3Var != null && al3Var.a != null && (((ji3Var = this.V) == null || ji3Var.a() != al3Var.c) && F(((al3) this.u0.get(i2)).a))) {
                TLObject tLObject = al3Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? mm4.j(this.t0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) al3Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = l7c.r((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) al3Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(al3Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(yk3 yk3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(yk3Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new cm2(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    public final Object I(int i) {
        int i2;
        int i3;
        TLRPC.Chat K0;
        int i4;
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (i > 0 && i - 1 < arrayList.size()) {
                return arrayList.get(i4);
            }
            i = ir2.k(1, i, arrayList);
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            if (i > 0) {
                return arrayList2.get(i - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.O ? this.w0 : this.v0;
            if (i > L && (i3 = (i - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((al3) arrayList3.get(i3)).a;
                boolean z = tLObject instanceof TLRPC.User;
                int i5 = this.t0;
                if (!z) {
                    return (!(tLObject instanceof TLRPC.Chat) || (K0 = na7.q1(i5).K0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : K0;
                }
                TLRPC.User V1 = na7.q1(i5).V1(Long.valueOf(((TLRPC.User) tLObject).id));
                return V1 != null ? V1 : tLObject;
            }
            i -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i > 0 && i <= arrayList4.size()) {
                return arrayList4.get(i - 1);
            }
            i = ir2.k(1, i, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i > 0 && i <= arrayList5.size()) {
                return arrayList5.get(i - 1);
            }
            i = ir2.k(1, i, arrayList5);
        }
        uk3 uk3Var = this.k0;
        ArrayList arrayList6 = uk3Var.e;
        ArrayList arrayList7 = uk3Var.d;
        ArrayList arrayList8 = uk3Var.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i == 0) {
                return null;
            }
            i--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.I0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i6 = (size4 <= 3 || !this.H0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i7 = 0;
        ArrayList arrayList9 = this.L;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i6 + 1;
        if (i >= 0 && i < size) {
            return this.s.get(i);
        }
        int i8 = i - size;
        if (i8 >= 0 && i8 < size2) {
            return arrayList7.get(i8);
        }
        int i9 = i8 - size2;
        if (i9 >= 0 && i9 < size3) {
            return arrayList8.get(i9);
        }
        int i10 = i9 - size3;
        if (i10 <= 0 || i10 >= size5) {
            i2 = i10 - size5;
        } else {
            int i11 = i10 - 1;
            if (i11 >= 0 && i11 < arrayList9.size()) {
                return arrayList9.get(i11);
            }
            i2 = i11 - arrayList9.size();
            if (i2 >= 0 && i2 < arrayList6.size()) {
                return arrayList6.get(i2);
            }
        }
        ArrayList arrayList10 = this.I;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i2 > 0 && i2 <= arrayList10.size()) {
            return arrayList10.get(i2 - 1);
        }
        if (!this.Y && !arrayList10.isEmpty()) {
            i7 = 1;
        }
        int i12 = i2 - (size6 + i7);
        ArrayList arrayList11 = this.J;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i12 <= 0 || i12 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i12 - 1);
    }

    public final int J() {
        ArrayList arrayList = this.O ? this.w0 : this.v0;
        return (L() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int K() {
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.O) {
                return size;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.k0.d.size();
        int i = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i : i + 1 : i;
    }

    public final boolean L() {
        if (this.O || hq6.d0(this.t0).j1.isEmpty()) {
            return false;
        }
        return this.i0 != 14 || this.s0.B2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i) {
        int i2;
        int i3;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i = ir2.k(1, i, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.O ? this.w0 : this.v0;
                if (i <= L || (i - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i -= J();
                }
            }
            uk3 uk3Var = this.k0;
            ArrayList arrayList3 = uk3Var.e;
            ArrayList arrayList4 = uk3Var.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = uk3Var.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i4 = (size4 <= 3 || !this.H0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.L;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i4 + 1;
            int size6 = this.F.size();
            if (size6 > 0) {
                if (i < 0 || i >= size6) {
                    i -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList.isEmpty())) {
                if (i != 0) {
                    i--;
                }
            }
            if ((i < 0 || i >= size) && (((i2 = i - size) < 0 || i2 >= size2) && ((i3 = i2 - size2) <= 0 || i3 >= size3))) {
                int i5 = i3 - size3;
                if (i5 > 0 && i5 < size5) {
                    return true;
                }
                int i6 = i5 - size5;
                ArrayList arrayList6 = this.I;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i6 <= 0 || i6 >= size7) {
                    ArrayList arrayList7 = this.J;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != yk3.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean O() {
        return this.W != 2 && M();
    }

    public final void P() {
        if ((this.R == 0 || this.P == 0) && this.h0 == this.e0) {
            ji3 ji3Var = this.V;
            if (ji3Var == null || ji3Var.a() == 0 || this.Y) {
                V(this.h0, this.a0);
            } else {
                U(this.h0, this.a0);
            }
        }
    }

    public final void Q(long j, TLObject tLObject) {
        al3 al3Var = (al3) this.y0.f(j);
        if (al3Var == null) {
            al3Var = new al3();
            this.y0.k(al3Var, j);
        } else {
            this.u0.remove(al3Var);
        }
        this.u0.add(0, al3Var);
        al3Var.c = j;
        al3Var.a = tLObject;
        al3Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        int i = this.t0;
        ad7.Y(i).a.c(new am0(i, j, (byte) 2));
    }

    public final boolean R() {
        int i = this.i0;
        return (i == 2 || i == 4 || i == 5 || i == 6 || i == 1 || i == 11 || i == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty() || (K = K()) >= b()) {
            return;
        }
        int size = arrayList.size();
        arrayList.clear();
        q(K + 1, size);
        int size2 = this.k0.e.size();
        if (this.H0) {
            size2 = Math.min(3, size2);
        }
        if (size2 <= 0) {
            r(K);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, String str) {
        String str2;
        if (str != null && str.equals(this.N) && (i == this.D0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.N = str;
        this.D0 = i;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        mk3 mk3Var = this.h;
        if (mk3Var != null) {
            gl.r(mk3Var);
            this.h = null;
        }
        va7 va7Var = this.r;
        if (va7Var != null) {
            gl.r(va7Var);
            this.r = null;
        }
        byte b = 1;
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.t0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.S, trim)) {
            this.S = trim;
            this.L.clear();
            if (this.T != 0) {
                ConnectionsManager.getInstance(this.t0).cancelRequest(this.T, true);
                this.T = 0;
            }
            if (trim == null || trim.length() < 4 || (y6c.h(this.t0).p() && na7.q1(this.t0).D2())) {
                this.S = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.S = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.T = ConnectionsManager.getInstance(this.t0).sendRequest(tL_contacts_getSponsoredPeers, new tf((mt9) this, (byte) 19));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.x0 = null;
            this.k0.s = false;
            this.s.clear();
            this.H.clear();
            this.K.clear();
            this.w = 0;
            this.x = 0;
            this.E = null;
            this.y.clear();
            this.k0.f(null, null);
            int i2 = this.i0;
            if (i2 != 15) {
                uk3 uk3Var = this.k0;
                boolean z = i2 != 11;
                boolean z2 = z;
                boolean z3 = i2 == 2 || i2 == 11;
                boolean z4 = i2 == 0;
                ji3 ji3Var = this.V;
                uk3Var.h(null, true, true, z, z2, z3, 0L, z4, 0, 0, ji3Var != null ? ji3Var.a() : 0L, null);
            }
            this.O = false;
            this.e0 = 0;
            this.E0 = 0;
            this.H0 = true;
            this.I0 = true;
            ji3 ji3Var2 = this.V;
            if (ji3Var2 != null) {
                ji3Var2.d(false, true);
            }
            if (this.i0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.z0.clear();
            this.A0 = false;
            qe4 qe4Var = this.B0;
            if (qe4Var != null) {
                ((ag3) qe4Var).h(false, null, this.z0, false);
                return;
            }
            return;
        }
        this.k0.f(this.s, this.w0);
        this.w = 0;
        this.x = 0;
        this.E = null;
        this.y.clear();
        if (this.W != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.X = true;
            uk3 uk3Var2 = this.k0;
            if (uk3Var2.s) {
                this.J.clear();
                this.K.clear();
                ArrayList arrayList = this.k0.q;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.K.add(((xr9) arrayList.get(i3)).a);
                }
                this.H0 = true;
                this.I0 = true;
                this.E0 = 0;
                f();
                ji3 ji3Var3 = this.V;
                if (ji3Var3 != null) {
                    ji3Var3.d(false, false);
                }
            } else {
                ad7.Y(uk3Var2.m).a.c(new wr9(uk3Var2, b));
            }
        } else {
            this.K.clear();
        }
        int i4 = this.e0 + 1;
        this.e0 = i4;
        this.E0 = 3;
        this.H0 = true;
        this.I0 = true;
        f();
        ji3 ji3Var4 = this.V;
        if (ji3Var4 != null) {
            ji3Var4.d(true, false);
        }
        if (trim != null) {
            String trim2 = trim.trim();
            if (trim2.length() > 1 && (trim2.charAt(0) == '#' || trim2.charAt(0) == '$')) {
                int indexOf = trim2.indexOf(64);
                String substring = trim2.substring(1);
                if (indexOf >= 0) {
                    trim2.substring(indexOf + 1);
                }
                str2 = substring;
                co3 co3Var = Utilities.g;
                mt9 mt9Var = (mt9) this;
                mk3 mk3Var2 = new mk3(mt9Var, trim, i4, str, (byte) 0);
                this.f = mk3Var2;
                co3Var.d(mk3Var2, 300L);
                if (str2 == null) {
                    this.E0++;
                    va7 va7Var2 = new va7((Object) mt9Var, i4, (Object) str2, (byte) 20);
                    this.r = va7Var2;
                    gl.d3(va7Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        co3 co3Var2 = Utilities.g;
        mt9 mt9Var2 = (mt9) this;
        mk3 mk3Var22 = new mk3(mt9Var2, trim, i4, str, (byte) 0);
        this.f = mk3Var22;
        co3Var2.d(mk3Var22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i, String str) {
        ji3 ji3Var = this.V;
        if (ji3Var == null || ji3Var.a() == 0 || this.W == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = this.R;
        int i3 = this.t0;
        if (i2 != 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(this.R, true);
            this.R = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.I;
        if (isEmpty) {
            this.x0 = null;
            this.J.clear();
            arrayList.clear();
            this.U = 0;
            this.a0 = null;
            this.O = false;
            f();
            return;
        }
        if (this.i0 != 15) {
            long a = this.V.a();
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 20;
            tL_messages_search.q = str;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.peer = na7.q1(i3).h1(a);
            if (str.equals(this.a0) && !arrayList.isEmpty()) {
                tL_messages_search.add_offset = arrayList.size();
            }
            this.a0 = str;
            int i4 = 1 + this.U;
            this.U = i4;
            this.R = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_search, new qk3(this, str, i4, i, tL_messages_search, (byte) 0), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i, String str) {
        if (this.W != 0) {
            if (TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(str)) {
                return;
            }
            int i2 = this.P;
            int i3 = this.t0;
            if (i2 != 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(this.P, true);
                this.P = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.J;
            if (isEmpty || this.V.a() != 0) {
                this.x0 = null;
                arrayList.clear();
                this.I.clear();
                this.Q = 0;
                this.a0 = null;
                this.b0 = (byte) 0;
                this.O = false;
                f();
                return;
            }
            G(str);
            this.k0.f(this.s, this.w0);
            if (this.i0 == 15) {
                int i4 = this.E0 - 1;
                this.E0 = i4;
                ji3 ji3Var = this.V;
                if (ji3Var != null) {
                    ji3Var.d(i4 > 0, true);
                    this.V.c();
                    return;
                }
                return;
            }
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            byte b = this.c.a;
            tL_messages_searchGlobal.broadcasts_only = (b & 2) != 0;
            tL_messages_searchGlobal.groups_only = (b & 4) != 0;
            tL_messages_searchGlobal.users_only = (b & 8) != 0;
            tL_messages_searchGlobal.limit = 20;
            tL_messages_searchGlobal.q = str;
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = this.D0 ? 1 : 0;
            if (!str.equals(this.a0)) {
                this.d = false;
            }
            if (str.equals(this.a0) && this.b0 == this.c.a && !arrayList.isEmpty() && this.h0 == this.e0) {
                k27 k27Var = (k27) b00.f(1, arrayList);
                tL_messages_searchGlobal.offset_id = k27Var.e1();
                tL_messages_searchGlobal.offset_rate = this.d0;
                tL_messages_searchGlobal.offset_peer = na7.q1(i3).h1(k27.B1(k27Var.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.a0 = str;
            this.b0 = this.c.a;
            int i5 = this.Q + 1;
            this.Q = i5;
            this.P = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_searchGlobal, new qk3(this, str, i5, i, tL_messages_searchGlobal, (byte) 1), 2);
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        ji3 ji3Var = this.V;
        if (ji3Var == null || ji3Var.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l = na7.q1(this.t0).g4.l(-this.V.a());
            String trim = str.trim();
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != null && ((TLRPC.TL_forumTopic) l.get(i)).title.toLowerCase().contains(trim)) {
                    arrayList.add((TLRPC.TL_forumTopic) l.get(i));
                    ((TLRPC.TL_forumTopic) l.get(i)).searchQuery = trim;
                }
            }
        }
        f();
    }

    @Override // w39
    public final int b() {
        if (this.E0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.O) {
                return size;
            }
        }
        ArrayList arrayList3 = this.G;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        uk3 uk3Var = this.k0;
        int size3 = uk3Var.d.size();
        int i = size + size2 + size3;
        int size4 = uk3Var.e.size();
        if (size4 > 3 && this.H0) {
            size4 = 3;
        }
        int size5 = this.L.size() + size4;
        int size6 = uk3Var.j.size();
        if (size6 > 3 && this.I0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i++;
        }
        if (size5 != 0) {
            i += size5 + 1;
        }
        if (size6 != 0) {
            i += size6;
        }
        ArrayList arrayList5 = this.I;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i += size7 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i;
        }
        ArrayList arrayList6 = this.J;
        int size8 = arrayList6.size();
        if ((this.c != yk3.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i2 = (arrayList5.isEmpty() || this.Y) ? size8 : 0;
        if (i2 != 0) {
            i += i2 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i;
        }
        this.C0 = i;
        return i;
    }

    @Override // w39
    public final long c(int i) {
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0142, code lost:
    
        if (r14 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0144, code lost:
    
        if (r14 != r6) goto L134;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2;
        if (this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (i != 0) {
                    int i3 = i - 1;
                    if (i3 < arrayList.size()) {
                        return 9;
                    }
                    i = i3 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i < L) {
                    return 6;
                }
                if (i != L) {
                    if (i >= J()) {
                        i -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                if (i != 0) {
                    if (i <= arrayList2.size()) {
                        return 3;
                    }
                    i = ir2.k(1, i, arrayList2);
                }
            }
            ArrayList arrayList3 = this.F;
            if (!arrayList3.isEmpty()) {
                if (i != 0) {
                    if (i <= arrayList3.size()) {
                        return 8;
                    }
                    i = ir2.k(1, i, arrayList3);
                }
            }
            uk3 uk3Var = this.k0;
            ArrayList arrayList4 = uk3Var.e;
            int size = this.s.size();
            int size2 = uk3Var.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i != 0) {
                    i--;
                }
            }
            int size3 = uk3Var.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i4 = (size4 <= 3 || !this.H0) ? size4 : 3;
            ArrayList arrayList5 = this.L;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i4 + 1;
            ArrayList arrayList6 = this.J;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            yk3 yk3Var = this.c;
            yk3 yk3Var2 = yk3.d;
            if ((yk3Var != yk3Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.I;
            if (!arrayList7.isEmpty() && !this.Y) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i < 0 || i >= size) && ((i2 = i - size) < 0 || i2 >= size2)) {
                int i5 = i2 - size2;
                if (i5 < 0 || i5 >= size3) {
                    int i6 = i5 - size3;
                    if (i6 < 0 || i6 >= size5) {
                        int i7 = i6 - size5;
                        if (size7 > 0) {
                            if (i7 >= 0) {
                                if (this.Y) {
                                }
                            }
                            i7 -= size7 + (!this.Y ? 1 : 0);
                        }
                        if (i7 >= 0 && i7 < size6) {
                            if (i7 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == yk3Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i6 != 0) {
                    }
                } else {
                    Object I = I(i5);
                    if (I instanceof String) {
                        if (!"section".equals((String) I)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0342  */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        long j;
        boolean z;
        boolean z2;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        TLRPC.Chat chat;
        String str;
        ?? r7;
        TLRPC.EncryptedChat encryptedChat;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int size;
        int size2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object obj;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        CharSequence charSequence4;
        boolean z6;
        CharSequence charSequence5;
        byte b;
        boolean z7;
        boolean z8;
        CharSequence charSequence6;
        int i3;
        String str2;
        int y1;
        boolean z9;
        TLRPC.Chat chat2;
        String p;
        ArrayList<TLRPC.TL_username> arrayList2;
        int i4;
        int i5;
        String str3;
        String str4;
        final l35 l35Var;
        final byte b2;
        ?? r72;
        Runnable runnable;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        ?? r0;
        char c;
        String str5;
        Object obj2;
        Runnable runnable2;
        String str6;
        int i6 = i;
        int i7 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList3 = this.I;
        ArrayList arrayList4 = this.K;
        ArrayList arrayList5 = this.L;
        ArrayList arrayList6 = this.y;
        int i8 = this.t0;
        ArrayList arrayList7 = this.G;
        uk3 uk3Var = this.k0;
        final byte b3 = 1;
        switch (i7) {
            case 0:
                rr8 rr8Var = (rr8) view;
                zkb.h(bkb.c6, null, rr8Var);
                long dialogId = rr8Var.getDialogId();
                boolean N = N(i6);
                Object I = I(i6);
                boolean z11 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z11) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.M;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z9 = N;
                            if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                N = z9;
                            }
                        } else {
                            z9 = N;
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i8).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                    }
                    j = dialogId;
                    long n = cf3.n(tL_sponsoredPeer2.peer);
                    if (n >= 0) {
                        user = na7.q1(i8).V1(Long.valueOf(n));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user.usernames;
                            p = cf3.p(this.c0, user);
                            arrayList2 = arrayList8;
                            chat2 = null;
                            String str7 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str7;
                            z2 = z9;
                        } else {
                            chat2 = null;
                            arrayList2 = null;
                            p = null;
                            String str72 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str72;
                            z2 = z9;
                        }
                    } else {
                        TLRPC.Chat K0 = na7.q1(i8).K0(Long.valueOf(-n));
                        if (K0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = K0.usernames;
                            p = cf3.p(this.c0, K0);
                            arrayList2 = arrayList9;
                            chat2 = K0;
                            user = null;
                            String str722 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str722;
                            z2 = z9;
                        } else {
                            chat2 = K0;
                            user = null;
                            arrayList2 = null;
                            p = null;
                            String str7222 = p;
                            chat = chat2;
                            arrayList = arrayList2;
                            z = z11;
                            str = str7222;
                            z2 = z9;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = true;
                        i6 = ir2.k(1, i6, arrayList6);
                    }
                    if (O()) {
                        if (i6 < J()) {
                            rr8Var.N = i6 != J() + (-1);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i6 -= J();
                    } else {
                        z4 = false;
                    }
                    if (arrayList7.isEmpty()) {
                        z5 = z;
                    } else {
                        z5 = z;
                        i6 = ir2.k(1, i6, arrayList7);
                    }
                    ArrayList arrayList10 = uk3Var.e;
                    int i9 = i6;
                    ArrayList arrayList11 = uk3Var.j;
                    int size3 = this.s.size();
                    int size4 = uk3Var.d.size();
                    i2 = (size3 + size4 > 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i9 : i9 - 1;
                    size = arrayList11.size();
                    if (size > 3 && this.I0) {
                        size = 3;
                    }
                    int i10 = (size > 0 || !(arrayList11.get(size + (-1)) instanceof String)) ? size : size - 2;
                    size2 = arrayList10.size();
                    int i11 = i10;
                    if (size2 > 3 && this.H0) {
                        size2 = 3;
                    }
                    int size5 = (arrayList10.isEmpty() || !arrayList5.isEmpty()) ? arrayList5.size() + size2 + 1 : 0;
                    if (!z4) {
                        rr8Var.N = (i2 == (b() - J()) + (-1) || i2 == ((size3 + i11) + size4) + (-1) || i2 == (((size3 + size5) + size) + size4) + (-1)) ? false : true;
                    }
                    if (i2 >= 0 || i2 >= this.s.size() || user != null) {
                        charSequence = null;
                    } else {
                        charSequence = (CharSequence) this.H.get(i2);
                        String p2 = l7c.p(user);
                        if (charSequence == null || user == null || p2 == null || !charSequence.toString().startsWith("@".concat(p2))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str8 = z4 ? this.x0 : uk3Var.c;
                                if (!TextUtils.isEmpty(str8)) {
                                    String m = user != null ? qu2.m(0, user.first_name, user.last_name) : r7 != 0 ? r7.monoforum ? mm4.j(i8, r7, false) : r7.title : null;
                                    if (m == null || (y1 = gl.y1(m, str8)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new cm4(bkb.p6, null), y1, str8.length() + y1, 33);
                                        charSequence2 = spannableStringBuilder2;
                                    }
                                    if (arrayList == null || arrayList.size() <= 1) {
                                        obj = I;
                                    } else {
                                        String substring = str8.startsWith("@") ? str8.substring(1) : str8;
                                        int size6 = arrayList.size();
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 < size6) {
                                                TLRPC.TL_username tL_username = arrayList.get(i12);
                                                i12++;
                                                TLRPC.TL_username tL_username2 = tL_username;
                                                obj = I;
                                                if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                    str2 = tL_username2.username;
                                                } else {
                                                    I = obj;
                                                }
                                            } else {
                                                obj = I;
                                                str2 = null;
                                            }
                                        }
                                        if (str2 == null) {
                                            int size7 = arrayList.size();
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < size7) {
                                                    TLRPC.TL_username tL_username3 = arrayList.get(i13);
                                                    i13++;
                                                    TLRPC.TL_username tL_username4 = tL_username3;
                                                    ArrayList<TLRPC.TL_username> arrayList12 = arrayList;
                                                    if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                        str2 = tL_username4.username;
                                                    } else {
                                                        arrayList = arrayList12;
                                                    }
                                                }
                                            }
                                        }
                                        if (str2 != null) {
                                            str = str2;
                                        }
                                    }
                                    if (str != null && (user == null || z2)) {
                                        if (str8.startsWith("@")) {
                                            str8 = str8.substring(1);
                                        }
                                        try {
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                            spannableStringBuilder3.append((CharSequence) "@");
                                            spannableStringBuilder3.append((CharSequence) str);
                                            int y12 = gl.y1(str, str8);
                                            if (y12 != -1) {
                                                int length = str8.length();
                                                if (y12 == 0) {
                                                    length++;
                                                } else {
                                                    y12++;
                                                }
                                                spannableStringBuilder3.setSpan(new cm4(bkb.p6, null), y12, length + y12, 33);
                                            }
                                            charSequence3 = spannableStringBuilder3;
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                            charSequence3 = str;
                                        }
                                    }
                                    rr8Var.y(false, false);
                                    if (user == null && user.id == this.m0 && this.i0 != 16) {
                                        tL_sponsoredPeer = null;
                                        charSequence4 = null;
                                        z6 = true;
                                        charSequence5 = k96.M0(2131745709, null);
                                    } else {
                                        tL_sponsoredPeer = null;
                                        charSequence4 = charSequence3;
                                        z6 = false;
                                        charSequence5 = charSequence2;
                                    }
                                    CharSequence charSequence7 = charSequence5;
                                    if (r7 != 0 || r7.participants_count == 0) {
                                        if (user != null && user.bot && (i3 = user.bot_active_users) != 0) {
                                            String H = k96.H(' ', "BotUsersShort", i3);
                                            if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                                ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H);
                                            } else if (TextUtils.isEmpty(charSequence4)) {
                                                b = 2;
                                                z7 = true;
                                                z8 = false;
                                                charSequence6 = H;
                                            } else {
                                                z8 = false;
                                                z7 = true;
                                                b = 2;
                                                charSequence4 = TextUtils.concat(charSequence4, ", ", H);
                                                charSequence6 = charSequence4;
                                            }
                                        }
                                        b = 2;
                                        z7 = true;
                                        z8 = false;
                                        charSequence6 = charSequence4;
                                    } else {
                                        String H2 = (!hc2.T(r7) || r7.megagroup) ? k96.H(' ', "Members", r7.participants_count) : k96.H(' ', "Subscribers", r7.participants_count);
                                        if (charSequence4 instanceof SpannableStringBuilder) {
                                            ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                        } else {
                                            charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                        }
                                        charSequence6 = charSequence4;
                                        b = 2;
                                        z7 = true;
                                        z8 = false;
                                    }
                                    hj3 hj3Var = new hj3(this, b);
                                    rr8Var.C0 = z4;
                                    rr8Var.D0 = hj3Var;
                                    rr8Var.setOnSponsoredOptionsClick(new w72(this, (byte) 21));
                                    rr8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                                    rr8Var.z(user != null ? user : r7, encryptedChat, charSequence7, charSequence6, true, z6);
                                    rr8Var.y(this.V.a.K2.contains(Long.valueOf(rr8Var.getDialogId())), j == rr8Var.getDialogId() ? z7 : z8);
                                    break;
                                }
                            }
                            charSequence3 = charSequence;
                            obj = I;
                            rr8Var.y(false, false);
                            if (user == null) {
                            }
                            tL_sponsoredPeer = null;
                            charSequence4 = charSequence3;
                            z6 = false;
                            charSequence5 = charSequence2;
                            CharSequence charSequence72 = charSequence5;
                            if (r7 != 0) {
                            }
                            if (user != null) {
                                String H3 = k96.H(' ', "BotUsersShort", i3);
                                if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                }
                            }
                            b = 2;
                            z7 = true;
                            z8 = false;
                            charSequence6 = charSequence4;
                            hj3 hj3Var2 = new hj3(this, b);
                            rr8Var.C0 = z4;
                            rr8Var.D0 = hj3Var2;
                            rr8Var.setOnSponsoredOptionsClick(new w72(this, (byte) 21));
                            rr8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                            rr8Var.z(user != null ? user : r7, encryptedChat, charSequence72, charSequence6, true, z6);
                            rr8Var.y(this.V.a.K2.contains(Long.valueOf(rr8Var.getDialogId())), j == rr8Var.getDialogId() ? z7 : z8);
                        }
                    }
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    rr8Var.y(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z6 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence722 = charSequence5;
                    if (r7 != 0) {
                    }
                    if (user != null) {
                    }
                    b = 2;
                    z7 = true;
                    z8 = false;
                    charSequence6 = charSequence4;
                    hj3 hj3Var22 = new hj3(this, b);
                    rr8Var.C0 = z4;
                    rr8Var.D0 = hj3Var22;
                    rr8Var.setOnSponsoredOptionsClick(new w72(this, (byte) 21));
                    rr8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                    rr8Var.z(user != null ? user : r7, encryptedChat, charSequence722, charSequence6, true, z6);
                    rr8Var.y(this.V.a.K2.contains(Long.valueOf(rr8Var.getDialogId())), j == rr8Var.getDialogId() ? z7 : z8);
                } else {
                    j = dialogId;
                    if (I instanceof TLRPC.User) {
                        user = (TLRPC.User) I;
                        arrayList = user.usernames;
                        str = cf3.p(this.c0, user);
                        z = z11;
                        z2 = N;
                        chat = null;
                    } else {
                        if (I instanceof TLRPC.Chat) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) I;
                            z = z11;
                            TLRPC.Chat K02 = na7.q1(i8).K0(Long.valueOf(chat3.id));
                            if (K02 != null) {
                                chat3 = K02;
                            }
                            arrayList = chat3.usernames;
                            str = cf3.p(this.c0, chat3);
                            z2 = N;
                            encryptedChat = null;
                            r7 = chat3;
                            user = null;
                        } else {
                            z = z11;
                            if (I instanceof TLRPC.EncryptedChat) {
                                TLRPC.EncryptedChat Y0 = na7.q1(i8).Y0(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                                z2 = N;
                                r7 = 0;
                                str = null;
                                encryptedChat = Y0;
                                user = na7.q1(i8).V1(Long.valueOf(Y0.user_id));
                                arrayList = null;
                            } else {
                                z2 = N;
                                arrayList = null;
                                user = null;
                                chat = null;
                                str = null;
                            }
                        }
                        if (arrayList6.isEmpty()) {
                        }
                        if (O()) {
                        }
                        if (arrayList7.isEmpty()) {
                        }
                        ArrayList arrayList102 = uk3Var.e;
                        int i92 = i6;
                        ArrayList arrayList112 = uk3Var.j;
                        int size32 = this.s.size();
                        int size42 = uk3Var.d.size();
                        if (size32 + size42 > 0) {
                        }
                        size = arrayList112.size();
                        if (size > 3) {
                            size = 3;
                        }
                        if (size > 0) {
                        }
                        size2 = arrayList102.size();
                        int i112 = i10;
                        if (size2 > 3) {
                            size2 = 3;
                        }
                        if (arrayList102.isEmpty()) {
                        }
                        if (!z4) {
                        }
                        if (i2 >= 0) {
                        }
                        charSequence = null;
                        charSequence2 = null;
                        if (charSequence == null) {
                        }
                        charSequence3 = charSequence;
                        obj = I;
                        rr8Var.y(false, false);
                        if (user == null) {
                        }
                        tL_sponsoredPeer = null;
                        charSequence4 = charSequence3;
                        z6 = false;
                        charSequence5 = charSequence2;
                        CharSequence charSequence7222 = charSequence5;
                        if (r7 != 0) {
                        }
                        if (user != null) {
                        }
                        b = 2;
                        z7 = true;
                        z8 = false;
                        charSequence6 = charSequence4;
                        hj3 hj3Var222 = new hj3(this, b);
                        rr8Var.C0 = z4;
                        rr8Var.D0 = hj3Var222;
                        rr8Var.setOnSponsoredOptionsClick(new w72(this, (byte) 21));
                        rr8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                        rr8Var.z(user != null ? user : r7, encryptedChat, charSequence7222, charSequence6, true, z6);
                        rr8Var.y(this.V.a.K2.contains(Long.valueOf(rr8Var.getDialogId())), j == rr8Var.getDialogId() ? z7 : z8);
                    }
                }
                encryptedChat = null;
                r7 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = uk3Var.e;
                int i922 = i6;
                ArrayList arrayList1122 = uk3Var.j;
                int size322 = this.s.size();
                int size422 = uk3Var.d.size();
                if (size322 + size422 > 0) {
                }
                size = arrayList1122.size();
                if (size > 3) {
                }
                if (size > 0) {
                }
                size2 = arrayList1022.size();
                int i1122 = i10;
                if (size2 > 3) {
                }
                if (arrayList1022.isEmpty()) {
                }
                if (!z4) {
                }
                if (i2 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                obj = I;
                rr8Var.y(false, false);
                if (user == null) {
                }
                tL_sponsoredPeer = null;
                charSequence4 = charSequence3;
                z6 = false;
                charSequence5 = charSequence2;
                CharSequence charSequence72222 = charSequence5;
                if (r7 != 0) {
                }
                if (user != null) {
                }
                b = 2;
                z7 = true;
                z8 = false;
                charSequence6 = charSequence4;
                hj3 hj3Var2222 = new hj3(this, b);
                rr8Var.C0 = z4;
                rr8Var.D0 = hj3Var2222;
                rr8Var.setOnSponsoredOptionsClick(new w72(this, (byte) 21));
                rr8Var.setAd(z5 ? (TLRPC.TL_sponsoredPeer) obj : tL_sponsoredPeer);
                rr8Var.z(user != null ? user : r7, encryptedChat, charSequence72222, charSequence6, true, z6);
                rr8Var.y(this.V.a.K2.contains(Long.valueOf(rr8Var.getDialogId())), j == rr8Var.getDialogId() ? z7 : z8);
                break;
            case 1:
                final l35 l35Var2 = (l35) view;
                if (!arrayList4.isEmpty()) {
                    String M0 = k96.M0(2131749149, null);
                    String M02 = k96.M0(2131752087, null);
                    final byte b4 = r6 ? (byte) 1 : (byte) 0;
                    l35Var2.b(M0, M02, new View.OnClickListener(this) { // from class: ok3
                        public final /* synthetic */ bl3 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            byte b5 = b4;
                            bl3 bl3Var = this.b;
                            switch (b5) {
                                case 0:
                                    ji3 ji3Var = bl3Var.V;
                                    if (ji3Var != null) {
                                        ji3Var.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    hi3 hi3Var = ((mt9) bl3Var).L0;
                                    kt9 kt9Var = hi3Var.y0;
                                    mt9 mt9Var = hi3Var.e0;
                                    String str9 = mt9Var.E;
                                    ArrayList arrayList13 = mt9Var.y;
                                    int i14 = mt9Var.x;
                                    int i15 = mt9Var.w;
                                    ArrayList arrayList14 = kt9Var.R;
                                    if (!TextUtils.equals(str9, kt9Var.b0)) {
                                        kt9Var.W();
                                        arrayList14.clear();
                                        arrayList14.addAll(arrayList13);
                                        kt9Var.Z = i15;
                                        kt9Var.Y = i15 > arrayList13.size();
                                        kt9Var.c0 = i14;
                                        kt9Var.b0 = str9;
                                        kt9Var.O(true);
                                    }
                                    hi3Var.t0 = true;
                                    hi3Var.w0.g1(0, 0);
                                    hi3Var.S();
                                    mec mecVar = hi3Var.N;
                                    if (mecVar != null && mecVar.getCurrentTabId() != 1) {
                                        hi3Var.N.e(1, 1);
                                    }
                                    kt9Var.Z(hi3Var.N0);
                                    break;
                                case 2:
                                    ji3 ji3Var2 = bl3Var.V;
                                    if (ji3Var2 != null) {
                                        ji3Var2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    ji3 ji3Var3 = bl3Var.V;
                                    if (ji3Var3 != null) {
                                        ji3Var3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i4 = i6;
                    } else if (i6 == 0) {
                        l35Var2.b(k96.M0(2131746391, null), gl.E2(k96.M0(2131746393, null), false, gl.L(-2.0f), gl.L(1.0f)), new View.OnClickListener(this) { // from class: ok3
                            public final /* synthetic */ bl3 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b5 = b3;
                                bl3 bl3Var = this.b;
                                switch (b5) {
                                    case 0:
                                        ji3 ji3Var = bl3Var.V;
                                        if (ji3Var != null) {
                                            ji3Var.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        hi3 hi3Var = ((mt9) bl3Var).L0;
                                        kt9 kt9Var = hi3Var.y0;
                                        mt9 mt9Var = hi3Var.e0;
                                        String str9 = mt9Var.E;
                                        ArrayList arrayList13 = mt9Var.y;
                                        int i14 = mt9Var.x;
                                        int i15 = mt9Var.w;
                                        ArrayList arrayList14 = kt9Var.R;
                                        if (!TextUtils.equals(str9, kt9Var.b0)) {
                                            kt9Var.W();
                                            arrayList14.clear();
                                            arrayList14.addAll(arrayList13);
                                            kt9Var.Z = i15;
                                            kt9Var.Y = i15 > arrayList13.size();
                                            kt9Var.c0 = i14;
                                            kt9Var.b0 = str9;
                                            kt9Var.O(true);
                                        }
                                        hi3Var.t0 = true;
                                        hi3Var.w0.g1(0, 0);
                                        hi3Var.S();
                                        mec mecVar = hi3Var.N;
                                        if (mecVar != null && mecVar.getCurrentTabId() != 1) {
                                            hi3Var.N.e(1, 1);
                                        }
                                        kt9Var.Z(hi3Var.N0);
                                        break;
                                    case 2:
                                        ji3 ji3Var2 = bl3Var.V;
                                        if (ji3Var2 != null) {
                                            ji3Var2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        ji3 ji3Var3 = bl3Var.V;
                                        if (ji3Var3 != null) {
                                            ji3Var3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i4 = ir2.k(1, i6, arrayList6);
                    }
                    ArrayList arrayList13 = uk3Var.e;
                    ArrayList arrayList14 = uk3Var.j;
                    boolean O = O();
                    ArrayList arrayList15 = this.F;
                    if (O || !arrayList7.isEmpty() || !arrayList15.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i4 >= L) {
                            if (i4 != L || !O()) {
                                if (i4 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList15.isEmpty() ? 0 : arrayList15.size() + 1) && !this.s.isEmpty()) {
                                    l35Var2.setText(k96.M0(2131745631, null));
                                    break;
                                } else {
                                    i4 -= J();
                                }
                            } else if (!this.O) {
                                final byte b5 = 2;
                                l35Var2.b(k96.M0(2131746177, null), k96.M0(2131752087, null), new View.OnClickListener(this) { // from class: ok3
                                    public final /* synthetic */ bl3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        byte b52 = b5;
                                        bl3 bl3Var = this.b;
                                        switch (b52) {
                                            case 0:
                                                ji3 ji3Var = bl3Var.V;
                                                if (ji3Var != null) {
                                                    ji3Var.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                hi3 hi3Var = ((mt9) bl3Var).L0;
                                                kt9 kt9Var = hi3Var.y0;
                                                mt9 mt9Var = hi3Var.e0;
                                                String str9 = mt9Var.E;
                                                ArrayList arrayList132 = mt9Var.y;
                                                int i14 = mt9Var.x;
                                                int i15 = mt9Var.w;
                                                ArrayList arrayList142 = kt9Var.R;
                                                if (!TextUtils.equals(str9, kt9Var.b0)) {
                                                    kt9Var.W();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    kt9Var.Z = i15;
                                                    kt9Var.Y = i15 > arrayList132.size();
                                                    kt9Var.c0 = i14;
                                                    kt9Var.b0 = str9;
                                                    kt9Var.O(true);
                                                }
                                                hi3Var.t0 = true;
                                                hi3Var.w0.g1(0, 0);
                                                hi3Var.S();
                                                mec mecVar = hi3Var.N;
                                                if (mecVar != null && mecVar.getCurrentTabId() != 1) {
                                                    hi3Var.N.e(1, 1);
                                                }
                                                kt9Var.Z(hi3Var.N0);
                                                break;
                                            case 2:
                                                ji3 ji3Var2 = bl3Var.V;
                                                if (ji3Var2 != null) {
                                                    ji3Var2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ji3 ji3Var3 = bl3Var.V;
                                                if (ji3Var3 != null) {
                                                    ji3Var3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final byte b6 = 3;
                                l35Var2.b(k96.M0(2131746177, null), k96.M0(2131752089, null), new View.OnClickListener(this) { // from class: ok3
                                    public final /* synthetic */ bl3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        byte b52 = b6;
                                        bl3 bl3Var = this.b;
                                        switch (b52) {
                                            case 0:
                                                ji3 ji3Var = bl3Var.V;
                                                if (ji3Var != null) {
                                                    ji3Var.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                hi3 hi3Var = ((mt9) bl3Var).L0;
                                                kt9 kt9Var = hi3Var.y0;
                                                mt9 mt9Var = hi3Var.e0;
                                                String str9 = mt9Var.E;
                                                ArrayList arrayList132 = mt9Var.y;
                                                int i14 = mt9Var.x;
                                                int i15 = mt9Var.w;
                                                ArrayList arrayList142 = kt9Var.R;
                                                if (!TextUtils.equals(str9, kt9Var.b0)) {
                                                    kt9Var.W();
                                                    arrayList142.clear();
                                                    arrayList142.addAll(arrayList132);
                                                    kt9Var.Z = i15;
                                                    kt9Var.Y = i15 > arrayList132.size();
                                                    kt9Var.c0 = i14;
                                                    kt9Var.b0 = str9;
                                                    kt9Var.O(true);
                                                }
                                                hi3Var.t0 = true;
                                                hi3Var.w0.g1(0, 0);
                                                hi3Var.S();
                                                mec mecVar = hi3Var.N;
                                                if (mecVar != null && mecVar.getCurrentTabId() != 1) {
                                                    hi3Var.N.e(1, 1);
                                                }
                                                kt9Var.Z(hi3Var.N0);
                                                break;
                                            case 2:
                                                ji3 ji3Var2 = bl3Var.V;
                                                if (ji3Var2 != null) {
                                                    ji3Var2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ji3 ji3Var3 = bl3Var.V;
                                                if (ji3Var3 != null) {
                                                    ji3Var3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            l35Var2.setText(k96.M0(2131752225, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = uk3Var.d.size();
                    int size10 = arrayList14.size();
                    if (size10 > 3 && this.I0) {
                        size10 = 3;
                    }
                    int size11 = arrayList13.size();
                    if (size11 > 3 && this.H0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList13.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList16 = this.J;
                    if (!arrayList16.isEmpty()) {
                        arrayList16.size();
                    }
                    int i14 = size13;
                    if (this.c != yk3.d || this.d) {
                        arrayList16.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i5 = 1;
                        str3 = null;
                        str4 = null;
                    } else {
                        if (i4 == 0) {
                            str3 = null;
                            str6 = k96.M0(2131743757, null);
                        } else {
                            str3 = null;
                            str6 = null;
                        }
                        i5 = 1;
                        i4 = ir2.k(1, i4, arrayList7);
                        str4 = str6;
                    }
                    if (!arrayList15.isEmpty()) {
                        if (i4 == 0) {
                            str4 = k96.M0(2131748915, str3);
                        }
                        i4 = ir2.k(i5, i4, arrayList15);
                    }
                    if (str4 == null) {
                        int i15 = i4 - (size8 + size9);
                        if (i15 < 0 || i15 >= size10) {
                            int i16 = i15 - size10;
                            if (i16 < 0 || i16 >= size12) {
                                l35Var = l35Var2;
                                r72 = null;
                                if (this.V == null || i14 <= 0 || i16 - size12 > 1) {
                                    this.G0 = i16;
                                    SpannableStringBuilder H4 = H(this.c);
                                    b2 = 1;
                                    Runnable runnable3 = new Runnable(this) { // from class: pk3
                                        public final /* synthetic */ bl3 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (b2) {
                                                case 0:
                                                    bl3 bl3Var = this.b;
                                                    boolean z12 = bl3Var.I0;
                                                    bl3Var.I0 = !z12;
                                                    l35Var.setRightText(k96.M0(!z12 ? 2131745147 : 2131745148, null));
                                                    bl3Var.f();
                                                    break;
                                                default:
                                                    bl3 bl3Var2 = this.b;
                                                    cj3 cj3Var = bl3Var2.s0;
                                                    l35 l35Var3 = l35Var;
                                                    cs5 I2 = cs5.I(cj3Var, l35Var3);
                                                    for (yk3 yk3Var : yk3.values()) {
                                                        boolean z13 = yk3Var.a == bl3Var2.c.a;
                                                        I2.h(new rg((Object) bl3Var2, z13, (Object) l35Var3, (Object) yk3Var, (byte) 15), k96.M0(yk3Var.b, null), z13);
                                                    }
                                                    I2.W(5);
                                                    I2.b0 = true;
                                                    I2.t = false;
                                                    I2.s = (short) 0;
                                                    I2.a0();
                                                    break;
                                            }
                                        }
                                    };
                                    str4 = k96.M0(2131745564, null);
                                    spannableStringBuilder = H4;
                                    runnable = runnable3;
                                } else {
                                    TLRPC.Chat K03 = na7.q1(i8).K0(Long.valueOf(-this.V.a()));
                                    if (K03 == null) {
                                        str5 = "null";
                                        c = 0;
                                    } else if (K03.monoforum) {
                                        c = 0;
                                        str5 = mm4.j(i8, K03, false);
                                    } else {
                                        c = 0;
                                        str5 = K03.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c] = str5;
                                    str4 = k96.a0(null, null, 2131745552, objArr);
                                }
                            } else {
                                r72 = null;
                                str4 = k96.M0(2131749360, null);
                                if (uk3Var.e.size() > 3) {
                                    l35Var = l35Var2;
                                    z10 = this.H0;
                                    spannableStringBuilder = null;
                                    obj2 = new tn6((Object) this, (Object) arrayList13, i, (Object) l35Var, (byte) 20);
                                    b2 = 1;
                                    r0 = obj2;
                                } else {
                                    l35Var = l35Var2;
                                }
                            }
                            SpannableStringBuilder spannableStringBuilder4 = r72;
                            spannableStringBuilder = spannableStringBuilder4;
                            z10 = false;
                            obj2 = spannableStringBuilder4;
                            b2 = 1;
                            r0 = obj2;
                        } else {
                            str4 = k96.M0(2131747090, null);
                            if (arrayList14.size() > 3) {
                                z10 = this.I0;
                                final byte b7 = 0;
                                Runnable runnable4 = new Runnable(this) { // from class: pk3
                                    public final /* synthetic */ bl3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (b7) {
                                            case 0:
                                                bl3 bl3Var = this.b;
                                                boolean z12 = bl3Var.I0;
                                                bl3Var.I0 = !z12;
                                                l35Var2.setRightText(k96.M0(!z12 ? 2131745147 : 2131745148, null));
                                                bl3Var.f();
                                                break;
                                            default:
                                                bl3 bl3Var2 = this.b;
                                                cj3 cj3Var = bl3Var2.s0;
                                                l35 l35Var3 = l35Var2;
                                                cs5 I2 = cs5.I(cj3Var, l35Var3);
                                                for (yk3 yk3Var : yk3.values()) {
                                                    boolean z13 = yk3Var.a == bl3Var2.c.a;
                                                    I2.h(new rg((Object) bl3Var2, z13, (Object) l35Var3, (Object) yk3Var, (byte) 15), k96.M0(yk3Var.b, null), z13);
                                                }
                                                I2.W(5);
                                                I2.b0 = true;
                                                I2.t = false;
                                                I2.s = (short) 0;
                                                I2.a0();
                                                break;
                                        }
                                    }
                                };
                                l35Var = l35Var2;
                                runnable2 = runnable4;
                                spannableStringBuilder = null;
                            } else {
                                l35Var = l35Var2;
                                runnable2 = null;
                                spannableStringBuilder = null;
                                z10 = false;
                            }
                            b2 = 1;
                            r72 = null;
                            r0 = runnable2;
                        }
                        if (r0 == 0) {
                            if (spannableStringBuilder == null) {
                                l35Var.b(str4, k96.M0(z10 ? 2131745147 : 2131745148, r72), new nk3(r0, (byte) 0));
                                l35Var.setRightTextMargin(16);
                                break;
                            } else {
                                l35Var.b(str4, spannableStringBuilder, new nk3(r0, b2));
                                l35Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            l35Var.setText(str4);
                            break;
                        }
                    } else {
                        l35Var = l35Var2;
                        b2 = 1;
                        r72 = null;
                        runnable = null;
                        spannableStringBuilder = null;
                    }
                    z10 = false;
                    r0 = runnable;
                    if (r0 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                ue3 ue3Var = (ue3) view;
                zkb.h(bkb.c6, null, ue3Var);
                ue3Var.t2 = i6 != b() - 1;
                k27 k27Var = (k27) I(i6);
                ue3Var.P = arrayList3.contains(k27Var);
                if (k27Var != null) {
                    ue3Var.f0(k27.B0(k27Var.k), k27Var, k27Var.k.date, false, false);
                    break;
                } else {
                    ue3Var.f0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ytb) view).setTopic((TLRPC.TL_forumTopic) I(i6));
                break;
            case 5:
                wc5 wc5Var = (wc5) view;
                zkb.h(bkb.c6, null, wc5Var);
                wc5Var.setText((CharSequence) arrayList4.get(i6 - 1));
                wc5Var.setNeedDivider(i6 != arrayList4.size());
                break;
            case 6:
                ((wk3) ((o39) view).getAdapter()).f();
                break;
            case 7:
                String str9 = (String) I(i6);
                wgb wgbVar = (wgb) view;
                wgbVar.g(-1, bkb.n6);
                wgbVar.k(k96.a0("AddContactByPhone", null, 2131754449, p38.f().e("+" + str9)), false);
                break;
            case 8:
                rr8 rr8Var2 = (rr8) view;
                nu2 nu2Var = (nu2) I(i6);
                rr8Var2.z(nu2Var, null, qu2.m(0, nu2Var.i, nu2Var.j), yjb.k(new StringBuilder("+"), (String) nu2Var.g.get(0), p38.f()), false, false);
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        byte b = 5;
        byte b2 = 6;
        int i2 = this.i0;
        byte b3 = 1;
        wjb wjbVar = null;
        Activity activity = this.e;
        switch (i) {
            case 0:
                rr8 rr8Var = new rr8(activity, null);
                rr8Var.m0 = i2 == 3;
                view = rr8Var;
                break;
            case 1:
                view = new l35(activity, null);
                break;
            case 2:
            case 9:
                view = new vk3(false ? 1 : 0, activity, true ? 1 : 0);
                break;
            case 3:
                view = new ytb(activity);
                break;
            case 4:
                pi4 pi4Var = new pi4(activity, null);
                pi4Var.setViewType(1);
                pi4Var.setIsSingleCell(true);
                view = pi4Var;
                break;
            case 5:
                wc5 wc5Var = new wc5(activity);
                wc5Var.setGravity(16);
                wc5Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                wc5Var.setTextSize(1, 17.0f);
                zkb.X(wc5Var, bkb.F6, null);
                view = wc5Var;
                break;
            case 6:
                rkb rkbVar = new rkb(activity, wjbVar, b2);
                zkb.l(rkbVar, 20, bkb.h6, null);
                rkbVar.setTag(9);
                rkbVar.setItemAnimator(null);
                rkbVar.setLayoutAnimation(null);
                zr zrVar = new zr(b);
                zrVar.i1(0);
                rkbVar.setLayoutManager(zrVar);
                rkbVar.setAdapter(new wk3(this.t0, null, this.e, false, i2 == 3));
                rkbVar.setOnItemClickListener(new u(this, (byte) 21));
                rkbVar.setOnItemLongClickListener(new rk3(this));
                this.l0 = rkbVar;
                view = rkbVar;
                break;
            case 7:
            default:
                view = new wgb(16, activity, false);
                break;
            case 8:
                view = new rr8(activity, null);
                break;
            case 10:
                li3 li3Var = new li3(this, b2);
                pkb pkbVar = new pkb(activity, (byte) 4);
                pkbVar.setOrientation(1);
                be0 be0Var = new be0(activity);
                be0Var.setImageDrawable(new oy8(R.raw.utyan_empty, gl.L(120.0f), gl.L(120.0f)));
                pkbVar.addView(be0Var, nme.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(activity);
                textView.setTextSize(1, 17.0f);
                int i3 = bkb.F6;
                zkb.X(textView, i3, null);
                textView.setTypeface(gl.o());
                textView.setText(k96.M0(2131745557, null));
                textView.setGravity(17);
                pkbVar.addView(textView, nme.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(activity);
                pkbVar.b = textView2;
                textView2.setTextSize(1, 14.0f);
                zkb.X(textView2, i3, null);
                textView2.setText(k96.a0(null, null, 2131745558, ""));
                textView2.setGravity(17);
                pkbVar.addView(textView2, nme.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(activity);
                textView3.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
                ir2.r(14.0f, 1, 2131745559, textView3, null);
                int i4 = bkb.Ei;
                zkb.X(textView3, i4, null);
                int p1 = bkb.p1(0.15f, bkb.w0(null, i4, false));
                ff0 i0 = bkb.i0(6, 6, 6, 6, 0, p1, p1);
                vkb K = zkb.K(0.15f, i4);
                textView3.setBackground(i0);
                zkb.j(textView3, i0, null, K, null);
                textView3.setOnClickListener(new yj3(li3Var, b3));
                pkbVar.addView(textView3, nme.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = pkbVar;
                textView2.setText(k96.a0(null, null, 2131745558, this.a0));
                view = pkbVar;
                break;
        }
        if (i == 5) {
            view.setLayoutParams(new e49(-1, gl.L(86.0f)));
        } else {
            view.setLayoutParams(new e49(-1, -2));
        }
        return new y29(view);
    }
}
