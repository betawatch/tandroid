package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.ua;
import bi.z6;
import c8.ha;
import hi.j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.p5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;
import org.telegram.ui.e61;
import org.telegram.ui.fu;
import org.telegram.ui.fw;
import org.telegram.ui.hw;
import org.telegram.ui.pz;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class h0 extends oj0 {
    public pz A0;
    public int B0;
    public int C0;
    public String D;
    public int D0;
    public c61 E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public String M;
    public boolean N;
    public int P;
    public String R;
    public int S;
    public int T;
    public hw U;
    public final int V;
    public boolean W;
    public boolean X;
    public String Z;
    public int a0;
    public String b0;
    public int c0;
    public boolean d;
    public int d0;
    public final Context e;
    public int e0;
    public o f;
    public int f0;
    public int g0;
    public o h;
    public final int h0;
    public final v4.k i0;
    public final z j0;
    public e61 k0;
    public final long l0;
    public long n0;
    public View o0;
    public ha.b p0;
    public ArrayList q0;
    public ai.e0 r;
    public final ww r0;
    public final int s0;
    public ArrayList t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public int w;
    public String w0;
    public int x;
    public a0.h x0;
    public final ArrayList y0;
    public boolean z0;
    public e0 c = e0.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final HashSet L = new HashSet();
    public int O = 0;
    public int Q = 0;
    public int Y = -1;
    public boolean m0 = false;

    public h0(Context context, ww wwVar, int i7, int i10, v4.k kVar, boolean z9) {
        int i11 = p10.s0;
        this.s0 = i11;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = null;
        this.x0 = new a0.h();
        this.y0 = new ArrayList();
        this.F0 = -1;
        this.G0 = true;
        this.H0 = true;
        this.i0 = kVar;
        this.r0 = wwVar;
        yl0 yl0Var = (yl0) this;
        z zVar = new z(yl0Var);
        this.j0 = zVar;
        zVar.a = new gf.g(yl0Var, 7);
        zVar.p = z9;
        this.e = context;
        this.V = i7;
        this.h0 = i10;
        this.l0 = p10.i(i11).e();
        if (i10 != 15) {
            yr.a0(i11).a.c(new r(i11, i10, new t(this), 0));
        }
        ui.b0(i11).M0(true);
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

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 1 || i7 == 4 || i7 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z9 = this.N;
        ArrayList arrayList = this.u0;
        ArrayList arrayList2 = this.v0;
        if (z9) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                g0 g0Var = (g0) arrayList2.remove(0);
                this.t0.remove(g0Var);
                arrayList.remove(g0Var);
                this.x0.l(g0Var.c);
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
            this.t0.clear();
            this.x0.b();
            sb2 = new StringBuilder("1");
        }
        String str = this.M;
        G(str != null ? str.trim() : null);
        f();
        boolean z10 = this.N;
        int i7 = this.s0;
        if (z10) {
            yr.a0(i7).a.c(new ha.b(13, (yl0) this, sb2));
        } else {
            yr.a0(i7).a.c(new j2(i7, 1));
        }
    }

    public final boolean F(Object obj) {
        if (this.h0 != 14) {
            return true;
        }
        boolean z9 = obj instanceof TLRPC.User;
        ww wwVar = this.r0;
        if (z9) {
            return ((TLRPC.User) obj).bot ? wwVar.A2 : wwVar.z2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return t3.T(chat) ? wwVar.y2 : t3.n0(chat) ? wwVar.v2 || wwVar.w2 : wwVar.v2 || wwVar.x2;
    }

    public final void G(String str) {
        hw hwVar;
        String str2;
        String str3;
        this.w0 = str;
        ArrayList arrayList = this.v0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.u0;
            arrayList2.clear();
            int size = this.t0.size();
            for (int i7 = 0; i7 < size; i7++) {
                hw hwVar2 = this.U;
                if ((hwVar2 == null || hwVar2.a() != ((g0) this.t0.get(i7)).c) && F(((g0) this.t0.get(i7)).a)) {
                    arrayList2.add((g0) this.t0.get(i7));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.t0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            g0 g0Var = (g0) this.t0.get(i10);
            if (g0Var != null && g0Var.a != null && (((hwVar = this.U) == null || hwVar.a() != g0Var.c) && F(((g0) this.t0.get(i10)).a))) {
                TLObject tLObject = g0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? qg.d.i(this.s0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) g0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = t10.p((TLRPC.User) tLObject);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(e0Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new wp(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
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
            i7 = g.g(1, i7, arrayList);
        }
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            if (i7 > 0) {
                return arrayList2.get(i7 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.N ? this.v0 : this.u0;
            if (i7 > L && (i11 = (i7 - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((g0) arrayList3.get(i11)).a;
                boolean z9 = tLObject instanceof TLRPC.User;
                int i13 = this.s0;
                if (!z9) {
                    return (!(tLObject instanceof TLRPC.Chat) || (M0 = qp.s1(i13).M0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : M0;
                }
                TLRPC.User a22 = qp.s1(i13).a2(Long.valueOf(((TLRPC.User) tLObject).id));
                return a22 != null ? a22 : tLObject;
            }
            i7 -= J();
        }
        ArrayList arrayList4 = this.F;
        if (!arrayList4.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList4.size()) {
                return arrayList4.get(i7 - 1);
            }
            i7 = g.g(1, i7, arrayList4);
        }
        ArrayList arrayList5 = this.E;
        if (!arrayList5.isEmpty()) {
            if (i7 > 0 && i7 <= arrayList5.size()) {
                return arrayList5.get(i7 - 1);
            }
            i7 = g.g(1, i7, arrayList5);
        }
        z zVar = this.j0;
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
        if (size3 > 3 && this.H0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i14 = (size4 <= 3 || !this.G0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i15 = 0;
        ArrayList arrayList9 = this.K;
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
        ArrayList arrayList10 = this.H;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i10 > 0 && i10 <= arrayList10.size()) {
            return arrayList10.get(i10 - 1);
        }
        if (!this.X && !arrayList10.isEmpty()) {
            i15 = 1;
        }
        int i20 = i10 - (size6 + i15);
        ArrayList arrayList11 = this.I;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i20 <= 0 || i20 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i20 - 1);
    }

    public final int J() {
        ArrayList arrayList = this.N ? this.v0 : this.u0;
        return (L() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int K() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.j0.d.size();
        int i7 = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i7 : i7 + 1 : i7;
    }

    public final boolean L() {
        if (this.N || ui.b0(this.s0).i1.isEmpty()) {
            return false;
        }
        return this.h0 != 14 || this.r0.z2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i7) {
        int i10;
        int i11;
        if (this.N && this.J.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i7 = g.g(1, i7, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.N ? this.v0 : this.u0;
                if (i7 <= L || (i7 - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i7 -= J();
                }
            }
            z zVar = this.j0;
            ArrayList arrayList3 = zVar.e;
            ArrayList arrayList4 = zVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = zVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i12 = (size4 <= 3 || !this.G0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.K;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            int size6 = this.E.size();
            if (size6 > 0) {
                if (i7 < 0 || i7 >= size6) {
                    i7 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.F.isEmpty() || !arrayList.isEmpty())) {
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
                ArrayList arrayList6 = this.H;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i14 <= 0 || i14 >= size7) {
                    ArrayList arrayList7 = this.I;
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
        return this.V != 2 && M();
    }

    public final void P() {
        if ((this.Q == 0 || this.O == 0) && this.g0 == this.d0) {
            hw hwVar = this.U;
            if (hwVar == null || hwVar.a() == 0 || this.X) {
                V(this.g0, this.Z);
            } else {
                U(this.g0, this.Z);
            }
        }
    }

    public final void Q(long j3, TLObject tLObject) {
        g0 g0Var = (g0) this.x0.f(j3);
        if (g0Var == null) {
            g0Var = new g0();
            this.x0.k(g0Var, j3);
        } else {
            this.t0.remove(g0Var);
        }
        this.t0.add(0, g0Var);
        g0Var.c = j3;
        g0Var.a = tLObject;
        g0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.M;
        G(str != null ? str.trim() : null);
        f();
        int i7 = this.s0;
        yr.a0(i7).a.c(new ua(i7, j3, 2));
    }

    public final boolean R() {
        int i7 = this.h0;
        return (i7 == 2 || i7 == 4 || i7 == 5 || i7 == 6 || i7 == 1 || i7 == 11 || i7 == 15) ? false : true;
    }

    public final void S() {
        int K;
        ArrayList arrayList = this.K;
        if (!arrayList.isEmpty() && (K = K()) < b()) {
            int size = arrayList.size();
            arrayList.clear();
            p(K + 1, size);
            int size2 = this.j0.e.size();
            if (this.G0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                s(K);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i7, String str) {
        String str2;
        if (str != null && str.equals(this.M) && (i7 == this.C0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.M = str;
        this.C0 = i7;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        o oVar = this.h;
        if (oVar != null) {
            org.telegram.messenger.g0.r(oVar);
            this.h = null;
        }
        ai.e0 e0Var = this.r;
        if (e0Var != null) {
            org.telegram.messenger.g0.r(e0Var);
            this.r = null;
        }
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.s0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.R, trim)) {
            this.R = trim;
            this.K.clear();
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.s0).cancelRequest(this.S, true);
                this.S = 0;
            }
            if (trim == null || trim.length() < 4 || (p10.i(this.s0).q() && qp.s1(this.s0).E2())) {
                this.R = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.R = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.S = ConnectionsManager.getInstance(this.s0).sendRequest(tL_contacts_getSponsoredPeers, new bi.j0(this, 13));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.w0 = null;
            this.j0.s = false;
            this.s.clear();
            this.G.clear();
            this.J.clear();
            this.w = 0;
            this.x = 0;
            this.D = null;
            this.y.clear();
            this.j0.f(null, null);
            int i10 = this.h0;
            if (i10 != 15) {
                z zVar = this.j0;
                boolean z9 = i10 != 11;
                boolean z10 = i10 != 11;
                boolean z11 = i10 == 2 || i10 == 11;
                boolean z12 = i10 == 0;
                hw hwVar = this.U;
                zVar.h(null, true, true, z9, z10, z11, 0L, z12, 0, 0, hwVar != null ? hwVar.a() : 0L, null);
            }
            this.N = false;
            this.d0 = 0;
            this.D0 = 0;
            this.G0 = true;
            this.H0 = true;
            hw hwVar2 = this.U;
            if (hwVar2 != null) {
                hwVar2.d(false, true);
            }
            if (this.h0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.y0.clear();
            this.z0 = false;
            pz pzVar = this.A0;
            if (pzVar != null) {
                ((fu) pzVar).j(false, null, this.y0, false);
                return;
            }
            return;
        }
        this.j0.f(this.s, this.v0);
        this.w = 0;
        this.x = 0;
        this.D = null;
        this.y.clear();
        if (this.V != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.W = true;
            z zVar2 = this.j0;
            if (zVar2.s) {
                this.I.clear();
                this.J.clear();
                ArrayList arrayList = this.j0.q;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    this.J.add(((x1) arrayList.get(i11)).a);
                }
                this.G0 = true;
                this.H0 = true;
                this.D0 = 0;
                f();
                hw hwVar3 = this.U;
                if (hwVar3 != null) {
                    hwVar3.d(false, false);
                }
            } else {
                yr.a0(zVar2.m).a.c(new w1(zVar2, 1));
            }
        } else {
            this.J.clear();
        }
        int i12 = this.d0 + 1;
        this.d0 = i12;
        this.D0 = 3;
        this.G0 = true;
        this.H0 = true;
        f();
        hw hwVar4 = this.U;
        if (hwVar4 != null) {
            hwVar4.d(true, false);
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
                o oVar2 = new o(this, trim, i12, str, 0);
                this.f = oVar2;
                p5Var.d(oVar2, 300L);
                if (str2 == null) {
                    this.D0++;
                    ai.e0 e0Var2 = new ai.e0(this, i12, str2, 17);
                    this.r = e0Var2;
                    org.telegram.messenger.g0.i3(e0Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        p5 p5Var2 = Utilities.g;
        o oVar22 = new o(this, trim, i12, str, 0);
        this.f = oVar22;
        p5Var2.d(oVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i7, String str) {
        hw hwVar = this.U;
        if (hwVar == null || hwVar.a() == 0 || this.V == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.Z) && TextUtils.isEmpty(str)) {
            return;
        }
        int i10 = this.Q;
        int i11 = this.s0;
        if (i10 != 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.Q, true);
            this.Q = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.H;
        if (isEmpty) {
            this.w0 = null;
            this.I.clear();
            arrayList.clear();
            this.T = 0;
            this.Z = null;
            this.N = false;
            f();
            return;
        }
        if (this.h0 == 15) {
            return;
        }
        long a10 = this.U.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = qp.s1(i11).j1(a10);
        if (str.equals(this.Z) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.Z = str;
        int i12 = 1 + this.T;
        this.T = i12;
        this.Q = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new s(i12, i7, 0, this, str, tL_messages_search), 2);
    }

    public final void V(int i7, String str) {
        if (this.V != 0 && (!TextUtils.isEmpty(this.Z) || !TextUtils.isEmpty(str))) {
            int i10 = this.O;
            int i11 = this.s0;
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
                this.O = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.I;
            if (isEmpty || this.U.a() != 0) {
                this.w0 = null;
                arrayList.clear();
                this.H.clear();
                this.P = 0;
                this.Z = null;
                this.a0 = 0;
                this.N = false;
                f();
                return;
            }
            G(str);
            this.j0.f(this.s, this.v0);
            if (this.h0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i12 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i12 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i12 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i12 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.C0;
                if (!str.equals(this.Z)) {
                    this.d = false;
                }
                if (str.equals(this.Z) && this.a0 == this.c.a && !arrayList.isEmpty() && this.g0 == this.d0) {
                    ij ijVar = (ij) g.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = ijVar.f1();
                    tL_messages_searchGlobal.offset_rate = this.c0;
                    tL_messages_searchGlobal.offset_peer = qp.s1(i11).j1(ij.C1(ijVar.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.Z = str;
                this.a0 = this.c.a;
                int i13 = this.P + 1;
                this.P = i13;
                this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new s(i13, i7, 1, this, str, tL_messages_searchGlobal), 2);
                return;
            }
            int i14 = this.D0 - 1;
            this.D0 = i14;
            hw hwVar = this.U;
            if (hwVar != null) {
                hwVar.d(i14 > 0, true);
                this.U.c();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.F;
        arrayList.clear();
        hw hwVar = this.U;
        if (hwVar == null || hwVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l10 = qp.s1(this.s0).q7.l(-this.U.a());
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

    @Override // v4.g0
    public final int b() {
        if (this.D0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.y;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.J;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (O()) {
            size += J();
            if (!this.N) {
                return size;
            }
        }
        ArrayList arrayList3 = this.F;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.E;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        z zVar = this.j0;
        int size3 = zVar.d.size();
        int i7 = size + size2 + size3;
        int size4 = zVar.e.size();
        if (size4 > 3 && this.G0) {
            size4 = 3;
        }
        int size5 = this.K.size() + size4;
        int size6 = zVar.j.size();
        if (size6 > 3 && this.H0) {
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
        ArrayList arrayList5 = this.H;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i7 += size7 + 1 + (!this.X ? 1 : 0);
        }
        if (!this.X) {
            this.Y = i7;
        }
        ArrayList arrayList6 = this.I;
        int size8 = arrayList6.size();
        if ((this.c != e0.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i10 = (arrayList5.isEmpty() || this.X) ? size8 : 0;
        if (i10 != 0) {
            i7 += i10 + 1 + (!this.W ? 1 : 0);
        }
        if (this.X) {
            this.Y = i7;
        }
        this.B0 = i7;
        return i7;
    }

    @Override // v4.g0
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i7) {
        int i10;
        if (this.J.isEmpty()) {
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
            ArrayList arrayList2 = this.F;
            if (!arrayList2.isEmpty()) {
                if (i7 != 0) {
                    if (i7 <= arrayList2.size()) {
                        return 3;
                    }
                    i7 = g.g(1, i7, arrayList2);
                }
            }
            ArrayList arrayList3 = this.E;
            if (!arrayList3.isEmpty()) {
                if (i7 != 0) {
                    if (i7 <= arrayList3.size()) {
                        return 8;
                    }
                    i7 = g.g(1, i7, arrayList3);
                }
            }
            z zVar = this.j0;
            ArrayList arrayList4 = zVar.e;
            int size = this.s.size();
            int size2 = zVar.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i7 != 0) {
                    i7--;
                }
            }
            int size3 = zVar.j.size();
            if (size3 > 3 && this.H0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i12 = (size4 <= 3 || !this.G0) ? size4 : 3;
            ArrayList arrayList5 = this.K;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            ArrayList arrayList6 = this.I;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            e0 e0Var = this.c;
            e0 e0Var2 = e0.d;
            if ((e0Var != e0Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.H;
            if (!arrayList7.isEmpty() && !this.X) {
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
                                if (this.X) {
                                }
                            }
                            i15 -= size7 + (!this.X ? 1 : 0);
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
    /* JADX WARN: Removed duplicated region for block: B:287:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x067e A[Catch: Exception -> 0x0698, TryCatch #0 {Exception -> 0x0698, blocks: (B:289:0x066c, B:291:0x067e, B:293:0x0684, B:294:0x0689, B:296:0x0687), top: B:288:0x066c }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033e  */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        boolean z9;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        String str;
        TLRPC.Chat chat;
        ?? r82;
        TLRPC.EncryptedChat encryptedChat;
        boolean z10;
        boolean z11;
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
        boolean z12;
        CharSequence charSequence5;
        int i11;
        boolean z13;
        boolean z14;
        CharSequence charSequence6;
        int i12;
        String str3;
        int A1;
        String str4;
        int A12;
        boolean z15;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        String q10;
        ArrayList<TLRPC.TL_username> arrayList2;
        TLRPC.Chat chat3;
        int i13;
        int i14;
        String str5;
        String str6;
        final x3 x3Var;
        ?? r83;
        SpannableStringBuilder spannableStringBuilder;
        Object obj2;
        boolean z16;
        ?? r02;
        char c10;
        String str7;
        Runnable runnable;
        String str8;
        int i15 = i7;
        int i16 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.J;
        ArrayList arrayList5 = this.K;
        ArrayList arrayList6 = this.y;
        ArrayList arrayList7 = this.F;
        z zVar = this.j0;
        int i17 = this.s0;
        final int i18 = 1;
        switch (i16) {
            case 0:
                g6 g6Var = (g6) view;
                r6.i(k6.d6, g6Var, null);
                long dialogId = g6Var.getDialogId();
                boolean N = N(i15);
                Object I = I(i15);
                boolean z17 = I instanceof TLRPC.TL_sponsoredPeer;
                if (z17) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer2 = (TLRPC.TL_sponsoredPeer) I;
                    HashSet hashSet = this.L;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z15 = N;
                            if (!Arrays.equals((byte[]) it.next(), tL_sponsoredPeer2.random_id)) {
                                N = z15;
                            }
                        } else {
                            z15 = N;
                            hashSet.add(tL_sponsoredPeer2.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer2.random_id;
                            ConnectionsManager.getInstance(i17).sendRequest(tL_messages_viewSponsoredMessage, null);
                        }
                    }
                    long o4 = m5.o(tL_sponsoredPeer2.peer);
                    if (o4 >= 0) {
                        user2 = qp.s1(i17).a2(Long.valueOf(o4));
                        if (user2 != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                            q10 = m5.q(this.b0, user2);
                            arrayList2 = arrayList8;
                            chat3 = null;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z9 = z15;
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
                            z9 = z15;
                            chat = chat3;
                        }
                    } else {
                        TLRPC.Chat M0 = qp.s1(i17).M0(Long.valueOf(-o4));
                        if (M0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = M0.usernames;
                            q10 = m5.q(this.b0, M0);
                            arrayList2 = arrayList9;
                            chat3 = M0;
                            user2 = null;
                            j3 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z9 = z15;
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
                            z9 = z15;
                            chat = chat3;
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = true;
                        i15 = g.g(1, i15, arrayList6);
                    }
                    if (O()) {
                        if (i15 < J()) {
                            g6Var.M = i15 != J() + (-1);
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i15 -= J();
                    } else {
                        z11 = false;
                    }
                    if (arrayList7.isEmpty()) {
                        str2 = str;
                    } else {
                        str2 = str;
                        i15 = g.g(1, i15, arrayList7);
                    }
                    ArrayList arrayList10 = zVar.e;
                    int i19 = i15;
                    ArrayList arrayList11 = zVar.j;
                    int size3 = this.s.size();
                    int size4 = zVar.d.size();
                    i10 = (size3 + size4 > 0 || (J() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i19 : i19 - 1;
                    size = arrayList11.size();
                    if (size > 3 && this.H0) {
                        size = 3;
                    }
                    int i20 = (size > 0 || !(arrayList11.get(size + (-1)) instanceof String)) ? size : size - 2;
                    size2 = arrayList10.size();
                    int i21 = i20;
                    if (size2 > 3 && this.G0) {
                        size2 = 3;
                    }
                    int size5 = (arrayList10.isEmpty() || !arrayList5.isEmpty()) ? arrayList5.size() + size2 + 1 : 0;
                    if (!z11) {
                        g6Var.M = (i10 == (b() - J()) + (-1) || i10 == ((size3 + i21) + size4) + (-1) || i10 == (((size3 + size5) + size) + size4) + (-1)) ? false : true;
                    }
                    if (i10 >= 0 || i10 >= this.s.size() || user != null) {
                        charSequence = null;
                    } else {
                        charSequence = (CharSequence) this.G.get(i10);
                        String n10 = t10.n(user);
                        if (charSequence == null || user == null || n10 == null || !charSequence.toString().startsWith("@".concat(n10))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str9 = z11 ? this.w0 : zVar.c;
                                if (!TextUtils.isEmpty(str9)) {
                                    String m10 = user != null ? g5.m(0, user.first_name, user.last_name) : r82 != 0 ? r82.monoforum ? qg.d.i(i17, r82, false) : r82.title : null;
                                    if (m10 == null || (A12 = org.telegram.messenger.g0.A1(m10, str9)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new yz(k6.q6, null), A12, str9.length() + A12, 33);
                                        charSequence2 = spannableStringBuilder2;
                                    }
                                    if (arrayList != null && arrayList.size() > 1) {
                                        String substring = str9.startsWith("@") ? str9.substring(1) : str9;
                                        int size6 = arrayList.size();
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 < size6) {
                                                TLRPC.TL_username tL_username = arrayList.get(i22);
                                                i22++;
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
                                            int i23 = 0;
                                            while (true) {
                                                if (i23 < size7) {
                                                    TLRPC.TL_username tL_username3 = arrayList.get(i23);
                                                    i23++;
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
                                            if (str3 != null && (user == null || z9)) {
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
                                                        spannableStringBuilder3.setSpan(new yz(k6.q6, null), A1, length + A1, 33);
                                                    }
                                                    charSequence3 = spannableStringBuilder3;
                                                } catch (Exception e10) {
                                                    a8.g(e10, true);
                                                    charSequence3 = str3;
                                                }
                                            }
                                            g6Var.w(false, false);
                                            if (user == null && user.id == this.l0 && this.h0 != 16) {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = null;
                                                z12 = true;
                                                charSequence5 = id.M0(2131745904, null);
                                            } else {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = charSequence3;
                                                z12 = false;
                                                charSequence5 = charSequence2;
                                            }
                                            CharSequence charSequence7 = charSequence5;
                                            if (r82 != 0 || r82.participants_count == 0) {
                                                if (user != null && user.bot && (i12 = user.bot_active_users) != 0) {
                                                    String H = id.H(' ', "BotUsersShort", i12);
                                                    if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                                        ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H);
                                                    } else if (TextUtils.isEmpty(charSequence4)) {
                                                        i11 = 2;
                                                        z13 = true;
                                                        z14 = false;
                                                        charSequence6 = H;
                                                    } else {
                                                        z14 = false;
                                                        z13 = true;
                                                        i11 = 2;
                                                        charSequence4 = TextUtils.concat(charSequence4, ", ", H);
                                                        charSequence6 = charSequence4;
                                                    }
                                                }
                                                i11 = 2;
                                                z13 = true;
                                                z14 = false;
                                                charSequence6 = charSequence4;
                                            } else {
                                                String H2 = (!t3.T(r82) || r82.megagroup) ? id.H(' ', "Members", r82.participants_count) : id.H(' ', "Subscribers", r82.participants_count);
                                                if (charSequence4 instanceof SpannableStringBuilder) {
                                                    ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                                } else {
                                                    charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                                }
                                                charSequence6 = charSequence4;
                                                i11 = 2;
                                                z13 = true;
                                                z14 = false;
                                            }
                                            ii.c cVar = new ii.c(this, i11);
                                            g6Var.B0 = z11;
                                            g6Var.C0 = cVar;
                                            g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                                            if (z17) {
                                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                            }
                                            g6Var.setAd(tL_sponsoredPeer);
                                            g6Var.x(user == null ? user : r82, encryptedChat, charSequence7, charSequence6, true, z12);
                                            g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
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
                                    g6Var.w(false, false);
                                    if (user == null) {
                                    }
                                    tL_sponsoredPeer = null;
                                    charSequence4 = charSequence3;
                                    z12 = false;
                                    charSequence5 = charSequence2;
                                    CharSequence charSequence72 = charSequence5;
                                    if (r82 != 0) {
                                    }
                                    if (user != null) {
                                        String H3 = id.H(' ', "BotUsersShort", i12);
                                        if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                        }
                                    }
                                    i11 = 2;
                                    z13 = true;
                                    z14 = false;
                                    charSequence6 = charSequence4;
                                    ii.c cVar2 = new ii.c(this, i11);
                                    g6Var.B0 = z11;
                                    g6Var.C0 = cVar2;
                                    g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                                    if (z17) {
                                    }
                                    g6Var.setAd(tL_sponsoredPeer);
                                    g6Var.x(user == null ? user : r82, encryptedChat, charSequence72, charSequence6, true, z12);
                                    g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
                                }
                            }
                            charSequence3 = charSequence;
                            obj = I;
                            g6Var.w(false, false);
                            if (user == null) {
                            }
                            tL_sponsoredPeer = null;
                            charSequence4 = charSequence3;
                            z12 = false;
                            charSequence5 = charSequence2;
                            CharSequence charSequence722 = charSequence5;
                            if (r82 != 0) {
                            }
                            if (user != null) {
                            }
                            i11 = 2;
                            z13 = true;
                            z14 = false;
                            charSequence6 = charSequence4;
                            ii.c cVar22 = new ii.c(this, i11);
                            g6Var.B0 = z11;
                            g6Var.C0 = cVar22;
                            g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                            if (z17) {
                            }
                            g6Var.setAd(tL_sponsoredPeer);
                            g6Var.x(user == null ? user : r82, encryptedChat, charSequence722, charSequence6, true, z12);
                            g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
                        }
                    }
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    g6Var.w(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z12 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence7222 = charSequence5;
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    i11 = 2;
                    z13 = true;
                    z14 = false;
                    charSequence6 = charSequence4;
                    ii.c cVar222 = new ii.c(this, i11);
                    g6Var.B0 = z11;
                    g6Var.C0 = cVar222;
                    g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                    if (z17) {
                    }
                    g6Var.setAd(tL_sponsoredPeer);
                    g6Var.x(user == null ? user : r82, encryptedChat, charSequence7222, charSequence6, true, z12);
                    g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
                } else {
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) I;
                        ArrayList<TLRPC.TL_username> arrayList13 = user3.usernames;
                        j3 = dialogId;
                        str = m5.q(this.b0, user3);
                        z9 = N;
                        encryptedChat = null;
                        user = user3;
                        arrayList = arrayList13;
                        r82 = 0;
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat4 = (TLRPC.Chat) I;
                        j3 = dialogId;
                        TLRPC.Chat M02 = qp.s1(i17).M0(Long.valueOf(chat4.id));
                        TLRPC.Chat chat5 = M02 == null ? chat4 : M02;
                        arrayList = chat5.usernames;
                        str = m5.q(this.b0, chat5);
                        chat = chat5;
                        z9 = N;
                        user = null;
                    } else {
                        j3 = dialogId;
                        if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.EncryptedChat a12 = qp.s1(i17).a1(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                            z9 = N;
                            str = null;
                            r82 = 0;
                            encryptedChat = a12;
                            user = qp.s1(i17).a2(Long.valueOf(a12.user_id));
                            arrayList = null;
                        } else {
                            z9 = N;
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
                    int i192 = i15;
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
                    int i212 = i20;
                    if (size2 > 3) {
                        size2 = 3;
                    }
                    if (arrayList102.isEmpty()) {
                    }
                    if (!z11) {
                    }
                    if (i10 >= 0) {
                    }
                    charSequence = null;
                    charSequence2 = null;
                    if (charSequence == null) {
                    }
                    charSequence3 = charSequence;
                    obj = I;
                    g6Var.w(false, false);
                    if (user == null) {
                    }
                    tL_sponsoredPeer = null;
                    charSequence4 = charSequence3;
                    z12 = false;
                    charSequence5 = charSequence2;
                    CharSequence charSequence72222 = charSequence5;
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    i11 = 2;
                    z13 = true;
                    z14 = false;
                    charSequence6 = charSequence4;
                    ii.c cVar2222 = new ii.c(this, i11);
                    g6Var.B0 = z11;
                    g6Var.C0 = cVar2222;
                    g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                    if (z17) {
                    }
                    g6Var.setAd(tL_sponsoredPeer);
                    g6Var.x(user == null ? user : r82, encryptedChat, charSequence72222, charSequence6, true, z12);
                    g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
                }
                encryptedChat = null;
                r82 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = zVar.e;
                int i1922 = i15;
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
                int i2122 = i20;
                if (size2 > 3) {
                }
                if (arrayList1022.isEmpty()) {
                }
                if (!z11) {
                }
                if (i10 >= 0) {
                }
                charSequence = null;
                charSequence2 = null;
                if (charSequence == null) {
                }
                charSequence3 = charSequence;
                obj = I;
                g6Var.w(false, false);
                if (user == null) {
                }
                tL_sponsoredPeer = null;
                charSequence4 = charSequence3;
                z12 = false;
                charSequence5 = charSequence2;
                CharSequence charSequence722222 = charSequence5;
                if (r82 != 0) {
                }
                if (user != null) {
                }
                i11 = 2;
                z13 = true;
                z14 = false;
                charSequence6 = charSequence4;
                ii.c cVar22222 = new ii.c(this, i11);
                g6Var.B0 = z11;
                g6Var.C0 = cVar22222;
                g6Var.setOnSponsoredOptionsClick(new hi.u1(this, 4));
                if (z17) {
                }
                g6Var.setAd(tL_sponsoredPeer);
                g6Var.x(user == null ? user : r82, encryptedChat, charSequence722222, charSequence6, true, z12);
                g6Var.w(this.U.a.I2.contains(Long.valueOf(g6Var.getDialogId())), j3 != g6Var.getDialogId() ? z13 : z14);
                break;
            case 1:
                final x3 x3Var2 = (x3) view;
                if (!arrayList4.isEmpty()) {
                    String M03 = id.M0(2131749342, null);
                    String M04 = id.M0(2131752099, null);
                    final int i24 = r6 ? 1 : 0;
                    x3Var2.b(M03, M04, new View.OnClickListener(this) { // from class: jg.p
                        public final /* synthetic */ h0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    hw hwVar = this.b.U;
                                    if (hwVar != null) {
                                        hwVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    fw fwVar = ((yl0) this.b).K0;
                                    wl0 wl0Var = fwVar.x0;
                                    yl0 yl0Var = fwVar.d0;
                                    String str10 = yl0Var.D;
                                    ArrayList arrayList14 = yl0Var.y;
                                    int i25 = yl0Var.x;
                                    int i26 = yl0Var.w;
                                    ArrayList arrayList15 = wl0Var.Q;
                                    if (!TextUtils.equals(str10, wl0Var.a0)) {
                                        wl0Var.W();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        wl0Var.Y = i26;
                                        wl0Var.X = i26 > arrayList14.size();
                                        wl0Var.b0 = i25;
                                        wl0Var.a0 = str10;
                                        wl0Var.O(true);
                                    }
                                    fwVar.s0 = true;
                                    fwVar.v0.h1(0, 0);
                                    fwVar.S();
                                    k61 k61Var = fwVar.M;
                                    if (k61Var != null && k61Var.getCurrentTabId() != 1) {
                                        fwVar.M.d(1, 1);
                                    }
                                    wl0Var.Z(fwVar.M0);
                                    break;
                                case 2:
                                    hw hwVar2 = this.b.U;
                                    if (hwVar2 != null) {
                                        hwVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    hw hwVar3 = this.b.U;
                                    if (hwVar3 != null) {
                                        hwVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i13 = i15;
                    } else if (i15 == 0) {
                        x3Var2.b(id.M0(2131746585, null), org.telegram.messenger.g0.I2(id.M0(2131746587, null), false, org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f)), new View.OnClickListener(this) { // from class: jg.p
                            public final /* synthetic */ h0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i18) {
                                    case 0:
                                        hw hwVar = this.b.U;
                                        if (hwVar != null) {
                                            hwVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        fw fwVar = ((yl0) this.b).K0;
                                        wl0 wl0Var = fwVar.x0;
                                        yl0 yl0Var = fwVar.d0;
                                        String str10 = yl0Var.D;
                                        ArrayList arrayList14 = yl0Var.y;
                                        int i25 = yl0Var.x;
                                        int i26 = yl0Var.w;
                                        ArrayList arrayList15 = wl0Var.Q;
                                        if (!TextUtils.equals(str10, wl0Var.a0)) {
                                            wl0Var.W();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            wl0Var.Y = i26;
                                            wl0Var.X = i26 > arrayList14.size();
                                            wl0Var.b0 = i25;
                                            wl0Var.a0 = str10;
                                            wl0Var.O(true);
                                        }
                                        fwVar.s0 = true;
                                        fwVar.v0.h1(0, 0);
                                        fwVar.S();
                                        k61 k61Var = fwVar.M;
                                        if (k61Var != null && k61Var.getCurrentTabId() != 1) {
                                            fwVar.M.d(1, 1);
                                        }
                                        wl0Var.Z(fwVar.M0);
                                        break;
                                    case 2:
                                        hw hwVar2 = this.b.U;
                                        if (hwVar2 != null) {
                                            hwVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        hw hwVar3 = this.b.U;
                                        if (hwVar3 != null) {
                                            hwVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i13 = g.g(1, i15, arrayList6);
                    }
                    ArrayList arrayList14 = zVar.e;
                    ArrayList arrayList15 = zVar.j;
                    boolean O = O();
                    ArrayList arrayList16 = this.E;
                    if (O || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i13 >= L) {
                            if (i13 != L || !O()) {
                                if (i13 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    x3Var2.setText(id.M0(2131745826, null));
                                    break;
                                } else {
                                    i13 -= J();
                                }
                            } else if (!this.N) {
                                final int i25 = 2;
                                x3Var2.b(id.M0(2131746371, null), id.M0(2131752099, null), new View.OnClickListener(this) { // from class: jg.p
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                hw hwVar = this.b.U;
                                                if (hwVar != null) {
                                                    hwVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                fw fwVar = ((yl0) this.b).K0;
                                                wl0 wl0Var = fwVar.x0;
                                                yl0 yl0Var = fwVar.d0;
                                                String str10 = yl0Var.D;
                                                ArrayList arrayList142 = yl0Var.y;
                                                int i252 = yl0Var.x;
                                                int i26 = yl0Var.w;
                                                ArrayList arrayList152 = wl0Var.Q;
                                                if (!TextUtils.equals(str10, wl0Var.a0)) {
                                                    wl0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    wl0Var.Y = i26;
                                                    wl0Var.X = i26 > arrayList142.size();
                                                    wl0Var.b0 = i252;
                                                    wl0Var.a0 = str10;
                                                    wl0Var.O(true);
                                                }
                                                fwVar.s0 = true;
                                                fwVar.v0.h1(0, 0);
                                                fwVar.S();
                                                k61 k61Var = fwVar.M;
                                                if (k61Var != null && k61Var.getCurrentTabId() != 1) {
                                                    fwVar.M.d(1, 1);
                                                }
                                                wl0Var.Z(fwVar.M0);
                                                break;
                                            case 2:
                                                hw hwVar2 = this.b.U;
                                                if (hwVar2 != null) {
                                                    hwVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                hw hwVar3 = this.b.U;
                                                if (hwVar3 != null) {
                                                    hwVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i26 = 3;
                                x3Var2.b(id.M0(2131746371, null), id.M0(2131752101, null), new View.OnClickListener(this) { // from class: jg.p
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                hw hwVar = this.b.U;
                                                if (hwVar != null) {
                                                    hwVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                fw fwVar = ((yl0) this.b).K0;
                                                wl0 wl0Var = fwVar.x0;
                                                yl0 yl0Var = fwVar.d0;
                                                String str10 = yl0Var.D;
                                                ArrayList arrayList142 = yl0Var.y;
                                                int i252 = yl0Var.x;
                                                int i262 = yl0Var.w;
                                                ArrayList arrayList152 = wl0Var.Q;
                                                if (!TextUtils.equals(str10, wl0Var.a0)) {
                                                    wl0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    wl0Var.Y = i262;
                                                    wl0Var.X = i262 > arrayList142.size();
                                                    wl0Var.b0 = i252;
                                                    wl0Var.a0 = str10;
                                                    wl0Var.O(true);
                                                }
                                                fwVar.s0 = true;
                                                fwVar.v0.h1(0, 0);
                                                fwVar.S();
                                                k61 k61Var = fwVar.M;
                                                if (k61Var != null && k61Var.getCurrentTabId() != 1) {
                                                    fwVar.M.d(1, 1);
                                                }
                                                wl0Var.Z(fwVar.M0);
                                                break;
                                            case 2:
                                                hw hwVar2 = this.b.U;
                                                if (hwVar2 != null) {
                                                    hwVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                hw hwVar3 = this.b.U;
                                                if (hwVar3 != null) {
                                                    hwVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            x3Var2.setText(id.M0(2131752237, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = zVar.d.size();
                    int size10 = arrayList15.size();
                    if (size10 > 3 && this.H0) {
                        size10 = 3;
                    }
                    int size11 = arrayList14.size();
                    if (size11 > 3 && this.G0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList14.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList17 = this.I;
                    if (!arrayList17.isEmpty()) {
                        arrayList17.size();
                    }
                    int i27 = size13;
                    if (this.c != e0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i14 = 1;
                        str5 = null;
                        str6 = null;
                    } else {
                        if (i13 == 0) {
                            str5 = null;
                            str8 = id.M0(2131743997, null);
                        } else {
                            str5 = null;
                            str8 = null;
                        }
                        i14 = 1;
                        i13 = g.g(1, i13, arrayList7);
                        str6 = str8;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i13 == 0) {
                            str6 = id.M0(2131749108, str5);
                        }
                        i13 = g.g(i14, i13, arrayList16);
                    }
                    if (str6 == null) {
                        int i28 = i13 - (size8 + size9);
                        if (i28 < 0 || i28 >= size10) {
                            int i29 = i28 - size10;
                            if (i29 < 0 || i29 >= size12) {
                                x3Var = x3Var2;
                                r83 = null;
                                if (this.U == null || i27 <= 0 || i29 - size12 > 1) {
                                    this.F0 = i29;
                                    SpannableStringBuilder H4 = H(this.c);
                                    final int i30 = 1;
                                    Object obj3 = new Runnable(this) { // from class: jg.q
                                        public final /* synthetic */ h0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i30) {
                                                case 0:
                                                    h0 h0Var = this.b;
                                                    boolean z18 = h0Var.H0;
                                                    h0Var.H0 = !z18;
                                                    x3Var.setRightText(id.M0(!z18 ? 2131745342 : 2131745343, null));
                                                    h0Var.f();
                                                    break;
                                                default:
                                                    h0 h0Var2 = this.b;
                                                    ww wwVar = h0Var2.r0;
                                                    x3 x3Var3 = x3Var;
                                                    k60 H5 = k60.H(wwVar, x3Var3);
                                                    for (e0 e0Var : e0.values()) {
                                                        boolean z19 = e0Var.a == h0Var2.c.a;
                                                        H5.i(new aa.d0(h0Var2, z19, x3Var3, e0Var, 5), id.M0(e0Var.b, null), z19);
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
                                    str6 = id.M0(2131745759, null);
                                    spannableStringBuilder = H4;
                                    obj2 = obj3;
                                    z16 = false;
                                    r02 = obj2;
                                } else {
                                    TLRPC.Chat M05 = qp.s1(i17).M0(Long.valueOf(-this.U.a()));
                                    if (M05 == null) {
                                        str7 = "null";
                                        c10 = 0;
                                    } else if (M05.monoforum) {
                                        c10 = 0;
                                        str7 = qg.d.i(i17, M05, false);
                                    } else {
                                        c10 = 0;
                                        str7 = M05.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = str7;
                                    str6 = id.a0(null, null, 2131745747, objArr);
                                }
                            } else {
                                r83 = null;
                                str6 = id.M0(2131749536, null);
                                if (zVar.e.size() > 3) {
                                    z16 = this.G0;
                                    x3Var = x3Var2;
                                    spannableStringBuilder = null;
                                    r02 = new ai.a1(this, arrayList14, i7, x3Var, 7);
                                } else {
                                    x3Var = x3Var2;
                                }
                            }
                        } else {
                            str6 = id.M0(2131747284, null);
                            if (arrayList15.size() > 3) {
                                boolean z18 = this.H0;
                                final int i31 = 0;
                                Runnable runnable2 = new Runnable(this) { // from class: jg.q
                                    public final /* synthetic */ h0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i31) {
                                            case 0:
                                                h0 h0Var = this.b;
                                                boolean z182 = h0Var.H0;
                                                h0Var.H0 = !z182;
                                                x3Var2.setRightText(id.M0(!z182 ? 2131745342 : 2131745343, null));
                                                h0Var.f();
                                                break;
                                            default:
                                                h0 h0Var2 = this.b;
                                                ww wwVar = h0Var2.r0;
                                                x3 x3Var3 = x3Var2;
                                                k60 H5 = k60.H(wwVar, x3Var3);
                                                for (e0 e0Var : e0.values()) {
                                                    boolean z19 = e0Var.a == h0Var2.c.a;
                                                    H5.i(new aa.d0(h0Var2, z19, x3Var3, e0Var, 5), id.M0(e0Var.b, null), z19);
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
                                z16 = z18;
                                runnable = runnable2;
                                spannableStringBuilder = null;
                            } else {
                                x3Var = x3Var2;
                                runnable = null;
                                spannableStringBuilder = null;
                                z16 = false;
                            }
                            r83 = null;
                            r02 = runnable;
                        }
                        if (r02 == 0) {
                            if (spannableStringBuilder == null) {
                                x3Var.b(str6, id.M0(z16 ? 2131745342 : 2131745343, r83), new z6(3, r02));
                                x3Var.setRightTextMargin(16);
                                break;
                            } else {
                                x3Var.b(str6, spannableStringBuilder, new z6(4, r02));
                                x3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            x3Var.setText(str6);
                            break;
                        }
                    } else {
                        x3Var = x3Var2;
                        r83 = null;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = r83;
                    spannableStringBuilder = spannableStringBuilder4;
                    obj2 = spannableStringBuilder4;
                    z16 = false;
                    r02 = obj2;
                    if (r02 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                t2 t2Var = (t2) view;
                r6.i(k6.d6, t2Var, null);
                t2Var.s2 = i15 != b() - 1;
                ij ijVar = (ij) I(i15);
                t2Var.O = arrayList3.contains(ijVar);
                if (ijVar != null) {
                    t2Var.d0(ij.B0(ijVar.k), ijVar, ijVar.k.date, false, false);
                    break;
                } else {
                    t2Var.d0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ja) view).setTopic((TLRPC.TL_forumTopic) I(i15));
                break;
            case 5:
                m4 m4Var = (m4) view;
                r6.i(k6.d6, m4Var, null);
                m4Var.setText((CharSequence) arrayList4.get(i15 - 1));
                m4Var.setNeedDivider(i15 != arrayList4.size());
                break;
            case 6:
                ((c0) ((pj0) view).getAdapter()).f();
                break;
            case 7:
                String str10 = (String) I(i15);
                m8 m8Var = (m8) view;
                m8Var.g(-1, k6.o6);
                m8Var.k(id.a0("AddContactByPhone", null, 2131754452, pf.b.c().b("+" + str10)), false);
                break;
            case 8:
                g6 g6Var2 = (g6) view;
                d5 d5Var = (d5) I(i15);
                g6Var2.x(d5Var, null, g5.m(0, d5Var.i, d5Var.j), k5.i(new StringBuilder("+"), (String) d5Var.g.get(0), pf.b.c()), false, false);
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10 = this.h0;
        int i11 = 1;
        f6 f6Var = null;
        Context context = this.e;
        switch (i7) {
            case 0:
                g6 g6Var = new g6(context, null);
                g6Var.l0 = i10 == 3;
                view = g6Var;
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
                mz mzVar = new mz(context, null);
                mzVar.setViewType(1);
                mzVar.setIsSingleCell(true);
                view2 = mzVar;
                break;
            case 5:
                m4 m4Var = new m4(context);
                m4Var.setGravity(16);
                m4Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                m4Var.setTextSize(1, 17.0f);
                r6.V(m4Var, k6.G6, null);
                view2 = m4Var;
                break;
            case 6:
                e61 e61Var = new e61(2, context, f6Var);
                r6.m(e61Var, 20, k6.i6, null);
                e61Var.setTag(9);
                e61Var.setItemAnimator(null);
                e61Var.setLayoutAnimation(null);
                b0 b0Var = new b0((int) (false ? 1 : 0));
                b0Var.j1(0);
                e61Var.setLayoutManager(b0Var);
                e61Var.setAdapter(new c0(this.s0, this.e, null, false, i10 == 3));
                e61Var.setOnItemClickListener(new ai.k(this, 14));
                e61Var.setOnItemLongClickListener(new t(this));
                this.k0 = e61Var;
                view = e61Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new m8(16, context, false);
                break;
            case 8:
                view2 = new g6(context, null);
                break;
            case 10:
                w wVar = new w(this, i11);
                c61 c61Var = new c61(context, 5);
                c61Var.setOrientation(1);
                l9 l9Var = new l9(context);
                l9Var.setImageDrawable(new zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                c61Var.addView(l9Var, ha.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i12 = k6.G6;
                r6.V(textView, i12, null);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(id.M0(2131745752, null));
                textView.setGravity(17);
                c61Var.addView(textView, ha.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                c61Var.b = textView2;
                textView2.setTextSize(1, 14.0f);
                r6.V(textView2, i12, null);
                textView2.setText(id.a0(null, null, 2131745753, ""));
                textView2.setGravity(17);
                c61Var.addView(textView2, ha.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                g.v(textView3, 1, 14.0f, null, 2131745754);
                int i13 = k6.Ci;
                r6.V(textView3, i13, null);
                int r12 = k6.r1(0.15f, k6.v0(i13));
                org.telegram.ui.Cells.y k02 = k6.k0(6, 6, 6, 6, 0, r12, r12);
                n6 L = r6.L(0.15f, i13);
                textView3.setBackground(k02);
                r6.k(textView3, k02, null, L, null);
                textView3.setOnClickListener(new ii.g(wVar, 4));
                c61Var.addView(textView3, ha.t(-2, -2, 1, 0, 0, 0, 38));
                this.E0 = c61Var;
                textView2.setText(id.a0(null, null, 2131745753, this.Z));
                view2 = c61Var;
                break;
        }
        if (i7 == 5) {
            view2.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            view2.setLayoutParams(new v4.o0(-1, -2));
        }
        return new xi0(view2);
    }
}
