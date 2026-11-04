package kg;

import ai.e3;
import ai.j6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.mf;
import ci.s9;
import ci.u8;
import gi.j8;
import gi.q4;
import gi.v5;
import ii.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.p5;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.cw;
import org.telegram.ui.du;
import org.telegram.ui.ew;
import org.telegram.ui.nz;
import org.telegram.ui.s51;
import org.telegram.ui.u51;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class e0 extends sj0 {
    public boolean A0;
    public nz B0;
    public int C0;
    public int D0;
    public String E;
    public int E0;
    public s51 F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public String N;
    public boolean O;
    public int Q;
    public String S;
    public int T;
    public int U;
    public ew V;
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
    public final u4.k j0;
    public final w k0;
    public u51 l0;
    public final long m0;
    public long o0;
    public View p0;
    public ii.e q0;
    public e3 r;
    public ArrayList r0;
    public final uw s0;
    public final int t0;
    public ArrayList u0;
    public final ArrayList v0;
    public int w;
    public final ArrayList w0;
    public int x;
    public String x0;
    public a0.h y0;
    public final ArrayList z0;
    public b0 c = b0.d;
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

    public e0(Context context, uw uwVar, int i3, int i10, u4.k kVar, boolean z10) {
        int i11 = h10.t0;
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
        this.s0 = uwVar;
        bm0 bm0Var = (bm0) this;
        w wVar = new w(bm0Var);
        this.k0 = wVar;
        wVar.a = new v5(bm0Var, 7);
        wVar.p = z10;
        this.e = context;
        this.W = i3;
        this.i0 = i10;
        this.m0 = h10.i(i11).e();
        if (i10 != 15) {
            qr.a0(i11).a.c(new k2.u(i11, i10, new r(this), 2));
        }
        li.b0(i11).M0(true);
    }

    public static boolean X(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i3 = 0; i3 < split.length; i3++) {
                String str3 = split[i3];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i3]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 1 || i3 == 4 || i3 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb2;
        boolean z10 = this.O;
        ArrayList arrayList = this.v0;
        ArrayList arrayList2 = this.w0;
        if (z10) {
            sb2 = null;
            while (arrayList2.size() > 0) {
                d0 d0Var = (d0) arrayList2.remove(0);
                this.u0.remove(d0Var);
                arrayList.remove(d0Var);
                this.y0.l(d0Var.c);
                if (sb2 == null) {
                    sb2 = new StringBuilder("did IN (");
                    sb2.append(d0Var.c);
                } else {
                    sb2.append(", ");
                    sb2.append(d0Var.c);
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
        int i3 = this.t0;
        if (z11) {
            qr.a0(i3).a.c(new ii.e(14, (bm0) this, sb2));
        } else {
            qr.a0(i3).a.c(new i2(i3, 1));
        }
    }

    public final boolean F(Object obj) {
        if (this.i0 != 14) {
            return true;
        }
        boolean z10 = obj instanceof TLRPC.User;
        uw uwVar = this.s0;
        if (z10) {
            return ((TLRPC.User) obj).bot ? uwVar.B2 : uwVar.A2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return t3.T(chat) ? uwVar.z2 : t3.n0(chat) ? uwVar.w2 || uwVar.x2 : uwVar.w2 || uwVar.y2;
    }

    public final void G(String str) {
        ew ewVar;
        String str2;
        String str3;
        this.x0 = str;
        ArrayList arrayList = this.w0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.v0;
            arrayList2.clear();
            int size = this.u0.size();
            for (int i3 = 0; i3 < size; i3++) {
                ew ewVar2 = this.V;
                if ((ewVar2 == null || ewVar2.a() != ((d0) this.u0.get(i3)).c) && F(((d0) this.u0.get(i3)).a)) {
                    arrayList2.add((d0) this.u0.get(i3));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.u0.size();
        for (int i10 = 0; i10 < size2; i10++) {
            d0 d0Var = (d0) this.u0.get(i10);
            if (d0Var != null && d0Var.a != null && (((ewVar = this.V) == null || ewVar.a() != d0Var.c) && F(((d0) this.u0.get(i10)).a))) {
                TLObject tLObject = d0Var.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? rg.c.i(this.t0, chat, false) : chat.title;
                    str3 = ((TLRPC.Chat) d0Var.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = l10.p((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) d0Var.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && X(str2.toLowerCase(), lowerCase)) || (str3 != null && X(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(d0Var);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(b0 b0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(b0Var.c, null));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new wp(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object I(int i3) {
        int i10;
        int i11;
        TLRPC.Chat M0;
        int i12;
        ArrayList arrayList = this.y;
        if (!arrayList.isEmpty()) {
            if (i3 > 0 && i3 - 1 < arrayList.size()) {
                return arrayList.get(i12);
            }
            i3 = k2.p1.f(1, i3, arrayList);
        }
        ArrayList arrayList2 = this.K;
        if (!arrayList2.isEmpty()) {
            if (i3 > 0) {
                return arrayList2.get(i3 - 1);
            }
            return null;
        }
        if (O()) {
            ?? L = L();
            ArrayList arrayList3 = this.O ? this.w0 : this.v0;
            if (i3 > L && (i11 = (i3 - 1) - (L == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((d0) arrayList3.get(i11)).a;
                boolean z10 = tLObject instanceof TLRPC.User;
                int i13 = this.t0;
                if (!z10) {
                    return (!(tLObject instanceof TLRPC.Chat) || (M0 = hp.s1(i13).M0(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : M0;
                }
                TLRPC.User a22 = hp.s1(i13).a2(Long.valueOf(((TLRPC.User) tLObject).id));
                return a22 != null ? a22 : tLObject;
            }
            i3 -= J();
        }
        ArrayList arrayList4 = this.G;
        if (!arrayList4.isEmpty()) {
            if (i3 > 0 && i3 <= arrayList4.size()) {
                return arrayList4.get(i3 - 1);
            }
            i3 = k2.p1.f(1, i3, arrayList4);
        }
        ArrayList arrayList5 = this.F;
        if (!arrayList5.isEmpty()) {
            if (i3 > 0 && i3 <= arrayList5.size()) {
                return arrayList5.get(i3 - 1);
            }
            i3 = k2.p1.f(1, i3, arrayList5);
        }
        w wVar = this.k0;
        ArrayList arrayList6 = wVar.e;
        ArrayList arrayList7 = wVar.d;
        ArrayList arrayList8 = wVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (J() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i3 == 0) {
                return null;
            }
            i3--;
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
        if (i3 >= 0 && i3 < size) {
            return this.s.get(i3);
        }
        int i16 = i3 - size;
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
        int i3 = size + size2 + size3;
        return size2 + size3 > 0 ? (J() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i3 : i3 + 1 : i3;
    }

    public final boolean L() {
        if (this.O || li.b0(this.t0).j1.isEmpty()) {
            return false;
        }
        return this.i0 != 14 || this.s0.A2;
    }

    public final boolean M() {
        return R() && J() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean N(int i3) {
        int i10;
        int i11;
        if (this.O && this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                i3 = k2.p1.f(1, i3, arrayList);
            }
            if (O()) {
                ?? L = L();
                ArrayList arrayList2 = this.O ? this.w0 : this.v0;
                if (i3 <= L || (i3 - 1) - (L == true ? 1 : 0) >= arrayList2.size()) {
                    i3 -= J();
                }
            }
            w wVar = this.k0;
            ArrayList arrayList3 = wVar.e;
            ArrayList arrayList4 = wVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = wVar.j.size();
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
                if (i3 < 0 || i3 >= size6) {
                    i3 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (J() > 0 || !this.G.isEmpty() || !arrayList.isEmpty())) {
                if (i3 != 0) {
                    i3--;
                }
            }
            if ((i3 < 0 || i3 >= size) && (((i10 = i3 - size) < 0 || i10 >= size2) && ((i11 = i10 - size2) <= 0 || i11 >= size3))) {
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
                    if (this.c != b0.d || this.d) {
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
            ew ewVar = this.V;
            if (ewVar == null || ewVar.a() == 0 || this.Y) {
                V(this.h0, this.a0);
            } else {
                U(this.h0, this.a0);
            }
        }
    }

    public final void Q(long j10, TLObject tLObject) {
        d0 d0Var = (d0) this.y0.f(j10);
        if (d0Var == null) {
            d0Var = new d0();
            this.y0.k(d0Var, j10);
        } else {
            this.u0.remove(d0Var);
        }
        this.u0.add(0, d0Var);
        d0Var.c = j10;
        d0Var.a = tLObject;
        d0Var.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.N;
        G(str != null ? str.trim() : null);
        f();
        int i3 = this.t0;
        qr.a0(i3).a.c(new s9(i3, j10, 2));
    }

    public final boolean R() {
        int i3 = this.i0;
        return (i3 == 2 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 1 || i3 == 11 || i3 == 15) ? false : true;
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
    public final void T(int i3, String str) {
        String str2;
        if (str != null && str.equals(this.N) && (i3 == this.D0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.N = str;
        this.D0 = i3;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        n nVar = this.h;
        if (nVar != null) {
            org.telegram.messenger.g0.r(nVar);
            this.h = null;
        }
        e3 e3Var = this.r;
        if (e3Var != null) {
            org.telegram.messenger.g0.r(e3Var);
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
            if (trim == null || trim.length() < 4 || (h10.i(this.t0).q() && hp.s1(this.t0).E2())) {
                this.S = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.S = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.T = ConnectionsManager.getInstance(this.t0).sendRequest(tL_contacts_getSponsoredPeers, new ci.d0((bm0) this, 13));
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
                w wVar = this.k0;
                boolean z10 = i10 != 11;
                boolean z11 = i10 != 11;
                boolean z12 = i10 == 2 || i10 == 11;
                boolean z13 = i10 == 0;
                ew ewVar = this.V;
                wVar.h(null, true, true, z10, z11, z12, 0L, z13, 0, 0, ewVar != null ? ewVar.a() : 0L, null);
            }
            this.O = false;
            this.e0 = 0;
            this.E0 = 0;
            this.H0 = true;
            this.I0 = true;
            ew ewVar2 = this.V;
            if (ewVar2 != null) {
                ewVar2.d(false, true);
            }
            if (this.i0 != 15) {
                W(null);
                V(0, null);
                U(0, null);
            }
            f();
            this.z0.clear();
            this.A0 = false;
            nz nzVar = this.B0;
            if (nzVar != null) {
                ((du) nzVar).j(false, null, this.z0, false);
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
            w wVar2 = this.k0;
            if (wVar2.s) {
                this.J.clear();
                this.K.clear();
                ArrayList arrayList = this.k0.q;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    this.K.add(((t1) arrayList.get(i11)).a);
                }
                this.H0 = true;
                this.I0 = true;
                this.E0 = 0;
                f();
                ew ewVar3 = this.V;
                if (ewVar3 != null) {
                    ewVar3.d(false, false);
                }
            } else {
                qr.a0(wVar2.m).a.c(new s1(wVar2, 1));
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
        ew ewVar4 = this.V;
        if (ewVar4 != null) {
            ewVar4.d(true, false);
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
                bm0 bm0Var = (bm0) this;
                n nVar2 = new n(bm0Var, trim, i12, str, 0);
                this.f = nVar2;
                p5Var.e(nVar2, 300L);
                if (str2 == null) {
                    this.E0++;
                    e3 e3Var2 = new e3(bm0Var, i12, str2, 19);
                    this.r = e3Var2;
                    org.telegram.messenger.g0.i3(e3Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        p5 p5Var2 = Utilities.g;
        bm0 bm0Var2 = (bm0) this;
        n nVar22 = new n(bm0Var2, trim, i12, str, 0);
        this.f = nVar22;
        p5Var2.e(nVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void U(int i3, String str) {
        ew ewVar = this.V;
        if (ewVar == null || ewVar.a() == 0 || this.W == 0) {
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
        tL_messages_search.peer = hp.s1(i11).j1(a10);
        if (str.equals(this.a0) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.a0 = str;
        int i12 = 1 + this.U;
        this.U = i12;
        this.R = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_search, new q(i12, i3, 0, this, str, tL_messages_search), 2);
    }

    public final void V(int i3, String str) {
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
                    zi ziVar = (zi) k2.p1.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = ziVar.f1();
                    tL_messages_searchGlobal.offset_rate = this.d0;
                    tL_messages_searchGlobal.offset_peer = hp.s1(i11).j1(zi.C1(ziVar.k.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.a0 = str;
                this.b0 = this.c.a;
                int i13 = this.Q + 1;
                this.Q = i13;
                this.P = ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new q(i13, i3, 1, this, str, tL_messages_searchGlobal), 2);
                return;
            }
            int i14 = this.E0 - 1;
            this.E0 = i14;
            ew ewVar = this.V;
            if (ewVar != null) {
                ewVar.d(i14 > 0, true);
                this.V.c();
            }
        }
    }

    public final void W(String str) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        ew ewVar = this.V;
        if (ewVar == null || ewVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList l10 = hp.s1(this.t0).q7.l(-this.V.a());
            String trim = str.trim();
            for (int i3 = 0; i3 < l10.size(); i3++) {
                if (l10.get(i3) != null && ((TLRPC.TL_forumTopic) l10.get(i3)).title.toLowerCase().contains(trim)) {
                    arrayList.add((TLRPC.TL_forumTopic) l10.get(i3));
                    ((TLRPC.TL_forumTopic) l10.get(i3)).searchQuery = trim;
                }
            }
        }
        f();
    }

    @Override // u4.h0
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
        w wVar = this.k0;
        int size3 = wVar.d.size();
        int i3 = size + size2 + size3;
        int size4 = wVar.e.size();
        if (size4 > 3 && this.H0) {
            size4 = 3;
        }
        int size5 = this.L.size() + size4;
        int size6 = wVar.j.size();
        if (size6 > 3 && this.I0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (J() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i3++;
        }
        if (size5 != 0) {
            i3 += size5 + 1;
        }
        if (size6 != 0) {
            i3 += size6;
        }
        ArrayList arrayList5 = this.I;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i3 += size7 + 1 + (!this.Y ? 1 : 0);
        }
        if (!this.Y) {
            this.Z = i3;
        }
        ArrayList arrayList6 = this.J;
        int size8 = arrayList6.size();
        if ((this.c != b0.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i10 = (arrayList5.isEmpty() || this.Y) ? size8 : 0;
        if (i10 != 0) {
            i3 += i10 + 1 + (!this.X ? 1 : 0);
        }
        if (this.Y) {
            this.Z = i3;
        }
        this.C0 = i3;
        return i3;
    }

    @Override // u4.h0
    public final long c(int i3) {
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i3) {
        int i10;
        if (this.K.isEmpty()) {
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (i3 != 0) {
                    int i11 = i3 - 1;
                    if (i11 < arrayList.size()) {
                        return 9;
                    }
                    i3 = i11 - arrayList.size();
                }
            }
            if (O()) {
                ?? L = L();
                if (i3 < L) {
                    return 6;
                }
                if (i3 != L) {
                    if (i3 >= J()) {
                        i3 -= J();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.G;
            if (!arrayList2.isEmpty()) {
                if (i3 != 0) {
                    if (i3 <= arrayList2.size()) {
                        return 3;
                    }
                    i3 = k2.p1.f(1, i3, arrayList2);
                }
            }
            ArrayList arrayList3 = this.F;
            if (!arrayList3.isEmpty()) {
                if (i3 != 0) {
                    if (i3 <= arrayList3.size()) {
                        return 8;
                    }
                    i3 = k2.p1.f(1, i3, arrayList3);
                }
            }
            w wVar = this.k0;
            ArrayList arrayList4 = wVar.e;
            int size = this.s.size();
            int size2 = wVar.d.size();
            if (size + size2 > 0 && (J() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i3 != 0) {
                    i3--;
                }
            }
            int size3 = wVar.j.size();
            if (size3 > 3 && this.I0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i12 = (size4 <= 3 || !this.H0) ? size4 : 3;
            ArrayList arrayList5 = this.L;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i12 + 1;
            ArrayList arrayList6 = this.J;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            b0 b0Var = this.c;
            b0 b0Var2 = b0.d;
            if ((b0Var != b0Var2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.I;
            if (!arrayList7.isEmpty() && !this.Y) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i3 < 0 || i3 >= size) && ((i10 = i3 - size) < 0 || i10 >= size2)) {
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
                                    return (this.c == b0Var2 || !arrayList6.isEmpty()) ? 2 : 10;
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
        if (i3 != 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:342:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x074a  */
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        boolean z10;
        ArrayList<TLRPC.TL_username> arrayList;
        TLRPC.User user;
        String str;
        TLRPC.Chat chat;
        ?? r82;
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
        ?? r83;
        SpannableStringBuilder spannableStringBuilder;
        Object obj2;
        boolean z17;
        ?? r02;
        char c2;
        String str7;
        Runnable runnable;
        String str8;
        int i14 = i3;
        int i15 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList3 = this.I;
        ArrayList arrayList4 = this.K;
        ArrayList arrayList5 = this.L;
        ArrayList arrayList6 = this.y;
        ArrayList arrayList7 = this.G;
        w wVar = this.k0;
        int i16 = this.t0;
        final int i17 = 1;
        switch (i15) {
            case 0:
                f6 f6Var = (f6) view;
                r6.i(k6.d6, f6Var, null);
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
                    long o10 = m5.o(tL_sponsoredPeer2.peer);
                    if (o10 >= 0) {
                        user2 = hp.s1(i16).a2(Long.valueOf(o10));
                        if (user2 != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                            q10 = m5.q(this.c0, user2);
                            arrayList2 = arrayList8;
                            chat3 = null;
                            j10 = dialogId;
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
                            j10 = dialogId;
                            str = q10;
                            user = user2;
                            arrayList = arrayList2;
                            z10 = z16;
                            chat = chat3;
                        }
                    } else {
                        TLRPC.Chat M0 = hp.s1(i16).M0(Long.valueOf(-o10));
                        if (M0 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = M0.usernames;
                            q10 = m5.q(this.c0, M0);
                            arrayList2 = arrayList9;
                            chat3 = M0;
                            user2 = null;
                            j10 = dialogId;
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
                            j10 = dialogId;
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
                        i14 = k2.p1.f(1, i14, arrayList6);
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
                        i14 = k2.p1.f(1, i14, arrayList7);
                    }
                    ArrayList arrayList10 = wVar.e;
                    int i18 = i14;
                    ArrayList arrayList11 = wVar.j;
                    int size3 = this.s.size();
                    int size4 = wVar.d.size();
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
                        String n4 = l10.n(user);
                        if (charSequence == null || user == null || n4 == null || !charSequence.toString().startsWith("@".concat(n4))) {
                            charSequence2 = charSequence;
                            charSequence = null;
                            if (charSequence == null) {
                                String str9 = z12 ? this.x0 : wVar.c;
                                if (!TextUtils.isEmpty(str9)) {
                                    String m10 = user != null ? g5.m(0, user.first_name, user.last_name) : r82 != 0 ? r82.monoforum ? rg.c.i(i16, r82, false) : r82.title : null;
                                    if (m10 == null || (A12 = org.telegram.messenger.g0.A1(m10, str9)) == -1) {
                                        charSequence3 = charSequence;
                                        charSequence2 = charSequence2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                                        charSequence3 = charSequence;
                                        spannableStringBuilder2.setSpan(new tz(k6.q6, null), A12, str9.length() + A12, 33);
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
                                                        spannableStringBuilder3.setSpan(new tz(k6.q6, null), A1, length + A1, 33);
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
                                                charSequence5 = bd.M0(2131745911, null);
                                            } else {
                                                tL_sponsoredPeer = null;
                                                charSequence4 = charSequence3;
                                                z13 = false;
                                                charSequence5 = charSequence2;
                                            }
                                            CharSequence charSequence7 = charSequence5;
                                            if (r82 != 0 || r82.participants_count == 0) {
                                                if (user != null && user.bot && (i11 = user.bot_active_users) != 0) {
                                                    String H = bd.H(' ', "BotUsersShort", i11);
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
                                                String H2 = (!t3.T(r82) || r82.megagroup) ? bd.H(' ', "Members", r82.participants_count) : bd.H(' ', "Subscribers", r82.participants_count);
                                                if (charSequence4 instanceof SpannableStringBuilder) {
                                                    ((SpannableStringBuilder) charSequence4).append((CharSequence) ", ").append((CharSequence) H2);
                                                } else {
                                                    charSequence4 = !TextUtils.isEmpty(charSequence4) ? TextUtils.concat(charSequence4, ", ", H2) : H2;
                                                }
                                                charSequence6 = charSequence4;
                                                z14 = true;
                                                z15 = false;
                                            }
                                            j8 j8Var = new j8(this, 5);
                                            f6Var.C0 = z12;
                                            f6Var.D0 = j8Var;
                                            f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                                            if (z18) {
                                                tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                                            }
                                            f6Var.setAd(tL_sponsoredPeer);
                                            f6Var.x(user == null ? user : r82, encryptedChat, charSequence7, charSequence6, true, z13);
                                            f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
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
                                    if (r82 != 0) {
                                    }
                                    if (user != null) {
                                        String H3 = bd.H(' ', "BotUsersShort", i11);
                                        if (!(charSequence4 instanceof SpannableStringBuilder)) {
                                        }
                                    }
                                    z14 = true;
                                    z15 = false;
                                    charSequence6 = charSequence4;
                                    j8 j8Var2 = new j8(this, 5);
                                    f6Var.C0 = z12;
                                    f6Var.D0 = j8Var2;
                                    f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                                    if (z18) {
                                    }
                                    f6Var.setAd(tL_sponsoredPeer);
                                    f6Var.x(user == null ? user : r82, encryptedChat, charSequence72, charSequence6, true, z13);
                                    f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
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
                            if (r82 != 0) {
                            }
                            if (user != null) {
                            }
                            z14 = true;
                            z15 = false;
                            charSequence6 = charSequence4;
                            j8 j8Var22 = new j8(this, 5);
                            f6Var.C0 = z12;
                            f6Var.D0 = j8Var22;
                            f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                            if (z18) {
                            }
                            f6Var.setAd(tL_sponsoredPeer);
                            f6Var.x(user == null ? user : r82, encryptedChat, charSequence722, charSequence6, true, z13);
                            f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
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
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    j8 j8Var222 = new j8(this, 5);
                    f6Var.C0 = z12;
                    f6Var.D0 = j8Var222;
                    f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                    if (z18) {
                    }
                    f6Var.setAd(tL_sponsoredPeer);
                    f6Var.x(user == null ? user : r82, encryptedChat, charSequence7222, charSequence6, true, z13);
                    f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
                } else {
                    if (I instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) I;
                        ArrayList<TLRPC.TL_username> arrayList13 = user3.usernames;
                        j10 = dialogId;
                        str = m5.q(this.c0, user3);
                        z10 = N;
                        encryptedChat = null;
                        user = user3;
                        arrayList = arrayList13;
                        r82 = 0;
                    } else if (I instanceof TLRPC.Chat) {
                        TLRPC.Chat chat4 = (TLRPC.Chat) I;
                        j10 = dialogId;
                        TLRPC.Chat M02 = hp.s1(i16).M0(Long.valueOf(chat4.id));
                        TLRPC.Chat chat5 = M02 == null ? chat4 : M02;
                        arrayList = chat5.usernames;
                        str = m5.q(this.c0, chat5);
                        chat = chat5;
                        z10 = N;
                        user = null;
                    } else {
                        j10 = dialogId;
                        if (I instanceof TLRPC.EncryptedChat) {
                            TLRPC.EncryptedChat a12 = hp.s1(i16).a1(Integer.valueOf(((TLRPC.EncryptedChat) I).id));
                            z10 = N;
                            str = null;
                            r82 = 0;
                            encryptedChat = a12;
                            user = hp.s1(i16).a2(Long.valueOf(a12.user_id));
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
                    ArrayList arrayList102 = wVar.e;
                    int i182 = i14;
                    ArrayList arrayList112 = wVar.j;
                    int size32 = this.s.size();
                    int size42 = wVar.d.size();
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
                    if (r82 != 0) {
                    }
                    if (user != null) {
                    }
                    z14 = true;
                    z15 = false;
                    charSequence6 = charSequence4;
                    j8 j8Var2222 = new j8(this, 5);
                    f6Var.C0 = z12;
                    f6Var.D0 = j8Var2222;
                    f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                    if (z18) {
                    }
                    f6Var.setAd(tL_sponsoredPeer);
                    f6Var.x(user == null ? user : r82, encryptedChat, charSequence72222, charSequence6, true, z13);
                    f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
                }
                encryptedChat = null;
                r82 = chat;
                if (arrayList6.isEmpty()) {
                }
                if (O()) {
                }
                if (arrayList7.isEmpty()) {
                }
                ArrayList arrayList1022 = wVar.e;
                int i1822 = i14;
                ArrayList arrayList1122 = wVar.j;
                int size322 = this.s.size();
                int size422 = wVar.d.size();
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
                if (r82 != 0) {
                }
                if (user != null) {
                }
                z14 = true;
                z15 = false;
                charSequence6 = charSequence4;
                j8 j8Var22222 = new j8(this, 5);
                f6Var.C0 = z12;
                f6Var.D0 = j8Var22222;
                f6Var.setOnSponsoredOptionsClick(new q4(this, 14));
                if (z18) {
                }
                f6Var.setAd(tL_sponsoredPeer);
                f6Var.x(user == null ? user : r82, encryptedChat, charSequence722222, charSequence6, true, z13);
                f6Var.w(this.V.a.J2.contains(Long.valueOf(f6Var.getDialogId())), j10 != f6Var.getDialogId() ? z14 : z15);
                break;
            case 1:
                final x3 x3Var2 = (x3) view;
                if (!arrayList4.isEmpty()) {
                    String M03 = bd.M0(2131749349, null);
                    String M04 = bd.M0(2131752099, null);
                    final int i23 = r6 ? 1 : 0;
                    x3Var2.b(M03, M04, new View.OnClickListener(this) { // from class: kg.o
                        public final /* synthetic */ e0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    ew ewVar = this.b.V;
                                    if (ewVar != null) {
                                        ewVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    cw cwVar = ((bm0) this.b).L0;
                                    zl0 zl0Var = cwVar.y0;
                                    bm0 bm0Var = cwVar.e0;
                                    String str10 = bm0Var.E;
                                    ArrayList arrayList14 = bm0Var.y;
                                    int i24 = bm0Var.x;
                                    int i25 = bm0Var.w;
                                    ArrayList arrayList15 = zl0Var.R;
                                    if (!TextUtils.equals(str10, zl0Var.b0)) {
                                        zl0Var.W();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        zl0Var.Z = i25;
                                        zl0Var.Y = i25 > arrayList14.size();
                                        zl0Var.c0 = i24;
                                        zl0Var.b0 = str10;
                                        zl0Var.O(true);
                                    }
                                    cwVar.t0 = true;
                                    cwVar.w0.h1(0, 0);
                                    cwVar.S();
                                    d61 d61Var = cwVar.N;
                                    if (d61Var != null && d61Var.getCurrentTabId() != 1) {
                                        cwVar.N.d(1, 1);
                                    }
                                    zl0Var.Z(cwVar.N0);
                                    break;
                                case 2:
                                    ew ewVar2 = this.b.V;
                                    if (ewVar2 != null) {
                                        ewVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    ew ewVar3 = this.b.V;
                                    if (ewVar3 != null) {
                                        ewVar3.b();
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
                        x3Var2.b(bd.M0(2131746592, null), org.telegram.messenger.g0.I2(bd.M0(2131746594, null), false, org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f)), new View.OnClickListener(this) { // from class: kg.o
                            public final /* synthetic */ e0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i17) {
                                    case 0:
                                        ew ewVar = this.b.V;
                                        if (ewVar != null) {
                                            ewVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        cw cwVar = ((bm0) this.b).L0;
                                        zl0 zl0Var = cwVar.y0;
                                        bm0 bm0Var = cwVar.e0;
                                        String str10 = bm0Var.E;
                                        ArrayList arrayList14 = bm0Var.y;
                                        int i24 = bm0Var.x;
                                        int i25 = bm0Var.w;
                                        ArrayList arrayList15 = zl0Var.R;
                                        if (!TextUtils.equals(str10, zl0Var.b0)) {
                                            zl0Var.W();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            zl0Var.Z = i25;
                                            zl0Var.Y = i25 > arrayList14.size();
                                            zl0Var.c0 = i24;
                                            zl0Var.b0 = str10;
                                            zl0Var.O(true);
                                        }
                                        cwVar.t0 = true;
                                        cwVar.w0.h1(0, 0);
                                        cwVar.S();
                                        d61 d61Var = cwVar.N;
                                        if (d61Var != null && d61Var.getCurrentTabId() != 1) {
                                            cwVar.N.d(1, 1);
                                        }
                                        zl0Var.Z(cwVar.N0);
                                        break;
                                    case 2:
                                        ew ewVar2 = this.b.V;
                                        if (ewVar2 != null) {
                                            ewVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        ew ewVar3 = this.b.V;
                                        if (ewVar3 != null) {
                                            ewVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = k2.p1.f(1, i14, arrayList6);
                    }
                    ArrayList arrayList14 = wVar.e;
                    ArrayList arrayList15 = wVar.j;
                    boolean O = O();
                    ArrayList arrayList16 = this.F;
                    if (O || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? L = L();
                        if (i12 >= L) {
                            if (i12 != L || !O()) {
                                if (i12 == J() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    x3Var2.setText(bd.M0(2131745833, null));
                                    break;
                                } else {
                                    i12 -= J();
                                }
                            } else if (!this.O) {
                                final int i24 = 2;
                                x3Var2.b(bd.M0(2131746378, null), bd.M0(2131752099, null), new View.OnClickListener(this) { // from class: kg.o
                                    public final /* synthetic */ e0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i24) {
                                            case 0:
                                                ew ewVar = this.b.V;
                                                if (ewVar != null) {
                                                    ewVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                cw cwVar = ((bm0) this.b).L0;
                                                zl0 zl0Var = cwVar.y0;
                                                bm0 bm0Var = cwVar.e0;
                                                String str10 = bm0Var.E;
                                                ArrayList arrayList142 = bm0Var.y;
                                                int i242 = bm0Var.x;
                                                int i25 = bm0Var.w;
                                                ArrayList arrayList152 = zl0Var.R;
                                                if (!TextUtils.equals(str10, zl0Var.b0)) {
                                                    zl0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    zl0Var.Z = i25;
                                                    zl0Var.Y = i25 > arrayList142.size();
                                                    zl0Var.c0 = i242;
                                                    zl0Var.b0 = str10;
                                                    zl0Var.O(true);
                                                }
                                                cwVar.t0 = true;
                                                cwVar.w0.h1(0, 0);
                                                cwVar.S();
                                                d61 d61Var = cwVar.N;
                                                if (d61Var != null && d61Var.getCurrentTabId() != 1) {
                                                    cwVar.N.d(1, 1);
                                                }
                                                zl0Var.Z(cwVar.N0);
                                                break;
                                            case 2:
                                                ew ewVar2 = this.b.V;
                                                if (ewVar2 != null) {
                                                    ewVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ew ewVar3 = this.b.V;
                                                if (ewVar3 != null) {
                                                    ewVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i25 = 3;
                                x3Var2.b(bd.M0(2131746378, null), bd.M0(2131752101, null), new View.OnClickListener(this) { // from class: kg.o
                                    public final /* synthetic */ e0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i25) {
                                            case 0:
                                                ew ewVar = this.b.V;
                                                if (ewVar != null) {
                                                    ewVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                cw cwVar = ((bm0) this.b).L0;
                                                zl0 zl0Var = cwVar.y0;
                                                bm0 bm0Var = cwVar.e0;
                                                String str10 = bm0Var.E;
                                                ArrayList arrayList142 = bm0Var.y;
                                                int i242 = bm0Var.x;
                                                int i252 = bm0Var.w;
                                                ArrayList arrayList152 = zl0Var.R;
                                                if (!TextUtils.equals(str10, zl0Var.b0)) {
                                                    zl0Var.W();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    zl0Var.Z = i252;
                                                    zl0Var.Y = i252 > arrayList142.size();
                                                    zl0Var.c0 = i242;
                                                    zl0Var.b0 = str10;
                                                    zl0Var.O(true);
                                                }
                                                cwVar.t0 = true;
                                                cwVar.w0.h1(0, 0);
                                                cwVar.S();
                                                d61 d61Var = cwVar.N;
                                                if (d61Var != null && d61Var.getCurrentTabId() != 1) {
                                                    cwVar.N.d(1, 1);
                                                }
                                                zl0Var.Z(cwVar.N0);
                                                break;
                                            case 2:
                                                ew ewVar2 = this.b.V;
                                                if (ewVar2 != null) {
                                                    ewVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ew ewVar3 = this.b.V;
                                                if (ewVar3 != null) {
                                                    ewVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            x3Var2.setText(bd.M0(2131752237, null));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = wVar.d.size();
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
                    if (this.c != b0.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str5 = null;
                        str6 = null;
                    } else {
                        if (i12 == 0) {
                            str5 = null;
                            str8 = bd.M0(2131744004, null);
                        } else {
                            str5 = null;
                            str8 = null;
                        }
                        i13 = 1;
                        i12 = k2.p1.f(1, i12, arrayList7);
                        str6 = str8;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = bd.M0(2131749115, str5);
                        }
                        i12 = k2.p1.f(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i27 = i12 - (size8 + size9);
                        if (i27 < 0 || i27 >= size10) {
                            int i28 = i27 - size10;
                            if (i28 < 0 || i28 >= size12) {
                                x3Var = x3Var2;
                                r83 = null;
                                if (this.V == null || i26 <= 0 || i28 - size12 > 1) {
                                    this.G0 = i28;
                                    SpannableStringBuilder H4 = H(this.c);
                                    final int i29 = 1;
                                    Object obj3 = new Runnable(this) { // from class: kg.p
                                        public final /* synthetic */ e0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i29) {
                                                case 0:
                                                    e0 e0Var = this.b;
                                                    boolean z19 = e0Var.I0;
                                                    e0Var.I0 = !z19;
                                                    x3Var.setRightText(bd.M0(!z19 ? 2131745349 : 2131745350, null));
                                                    e0Var.f();
                                                    break;
                                                default:
                                                    e0 e0Var2 = this.b;
                                                    uw uwVar = e0Var2.s0;
                                                    x3 x3Var3 = x3Var;
                                                    f60 H5 = f60.H(uwVar, x3Var3);
                                                    for (b0 b0Var : b0.values()) {
                                                        boolean z20 = b0Var.a == e0Var2.c.a;
                                                        H5.i(new u8(e0Var2, z20, x3Var3, b0Var, 5), bd.M0(b0Var.b, null), z20);
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
                                    str6 = bd.M0(2131745766, null);
                                    spannableStringBuilder = H4;
                                    obj2 = obj3;
                                    z17 = false;
                                    r02 = obj2;
                                } else {
                                    TLRPC.Chat M05 = hp.s1(i16).M0(Long.valueOf(-this.V.a()));
                                    if (M05 == null) {
                                        str7 = "null";
                                        c2 = 0;
                                    } else if (M05.monoforum) {
                                        c2 = 0;
                                        str7 = rg.c.i(i16, M05, false);
                                    } else {
                                        c2 = 0;
                                        str7 = M05.title;
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c2] = str7;
                                    str6 = bd.a0(null, null, 2131745754, objArr);
                                }
                            } else {
                                r83 = null;
                                str6 = bd.M0(2131749543, null);
                                if (wVar.e.size() > 3) {
                                    z17 = this.H0;
                                    x3Var = x3Var2;
                                    spannableStringBuilder = null;
                                    r02 = new bi.q0(this, arrayList14, i3, x3Var, 7);
                                } else {
                                    x3Var = x3Var2;
                                }
                            }
                        } else {
                            str6 = bd.M0(2131747291, null);
                            if (arrayList15.size() > 3) {
                                boolean z19 = this.I0;
                                final int i30 = 0;
                                Runnable runnable2 = new Runnable(this) { // from class: kg.p
                                    public final /* synthetic */ e0 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i30) {
                                            case 0:
                                                e0 e0Var = this.b;
                                                boolean z192 = e0Var.I0;
                                                e0Var.I0 = !z192;
                                                x3Var2.setRightText(bd.M0(!z192 ? 2131745349 : 2131745350, null));
                                                e0Var.f();
                                                break;
                                            default:
                                                e0 e0Var2 = this.b;
                                                uw uwVar = e0Var2.s0;
                                                x3 x3Var3 = x3Var2;
                                                f60 H5 = f60.H(uwVar, x3Var3);
                                                for (b0 b0Var : b0.values()) {
                                                    boolean z20 = b0Var.a == e0Var2.c.a;
                                                    H5.i(new u8(e0Var2, z20, x3Var3, b0Var, 5), bd.M0(b0Var.b, null), z20);
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
                            r83 = null;
                            r02 = runnable;
                        }
                        if (r02 == 0) {
                            if (spannableStringBuilder == null) {
                                x3Var.b(str6, bd.M0(z17 ? 2131745349 : 2131745350, r83), new ai.j0(4, r02));
                                x3Var.setRightTextMargin(16);
                                break;
                            } else {
                                x3Var.b(str6, spannableStringBuilder, new ai.j0(5, r02));
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
                    z17 = false;
                    r02 = obj2;
                    if (r02 == 0) {
                    }
                }
                break;
            case 2:
            case 9:
                t2 t2Var = (t2) view;
                r6.i(k6.d6, t2Var, null);
                t2Var.t2 = i14 != b() - 1;
                zi ziVar = (zi) I(i14);
                t2Var.P = arrayList3.contains(ziVar);
                if (ziVar != null) {
                    t2Var.d0(zi.B0(ziVar.k), ziVar, ziVar.k.date, false, false);
                    break;
                } else {
                    t2Var.d0(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((ja) view).setTopic((TLRPC.TL_forumTopic) I(i14));
                break;
            case 5:
                m4 m4Var = (m4) view;
                r6.i(k6.d6, m4Var, null);
                m4Var.setText((CharSequence) arrayList4.get(i14 - 1));
                m4Var.setNeedDivider(i14 != arrayList4.size());
                break;
            case 6:
                ((z) ((tj0) view).getAdapter()).f();
                break;
            case 7:
                String str10 = (String) I(i14);
                l8 l8Var = (l8) view;
                l8Var.g(-1, k6.o6);
                l8Var.k(bd.a0("AddContactByPhone", null, 2131754452, mf.b.c().b("+" + str10)), false);
                break;
            case 8:
                f6 f6Var2 = (f6) view;
                d5 d5Var = (d5) I(i14);
                f6Var2.x(d5Var, null, g5.m(0, d5Var.i, d5Var.j), k5.i(new StringBuilder("+"), (String) d5Var.g.get(0), mf.b.c()), false, false);
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        int i10 = this.i0;
        int i11 = 1;
        e6 e6Var = null;
        Context context = this.e;
        switch (i3) {
            case 0:
                f6 f6Var = new f6(context, null);
                f6Var.m0 = i10 == 3;
                view = f6Var;
                view2 = view;
                break;
            case 1:
                view2 = new x3(context, null);
                break;
            case 2:
            case 9:
                view2 = new x(false ? 1 : 0, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new ja(context);
                break;
            case 4:
                iz izVar = new iz(context, null);
                izVar.setViewType(1);
                izVar.setIsSingleCell(true);
                view2 = izVar;
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
                u51 u51Var = new u51(2, context, e6Var);
                r6.m(u51Var, 20, k6.i6, null);
                u51Var.setTag(9);
                u51Var.setItemAnimator(null);
                u51Var.setLayoutAnimation(null);
                y yVar = new y((int) (false ? 1 : 0));
                yVar.j1(0);
                u51Var.setLayoutManager(yVar);
                u51Var.setAdapter(new z(this.t0, this.e, null, false, i10 == 3));
                u51Var.setOnItemClickListener(new j6(this, 15));
                u51Var.setOnItemLongClickListener(new r(this));
                this.l0 = u51Var;
                view = u51Var;
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
                u uVar = new u(this, i11);
                s51 s51Var = new s51(context, 6);
                s51Var.setOrientation(1);
                k9 k9Var = new k9(context);
                k9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
                s51Var.addView(k9Var, mf.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i12 = k6.G6;
                r6.V(textView, i12, null);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(bd.M0(2131745759, null));
                textView.setGravity(17);
                s51Var.addView(textView, mf.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                s51Var.b = textView2;
                textView2.setTextSize(1, 14.0f);
                r6.V(textView2, i12, null);
                textView2.setText(bd.a0(null, null, 2131745760, ""));
                textView2.setGravity(17);
                s51Var.addView(textView2, mf.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
                k2.p1.u(textView3, 1, 14.0f, null, 2131745761);
                int i13 = k6.Ci;
                r6.V(textView3, i13, null);
                int r12 = k6.r1(0.15f, k6.v0(i13));
                org.telegram.ui.Cells.y k02 = k6.k0(6, 6, 6, 6, 0, r12, r12);
                n6 L = r6.L(0.15f, i13);
                textView3.setBackground(k02);
                r6.k(textView3, k02, null, L, null);
                textView3.setOnClickListener(new ii.m(uVar, 7));
                s51Var.addView(textView3, mf.t(-2, -2, 1, 0, 0, 0, 38));
                this.F0 = s51Var;
                textView2.setText(bd.a0(null, null, 2131745760, this.a0));
                view2 = s51Var;
                break;
        }
        if (i3 == 5) {
            view2.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(86.0f)));
        } else {
            view2.setLayoutParams(new u4.p0(-1, -2));
        }
        return new bj0(view2);
    }
}
