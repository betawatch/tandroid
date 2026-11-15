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
import bi.i6;
import c8.ja;
import fi.b7;
import fi.s6;
import hi.g7;
import hi.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.po;
import org.telegram.messenger.q10;
import org.telegram.messenger.r2;
import org.telegram.messenger.ro;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.cv;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.xw;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public class m extends tj0 implements p2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public uj0 L;
    public ng0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final yw S;
    public boolean T;
    public final TLRPC.RequestPeerType U;
    public boolean V;
    public final long W;
    public boolean a0;
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
    public ArrayList N = new ArrayList();
    public ArrayList O = new ArrayList();
    public int X = 10;
    public final LongSparseIntArray Y = new LongSparseIntArray();
    public final HashMap Z = new HashMap();
    public int b0 = -1;

    static {
        boolean z10 = r2.a;
    }

    public m(yw ywVar, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = ywVar;
        this.h = i7;
        this.r = i10;
        this.x = z10;
        this.E = i10 == 0 && i7 == 0 && !z10;
        this.y = arrayList;
        this.G = i11;
        this.W = ywVar.a3;
        if (i10 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new ai.o(jVar, 18);
            this.Q = jVar;
        }
        this.U = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                q6.x(view, drawable, j6.b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e10) {
                a8.g(e10, true);
                return;
            }
        }
        int i7 = j6.a7;
        i0.b bVar = new i0.b(4);
        i0.b bVar2 = new i0.b(5);
        int P = q6.P(i7, -1, 0, 0.0f, null);
        bVar2.f(P, view);
        k6 w10 = q6.w(101, view);
        w10.c(i7, -1, 0, 0.0f, null);
        w10.n = bVar;
        w10.o = bVar2;
        w10.m = false;
        w10.g = P;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 1 || i7 == 5 || i7 == 3 || i7 == 8 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 13 || i7 == 15 || i7 == 16 || i7 == 18 || i7 == 19 || i7 == 20) ? false : true;
    }

    public final int F() {
        int i7 = this.h;
        int i10 = this.r;
        if (i7 == 7 || i7 == 8) {
            return np.s1(this.G).c2.get(i10) ? 2 : 3;
        }
        if (i10 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j3) {
        for (int i7 = 0; i7 < this.N.size(); i7++) {
            if (((k) this.N.get(i7)).c != null && ((k) this.N.get(i7)).c.id == j3) {
                return i7;
            }
        }
        return -1;
    }

    public final int H(int i7) {
        if (this.F) {
            i7--;
        }
        if (this.E) {
            i7 = i5.c.f(2, i7, np.s1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i7--;
        }
        int i10 = this.h;
        return (i10 == 11 || i10 == 13) ? i7 - 2 : i10 == 12 ? i7 - 1 : i7;
    }

    public final so I() {
        int i7 = this.h;
        if (i7 == 7 || i7 == 8) {
            return np.s1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i7) {
        if (i7 >= 0 && i7 < this.N.size()) {
            k kVar = (k) this.N.get(i7);
            String str = kVar.l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return np.s1(this.G).a2(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.n = z10;
    }

    public final void O(ng0 ng0Var) {
        this.M = ng0Var;
    }

    public final void P(uj0 uj0Var, boolean z10) {
        this.K = z10;
        for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
            if (uj0Var.getChildAt(i7) instanceof t2) {
                ((t2) uj0Var.getChildAt(i7)).f = z10;
            }
        }
        for (int i10 = 0; i10 < uj0Var.getCachedChildCount(); i10++) {
            if (uj0Var.P(i10) instanceof t2) {
                ((t2) uj0Var.P(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < uj0Var.getHiddenChildCount(); i11++) {
            if (uj0Var.V(i11) instanceof t2) {
                ((t2) uj0Var.V(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < uj0Var.getAttachedScrapChildCount(); i12++) {
            if (uj0Var.O(i12) instanceof t2) {
                ((t2) uj0Var.O(i12)).f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j3) {
        this.s = j3;
    }

    public final void S(uw uwVar) {
        this.L = uwVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i7 = this.G;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                    Collections.sort(this.d, new d(np.s1(i7), currentTime, 1));
                    if (z10) {
                        f();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void V() {
        this.E = this.r == 0 && this.h == 0 && !this.x && !np.s1(this.G).s.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bf A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        ArrayList d42;
        long j3;
        boolean z10;
        int i7;
        TLRPC.Dialog dialog;
        boolean z11;
        int i10;
        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates;
        TLRPC.RequestPeerType requestPeerType;
        int i11;
        int i12;
        boolean z12;
        TLRPC.Dialog dialog2;
        int i13;
        TLRPC.Dialog dialog3;
        String M0;
        ArrayList arrayList;
        long j10 = this.W;
        int i14 = this.G;
        boolean z13 = true;
        if (j10 != 0) {
            this.N.clear();
            V();
            ab.c0 x10 = np.s1(i14).x(j10);
            ArrayList arrayList2 = (ArrayList) x10.b;
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) x10.c;
            int size2 = arrayList3.size() + size;
            ArrayList arrayList4 = (ArrayList) x10.d;
            int size3 = arrayList4.size() + size2;
            ArrayList arrayList5 = (ArrayList) x10.e;
            this.f = arrayList5.size() + size3;
            this.V = false;
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
                    this.N.add(new k(this, M0));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        ro roVar = (ro) arrayList.get(i17);
                        TLRPC.Dialog dialog4 = roVar.d;
                        if (dialog4 != null) {
                            this.N.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = roVar.b;
                            if (chat != null) {
                                this.N.add(new k(this, chat));
                            } else {
                                TLRPC.User user = roVar.c;
                                if (user != null) {
                                    this.N.add(new k(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.N.clear();
        V();
        np s12 = np.s1(i14);
        int i18 = this.r;
        yw ywVar = this.S;
        if (j10 != 0) {
            d42 = (ArrayList) s12.x.f(j10);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        } else {
            d42 = ywVar.d4(i14, this.h, i18, this.H);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        }
        int size4 = d42.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && ywVar.q4()) {
            i5.c.z(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i18 != 0 || !s12.c2.get(i18) || this.e) {
            j3 = 0;
            z10 = true;
        } else if (s12.D0() > 10 || !g5.r(i14).n || g5.r(i14).f0.isEmpty()) {
            j3 = 0;
            z10 = true;
            this.d = null;
        } else {
            j3 = 0;
            this.d = new ArrayList(g5.r(i14).f0);
            long j11 = m10.i(i14).n;
            int size5 = this.d.size();
            int i19 = 0;
            while (i19 < size5) {
                boolean z14 = z13;
                long j12 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j12 == j11 || s12.R.f(j12) != null) {
                    this.d.remove(i19);
                    i19--;
                    size5--;
                }
                i19++;
                z13 = z14;
            }
            z10 = z13;
            if (this.d.isEmpty()) {
                this.d = null;
            } else {
                U(false);
            }
        }
        so I = I();
        if ((I == null || I.e()) && ywVar != null && ywVar.O0) {
            long j13 = ywVar.R0;
            i7 = i14;
            if (j13 != j3 || ywVar.Q0 != j3) {
                if (j13 == j3) {
                    j13 = ywVar.Q0;
                }
                i5.c.z(this, 20, this.N);
                int i20 = 0;
                while (true) {
                    if (i20 >= d42.size()) {
                        dialog = null;
                        break;
                    } else {
                        if (((TLRPC.Dialog) d42.get(i20)).id == j13) {
                            dialog = (TLRPC.Dialog) d42.get(i20);
                            break;
                        }
                        i20++;
                    }
                }
                if (dialog == null) {
                    dialog = new TLRPC.TL_dialog();
                    dialog.id = j13;
                }
                this.N.add(new k(this, 0, dialog));
                i5.c.z(this, 20, this.N);
                z11 = false;
                this.F = z11;
                i10 = this.h;
                if ((i10 != 7 || i10 == 8) && I != null && I.d()) {
                    s12.H(I.a, false);
                    po poVar = (po) s12.d0.get(I.a);
                    tL_chatlists_chatlistUpdates = poVar == null ? null : poVar.c;
                    if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                        this.F = z10;
                        this.N.add(new k(this, tL_chatlists_chatlistUpdates));
                    }
                }
                requestPeerType = this.U;
                if (requestPeerType != null) {
                    i5.c.z(this, 15, this.N);
                }
                if (!this.K || this.T) {
                    for (i11 = 0; i11 < d42.size(); i11++) {
                        if (this.h == 2 && (d42.get(i11) instanceof tw)) {
                            this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i11)));
                        } else {
                            this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i11)));
                        }
                    }
                    i5.c.z(this, 10, this.N);
                }
                if (this.f == 0 && this.e) {
                    this.V = true;
                    if (requestPeerType != null) {
                        i5.c.z(this, 16, this.N);
                    } else {
                        this.N.add(new k(this, F(), 0));
                    }
                    i5.c.z(this, 8, this.N);
                    i5.c.z(this, 7, this.N);
                    i5.c.z(this, 13, this.N);
                } else {
                    ArrayList arrayList6 = this.d;
                    if (arrayList6 != null && !arrayList6.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                        if (this.f == 0) {
                            this.V = true;
                            if (requestPeerType != null) {
                                i5.c.z(this, 16, this.N);
                            } else {
                                this.N.add(new k(this, F(), 0));
                            }
                            i5.c.z(this, 8, this.N);
                            i5.c.z(this, 7, this.N);
                        } else {
                            for (int i21 = 0; i21 < d42.size(); i21++) {
                                this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i21)));
                            }
                            i5.c.z(this, 8, this.N);
                            i5.c.z(this, 7, this.N);
                        }
                        for (int i22 = 0; i22 < this.d.size(); i22++) {
                            this.N.add(new k(this, (TLRPC.TL_contact) this.d.get(i22)));
                        }
                        i5.c.z(this, 10, this.N);
                        z12 = true;
                        if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                            i5.c.z(this, 12, this.N);
                        }
                        if (this.n && this.h == 3) {
                            i5.c.z(this, 21, this.N);
                        }
                        if (!z12) {
                            for (int i23 = 0; i23 < d42.size(); i23++) {
                                if (this.h == 2 && (d42.get(i23) instanceof tw)) {
                                    this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i23)));
                                } else {
                                    this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i23)));
                                }
                            }
                            if (j10 != 0 || this.R || (i13 = this.h) == 7 || i13 == 8 || np.s1(i7).c2.get(i18)) {
                                int i24 = this.f;
                                if (i24 == 0) {
                                    this.V = true;
                                    if (requestPeerType != null) {
                                        i5.c.z(this, 16, this.N);
                                    } else {
                                        this.N.add(new k(this, F(), 0));
                                    }
                                } else {
                                    if (i18 == 0 && i24 > 10 && this.h == 0) {
                                        i5.c.z(this, 11, this.N);
                                    }
                                    i5.c.z(this, 10, this.N);
                                }
                            } else {
                                if (this.f != 0) {
                                    i5.c.z(this, 1, this.N);
                                }
                                i5.c.z(this, 10, this.N);
                            }
                        }
                        if (s12.S0.isEmpty()) {
                            int i25 = 0;
                            while (i25 < this.N.size()) {
                                k kVar = (k) this.N.get(i25);
                                if (kVar.a == 0 && (dialog2 = kVar.c) != null && s12.w2(dialog2.id)) {
                                    this.N.remove(i25);
                                    i25--;
                                }
                                i25++;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.E) {
                        int size6 = np.s1(i7).s.size();
                        i5.c.z(this, 2, this.N);
                        for (int i26 = 0; i26 < size6; i26++) {
                            this.N.add(new k(this, (TLRPC.RecentMeUrl) np.s1(i7).s.get(i26)));
                        }
                        i5.c.z(this, 3, this.N);
                    } else {
                        int i27 = this.h;
                        if (i27 == 11 || i27 == 13) {
                            i5.c.z(this, 7, this.N);
                            i5.c.z(this, 12, this.N);
                        } else if (i27 == 12) {
                            i5.c.z(this, 7, this.N);
                        }
                    }
                }
                z12 = false;
                if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                }
                i5.c.z(this, 12, this.N);
                if (this.n) {
                    i5.c.z(this, 21, this.N);
                }
                if (!z12) {
                }
                if (s12.S0.isEmpty()) {
                }
            }
        } else {
            i7 = i14;
        }
        if ((I == null || I.e()) && ywVar != null && this.h == 3 && ywVar.S0 != j3) {
            i5.c.z(this, 20, this.N);
            int i28 = 0;
            while (true) {
                if (i28 >= d42.size()) {
                    dialog3 = null;
                    break;
                } else {
                    if (((TLRPC.Dialog) d42.get(i28)).id == ywVar.S0) {
                        dialog3 = (TLRPC.Dialog) d42.get(i28);
                        break;
                    }
                    i28++;
                }
            }
            if (dialog3 == null) {
                dialog3 = new TLRPC.TL_dialog();
                dialog3.id = ywVar.S0;
            }
            z11 = false;
            this.N.add(new k(this, 0, dialog3));
            i5.c.z(this, 20, this.N);
            this.F = z11;
            i10 = this.h;
            if (i10 != 7) {
            }
            s12.H(I.a, false);
            po poVar2 = (po) s12.d0.get(I.a);
            if (poVar2 == null) {
            }
            if (tL_chatlists_chatlistUpdates != null) {
                this.F = z10;
                this.N.add(new k(this, tL_chatlists_chatlistUpdates));
            }
            requestPeerType = this.U;
            if (requestPeerType != null) {
            }
            if (this.K) {
            }
            while (i11 < d42.size()) {
            }
            i5.c.z(this, 10, this.N);
        }
        z11 = false;
        this.F = z11;
        i10 = this.h;
        if (i10 != 7) {
        }
        s12.H(I.a, false);
        po poVar22 = (po) s12.d0.get(I.a);
        if (poVar22 == null) {
        }
        if (tL_chatlists_chatlistUpdates != null) {
        }
        requestPeerType = this.U;
        if (requestPeerType != null) {
        }
        if (this.K) {
        }
        while (i11 < d42.size()) {
        }
        i5.c.z(this, 10, this.N);
    }

    public final void X(cv cvVar) {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ArrayList arrayList = new ArrayList();
        this.O = arrayList;
        arrayList.addAll(this.N);
        W();
        ArrayList arrayList2 = new ArrayList(this.N);
        ArrayList arrayList3 = this.O;
        this.N = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        arrayList3.size();
        p4.c c10 = v4.o.c(gVar, true);
        this.a0 = false;
        if (cvVar != null) {
            cvVar.run();
        }
        this.N = arrayList2;
        c10.c(this);
    }

    @Override // v4.h0
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // v4.h0
    public final long c(int i7) {
        return ((k) this.N.get(i7)).k;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((k) this.N.get(i7)).a;
    }

    @Override // v4.h0
    public void f() {
        if (this.a0) {
            this.N = new ArrayList();
        }
        this.a0 = false;
        W();
        super.f();
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return this.y.isEmpty();
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
        s6 P1 = np.s1(this.G).P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = P1.E(0, m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        this.S.getOrCreateStoryViewer().M(this.c, null, arrayList2, 0, null, null, new b7(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        TLRPC.Chat chat2;
        String H;
        TLRPC.Chat M0;
        String M02;
        int i10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        int i12 = this.G;
        yw ywVar = this.S;
        Object[] objArr = 0;
        if (i11 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i7);
            Object J = J(i7 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i13 = this.h;
            ArrayList arrayList = this.y;
            if (i13 == 2 || i13 == 15) {
                f6 f6Var = (f6) view;
                long dialogId = f6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = np.s1(i12).M0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (M0 = np.s1(i12).M0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = M0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str2 = chat.title;
                    if (!t3.T(chat) || chat.megagroup) {
                        int i14 = chat.participants_count;
                        H = i14 != 0 ? hd.H(',', "Members", i14) : chat.has_geo ? hd.M0(2131748642, null) : !t3.t0(chat) ? hd.M0(2131748641, null).toLowerCase() : hd.M0(2131748638, null).toLowerCase();
                    } else {
                        int i15 = chat.participants_count;
                        H = i15 != 0 ? hd.H(',', "Subscribers", i15) : !t3.t0(chat) ? hd.M0(2131752329, null).toLowerCase() : hd.M0(2131752318, null).toLowerCase();
                    }
                    r10 = str2;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(dialog.id));
                    if (a22 != 0) {
                        String p10 = q10.p(a22);
                        if (q10.z(a22)) {
                            str = "";
                            r10 = p10;
                            chat2 = a22;
                        } else {
                            chat2 = a22;
                            str = a22.bot ? hd.M0(2131753156, null) : hd.d0(i12, a22, null, null);
                            r10 = p10;
                        }
                    } else {
                        str = "";
                        chat2 = null;
                    }
                }
                f6Var.N = dialog2 != null;
                f6Var.x(chat2, null, r10, str, false, false);
                f6Var.w(arrayList.contains(Long.valueOf(f6Var.getDialogId())), dialogId == f6Var.getDialogId());
                if (i7 < this.f + 1) {
                    view.setAlpha(1.0f);
                    return;
                }
                return;
            }
            t2 t2Var = (t2) view;
            t2Var.R0 = this.W != 0 && t3.d0(i12, dialog.id);
            t2Var.t2 = false;
            t2Var.u2 = false;
            if (this.h == 0 && org.telegram.messenger.g0.Q1()) {
                t2Var.setDialogSelected(dialog.id == this.s);
            }
            t2Var.e0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i7 == 1 && ywVar != null && ywVar.O0 && ywVar.R0 != 0 && dialog.top_message == 0) {
                so I = I();
                t2Var.setCustomMessage((I == null || I.e()) ? hd.M0(2131746261, null) : null);
            } else if (i7 == 1 && ywVar != null && ywVar.O0 && ywVar.Q0 != 0 && dialog.top_message == 0) {
                so I2 = I();
                if (I2 == null || I2.e()) {
                    t2Var.setCustomMessage(m5.w(ywVar.Q0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else if (i7 == 1 && ywVar != null && this.h == 3 && ywVar.S0 != 0 && dialog.top_message == 0) {
                so I3 = I();
                if (I3 == null || I3.e()) {
                    t2Var.setCustomMessage(m5.w(ywVar.S0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else {
                t2Var.setCustomMessage(null);
            }
            t2Var.g0(dialog, this.h, this.r);
            if (t2Var.getMeasuredHeight() > 0 && t2Var.getMeasuredHeight() != t2Var.F()) {
                t2Var.requestLayout();
            }
            boolean z10 = t2Var.f;
            boolean z11 = this.K;
            if (z10 != z11) {
                t2Var.f = z11;
                t2Var.requestLayout();
            }
            j jVar = this.Q;
            if (jVar != null && i7 < 10) {
                long j3 = dialog.id;
                ArrayList arrayList2 = jVar.d;
                if (!jVar.a.contains(Long.valueOf(j3)) && !jVar.b.contains(Long.valueOf(j3)) && !jVar.c.contains(Long.valueOf(j3)) && !arrayList2.contains(Long.valueOf(j3))) {
                    arrayList2.add(Long.valueOf(j3));
                }
            }
        } else if (i11 == 4) {
            ((u2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i7));
        } else if (i11 == 5) {
            z2 z2Var = (z2) view;
            int i16 = this.b0;
            int F = F();
            this.b0 = F;
            yy0 yy0Var = z2Var.n;
            TextView textView = z2Var.h;
            fh0 fh0Var = z2Var.f;
            if (z2Var.r != F) {
                z2Var.r = F;
                if (F == 0 || F == 1) {
                    M02 = hd.M0(2131748228, null);
                    textView.setText(hd.M0(2131748230, null));
                    i10 = R.raw.utyan_newborn;
                } else if (F != 2) {
                    fh0Var.setAutoRepeat(true);
                    M02 = hd.M0(2131750808, null);
                    textView.setText(hd.M0(2131750809, null));
                    i10 = R.raw.filter_new;
                } else {
                    fh0Var.setAutoRepeat(false);
                    boolean z12 = this.x;
                    i10 = R.raw.filter_no_chats;
                    if (z12) {
                        textView.setText(hd.M0(2131750723, null));
                        M02 = hd.M0(2131750722, null);
                    } else {
                        textView.setText(hd.M0(2131750725, null));
                        M02 = hd.M0(2131750724, null);
                    }
                }
                fh0Var.setVisibility(0);
                if (z2Var.r == 1) {
                    if (z2Var.d) {
                        z2Var.a = 1.0f;
                        String M03 = hd.M0(2131748229, null);
                        if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                            M03 = M03.replace('\n', ' ');
                        }
                        yy0Var.a(M03, true, false);
                        z2Var.requestLayout();
                    } else {
                        z2Var.a(true);
                    }
                }
                if (z2Var.s != i10) {
                    fh0Var.f(i10, 100, 100, null);
                    fh0Var.d();
                    z2Var.s = i10;
                }
                if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                    M02 = M02.replace('\n', ' ');
                }
                yy0Var.a(M02, false, false);
            }
            int i17 = this.h;
            if (i17 != 7 && i17 != 8) {
                z2Var.setOnUtyanAnimationEndListener(new f(this, objArr == true ? 1 : 0));
                z2Var.setOnUtyanAnimationUpdateListener(new i6(this, 3));
                if (!z2Var.d && this.f == 0) {
                    ywVar.L4(0.0f);
                    for (xw xwVar : ywVar.f0) {
                        ((v4.b0) xwVar.a.getLayoutManager()).u = true;
                    }
                }
                if (this.d == null || i16 != 0) {
                    if (this.e) {
                        if (this.f == 0) {
                            z2Var.a(false);
                        }
                    } else if (z2Var.d && this.b0 == 0) {
                        ValueAnimator valueAnimator = z2Var.e;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        z2Var.d = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(z2Var.a, 0.0f).setDuration(250L);
                        z2Var.e = duration;
                        duration.setInterpolator(qs.d);
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
                n4Var.setText(hd.M0((this.f == 0 && this.e) ? 2131751804 : 2131742826, null));
            } else if (i7 == 0) {
                n4Var.setText(hd.M0(2131749249, null));
            } else {
                n4Var.setText(hd.M0(2131749248, null));
            }
        } else if (i11 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
            if (i11 != 12) {
                switch (i11) {
                    case 14:
                        n4 n4Var2 = (n4) view;
                        n4Var2.setTextSize(14.0f);
                        if (n4Var2.getTextView() != null) {
                            q6.U(n4Var2.getTextView(), j6.y6, null);
                        } else {
                            n4Var2.setTextColor(j6.x0(null, j6.y6, false));
                        }
                        q6.h(j6.e7, n4Var2, null);
                        int i19 = ((tw) J(i7)).a;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 == 2) {
                                    n4Var2.setText(hd.M0(2131750774, null));
                                    break;
                                }
                            } else {
                                n4Var2.setText(hd.M0(2131748304, null));
                                break;
                            }
                        } else {
                            n4Var2.setText(hd.M0(2131748305, null));
                            break;
                        }
                        break;
                    case 15:
                        ((n6) view).set(requestPeerType);
                        break;
                    case 16:
                        ((d3) view).set(requestPeerType);
                        break;
                    case 17:
                        b3 b3Var = (b3) view;
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.N.get(i7)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            b3Var.b(org.telegram.messenger.g0.S2(hd.G(size, "FolderUpdatesTitle", new Object[0]), j6.I6, 0, null, null), hd.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 20:
                                x3 x3Var = (x3) view;
                                if (ywVar == null || !ywVar.O0) {
                                    if (this.h == 3) {
                                        if (i7 == 0) {
                                            x3Var.setText(hd.M0(2131750586, null));
                                            break;
                                        } else {
                                            x3Var.setText(hd.M0(2131746259, null));
                                            break;
                                        }
                                    }
                                } else if (i7 == 0) {
                                    x3Var.setText(hd.M0(ywVar.R0 != 0 ? 2131746262 : 2131746260, null));
                                    break;
                                } else {
                                    x3Var.setText(hd.M0(2131746259, null));
                                    break;
                                }
                                break;
                            case 21:
                                t2 t2Var2 = (t2) view;
                                o2 o2Var = new o2();
                                o2Var.a = hd.M0(2131744771, null);
                                o2Var.b = hd.M0(2131744772, null);
                                t2Var2.t2 = false;
                                t2Var2.u2 = false;
                                t2Var2.setDialog(o2Var);
                                if (t2Var2.getMeasuredHeight() > 0 && t2Var2.getMeasuredHeight() != t2Var2.F()) {
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
                                    t2Var3.R0 = t3.e0(i12, chat3);
                                    t2Var3.setCustomMessageWithoutRebuild(hd.G(chat3.participants_count, "Members", new Object[0]));
                                    t2Var3.f0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    t2Var3.R0 = t3.f0(i12, user);
                                    t2Var3.setCustomMessageWithoutRebuild(hd.M0(2131753156, null));
                                    t2Var3.f0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof l8)) {
                    return;
                }
                l8 l8Var = (l8) view;
                int i20 = j6.q6;
                l8Var.g(i20, i20);
                if (requestPeerType == null) {
                    l8Var.o(R.drawable.msg_groups_create, hd.M0(2131751747, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    l8Var.o(R.drawable.msg_channel_create, hd.M0(2131751752, null), true);
                } else {
                    l8Var.o(R.drawable.msg_groups_create, hd.M0(2131751746, null), true);
                }
                l8Var.y = true;
                l8Var.setOffsetFromImage(75);
            }
        } else {
            y8 y8Var = (y8) view;
            y8Var.setText(hd.M0(2131744267, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(j6.x0(null, j6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            z70 textView2 = y8Var.getTextView();
            if (textView2 != null) {
                q6.x(textView2, this.P, j6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (ywVar == null || !ywVar.P3) ? this.P : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i7 < this.f + 1) {
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        int i7 = this.G;
        np.s1(i7);
        if (np.s1(i7).P1().K(t2Var.getDialogId())) {
            yw ywVar = this.S;
            ywVar.getOrCreateStoryViewer().getClass();
            ywVar.getOrCreateStoryViewer().J(ywVar.getParentActivity(), t2Var.getDialogId(), b7.a((uj0) t2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
        this.S.T4(t2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [org.telegram.ui.Cells.pa] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View, org.telegram.ui.Cells.x6] */
    /* JADX WARN: Type inference failed for: r2v13, types: [jg.l] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View, jg.i] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.n6] */
    /* JADX WARN: Type inference failed for: r2v18, types: [jg.h] */
    /* JADX WARN: Type inference failed for: r2v19, types: [org.telegram.ui.Cells.b3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [org.telegram.ui.Components.bn] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.ViewGroup, jg.l] */
    /* JADX WARN: Type inference failed for: r2v22, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r2v23, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v28, types: [android.view.View, org.telegram.ui.Cells.l8] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.telegram.ui.Components.pz] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, android.view.ViewGroup, bi.v1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, org.telegram.ui.Cells.u2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v9, types: [org.telegram.ui.Cells.z2] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ?? r22;
        n4 n4Var;
        int i10 = 2;
        long j3 = this.W;
        int i11 = 1;
        Context context = this.c;
        switch (i7) {
            case 0:
            case 21:
                int i12 = this.h;
                if (i12 == 2 || i12 == 15) {
                    r22 = new f6(context, null);
                } else {
                    t2 t2Var = new t2(this.S, this.c, false, this.G, null);
                    if (T()) {
                        g7 g7Var = new g7(this, r3);
                        t2Var.K1 = true;
                        t2Var.L1 = g7Var;
                    }
                    t2Var.setArchivedPullAnimation(this.M);
                    t2Var.setPreloader(this.Q);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.T);
                    if (i7 == 21) {
                        t2Var.H = new org.telegram.ui.Cells.b7(t2Var.getContext(), t2Var, false, R.drawable.forward_to_stories, t2Var.K4);
                        t2Var.G = true;
                    }
                    r22 = t2Var;
                    if (j3 != 0) {
                        t2Var.P0 = true;
                        r22 = t2Var;
                    }
                }
                if (this.h == 15) {
                    q6.h(j6.d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new pz(context, null);
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
                n4 n4Var2 = new n4(context);
                n4Var2.setText(hd.M0(2131746360, null));
                TextView textView = new TextView(context);
                i5.c.v(textView, 1, 15.0f);
                i20.q(textView, j6.L6, null, null, 2131746359);
                textView.setGravity((hd.a0 ? 3 : 5) | 16);
                n4Var2.addView(textView, ja.d(-1, -1.0f, (hd.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new p5(this, i10));
                r22 = n4Var2;
                break;
            case 3:
                r22 = new bi.v1(context, 4);
                q6.h(j6.a7, r22, null);
                View view = new View(context);
                q6.Z(view, context, R.drawable.greydivider, j6.b7);
                r22.addView(view, ja.c(-1.0f, -1));
                break;
            case 4:
                r22 = new u2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new t8((e6) null);
                r22.x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = m10.t0;
                j6.T(context);
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
                yw ywVar = this.S;
                if (ywVar == null || !ywVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.Cells.y0) null);
                Drawable Y0 = j6.Y0(context, R.drawable.greydivider, j6.b7);
                fq fqVar = new fq(new ColorDrawable(j6.x0(null, j6.a7, false)), Y0);
                fqVar.x = true;
                r22.setBackgroundDrawable(fqVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new l8(context);
                if (this.h == 15) {
                    q6.h(j6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable Y02 = j6.Y0(context, R.drawable.greydivider, j6.b7);
                fq fqVar2 = new fq(new ColorDrawable(j6.x0(null, j6.a7, false)), Y02);
                fqVar2.x = true;
                r22.setBackgroundDrawable(fqVar2);
                E(r22, Y02);
                break;
            case 14:
                n4 n4Var3 = new n4(this.c, j6.f7, 16, 0, false, null);
                n4Var3.setHeight(32);
                n4Var3.setClickable(false);
                n4Var = n4Var3;
                r22 = n4Var;
                break;
            case 15:
                r22 = new n6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                q6.h(j6.a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new bn(context, r3);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new org.telegram.ui.Components.n6(this.c, this.G, null, new f(this, i11), null), ja.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new x3(context, null);
                break;
            case 22:
                r22 = new n4(context);
                break;
            case 23:
                ?? t2Var2 = new t2(this.S, this.c, false, this.G, null);
                n4Var = t2Var2;
                if (j3 != 0) {
                    t2Var2.P0 = true;
                    t2Var2.Q0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        r22.setLayoutParams(new v4.p0(-1, (i7 == 5 || i7 == 19) ? -1 : -2));
        return new cj0(r22);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.c0(this.I, false);
            t2Var.e0(this.y.contains(Long.valueOf(t2Var.getDialogId())), false);
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
