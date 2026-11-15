package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.b6;
import di.j9;
import hi.g7;
import hi.h4;
import hi.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.p5;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.t3;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.b61;
import org.telegram.ui.hu;
import org.telegram.ui.hw;
import org.telegram.ui.jw;
import org.telegram.ui.qz;
import org.telegram.ui.yw;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class h0 extends tj0 {
    public boolean A0;
    public qz B0;
    public int C0;
    public int D0;
    public String E;
    public int E0;
    public z51 F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public jw V;
    public final int W;
    public boolean X;
    public boolean Y;
    public String a0;
    public int b0;
    public String c0;
    public boolean d;
    public int d0;
    public final Context e;
    public int e0;
    public n f;
    public int f0;
    public int g0;
    public n h;
    public int h0;
    public final int i0;
    public final v4.k j0;
    public final z k0;
    public b61 l0;
    public final long m0;
    public long o0;
    public View p0;
    public h4 q0;
    public ai.z0 r;
    public ArrayList r0;
    public final yw s0;
    public final int t0;
    public ArrayList u0;
    public final ArrayList v0;
    public int w;
    public final ArrayList w0;
    public int x;
    public String x0;
    public a0.h y0;
    public final ArrayList z0;
    public e0 c = e0.d;
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

    public h0(Context context, yw ywVar, int i7, int i10, v4.k kVar, boolean z10) {
        int i11 = m10.t0;
        this.t0 = i11;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = null;
        this.y0 = new a0.h();
        this.z0 = new ArrayList();
        this.G0 = -1;
        this.H0 = true;
        this.I0 = true;
        this.j0 = kVar;
        this.s0 = ywVar;
        cm0 cm0Var = (cm0) this;
        z zVar = new z(cm0Var);
        this.k0 = zVar;
        zVar.a = new gc.b(cm0Var, 10);
        zVar.p = z10;
        this.e = context;
        this.W = i7;
        this.i0 = i10;
        this.m0 = m10.i(i11).e();
        if (i10 != 15) {
            vr.a0(i11).a.c(new q(i11, i10, new s(this), 0));
        }
        si.b0(i11).M0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i7 = 0; i7 < split.length; i7++) {
                String str3 = split[i7];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i7]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 1 || i7 == 4 || i7 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.O;
        ArrayList arrayList = this.v0;
        ArrayList arrayList2 = this.w0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                g0 g0Var = (g0) arrayList2.remove(0);
                this.u0.remove(g0Var);
                arrayList.remove(g0Var);
                this.y0.l(g0Var.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(g0Var.c);
                } else {
                    sb2.append(", ");
                    sb2.append(g0Var.c);
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder("1");
            } else {
                sb2.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.u0.clear();
            this.y0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        boolean z11 = this.O;
        int i7 = this.t0;
        if (z11) {
            vr.a0(i7).a.c(new h4(20, (cm0) this, sb2));
        } else {
            vr.a0(i7).a.c(new x(i7, 0));
        }
    }

    public final boolean F(Object obj) {
        if (this.i0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        yw ywVar = this.s0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? ywVar.C2 : ywVar.B2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return t3.T(chat) ? ywVar.A2 : t3.n0(chat) ? ywVar.x2 || ywVar.y2 : ywVar.x2 || ywVar.z2;
    }

    public final void G(String str) {
        jw jwVar;
        String str2;
        String str3;
        this.x0 = str;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.v0;
            arrayList2.clear();
            int size = this.u0.size();
            for (int i7 = 0; i7 < size; i7++) {
                jw jwVar2 = this.V;
                if ((jwVar2 == null || jwVar2.a() != ((g0) this.u0.get(i7)).c) && F(((g0) this.u0.get(i7)).a)) {
                    arrayList2.add((g0) this.u0.get(i7));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.u0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            g0 g0Var = (g0) this.u0.get(i10);
            if (g0Var != null && g0Var.a != null && (((jwVar = this.V) == null || jwVar.a() != g0Var.c) && F(((g0) this.u0.get(i10)).a))) {
                TLObject tLObject = g0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? qg.c.i(this.t0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) g0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = q10.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) g0Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(g0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(e0 e0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(e0Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new eq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object I(int i7) {
        int i10;
        int i11;
        TLRPC.Chat M0;
        int i12;
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (i7 > 0 && i7 - 1 < arrayList.size()) {
                return arrayList.get(i12);
            }
            i7 = i5.c.f(1, i7, arrayList);
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            if (i7 > 0) {
                return arrayList2.get(i7 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.O ? this.w0 : this.v0;
            if (i7 > L && (i11 = (i7 - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((g0) arrayList3.get(i11)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.t0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (M0 = np.s1(i13).M0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : M0;
                }
                TLRPC.User a22 = np.s1(i13).a2(Long.valueOf(((TLRPC.User) tLObject).id));
                return a22 != null ? a22 : tLObject;
            }
            i7 -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList4.size()) {
                return arrayList4.get(i7 - 1);
            }
            i7 = i5.c.f(1, i7, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList5.size()) {
                return arrayList5.get(i7 - 1);
            }
            i7 = i5.c.f(1, i7, arrayList5);
        }
        z zVar = this.k0;
        ArrayList arrayList6 = zVar.e;
        ArrayList arrayList7 = zVar.d;
        ArrayList arrayList8 = zVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i7 == 0) {
                return null;
            }
            i7--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.I0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i14 = (size4 <= 3 || !this.H0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.L;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i14 + 1;
        if (i7 >= 0 && i7 < size) {
            return this.s.get(i7);
        }
        int i16 = i7 - size;
        if (i16 >= 0 && i16 < size2) {
            return arrayList7.get(i16);
        }
        int i17 = i16 - size2;
        if (i17 >= 0 && i17 < size3) {
            return arrayList8.get(i17);
        }
        int i18 = i17 - size3;
        if (i18 <= 0 || i18 >= size5) {
            i10 = i18 - size5;
        } else {
            int i19 = i18 - 1;
            if (i19 >= 0 && i19 < arrayList9.size()) {
                return arrayList9.get(i19);
            }
            i10 = i19 - arrayList9.size();
            if (i10 >= 0 && i10 < arrayList6.size()) {
                return arrayList6.get(i10);
            }
        }
        ArrayList arrayList10 = this.I;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.Y && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size6 + i15);
        ArrayList arrayList11 = this.J;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 <= 0 || i20 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i20 - 1);
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
        int i7 = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i7 : i7 + 1 : i7;
    }

    public final boolean L() {
        if (this.O || si.b0(this.t0).j1.isEmpty()) {
            return false;
        }
        return this.i0 != 14 || this.s0.B2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i7) {
        int i10;
        int i11;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i7 = i5.c.f(1, i7, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.O ? this.w0 : this.v0;
                if (i7 <= L || (i7 - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i7 -= J();
                }
            }
            z zVar = this.k0;
            ArrayList arrayList3 = zVar.e;
            ArrayList arrayList4 = zVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = zVar.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i12 = (size4 <= 3 || !this.H0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.L;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            int size6 = this.F.size();
            if (size6 > 0) {
                if (i7 < 0 || i7 >= size6) {
                    i7 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList.isEmpty())) {
                if (i7 != 0) {
                    i7--;
                }
            }
            if ((i7 < 0 || i7 >= size) && (((i10 = i7 - size) < 0 || i10 >= size2) && ((i11 = i10 - size2) <= 0 || i11 >= size3))) {
                int i13 = i11 - size3;
                if (i13 > 0 && i13 < size5) {
                    return true;
                }
                int i14 = i13 - size5;
                ArrayList arrayList6 = this.I;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i14 <= 0 || i14 >= size7) {
                    ArrayList arrayList7 = this.J;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != e0.d || this.d) {
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
            jw jwVar = this.V;
            if (jwVar == null || jwVar.a() == 0 || this.Y) {
                V(this.h0, this.a0);
            } else {
                U(this.h0, this.a0);
            }
        }
    }

    public final void Q(long j3, TLObject tLObject) {
        g0 g0Var = (g0) this.y0.f(j3);
        if (g0Var == null) {
            g0Var = new g0();
            this.y0.k(g0Var, j3);
        } else {
            this.u0.remove(g0Var);
        }
        this.u0.add(0, g0Var);
        g0Var.c = j3;
        g0Var.a = tLObject;
        g0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        int i7 = this.t0;
        vr.a0(i7).a.c(new j9(i7, j3, 1));
    }

    public final boolean R() {
        int i7 = this.i0;
        return (i7 == 2 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 1 || i7 == 11 || i7 == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.L;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.k0.e.size();
            if (this.H0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i7, String str) {
        String str2;
        if (str != null && str.equals(this.N) && (i7 == this.D0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.N = str;
        this.D0 = i7;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        n nVar = this.h;
        if (nVar != null) {
            org.telegram.messenger.g0.r(nVar);
            this.h = null;
        }
        ai.z0 z0Var = this.r;
        if (z0Var != null) {
            org.telegram.messenger.g0.r(z0Var);
            this.r = null;
        }
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
            if (trim == null || trim.length() < 4 || (m10.i(this.t0).q() && np.s1(this.t0).E2())) {
                this.S = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.S = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.T = ConnectionsManager.getInstance(this.t0).sendRequest(tL_contacts_getSponsoredPeers, new ai.d1((cm0) this, 13));
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
            int i10 = this.i0;
            if (i10 != 15) {
                z zVar = this.k0;
                boolean z10 = i10 != 11;
                boolean z11 = i10 != 11;
                boolean z12 = i10 == 2 || i10 == 11;
                boolean z13 = i10 == 0;
                jw jwVar = this.V;
                zVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, jwVar != null ? jwVar.a() : 0L, null);
            }
            this.O = false;
            this.e0 = 0;
            this.E0 = 0;
            this.H0 = true;
            this.I0 = true;
            jw jwVar2 = this.V;
            if (jwVar2 != null) {
                jwVar2.d(false, true);
            }
            if (this.i0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.z0.clear();
            this.A0 = false;
            qz qzVar = this.B0;
            if (qzVar != null) {
                ((hu) qzVar).j(false, null, this.z0, false);
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
            z zVar2 = this.k0;
            if (zVar2.s) {
                this.J.clear();
                this.K.clear();
                ArrayList arrayList = this.k0.q;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    this.K.add(((x1) arrayList.get(i11)).a);
                }
                this.H0 = true;
                this.I0 = true;
                this.E0 = 0;
                f();
                jw jwVar3 = this.V;
                if (jwVar3 != null) {
                    jwVar3.d(false, false);
                }
            } else {
                vr.a0(zVar2.m).a.c(new w1(zVar2, 1));
            }
        } else {
            this.K.clear();
        }
        int i12 = this.e0 + 1;
        this.e0 = i12;
        this.E0 = 3;
        this.H0 = true;
        this.I0 = true;
        f();
        jw jwVar4 = this.V;
        if (jwVar4 != null) {
            jwVar4.d(true, false);
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
                p5 p5Var = Utilities.g;
                cm0 cm0Var = (cm0) this;
                n nVar2 = new n(cm0Var, trim, i12, str, 0);
                this.f = nVar2;
                p5Var.d(nVar2, 300L);
                if (str2 == null) {
                    this.E0++;
                    ai.z0 z0Var2 = new ai.z0(cm0Var, i12, str2, 18);
                    this.r = z0Var2;
                    org.telegram.messenger.g0.i3(z0Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        p5 p5Var2 = Utilities.g;
        cm0 cm0Var2 = (cm0) this;
        n nVar22 = new n(cm0Var2, trim, i12, str, 0);
        this.f = nVar22;
        p5Var2.d(nVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i7, String str) {
        jw jwVar = this.V;
        if (jwVar == null || jwVar.a() == 0 || this.W == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(str)) {
            return;
        }
        int i10 = this.R;
        int i11 = this.t0;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.R, true);
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
        if (this.i0 == 15) {
            return;
        }
        long a10 = this.V.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = np.s1(i11).j1(a10);
        if (str.equals(this.a0) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.a0 = str;
        int i12 = 1 + this.U;
        this.U = i12;
        this.R = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new r(i12, i7, 0, this, str, tL_messages_search), 2);
    }

    public final void V(int i7, String str) {
        if (this.W != 0 && (!TextUtils.isEmpty(this.a0) || !TextUtils.isEmpty(str))) {
            int i10 = this.P;
            int i11 = this.t0;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.P, true);
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
                this.b0 = 0;
                this.O = false;
                f();
                return;
            }
            G(str);
            this.k0.f(this.s, this.w0);
            if (this.i0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i12 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i12 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i12 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i12 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.D0;
                if (!str.equals(this.a0)) {
                    this.d = false;
                }
                if (str.equals(this.a0) && this.b0 == this.c.a && !arrayList.isEmpty() && this.h0 == this.e0) {
                    gj gjVar = (gj) i5.c.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = gjVar.e1();
                    tL_messages_searchGlobal.offset_rate = this.d0;
                    tL_messages_searchGlobal.offset_peer = np.s1(i11).j1(gj.B1(gjVar.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.a0 = str;
                this.b0 = this.c.a;
                int i13 = this.Q + 1;
                this.Q = i13;
                this.P = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new r(i13, i7, 1, this, str, tL_messages_searchGlobal), 2);
                return;
            }
            int i14 = this.E0 - 1;
            this.E0 = i14;
            jw jwVar = this.V;
            if (jwVar != null) {
                jwVar.d(i14 > 0, true);
                this.V.c();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        jw jwVar = this.V;
        if (jwVar == null || jwVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l10 = np.s1(this.t0).r7.l(-this.V.a());
            String trim = str.trim();
            for (int i7 = 0; i7 < l10.size(); i7++) {
                if (l10.get(i7) != null && ((TLRPC.TL_forumTopic) l10.get(i7)).title.toLowerCase().contains(trim)) {
                    arrayList.add((TLRPC.TL_forumTopic) l10.get(i7));
                    ((TLRPC.TL_forumTopic) l10.get(i7)).searchQuery = trim;
                }
            }
        }
        f();
    }

    @Override // v4.h0
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
        z zVar = this.k0;
        int size3 = zVar.d.size();
        int i7 = size + size2 + size3;
        int size4 = zVar.e.size();
        if (size4 > 3 && this.H0) {
            size4 = 3;
        }
        int size5 = this.L.size() + size4;
        int size6 = zVar.j.size();
        if (size6 > 3 && this.I0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i7++;
        }
        if (size5 != 0) {
            i7 += size5 + 1;
        }
        if (size6 != 0) {
            i7 += size6;
        }
        ArrayList arrayList5 = this.I;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i7 += size7 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i7;
        }
        ArrayList arrayList6 = this.J;
        int size8 = arrayList6.size();
        if ((this.c != e0.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i10 = (arrayList5.isEmpty() || this.Y) ? size8 : 0;
        if (i10 != 0) {
            i7 += i10 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i7;
        }
        this.C0 = i7;
        return i7;
    }

    @Override // v4.h0
    public final long c(int i7) {
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i7) {
        int i10;
        if (this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (i7 != 0) {
                    int i11 = i7 - 1;
                    if (i11 < arrayList.size()) {
                        return 9;
                    }
                    i7 = i11 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i7 < L) {
                    return 6;
                }
                if (i7 != L) {
                    if (i7 >= J()) {
                        i7 -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                if (i7 != 0) {
                    if (i7 <= arrayList2.size()) {
                        return 3;
                    }
                    i7 = i5.c.f(1, i7, arrayList2);
                }
            }
            ArrayList arrayList3 = this.F;
            if (!arrayList3.isEmpty()) {
                if (i7 != 0) {
                    if (i7 <= arrayList3.size()) {
                        return 8;
                    }
                    i7 = i5.c.f(1, i7, arrayList3);
                }
            }
            z zVar = this.k0;
            ArrayList arrayList4 = zVar.e;
            int size = this.s.size();
            int size2 = zVar.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i7 != 0) {
                    i7--;
                }
            }
            int size3 = zVar.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i12 = (size4 <= 3 || !this.H0) ? size4 : 3;
            ArrayList arrayList5 = this.L;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            ArrayList arrayList6 = this.J;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            e0 e0Var = this.c;
            e0 e0Var2 = e0.d;
            if ((e0Var != e0Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.I;
            if (!arrayList7.isEmpty() && !this.Y) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i7 < 0 || i7 >= size) && ((i10 = i7 - size) < 0 || i10 >= size2)) {
                int i13 = i10 - size2;
                if (i13 < 0 || i13 >= size3) {
                    int i14 = i13 - size3;
                    if (i14 < 0 || i14 >= size5) {
                        int i15 = i14 - size5;
                        if (size7 > 0) {
                            if (i15 >= 0) {
                                if (this.Y) {
                                }
                            }
                            i15 -= size7 + (!this.Y ? 1 : 0);
                        }
                        if (i15 >= 0 && i15 < size6) {
                            if (i15 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == e0Var2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i14 == 0) {
                    }
                } else {
                    Object I = I(i13);
                    if (I instanceof String) {
                        if (!"section".equals((String) I)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i7 != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x067d A[Catch: Exception -> 0x0697, TryCatch #0 {Exception -> 0x0697, blocks: (B:289:0x066b, B:291:0x067d, B:293:0x0683, B:294:0x0688, B:296:0x0686), top: B:288:0x066b }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033e  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        boolean z10;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        String str;
        TLRPC.Chat chat;
        ?? r92;
        TLRPC.EncryptedChat encryptedChat;
        boolean z11;
        boolean z12;
        String str2;
        int i10;
        int size;
        int size2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Object obj;
        TLRPC.TL_sponsoredPeer tL_sponsoredPeer;
        CharSequence charSequence4;
        boolean z13;
        CharSequence charSequence5;
        boolean z14;
        boolean z15;
        CharSequence charSequence6;
        int i11;
        String str3;
        int A1;
        String str4;
        int A12;
        boolean z16;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        String q10;
        ArrayList<TLRPC.TL_username> arrayList2;
        TLRPC.Chat chat3;
        int i12;
        int i13;
        String str5;
        String str6;
        final x3 x3Var;
        ?? r93;
        SpannableStringBuilder spannableStringBuilder;
        Object obj2;
        boolean z17;
        ?? r02;
        char c10;
        String str7;
        Runnable runnable;
        String str8;
        int i14 = i7;
        int i15 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList3 = this.I;
        ArrayList arrayList4 = this.K;
        ArrayList arrayList5 = this.L;
        ArrayList arrayList6 = this.y;
        ArrayList arrayList7 = this.G;
        z zVar = this.k0;
        int i16 = this.t0;
        final int i17 = 1;
        switch (i15) {
            case 0:
                f6 f6Var = (f6) view;
                q6.h(j6.d6, f6Var, null);
                long dialogId = f6Var.getDialogId();
                boolean N = N(i14);
                Object I = I(i14);
                boolean z18 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z18) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.M;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z16 = N;
                            if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                N = z16;
                            }
                        } else {
                            z16 = N;
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i16).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                    }
                    long o4 = m5.o(tL_sponsoredPeer2.peer);
                    if (o4 >= 0) {
                        user2 = np.s1(i16).a2(Long.valueOf(o4));
                        if (user2 != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                            q10 = m5.q(this.c0, user2);
                            arrayList2 = arrayList8;
                            chat3 = null;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        } else {
                            chat2 = null;
                            arrayList2 = null;
                            q10 = null;
                            chat3 = chat2;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        }
                    } else {
                        TLRPC.Chat M0 = np.s1(i16).M0(Long.valueOf(-o4));
                        if (M0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = M0.usernames;
                            q10 = m5.q(this.c0, M0);
                            arrayList2 = arrayList9;
                            chat3 = M0;
                            user2 = null;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        } else {
                            chat2 = M0;
                            user2 = null;
                            arrayList2 = null;
                            q10 = null;
                            chat3 = chat2;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = true;
                        i14 = i5.c.f(1, i14, arrayList6);
                    }
                    if (O()) {
                        if (i14 < J()) {
                            f6Var.N = i14 != J() + (-1);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i14 -= J();
                    } else {
                        z12 = false;
                    }
                    if (arrayList7.isEmpty()) {
                        str2 = str;
                    } else {
                        str2 = str;
                        i14 = i5.c.f(1, i14, arrayList7);
                    }
                    ArrayList arrayList10 = zVar.e;
                    int i18 = i14;
                    ArrayList arrayList11 = zVar.j;
                    int size3 = this.s.size();
                    int size4 = zVar.d.size();
                    i10 = (size3 + size4 > 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i18 : i18 - 1;
                    size = arrayList11.size();
                    if (size > 3 && this.I0) {
                        size = 3;
                    }
                    int i19 = (size > 0 || !(arrayList11.get(size + (-1)) instanceof String)) ? size : size - 2;
                    size2 = arrayList10.size();
                    int i20 = i19;
                    if (size2 > 3 && this.H0) {
                        size2 = 3;
                    }
                    int size5 = (arrayList10.isEmpty() || !arrayList5.isEmpty()) ? arrayList5.size() + size2 + 1 : 0;
                    if (!z12) {
                        f6Var.N = (i10 == (b() - J()) + (-1) || i10 == ((size3 + i20) + size4) + (-1) || i10 == (((size3 + size5) + size) + size4) + (-1)) ? false : true;
                    }
                    if (i10 >= 0 || i10 >= this.s.size() || user != null) {
                        charSequence = null;
                    } else {
                        charSequence = (CharSequence) this.H.get(i10);
                        String n10 = q10.n(user);
                        if (charSequence == null || user == null || n10 == null || !charSequence.toString().startsWith("@".concat(n10))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str9 = z12 ? this.x0 : zVar.c;
                                if (!TextUtils.isEmpty(str9)) {
                                    String m10 = user != null ? g5.m(0, user.first_name, user.last_name) : r92 != 0 ? r92.monoforum ? qg.c.i(i16, r92, false) : r92.title : null;
                                    if (m10 == null || (A12 = org.telegram.messenger.g0.A1(m10, str9)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new b00(j6.q6, null), A12, str9.length() + A12, 33);
                                        charSequence2 = spannableStringBuilder2;
                                    }
                                    if (arrayList != null && arrayList.size() > 1) {
                                        String substring = str9.startsWith("@") ? str9.substring(1) : str9;
                                        int size6 = arrayList.size();
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < size6) {
                                                TLRPC.TL_username tL_username = arrayList.get(i21);
                                                i21++;
                                                TLRPC.TL_username tL_username2 = tL_username;
                                                obj = I;
                                                if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                                    str4 = tL_username2.username;
                                                } else {
                                                    I = obj;
                                                }
                                            } else {
                                                obj = I;
                                                str4 = null;
                                            }
                                        }
                                        if (str4 == null) {
                                            int size7 = arrayList.size();
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 < size7) {
                                                    TLRPC.TL_username tL_username3 = arrayList.get(i22);
                                                    i22++;
                                                    TLRPC.TL_username tL_username4 = tL_username3;
                                                    ArrayList<TLRPC.TL_username> arrayList12 = arrayList;
                                                    if (tL_username4.active && tL_username4.username.contains(substring)) {
                                                        str4 = tL_username4.username;
                                                    } else {
                                                        arrayList = arrayList12;
                                                    }
                                                }
                                            }
                                        }
                                        if (str4 != null) {
                                            str3 = str4;
                                            if (str3 != null && (user == null || z10)) {
                                                if (str9.startsWith("@")) {
                                                    str9 = str9.substring(1);
                                                }
                                                try {
                                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                    spannableStringBuilder3.append((CharSequence) "@");
                                                    spannableStringBuilder3.append((CharSequence) str3);
                                                    A1 = org.telegram.messenger.g0.A1(str3, str9);
                                                    if (A1 != -1) {
                                                        int length = str9.length();
                                                        if (A1 == 0) {
                                                            length++;
                                                        } else {
                                                            A1++;
                                                        }
                                                        spannableStringBuilder3.setSpan(new b00(j6.q6, null), A1, length + A1, 33);
                                                    }
                                                    charSequence3 = spannableStringBuilder3;
                                                } catch (Exception e10) {
                                                    a8.g(e10, true);
                                                    charSequence3 = str3;
                                                }
                                            }
                                            f6Var.w(false, false);
                                            if (user == null && user.id == this.m0 && this.i0 != 16) {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = null;
                                                z13 = true;
                                                charSequence5 = hd.M0(2131745901, null);
                                            } else {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = charSequence3;
                                                z13 = false;
                                                charSequence5 = charSequence2;
                                            }
                                            CharSequence charSequence7 = charSequence5;
                                            if (r92 != 0 || r92.participants_count == 0) {
                                                if (user != null && user.bot && (i11 = user.bot_active_users) != 0) {
                                                    String H = hd.H(' ', "BotUsersShort", i11);
                                                    if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                                        ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H);
                                                    } else if (TextUtils.isEmpty(charSequence4)) {
                                                        z14 = true;
                                                        z15 = false;
                                                        charSequence6 = H;
                                                    } else {
                                                        z15 = false;
                                                        z14 = true;
                                                        charSequence4 = TextUtils.concat(charSequence4, ", ", H);
                                                        charSequence6 = charSequence4;
                                                    }
                                                }
                                                z14 = true;
                                                z15 = false;
                                                charSequence6 = charSequence4;
                                            } else {
                                                String H2 = (!t3.T(r92) || r92.megagroup) ? hd.H(' ', "Members", r92.participants_count) : hd.H(' ', "Subscribers", r92.participants_count);
                                                if (charSequence4 instanceof SpannableStringBuilder) {
                                                    ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                                } else {
                                                    charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                                }
                                                charSequence6 = charSequence4;
                                                z14 = true;
                                                z15 = false;
                                            }
                                            g7 g7Var = new g7(this, 4);
                                            f6Var.C0 = z12;
                                            f6Var.D0 = g7Var;
                                            f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                                            if (z18) {
                                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                            }
                                            f6Var.setAd(tL_sponsoredPeer);
                                            f6Var.x(user == null ? user : r92, encryptedChat, charSequence7, charSequence6, true, z13);
                                            f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                                            break;
                                        }
                                    } else {
                                        obj = I;
                                    }
                                    str3 = str2;
                                    if (str3 != null) {
                                        if (str9.startsWith("@")) {
                                        }
                                        SpannableStringBuilder spannableStringBuilder32 = new SpannableStringBuilder();
                                        spannableStringBuilder32.append((CharSequence) "@");
                                        spannableStringBuilder32.append((CharSequence) str3);
                                        A1 = org.telegram.messenger.g0.A1(str3, str9);
                                        if (A1 != -1) {
                                        }
                                        charSequence3 = spannableStringBuilder32;
                                    }
                                    f6Var.w(false, false);
                                    if (user == null) {
                                    }
                                    tL_sponsoredPeer = null;
                                    charSequence4 = charSequence3;
                                    z13 = false;
                                    charSequence5 = charSequence2;
                                    CharSequence charSequence72 = charSequence5;
                                    if (r92 != 0) {
                                    }
                                    if (user != null) {
                                        String H3 = hd.H(' ', "BotUsersShort", i11);
                                        if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                        }
                                    }
                                    z14 = true;
                                    z15 = false;
                                    charSequence6 = charSequence4;
                                    g7 g7Var2 = new g7(this, 4);
                                    f6Var.C0 = z12;
                                    f6Var.D0 = g7Var2;
                                    f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                                    if (z18) {
                                    }
                                    f6Var.setAd(tL_sponsoredPeer);
                                    f6Var.x(user == null ? user : r92, encryptedChat, charSequence72, charSequence6, true, z13);
                                    f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                                }
                            }
                            charSequence3 = charSequence;
                            obj = I;
                            f6Var.w(false, false);
                            if (user == null) {
                            }
                            tL_sponsoredPeer = null;
                            charSequence4 = charSequence3;
                            z13 = false;
                            charSequence5 = charSequence2;
                            CharSequence charSequence722 = charSequence5;
                            if (r92 != 0) {
                            }
                            if (user != null) {
                            }
                            z14 = true;
                            z15 = false;
                            charSequence6 = charSequence4;
                            g7 g7Var22 = new g7(this, 4);
                            f6Var.C0 = z12;
                            f6Var.D0 = g7Var22;
                            f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                            if (z18) {
                            }
                            f6Var.setAd(tL_sponsoredPeer);
                            f6Var.x(user == null ? user : r92, encryptedChat, charSequence722, charSequence6, true, z13);
                            f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                        }
                    }
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    f6Var.w(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z13 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence7222 = charSequence5;
                    if (r92 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    g7 g7Var222 = new g7(this, 4);
                    f6Var.C0 = z12;
                    f6Var.D0 = g7Var222;
                    f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                    if (z18) {
                    }
                    f6Var.setAd(tL_sponsoredPeer);
                    f6Var.x(user == null ? user : r92, encryptedChat, charSequence7222, charSequence6, true, z13);
                    f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                } else {
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) I;
                        ArrayList<TLRPC.TL_username> arrayList13 = user3.usernames;
                        j3 = dialogId;
                        str = m5.q(this.c0, user3);
                        z10 = N;
                        encryptedChat = null;
                        user = user3;
                        arrayList = arrayList13;
                        r92 = 0;
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat4 = (TLRPC.Chat) I;
                        j3 = dialogId;
                        TLRPC.Chat M02 = np.s1(i16).M0(Long.valueOf(chat4.id));
                        TLRPC.Chat chat5 = M02 == null ? chat4 : M02;
                        arrayList = chat5.usernames;
                        str = m5.q(this.c0, chat5);
                        chat = chat5;
                        z10 = N;
                        user = null;
                    } else {
                        j3 = dialogId;
                        if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.EncryptedChat a12 = np.s1(i16).a1(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                            z10 = N;
                            str = null;
                            r92 = 0;
                            encryptedChat = a12;
                            user = np.s1(i16).a2(Long.valueOf(a12.user_id));
                            arrayList = null;
                        } else {
                            z10 = N;
                            arrayList = null;
                            user = null;
                            str = null;
                            chat = null;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                    }
                    if (O()) {
                    }
                    if (arrayList7.isEmpty()) {
                    }
                    ArrayList arrayList102 = zVar.e;
                    int i182 = i14;
                    ArrayList arrayList112 = zVar.j;
                    int size32 = this.s.size();
                    int size42 = zVar.d.size();
                    if (size32 + size42 > 0) {
                    }
                    size = arrayList112.size();
                    if (size > 3) {
                        size = 3;
                    }
                    if (size > 0) {
                    }
                    size2 = arrayList102.size();
                    int i202 = i19;
                    if (size2 > 3) {
                        size2 = 3;
                    }
                    if (arrayList102.isEmpty()) {
                    }
                    if (!z12) {
                    }
                    if (i10 >= 0) {
                    }
                    charSequence = null;
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    f6Var.w(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z13 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence72222 = charSequence5;
                    if (r92 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    g7 g7Var2222 = new g7(this, 4);
                    f6Var.C0 = z12;
                    f6Var.D0 = g7Var2222;
                    f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                    if (z18) {
                    }
                    f6Var.setAd(tL_sponsoredPeer);
                    f6Var.x(user == null ? user : r92, encryptedChat, charSequence72222, charSequence6, true, z13);
                    f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                }
                encryptedChat = null;
                r92 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = zVar.e;
                int i1822 = i14;
                ArrayList arrayList1122 = zVar.j;
                int size322 = this.s.size();
                int size422 = zVar.d.size();
                if (size322 + size422 > 0) {
                }
                size = arrayList1122.size();
                if (size > 3) {
                }
                if (size > 0) {
                }
                size2 = arrayList1022.size();
                int i2022 = i19;
                if (size2 > 3) {
                }
                if (arrayList1022.isEmpty()) {
                }
                if (!z12) {
                }
                if (i10 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                obj = I;
                f6Var.w(false, false);
                if (user == null) {
                }
                tL_sponsoredPeer = null;
                charSequence4 = charSequence3;
                z13 = false;
                charSequence5 = charSequence2;
                CharSequence charSequence722222 = charSequence5;
                if (r92 != 0) {
                }
                if (user != null) {
                }
                z14 = true;
                z15 = false;
                charSequence6 = charSequence4;
                g7 g7Var22222 = new g7(this, 4);
                f6Var.C0 = z12;
                f6Var.D0 = g7Var22222;
                f6Var.setOnSponsoredOptionsClick(new q4(this, 6));
                if (z18) {
                }
                f6Var.setAd(tL_sponsoredPeer);
                f6Var.x(user == null ? user : r92, encryptedChat, charSequence722222, charSequence6, true, z13);
                f6Var.w(this.V.a.K2.contains(Long.valueOf(f6Var.getDialogId())), j3 != f6Var.getDialogId() ? z14 : z15);
                break;
            case 1:
                final x3 x3Var2 = (x3) view;
                if (!arrayList4.isEmpty()) {
                    String M03 = hd.M0(2131749341, null);
                    String M04 = hd.M0(2131752099, null);
                    final int i23 = r7 ? 1 : 0;
                    x3Var2.b(M03, M04, new View.OnClickListener(this) { // from class: jg.o
                        public final /* synthetic */ h0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    jw jwVar = this.b.V;
                                    if (jwVar != null) {
                                        jwVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    hw hwVar = ((cm0) this.b).L0;
                                    am0 am0Var = hwVar.y0;
                                    cm0 cm0Var = hwVar.e0;
                                    String str10 = cm0Var.E;
                                    ArrayList arrayList14 = cm0Var.y;
                                    int i24 = cm0Var.x;
                                    int i25 = cm0Var.w;
                                    ArrayList arrayList15 = am0Var.R;
                                    if (!TextUtils.equals(str10, am0Var.b0)) {
                                        am0Var.W();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        am0Var.Z = i25;
                                        am0Var.Y = i25 > arrayList14.size();
                                        am0Var.c0 = i24;
                                        am0Var.b0 = str10;
                                        am0Var.O(true);
                                    }
                                    hwVar.t0 = true;
                                    hwVar.w0.h1(0, 0);
                                    hwVar.R();
                                    l61 l61Var = hwVar.N;
                                    if (l61Var != null && l61Var.getCurrentTabId() != 1) {
                                        hwVar.N.d(1, 1);
                                    }
                                    am0Var.Z(hwVar.N0);
                                    break;
                                case 2:
                                    jw jwVar2 = this.b.V;
                                    if (jwVar2 != null) {
                                        jwVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    jw jwVar3 = this.b.V;
                                    if (jwVar3 != null) {
                                        jwVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i12 = i14;
                    } else if (i14 == 0) {
                        x3Var2.b(hd.M0(2131746584, null), org.telegram.messenger.g0.I2(hd.M0(2131746586, null), false, org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f)), new View.OnClickListener(this) { // from class: jg.o
                            public final /* synthetic */ h0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i17) {
                                    case 0:
                                        jw jwVar = this.b.V;
                                        if (jwVar != null) {
                                            jwVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        hw hwVar = ((cm0) this.b).L0;
                                        am0 am0Var = hwVar.y0;
                                        cm0 cm0Var = hwVar.e0;
                                        String str10 = cm0Var.E;
                                        ArrayList arrayList14 = cm0Var.y;
                                        int i24 = cm0Var.x;
                                        int i25 = cm0Var.w;
                                        ArrayList arrayList15 = am0Var.R;
                                        if (!TextUtils.equals(str10, am0Var.b0)) {
                                            am0Var.W();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            am0Var.Z = i25;
                                            am0Var.Y = i25 > arrayList14.size();
                                            am0Var.c0 = i24;
                                            am0Var.b0 = str10;
                                            am0Var.O(true);
                                        }
                                        hwVar.t0 = true;
                                        hwVar.w0.h1(0, 0);
                                        hwVar.R();
                                        l61 l61Var = hwVar.N;
                                        if (l61Var != null && l61Var.getCurrentTabId() != 1) {
                                            hwVar.N.d(1, 1);
                                        }
                                        am0Var.Z(hwVar.N0);
                                        break;
                                    case 2:
                                        jw jwVar2 = this.b.V;
                                        if (jwVar2 != null) {
                                            jwVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        jw jwVar3 = this.b.V;
                                        if (jwVar3 != null) {
                                            jwVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = i5.c.f(1, i14, arrayList6);
                    }
                    ArrayList arrayList14 = zVar.e;
                    ArrayList arrayList15 = zVar.j;
                    boolean O = O();
                    ArrayList arrayList16 = this.F;
                    if (O || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i12 >= L) {
                            if (i12 != L || !O()) {
                                if (i12 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    x3Var2.setText(hd.M0(2131745823, null));
                                    break;
                                } else {
                                    i12 -= J();
                                }
                            } else if (!this.O) {
                                final int i24 = 2;
                                x3Var2.b(hd.M0(2131746370, null), hd.M0(2131752099, null), new View.OnClickListener(this) { // from class: jg.o
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i24) {
                                            case 0:
                                                jw jwVar = this.b.V;
                                                if (jwVar != null) {
                                                    jwVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                hw hwVar = ((cm0) this.b).L0;
                                                am0 am0Var = hwVar.y0;
                                                cm0 cm0Var = hwVar.e0;
                                                String str10 = cm0Var.E;
                                                ArrayList arrayList142 = cm0Var.y;
                                                int i242 = cm0Var.x;
                                                int i25 = cm0Var.w;
                                                ArrayList arrayList152 = am0Var.R;
                                                if (!TextUtils.equals(str10, am0Var.b0)) {
                                                    am0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    am0Var.Z = i25;
                                                    am0Var.Y = i25 > arrayList142.size();
                                                    am0Var.c0 = i242;
                                                    am0Var.b0 = str10;
                                                    am0Var.O(true);
                                                }
                                                hwVar.t0 = true;
                                                hwVar.w0.h1(0, 0);
                                                hwVar.R();
                                                l61 l61Var = hwVar.N;
                                                if (l61Var != null && l61Var.getCurrentTabId() != 1) {
                                                    hwVar.N.d(1, 1);
                                                }
                                                am0Var.Z(hwVar.N0);
                                                break;
                                            case 2:
                                                jw jwVar2 = this.b.V;
                                                if (jwVar2 != null) {
                                                    jwVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                jw jwVar3 = this.b.V;
                                                if (jwVar3 != null) {
                                                    jwVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i25 = 3;
                                x3Var2.b(hd.M0(2131746370, null), hd.M0(2131752101, null), new View.OnClickListener(this) { // from class: jg.o
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                jw jwVar = this.b.V;
                                                if (jwVar != null) {
                                                    jwVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                hw hwVar = ((cm0) this.b).L0;
                                                am0 am0Var = hwVar.y0;
                                                cm0 cm0Var = hwVar.e0;
                                                String str10 = cm0Var.E;
                                                ArrayList arrayList142 = cm0Var.y;
                                                int i242 = cm0Var.x;
                                                int i252 = cm0Var.w;
                                                ArrayList arrayList152 = am0Var.R;
                                                if (!TextUtils.equals(str10, am0Var.b0)) {
                                                    am0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    am0Var.Z = i252;
                                                    am0Var.Y = i252 > arrayList142.size();
                                                    am0Var.c0 = i242;
                                                    am0Var.b0 = str10;
                                                    am0Var.O(true);
                                                }
                                                hwVar.t0 = true;
                                                hwVar.w0.h1(0, 0);
                                                hwVar.R();
                                                l61 l61Var = hwVar.N;
                                                if (l61Var != null && l61Var.getCurrentTabId() != 1) {
                                                    hwVar.N.d(1, 1);
                                                }
                                                am0Var.Z(hwVar.N0);
                                                break;
                                            case 2:
                                                jw jwVar2 = this.b.V;
                                                if (jwVar2 != null) {
                                                    jwVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                jw jwVar3 = this.b.V;
                                                if (jwVar3 != null) {
                                                    jwVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            x3Var2.setText(hd.M0(2131752237, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = zVar.d.size();
                    int size10 = arrayList15.size();
                    if (size10 > 3 && this.I0) {
                        size10 = 3;
                    }
                    int size11 = arrayList14.size();
                    if (size11 > 3 && this.H0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList14.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList17 = this.J;
                    if (!arrayList17.isEmpty()) {
                        arrayList17.size();
                    }
                    int i26 = size13;
                    if (this.c != e0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str5 = null;
                        str6 = null;
                    } else {
                        if (i12 == 0) {
                            str5 = null;
                            str8 = hd.M0(2131743994, null);
                        } else {
                            str5 = null;
                            str8 = null;
                        }
                        i13 = 1;
                        i12 = i5.c.f(1, i12, arrayList7);
                        str6 = str8;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = hd.M0(2131749107, str5);
                        }
                        i12 = i5.c.f(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i27 = i12 - (size8 + size9);
                        if (i27 < 0 || i27 >= size10) {
                            int i28 = i27 - size10;
                            if (i28 < 0 || i28 >= size12) {
                                x3Var = x3Var2;
                                r93 = null;
                                if (this.V == null || i26 <= 0 || i28 - size12 > 1) {
                                    this.G0 = i28;
                                    SpannableStringBuilder H4 = H(this.c);
                                    final int i29 = 1;
                                    Object obj3 = new Runnable(this) { // from class: jg.p
                                        public final /* synthetic */ h0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    h0 h0Var = this.b;
                                                    boolean z19 = h0Var.I0;
                                                    h0Var.I0 = !z19;
                                                    x3Var.setRightText(hd.M0(!z19 ? 2131745339 : 2131745340, null));
                                                    h0Var.f();
                                                    break;
                                                default:
                                                    h0 h0Var2 = this.b;
                                                    yw ywVar = h0Var2.s0;
                                                    x3 x3Var3 = x3Var;
                                                    m60 H5 = m60.H(ywVar, x3Var3);
                                                    for (e0 e0Var : e0.values()) {
                                                        boolean z20 = e0Var.a == h0Var2.c.a;
                                                        H5.i(new aa.c0(h0Var2, z20, x3Var3, e0Var, 5), hd.M0(e0Var.b, null), z20);
                                                    }
                                                    H5.V(5);
                                                    H5.Y = true;
                                                    H5.t = false;
                                                    H5.s = 0;
                                                    H5.Z();
                                                    break;
                                            }
                                        }
                                    };
                                    str6 = hd.M0(2131745756, null);
                                    spannableStringBuilder = H4;
                                    obj2 = obj3;
                                    z17 = false;
                                    r02 = obj2;
                                } else {
                                    TLRPC.Chat M05 = np.s1(i16).M0(Long.valueOf(-this.V.a()));
                                    if (M05 == null) {
                                        str7 = "null";
                                        c10 = 0;
                                    } else if (M05.monoforum) {
                                        c10 = 0;
                                        str7 = qg.c.i(i16, M05, false);
                                    } else {
                                        c10 = 0;
                                        str7 = M05.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = str7;
                                    str6 = hd.a0(null, null, 2131745744, objArr);
                                }
                            } else {
                                r93 = null;
                                str6 = hd.M0(2131749535, null);
                                if (zVar.e.size() > 3) {
                                    z17 = this.H0;
                                    x3Var = x3Var2;
                                    spannableStringBuilder = null;
                                    r02 = new ci.p0(this, arrayList14, i7, x3Var, 5);
                                } else {
                                    x3Var = x3Var2;
                                }
                            }
                        } else {
                            str6 = hd.M0(2131747283, null);
                            if (arrayList15.size() > 3) {
                                boolean z19 = this.I0;
                                final int i30 = 0;
                                Runnable runnable2 = new Runnable(this) { // from class: jg.p
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i30) {
                                            case 0:
                                                h0 h0Var = this.b;
                                                boolean z192 = h0Var.I0;
                                                h0Var.I0 = !z192;
                                                x3Var2.setRightText(hd.M0(!z192 ? 2131745339 : 2131745340, null));
                                                h0Var.f();
                                                break;
                                            default:
                                                h0 h0Var2 = this.b;
                                                yw ywVar = h0Var2.s0;
                                                x3 x3Var3 = x3Var2;
                                                m60 H5 = m60.H(ywVar, x3Var3);
                                                for (e0 e0Var : e0.values()) {
                                                    boolean z20 = e0Var.a == h0Var2.c.a;
                                                    H5.i(new aa.c0(h0Var2, z20, x3Var3, e0Var, 5), hd.M0(e0Var.b, null), z20);
                                                }
                                                H5.V(5);
                                                H5.Y = true;
                                                H5.t = false;
                                                H5.s = 0;
                                                H5.Z();
                                                break;
                                        }
                                    }
                                };
                                x3Var = x3Var2;
                                z17 = z19;
                                runnable = runnable2;
                                spannableStringBuilder = null;
                            } else {
                                x3Var = x3Var2;
                                runnable = null;
                                spannableStringBuilder = null;
                                z17 = false;
                            }
                            r93 = null;
                            r02 = runnable;
                        }
                        if (r02 == 0) {
                            if (spannableStringBuilder == null) {
                                x3Var.b(str6, hd.M0(z17 ? 2131745339 : 2131745340, r93), new bi.d0(4, r02));
                                x3Var.setRightTextMargin(16);
                                break;
                            } else {
                                x3Var.b(str6, spannableStringBuilder, new bi.d0(5, r02));
                                x3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            x3Var.setText(str6);
                            break;
                        }
                    } else {
                        x3Var = x3Var2;
                        r93 = null;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = r93;
                    spannableStringBuilder = spannableStringBuilder4;
                    obj2 = spannableStringBuilder4;
                    z17 = false;
                    r02 = obj2;
                    if (r02 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                t2 t2Var = (t2) view;
                q6.h(j6.d6, t2Var, null);
                t2Var.t2 = i14 != b() - 1;
                gj gjVar = (gj) I(i14);
                t2Var.P = arrayList3.contains(gjVar);
                if (gjVar != null) {
                    t2Var.f0(gj.B0(gjVar.k), gjVar, gjVar.k.date, false, false);
                    break;
                } else {
                    t2Var.f0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ja) view).setTopic((TLRPC.TL_forumTopic) I(i14));
                break;
            case 5:
                m4 m4Var = (m4) view;
                q6.h(j6.d6, m4Var, null);
                m4Var.setText((CharSequence) arrayList4.get(i14 - 1));
                m4Var.setNeedDivider(i14 != arrayList4.size());
                break;
            case 6:
                ((c0) ((uj0) view).getAdapter()).f();
                break;
            case 7:
                String str10 = (String) I(i14);
                l8 l8Var = (l8) view;
                l8Var.g(-1, j6.o6);
                l8Var.k(hd.a0("AddContactByPhone", null, 2131754452, pf.b.c().b("+" + str10)), false);
                break;
            case 8:
                f6 f6Var2 = (f6) view;
                d5 d5Var = (d5) I(i14);
                f6Var2.x(d5Var, null, g5.m(0, d5Var.i, d5Var.j), k5.h(new StringBuilder("+"), (String) d5Var.g.get(0), pf.b.c()), false, false);
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = 3;
        int i11 = this.i0;
        int i12 = 1;
        e6 e6Var = null;
        Context context = this.e;
        switch (i7) {
            case 0:
                f6 f6Var = new f6(context, null);
                f6Var.m0 = i11 == 3;
                view = f6Var;
                view2 = view;
                break;
            case 1:
                view2 = new x3(context, null);
                break;
            case 2:
            case 9:
                view2 = new a0(false ? 1 : 0, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new ja(context);
                break;
            case 4:
                pz pzVar = new pz(context, null);
                pzVar.setViewType(1);
                pzVar.setIsSingleCell(true);
                view2 = pzVar;
                break;
            case 5:
                m4 m4Var = new m4(context);
                m4Var.setGravity(16);
                m4Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                m4Var.setTextSize(1, 17.0f);
                q6.U(m4Var, j6.G6, null);
                view2 = m4Var;
                break;
            case 6:
                b61 b61Var = new b61(2, context, e6Var);
                q6.l(b61Var, 20, j6.i6, null);
                b61Var.setTag(9);
                b61Var.setItemAnimator(null);
                b61Var.setLayoutAnimation(null);
                b0 b0Var = new b0((int) (false ? 1 : 0));
                b0Var.j1(0);
                b61Var.setLayoutManager(b0Var);
                b61Var.setAdapter(new c0(this.t0, this.e, null, false, i11 == 3));
                b61Var.setOnItemClickListener(new b6(this, 14));
                b61Var.setOnItemLongClickListener(new s(this));
                this.l0 = b61Var;
                view = b61Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new l8(16, context, false);
                break;
            case 8:
                view2 = new f6(context, null);
                break;
            case 10:
                v vVar = new v(this, i12);
                z51 z51Var = new z51(context, 6);
                z51Var.setOrientation(1);
                i9 i9Var = new i9(context);
                i9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                z51Var.addView(i9Var, c8.ja.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i13 = j6.G6;
                q6.U(textView, i13, null);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(hd.M0(2131745749, null));
                textView.setGravity(17);
                z51Var.addView(textView, c8.ja.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                z51Var.b = textView2;
                textView2.setTextSize(1, 14.0f);
                q6.U(textView2, i13, null);
                textView2.setText(hd.a0(null, null, 2131745750, ""));
                textView2.setGravity(17);
                z51Var.addView(textView2, c8.ja.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                i5.c.w(textView3, 1, 14.0f, null, 2131745751);
                int i14 = j6.Fi;
                q6.U(textView3, i14, null);
                int r12 = j6.r1(0.15f, j6.v0(i14));
                org.telegram.ui.Cells.y k02 = j6.k0(6, 6, 6, 6, 0, r12, r12);
                m6 K = q6.K(0.15f, i14);
                textView3.setBackground(k02);
                q6.j(textView3, k02, null, K, null);
                textView3.setOnClickListener(new hi.p5(vVar, i10));
                z51Var.addView(textView3, c8.ja.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = z51Var;
                textView2.setText(hd.a0(null, null, 2131745750, this.a0));
                view2 = z51Var;
                break;
        }
        if (i7 == 5) {
            view2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            view2.setLayoutParams(new v4.p0(-1, -2));
        }
        return new cj0(view2);
    }
}
