package jg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.q9;
import c8.ha;
import di.a4;
import di.h7;
import di.y6;
import hi.x3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.uo;
import org.telegram.messenger.vo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.bv;
import org.telegram.ui.rw;
import org.telegram.ui.sw;
import org.telegram.ui.vw;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class n extends oj0 implements p2 {
    public boolean D;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public pj0 K;
    public kg0 L;
    public Drawable O;
    public final k P;
    public boolean Q;
    public final ww R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public final Context c;
    public ArrayList d;
    public boolean e;
    public int f;
    public int h;
    public boolean n;
    public final int r;
    public long s;
    public int w;
    public final boolean x;
    public final ArrayList y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int a0 = -1;

    static {
        boolean z9 = r2.a;
    }

    public n(ww wwVar, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.R = wwVar;
        this.h = i7;
        this.r = i10;
        this.x = z9;
        this.D = i10 == 0 && i7 == 0 && !z9;
        this.y = arrayList;
        this.F = i11;
        this.V = wwVar.Y2;
        if (i10 == 0) {
            k kVar = new k();
            kVar.a = new HashSet();
            kVar.b = new HashSet();
            kVar.c = new HashSet();
            kVar.d = new ArrayList();
            kVar.e = new ai.m0(kVar, 15);
            this.P = kVar;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                r6.y(view, drawable, k6.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = k6.a7;
        x3 x3Var = new x3(8);
        x3 x3Var2 = new x3(9);
        int Q = r6.Q(i7, -1, 0, 0.0f, null);
        x3Var2.c(Q, view);
        l6 x10 = r6.x(101, view);
        x10.c(i7, -1, 0, 0.0f, null);
        x10.n = x3Var;
        x10.o = x3Var2;
        x10.m = false;
        x10.g = Q;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 1 || i7 == 5 || i7 == 3 || i7 == 8 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 13 || i7 == 15 || i7 == 16 || i7 == 18 || i7 == 19 || i7 == 20) ? false : true;
    }

    public final int F() {
        int i7 = this.h;
        int i10 = this.r;
        if (i7 == 7 || i7 == 8) {
            return qp.s1(this.F).b2.get(i10) ? 2 : 3;
        }
        if (i10 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.M.size(); i7++) {
            if (((l) this.M.get(i7)).c != null && ((l) this.M.get(i7)).c.id == j3) {
                return i7;
            }
        }
        return -1;
    }

    public final int H(int i7) {
        if (this.E) {
            i7--;
        }
        if (this.D) {
            i7 = g.g(2, i7, qp.s1(this.F).s);
        }
        if (this.n && this.h == 3) {
            i7--;
        }
        int i10 = this.h;
        return (i10 == 11 || i10 == 13) ? i7 - 2 : i10 == 12 ? i7 - 1 : i7;
    }

    public final vo I() {
        int i7 = this.h;
        if (i7 == 7 || i7 == 8) {
            return qp.s1(this.F).M[this.h - 7];
        }
        return null;
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.M.size()) {
            l lVar = (l) this.M.get(i7);
            String str = lVar.l;
            TLRPC.TL_contact tL_contact = lVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = lVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = lVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = lVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return qp.s1(this.F).a2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = lVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z9) {
        this.n = z9;
    }

    public final void O(kg0 kg0Var) {
        this.L = kg0Var;
    }

    public final void P(pj0 pj0Var, boolean z9) {
        this.J = z9;
        for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
            if (pj0Var.getChildAt(i7) instanceof t2) {
                ((t2) pj0Var.getChildAt(i7)).f = z9;
            }
        }
        for (int i10 = 0; i10 < pj0Var.getCachedChildCount(); i10++) {
            if (pj0Var.P(i10) instanceof t2) {
                ((t2) pj0Var.P(i10)).f = z9;
            }
        }
        for (int i11 = 0; i11 < pj0Var.getHiddenChildCount(); i11++) {
            if (pj0Var.V(i11) instanceof t2) {
                ((t2) pj0Var.V(i11)).f = z9;
            }
        }
        for (int i12 = 0; i12 < pj0Var.getAttachedScrapChildCount(); i12++) {
            if (pj0Var.O(i12) instanceof t2) {
                ((t2) pj0Var.O(i12)).f = z9;
            }
        }
    }

    public final void Q(boolean z9) {
        this.Q = z9;
    }

    public final void R(long j3) {
        this.s = j3;
    }

    public final void S(sw swVar) {
        this.K = swVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z9) {
        int i7 = this.F;
        if (this.d != null) {
            if (!z9 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    Collections.sort(this.d, new d(qp.s1(i7), currentTime, 1));
                    if (z9) {
                        f();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void V() {
        this.D = this.r == 0 && this.h == 0 && !this.x && !qp.s1(this.F).s.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        ArrayList d42;
        long j3;
        boolean z9;
        int i7;
        TLRPC.Dialog dialog;
        boolean z10;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z11;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        String M0;
        ArrayList arrayList;
        long j10 = this.V;
        int i14 = this.F;
        boolean z12 = true;
        if (j10 != 0) {
            this.M.clear();
            V();
            ui.e x10 = qp.s1(i14).x(j10);
            ArrayList arrayList2 = (ArrayList) x10.b;
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) x10.c;
            int size2 = arrayList3.size() + size;
            ArrayList arrayList4 = (ArrayList) x10.d;
            int size3 = arrayList4.size() + size2;
            ArrayList arrayList5 = (ArrayList) x10.e;
            this.f = arrayList5.size() + size3;
            this.U = false;
            int i15 = this.h == 3 ? 2 : 4;
            for (int i16 = 0; i16 < i15; i16++) {
                if (i16 == 0) {
                    M0 = hd.M0(2131751878, null);
                    arrayList = arrayList2;
                } else if (i16 == 1) {
                    M0 = hd.M0(2131751875, null);
                    arrayList = arrayList3;
                } else if (i16 == 2) {
                    M0 = hd.M0(2131751876, null);
                    arrayList = arrayList4;
                } else {
                    M0 = hd.M0(2131751873, null);
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    this.M.add(new l(this, M0));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        uo uoVar = (uo) arrayList.get(i17);
                        TLRPC.Dialog dialog4 = uoVar.d;
                        if (dialog4 != null) {
                            this.M.add(new l(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = uoVar.b;
                            if (chat != null) {
                                this.M.add(new l(this, chat));
                            } else {
                                TLRPC.User user = uoVar.c;
                                if (user != null) {
                                    this.M.add(new l(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.M.clear();
        V();
        qp s12 = qp.s1(i14);
        int i18 = this.r;
        ww wwVar = this.R;
        if (j10 != 0) {
            d42 = (ArrayList) s12.x.f(j10);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        } else {
            d42 = wwVar.d4(i14, this.h, i18, this.G);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        }
        int size4 = d42.size();
        this.f = size4;
        this.U = false;
        if (size4 == 0 && wwVar.q4()) {
            g.y(this, 19, this.M);
            return;
        }
        if (this.D || this.h != 0 || i18 != 0 || !s12.b2.get(i18) || this.e) {
            j3 = 0;
            z9 = true;
        } else if (s12.D0() > 10 || !g5.r(i14).n || g5.r(i14).e0.isEmpty()) {
            j3 = 0;
            z9 = true;
            this.d = null;
        } else {
            j3 = 0;
            this.d = new ArrayList(g5.r(i14).e0);
            long j11 = p10.i(i14).n;
            int size5 = this.d.size();
            int i19 = 0;
            while (i19 < size5) {
                boolean z13 = z12;
                long j12 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j12 == j11 || s12.Q.f(j12) != null) {
                    this.d.remove(i19);
                    i19--;
                    size5--;
                }
                i19++;
                z12 = z13;
            }
            z9 = z12;
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                U(false);
            }
        }
        vo I = I();
        if ((I == null || I.e()) && wwVar != null && wwVar.N0 && wwVar.P0 != j3) {
            g.y(this, 20, this.M);
            int i20 = 0;
            while (true) {
                if (i20 >= d42.size()) {
                    i7 = i14;
                    dialog = null;
                    break;
                }
                i7 = i14;
                if (((TLRPC.Dialog) d42.get(i20)).id == wwVar.P0) {
                    dialog = (TLRPC.Dialog) d42.get(i20);
                    break;
                } else {
                    i20++;
                    i14 = i7;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = wwVar.P0;
            }
            this.M.add(new l(this, 0, dialog));
            g.y(this, 20, this.M);
        } else {
            i7 = i14;
            if ((I == null || I.e()) && wwVar != null && this.h == 3 && wwVar.Q0 != j3) {
                g.y(this, 20, this.M);
                int i21 = 0;
                while (true) {
                    if (i21 >= d42.size()) {
                        dialog3 = null;
                        break;
                    } else {
                        if (((TLRPC.Dialog) d42.get(i21)).id == wwVar.Q0) {
                            dialog3 = (TLRPC.Dialog) d42.get(i21);
                            break;
                        }
                        i21++;
                    }
                }
                if (dialog3 == null) {
                    dialog3 = new TLRPC.TL_dialog();
                    dialog3.id = wwVar.Q0;
                }
                z10 = false;
                this.M.add(new l(this, 0, dialog3));
                g.y(this, 20, this.M);
                this.E = z10;
                i10 = this.h;
                if ((i10 != 7 || i10 == 8) && I != null && I.d()) {
                    s12.H(I.a, false);
                    so soVar = (so) s12.c0.get(I.a);
                    tL_chatlists_chatlistUpdates = soVar != null ? null : soVar.c;
                    if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                        this.E = z9;
                        this.M.add(new l(this, tL_chatlists_chatlistUpdates));
                    }
                }
                requestPeerType = this.T;
                if (requestPeerType != null) {
                    g.y(this, 15, this.M);
                }
                if (!this.J || this.S) {
                    for (i11 = 0; i11 < d42.size(); i11++) {
                        if (this.h == 2 && (d42.get(i11) instanceof rw)) {
                            this.M.add(new l(this, 14, (TLRPC.Dialog) d42.get(i11)));
                        } else {
                            this.M.add(new l(this, 0, (TLRPC.Dialog) d42.get(i11)));
                        }
                    }
                    g.y(this, 10, this.M);
                }
                if (this.f == 0 && this.e) {
                    this.U = true;
                    if (requestPeerType != null) {
                        g.y(this, 16, this.M);
                    } else {
                        this.M.add(new l(this, F(), 0));
                    }
                    g.y(this, 8, this.M);
                    g.y(this, 7, this.M);
                    g.y(this, 13, this.M);
                } else {
                    ArrayList arrayList6 = this.d;
                    if (arrayList6 != null && !arrayList6.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                        if (this.f == 0) {
                            this.U = true;
                            if (requestPeerType != null) {
                                g.y(this, 16, this.M);
                            } else {
                                this.M.add(new l(this, F(), 0));
                            }
                            g.y(this, 8, this.M);
                            g.y(this, 7, this.M);
                        } else {
                            for (int i22 = 0; i22 < d42.size(); i22++) {
                                this.M.add(new l(this, 0, (TLRPC.Dialog) d42.get(i22)));
                            }
                            g.y(this, 8, this.M);
                            g.y(this, 7, this.M);
                        }
                        for (int i23 = 0; i23 < this.d.size(); i23++) {
                            this.M.add(new l(this, (TLRPC.TL_contact) this.d.get(i23)));
                        }
                        g.y(this, 10, this.M);
                        z11 = true;
                        if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                            g.y(this, 12, this.M);
                        }
                        if (this.n && this.h == 3) {
                            g.y(this, 21, this.M);
                        }
                        if (!z11) {
                            for (int i24 = 0; i24 < d42.size(); i24++) {
                                if (this.h == 2 && (d42.get(i24) instanceof rw)) {
                                    this.M.add(new l(this, 14, (TLRPC.Dialog) d42.get(i24)));
                                } else {
                                    this.M.add(new l(this, 0, (TLRPC.Dialog) d42.get(i24)));
                                }
                            }
                            if (j10 != 0 || this.Q || (i13 = this.h) == 7 || i13 == 8 || qp.s1(i7).b2.get(i18)) {
                                int i25 = this.f;
                                if (i25 == 0) {
                                    this.U = true;
                                    if (requestPeerType != null) {
                                        g.y(this, 16, this.M);
                                    } else {
                                        this.M.add(new l(this, F(), 0));
                                    }
                                } else {
                                    if (i18 == 0 && i25 > 10 && this.h == 0) {
                                        g.y(this, 11, this.M);
                                    }
                                    g.y(this, 10, this.M);
                                }
                            } else {
                                if (this.f != 0) {
                                    g.y(this, 1, this.M);
                                }
                                g.y(this, 10, this.M);
                            }
                        }
                        if (s12.R0.isEmpty()) {
                            int i26 = 0;
                            while (i26 < this.M.size()) {
                                l lVar = (l) this.M.get(i26);
                                if (lVar.a == 0 && (dialog2 = lVar.c) != null && s12.w2(dialog2.id)) {
                                    this.M.remove(i26);
                                    i26--;
                                }
                                i26++;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.D) {
                        int size6 = qp.s1(i7).s.size();
                        g.y(this, 2, this.M);
                        for (int i27 = 0; i27 < size6; i27++) {
                            this.M.add(new l(this, (TLRPC.RecentMeUrl) qp.s1(i7).s.get(i27)));
                        }
                        g.y(this, 3, this.M);
                    } else {
                        int i28 = this.h;
                        if (i28 == 11 || i28 == 13) {
                            g.y(this, 7, this.M);
                            g.y(this, 12, this.M);
                        } else if (i28 == 12) {
                            g.y(this, 7, this.M);
                        }
                    }
                }
                z11 = false;
                if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                }
                g.y(this, 12, this.M);
                if (this.n) {
                    g.y(this, 21, this.M);
                }
                if (!z11) {
                }
                if (s12.R0.isEmpty()) {
                }
            }
        }
        z10 = false;
        this.E = z10;
        i10 = this.h;
        if (i10 != 7) {
        }
        s12.H(I.a, false);
        so soVar2 = (so) s12.c0.get(I.a);
        if (soVar2 != null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
            this.E = z9;
            this.M.add(new l(this, tL_chatlists_chatlistUpdates));
        }
        requestPeerType = this.T;
        if (requestPeerType != null) {
        }
        if (this.J) {
        }
        while (i11 < d42.size()) {
        }
        g.y(this, 10, this.M);
    }

    public final void X(bv bvVar) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        h hVar = new h(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.o.c(hVar, true);
        this.Z = false;
        if (bvVar != null) {
            bvVar.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override // v4.g0
    public final int b() {
        int size = this.M.size();
        this.w = size;
        return size;
    }

    @Override // v4.g0
    public final long c(int i7) {
        return ((l) this.M.get(i7)).k;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((l) this.M.get(i7)).a;
    }

    @Override // v4.g0
    public void f() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.f();
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
        y6 P1 = qp.s1(this.F).P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z9 = P1.E(0, m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z9 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.R.getOrCreateStoryViewer().M(this.c, null, arrayList2, 0, null, null, new h7(this.K, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String str2;
        String H;
        TLRPC.Chat M0;
        String M02;
        int i10;
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = this.F;
        ww wwVar = this.R;
        Object[] objArr = 0;
        if (i11 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i7);
            Object J = J(i7 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i13 = this.h;
            ArrayList arrayList = this.y;
            if (i13 == 2 || i13 == 15) {
                g6 g6Var = (g6) view;
                long dialogId = g6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = qp.s1(i12).M0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (M0 = qp.s1(i12).M0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = M0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str3 = chat.title;
                    if (!t3.T(chat) || chat.megagroup) {
                        int i14 = chat.participants_count;
                        H = i14 != 0 ? hd.H(',', "Members", i14) : chat.has_geo ? hd.M0(2131748641, null) : !t3.t0(chat) ? hd.M0(2131748640, null).toLowerCase() : hd.M0(2131748637, null).toLowerCase();
                    } else {
                        int i15 = chat.participants_count;
                        H = i15 != 0 ? hd.H(',', "Subscribers", i15) : !t3.t0(chat) ? hd.M0(2131752329, null).toLowerCase() : hd.M0(2131752318, null).toLowerCase();
                    }
                    str2 = str3;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User a22 = qp.s1(i12).a2(Long.valueOf(dialog.id));
                    if (a22 != 0) {
                        String p10 = t10.p(a22);
                        chat2 = a22;
                        str = t10.z(a22) ? "" : a22.bot ? hd.M0(2131753156, null) : hd.d0(i12, a22, null, null);
                        str2 = p10;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                g6Var.M = dialog2 != null;
                g6Var.x(chat2, null, str2, str, false, false);
                g6Var.w(arrayList.contains(Long.valueOf(g6Var.getDialogId())), dialogId == g6Var.getDialogId());
                if (i7 < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            t2 t2Var = (t2) view;
            t2Var.Q0 = this.V != 0 && t3.d0(i12, dialog.id);
            t2Var.s2 = false;
            t2Var.t2 = false;
            if (this.h == 0 && org.telegram.messenger.g0.Q1()) {
                t2Var.setDialogSelected(dialog.id == this.s);
            }
            t2Var.c0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i7 == 1 && wwVar != null && wwVar.N0 && wwVar.P0 != 0 && dialog.top_message == 0) {
                vo I = I();
                if (I == null || I.e()) {
                    t2Var.setCustomMessage(m5.w(wwVar.P0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else if (i7 == 1 && wwVar != null && this.h == 3 && wwVar.Q0 != 0 && dialog.top_message == 0) {
                vo I2 = I();
                if (I2 == null || I2.e()) {
                    t2Var.setCustomMessage(m5.w(wwVar.Q0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else {
                t2Var.setCustomMessage(null);
            }
            t2Var.e0(dialog, this.h, this.r);
            if (t2Var.getMeasuredHeight() > 0 && t2Var.getMeasuredHeight() != t2Var.D()) {
                t2Var.requestLayout();
            }
            boolean z9 = t2Var.f;
            boolean z10 = this.J;
            if (z9 != z10) {
                t2Var.f = z10;
                t2Var.requestLayout();
            }
            k kVar = this.P;
            if (kVar != null && i7 < 10) {
                long j3 = dialog.id;
                ArrayList arrayList2 = kVar.d;
                if (!kVar.a.contains(Long.valueOf(j3)) && !kVar.b.contains(Long.valueOf(j3)) && !kVar.c.contains(Long.valueOf(j3)) && !arrayList2.contains(Long.valueOf(j3))) {
                    arrayList2.add(Long.valueOf(j3));
                }
            }
        } else if (i11 == 4) {
            ((u2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i7));
        } else if (i11 == 5) {
            z2 z2Var = (z2) view;
            int i16 = this.a0;
            int F = F();
            this.a0 = F;
            vy0 vy0Var = z2Var.n;
            TextView textView = z2Var.h;
            ch0 ch0Var = z2Var.f;
            if (z2Var.r != F) {
                z2Var.r = F;
                if (F == 0 || F == 1) {
                    M02 = hd.M0(2131748227, null);
                    textView.setText(hd.M0(2131748229, null));
                    i10 = R.raw.utyan_newborn;
                } else if (F != 2) {
                    ch0Var.setAutoRepeat(true);
                    M02 = hd.M0(2131750809, null);
                    textView.setText(hd.M0(2131750810, null));
                    i10 = R.raw.filter_new;
                } else {
                    ch0Var.setAutoRepeat(false);
                    if (this.x) {
                        textView.setText(hd.M0(2131750724, null));
                        M02 = hd.M0(2131750723, null);
                    } else {
                        textView.setText(hd.M0(2131750726, null));
                        M02 = hd.M0(2131750725, null);
                    }
                    i10 = R.raw.filter_no_chats;
                }
                ch0Var.setVisibility(0);
                if (z2Var.r == 1) {
                    if (z2Var.d) {
                        z2Var.a = 1.0f;
                        String M03 = hd.M0(2131748228, null);
                        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                            M03 = M03.replace('\n', ' ');
                        }
                        vy0Var.a(M03, true, false);
                        z2Var.requestLayout();
                    } else {
                        z2Var.a(true);
                    }
                }
                if (z2Var.s != i10) {
                    ch0Var.f(i10, 100, 100, null);
                    ch0Var.d();
                    z2Var.s = i10;
                }
                if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                    M02 = M02.replace('\n', ' ');
                }
                vy0Var.a(M02, false, false);
            }
            int i17 = this.h;
            if (i17 != 7 && i17 != 8) {
                z2Var.setOnUtyanAnimationEndListener(new f(this, objArr == true ? 1 : 0));
                z2Var.setOnUtyanAnimationUpdateListener(new q9(this, 4));
                if (!z2Var.d && this.f == 0) {
                    wwVar.L4(0.0f);
                    for (vw vwVar : wwVar.e0) {
                        ((v4.b0) vwVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i16 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            z2Var.a(false);
                        }
                    } else if (z2Var.d && this.a0 == 0) {
                        ValueAnimator valueAnimator = z2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        z2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(z2Var.a, 0.0f).setDuration(250L);
                        z2Var.e = duration;
                        duration.setInterpolator(ks.d);
                        z2Var.e.addUpdateListener(new x2(z2Var, 1));
                        z2Var.e.addListener(new y2(z2Var, 0));
                        z2Var.e.start();
                    }
                } else if (!z2Var.d) {
                    z2Var.a(true);
                }
            }
        } else if (i11 == 6) {
            ((pa) view).d((TLRPC.User) J(i7), null, null, false);
        } else if (i11 == 7) {
            n4 n4Var = (n4) view;
            int i18 = this.h;
            if (i18 != 11 && i18 != 12 && i18 != 13) {
                n4Var.setText(hd.M0((this.f == 0 && this.e) ? 2131751804 : 2131742827, null));
            } else if (i7 == 0) {
                n4Var.setText(hd.M0(2131749248, null));
            } else {
                n4Var.setText(hd.M0(2131749247, null));
            }
        } else if (i11 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.T;
            if (i11 != 12) {
                switch (i11) {
                    case 14:
                        n4 n4Var2 = (n4) view;
                        n4Var2.setTextSize(14.0f);
                        if (n4Var2.getTextView() != null) {
                            r6.V(n4Var2.getTextView(), k6.y6, null);
                        } else {
                            n4Var2.setTextColor(k6.x0(null, k6.y6, false));
                        }
                        r6.i(k6.e7, n4Var2, null);
                        int i19 = ((rw) J(i7)).a;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 == 2) {
                                    n4Var2.setText(hd.M0(2131750775, null));
                                    break;
                                }
                            } else {
                                n4Var2.setText(hd.M0(2131748303, null));
                                break;
                            }
                        } else {
                            n4Var2.setText(hd.M0(2131748304, null));
                            break;
                        }
                        break;
                    case 15:
                        ((o6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((d3) view).set(requestPeerType);
                        break;
                    case 17:
                        b3 b3Var = (b3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((l) this.M.get(i7)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            b3Var.b(org.telegram.messenger.g0.S2(hd.G(size, "FolderUpdatesTitle", new Object[0]), k6.I6, 0, null, null), hd.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 20:
                                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                                if (wwVar == null || !wwVar.N0) {
                                    if (this.h == 3) {
                                        if (i7 == 0) {
                                            x3Var.setText(hd.M0(2131750587, null));
                                            break;
                                        } else {
                                            x3Var.setText(hd.M0(2131746260, null));
                                            break;
                                        }
                                    }
                                } else if (i7 == 0) {
                                    x3Var.setText(hd.M0(2131746261, null));
                                    break;
                                } else {
                                    x3Var.setText(hd.M0(2131746260, null));
                                    break;
                                }
                                break;
                            case 21:
                                t2 t2Var2 = (t2) view;
                                o2 o2Var = new o2();
                                o2Var.a = hd.M0(2131744772, null);
                                o2Var.b = hd.M0(2131744773, null);
                                t2Var2.s2 = false;
                                t2Var2.t2 = false;
                                t2Var2.setDialog(o2Var);
                                if (t2Var2.getMeasuredHeight() > 0 && t2Var2.getMeasuredHeight() != t2Var2.D()) {
                                    t2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((n4) view).setText((String) J(i7));
                                break;
                            case 23:
                                Object J2 = J(i7);
                                t2 t2Var3 = (t2) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    t2Var3.Q0 = t3.e0(i12, chat3);
                                    t2Var3.setCustomMessageWithoutRebuild(hd.G(chat3.participants_count, "Members", new Object[0]));
                                    t2Var3.d0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    t2Var3.Q0 = t3.f0(i12, user);
                                    t2Var3.setCustomMessageWithoutRebuild(hd.M0(2131753156, null));
                                    t2Var3.d0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof m8)) {
                    return;
                }
                m8 m8Var = (m8) view;
                int i20 = k6.q6;
                m8Var.g(i20, i20);
                if (requestPeerType == null) {
                    m8Var.o(R.drawable.msg_groups_create, hd.M0(2131751747, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    m8Var.o(R.drawable.msg_channel_create, hd.M0(2131751752, null), true);
                } else {
                    m8Var.o(R.drawable.msg_groups_create, hd.M0(2131751746, null), true);
                }
                m8Var.y = true;
                m8Var.setOffsetFromImage(75);
            }
        } else {
            z8 z8Var = (z8) view;
            z8Var.setText(hd.M0(2131744268, null));
            if (this.O == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.O = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            w70 textView2 = z8Var.getTextView();
            if (textView2 != null) {
                r6.y(textView2, this.O, k6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (wwVar == null || !wwVar.N3) ? this.O : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i7 < this.f + 1) {
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        int i7 = this.F;
        qp.s1(i7);
        if (qp.s1(i7).P1().K(t2Var.getDialogId())) {
            ww wwVar = this.R;
            wwVar.getOrCreateStoryViewer().getClass();
            wwVar.getOrCreateStoryViewer().J(wwVar.getParentActivity(), t2Var.getDialogId(), h7.a((pj0) t2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
        this.R.T4(t2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [org.telegram.ui.Components.lz] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.ViewGroup, org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View, org.telegram.ui.Cells.u2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Cells.z2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [org.telegram.ui.Cells.pa] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.View, org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View, org.telegram.ui.Cells.y6] */
    /* JADX WARN: Type inference failed for: r2v23, types: [jg.m] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.view.View, jg.j] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.o6] */
    /* JADX WARN: Type inference failed for: r2v27, types: [jg.i] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.Cells.b3] */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.Components.tm] */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.view.ViewGroup, jg.m] */
    /* JADX WARN: Type inference failed for: r2v31, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r2v32, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v37, types: [android.view.View, org.telegram.ui.Cells.m8] */
    /* JADX WARN: Type inference failed for: r2v38 */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        n4 n4Var;
        int i10 = 2;
        long j3 = this.V;
        int i11 = 1;
        Context context = this.c;
        switch (i7) {
            case 0:
            case 21:
                int i12 = this.h;
                if (i12 == 2 || i12 == 15) {
                    r22 = new g6(context, null);
                } else {
                    t2 t2Var = new t2(this.R, this.c, false, this.F, null);
                    if (T()) {
                        ii.c cVar = new ii.c(this, i11);
                        t2Var.J1 = true;
                        t2Var.K1 = cVar;
                    }
                    t2Var.setArchivedPullAnimation(this.L);
                    t2Var.setPreloader(this.P);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.S);
                    if (i7 == 21) {
                        c7 c7Var = new c7(t2Var.getContext(), t2Var, false, R.drawable.forward_to_stories, t2Var.J4);
                        t2Var = t2Var;
                        t2Var.G = c7Var;
                        t2Var.F = true;
                    }
                    if (j3 != 0) {
                        t2Var.O0 = true;
                    }
                    r22 = t2Var;
                }
                if (this.h == 15) {
                    r6.i(k6.d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new lz(context, null);
                r22.setIsSingleCell(true);
                int i13 = i7 == 13 ? 18 : 7;
                r22.setViewType(i13);
                if (i13 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i7 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new n4(context);
                r22.setText(hd.M0(2131746359, null));
                TextView textView = new TextView(context);
                com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
                org.telegram.messenger.camera.q.o(textView, k6.L6, null, null, 2131746358);
                int i14 = 3;
                textView.setGravity((hd.a0 ? 3 : 5) | 16);
                r22.addView(textView, ha.d(-1, -1.0f, (hd.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ii.g(this, i14));
                break;
            case 3:
                a4 a4Var = new a4(context, i10);
                r6.i(k6.a7, a4Var, null);
                View view = new View(context);
                r6.a0(view, context, R.drawable.greydivider, k6.b7);
                a4Var.addView(view, ha.c(-1.0f, -1));
                r22 = a4Var;
                break;
            case 4:
                r22 = new u2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new w8((f6) null);
                r22.x = org.telegram.messenger.g0.L(40.0f);
                r22.F = org.telegram.messenger.g0.L(10.0f);
                r22.H = p10.s0;
                k6.T(context);
                imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
                break;
            case 5:
                r22 = new z2(context);
                break;
            case 6:
                r22 = new pa(context, 8, 0, false);
                break;
            case 7:
                r22 = new n4(context);
                ww wwVar = this.R;
                if (wwVar == null || !wwVar.N0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = k6.Y0(context, R.drawable.greydivider, k6.b7);
                xp xpVar = new xp(new ColorDrawable(k6.x0(null, k6.a7, false)), Y0);
                xpVar.x = true;
                r22.setBackgroundDrawable(xpVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    r6.i(k6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new m(this, context);
                break;
            case 11:
                r22 = new j(this, context);
                Drawable Y02 = k6.Y0(context, R.drawable.greydivider, k6.b7);
                xp xpVar2 = new xp(new ColorDrawable(k6.x0(null, k6.a7, false)), Y02);
                xpVar2.x = true;
                r22.setBackgroundDrawable(xpVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var2 = new n4(this.c, k6.f7, 16, 0, false, null);
                n4Var2.setHeight(32);
                n4Var2.setClickable(false);
                n4Var = n4Var2;
                r22 = n4Var;
                break;
            case 15:
                r22 = new o6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.a7, r22, null);
                break;
            case 16:
                r22 = new i(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new tm(context, 4);
                break;
            case 19:
                r22 = new m(this, context);
                r22.addView(new p6(this.c, this.F, null, new f(this, i11), null), ha.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new org.telegram.ui.Cells.x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.R, this.c, false, this.F, null);
                n4Var = t2Var2;
                if (j3 != 0) {
                    t2Var2.O0 = true;
                    t2Var2.P0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        r22.setLayoutParams(new v4.o0(-1, (i7 == 5 || i7 == 19) ? -1 : -2));
        return new xi0(r22);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.a0(this.H, false);
            t2Var.c0(this.y.contains(Long.valueOf(t2Var.getDialogId())), false);
        }
    }

    public void M(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Cells.p2
    public void l(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public void r(t2 t2Var) {
    }

    public void K() {
    }

    public void L() {
    }
}
