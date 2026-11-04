package kg;

import ai.d2;
import ai.q6;
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
import b8.mf;
import ei.i7;
import ei.z6;
import gi.j8;
import ii.y3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.jo;
import org.telegram.messenger.l10;
import org.telegram.messenger.lo;
import org.telegram.messenger.m5;
import org.telegram.messenger.mo;
import org.telegram.messenger.r2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b3;
import org.telegram.ui.Cells.b7;
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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ow;
import org.telegram.ui.pw;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.yu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class m extends sj0 implements p2 {
    public boolean E;
    public boolean F;
    public final int G;
    public boolean H;
    public boolean I;
    public long J;
    public boolean K;
    public tj0 L;
    public ng0 M;
    public Drawable P;
    public final j Q;
    public boolean R;
    public final uw S;
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

    public m(uw uwVar, Context context, int i3, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        this.c = context;
        this.S = uwVar;
        this.h = i3;
        this.r = i10;
        this.x = z10;
        this.E = i10 == 0 && i3 == 0 && !z10;
        this.y = arrayList;
        this.G = i11;
        this.W = uwVar.Z2;
        if (i10 == 0) {
            j jVar = new j();
            jVar.a = new HashSet();
            jVar.b = new HashSet();
            jVar.c = new HashSet();
            jVar.d = new ArrayList();
            jVar.e = new ai.y1(jVar, 19);
            this.Q = jVar;
        }
        this.U = requestPeerType;
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
        int i3 = k6.a7;
        y3 y3Var = new y3(13);
        y3 y3Var2 = new y3(14);
        int Q = r6.Q(i3, -1, 0, 0.0f, null);
        y3Var2.f(Q, view);
        l6 x10 = r6.x(101, view);
        x10.c(i3, -1, 0, 0.0f, null);
        x10.n = y3Var;
        x10.o = y3Var2;
        x10.m = false;
        x10.g = Q;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 1 || i3 == 5 || i3 == 3 || i3 == 8 || i3 == 7 || i3 == 10 || i3 == 11 || i3 == 13 || i3 == 15 || i3 == 16 || i3 == 18 || i3 == 19 || i3 == 20) ? false : true;
    }

    public final int F() {
        int i3 = this.h;
        int i10 = this.r;
        if (i3 == 7 || i3 == 8) {
            return hp.s1(this.G).c2.get(i10) ? 2 : 3;
        }
        if (i10 == 1) {
            return 2;
        }
        return this.d != null ? 1 : 0;
    }

    public final int G(long j10) {
        for (int i3 = 0; i3 < this.N.size(); i3++) {
            if (((k) this.N.get(i3)).c != null && ((k) this.N.get(i3)).c.id == j10) {
                return i3;
            }
        }
        return -1;
    }

    public final int H(int i3) {
        if (this.F) {
            i3--;
        }
        if (this.E) {
            i3 = k2.p1.f(2, i3, hp.s1(this.G).s);
        }
        if (this.n && this.h == 3) {
            i3--;
        }
        int i10 = this.h;
        return (i10 == 11 || i10 == 13) ? i3 - 2 : i10 == 12 ? i3 - 1 : i3;
    }

    public final mo I() {
        int i3 = this.h;
        if (i3 == 7 || i3 == 8) {
            return hp.s1(this.G).N[this.h - 7];
        }
        return null;
    }

    public final Object J(int i3) {
        if (i3 >= 0 && i3 < this.N.size()) {
            k kVar = (k) this.N.get(i3);
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
                return hp.s1(this.G).a2(Long.valueOf(tL_contact.user_id));
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

    public final void P(tj0 tj0Var, boolean z10) {
        this.K = z10;
        for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
            if (tj0Var.getChildAt(i3) instanceof t2) {
                ((t2) tj0Var.getChildAt(i3)).f = z10;
            }
        }
        for (int i10 = 0; i10 < tj0Var.getCachedChildCount(); i10++) {
            if (tj0Var.P(i10) instanceof t2) {
                ((t2) tj0Var.P(i10)).f = z10;
            }
        }
        for (int i11 = 0; i11 < tj0Var.getHiddenChildCount(); i11++) {
            if (tj0Var.V(i11) instanceof t2) {
                ((t2) tj0Var.V(i11)).f = z10;
            }
        }
        for (int i12 = 0; i12 < tj0Var.getAttachedScrapChildCount(); i12++) {
            if (tj0Var.O(i12) instanceof t2) {
                ((t2) tj0Var.O(i12)).f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.R = z10;
    }

    public final void R(long j10) {
        this.s = j10;
    }

    public final void S(pw pwVar) {
        this.L = pwVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i3 = this.G;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.J >= 2000) {
                this.J = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    Collections.sort(this.d, new d(hp.s1(i3), currentTime, 1));
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
        this.E = this.r == 0 && this.h == 0 && !this.x && !hp.s1(this.G).s.isEmpty();
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
        long j10;
        boolean z10;
        int i3;
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
        long j11 = this.W;
        int i14 = this.G;
        boolean z13 = true;
        if (j11 != 0) {
            this.N.clear();
            V();
            ui.f x10 = hp.s1(i14).x(j11);
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
                    M0 = bd.M0(2131751878, null);
                    arrayList = arrayList2;
                } else if (i16 == 1) {
                    M0 = bd.M0(2131751875, null);
                    arrayList = arrayList3;
                } else if (i16 == 2) {
                    M0 = bd.M0(2131751876, null);
                    arrayList = arrayList4;
                } else {
                    M0 = bd.M0(2131751873, null);
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    this.N.add(new k(this, M0));
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        lo loVar = (lo) arrayList.get(i17);
                        TLRPC.Dialog dialog4 = loVar.d;
                        if (dialog4 != null) {
                            this.N.add(new k(this, 0, dialog4));
                        } else {
                            TLRPC.Chat chat = loVar.b;
                            if (chat != null) {
                                this.N.add(new k(this, chat));
                            } else {
                                TLRPC.User user = loVar.c;
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
        hp s12 = hp.s1(i14);
        int i18 = this.r;
        uw uwVar = this.S;
        if (j11 != 0) {
            d42 = (ArrayList) s12.x.f(j11);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        } else {
            d42 = uwVar.d4(i14, this.h, i18, this.H);
            if (d42 == null) {
                d42 = new ArrayList();
            }
        }
        int size4 = d42.size();
        this.f = size4;
        this.V = false;
        if (size4 == 0 && uwVar.q4()) {
            k2.p1.x(this, 19, this.N);
            return;
        }
        if (this.E || this.h != 0 || i18 != 0 || !s12.c2.get(i18) || this.e) {
            j10 = 0;
            z10 = true;
        } else if (s12.D0() > 10 || !g5.r(i14).n || g5.r(i14).f0.isEmpty()) {
            j10 = 0;
            z10 = true;
            this.d = null;
        } else {
            j10 = 0;
            this.d = new ArrayList(g5.r(i14).f0);
            long j12 = h10.i(i14).n;
            int size5 = this.d.size();
            int i19 = 0;
            while (i19 < size5) {
                boolean z14 = z13;
                long j13 = ((TLRPC.TL_contact) this.d.get(i19)).user_id;
                if (j13 == j12 || s12.R.f(j13) != null) {
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
        mo I = I();
        if ((I == null || I.e()) && uwVar != null && uwVar.O0 && uwVar.Q0 != j10) {
            k2.p1.x(this, 20, this.N);
            int i20 = 0;
            while (true) {
                if (i20 >= d42.size()) {
                    i3 = i14;
                    dialog = null;
                    break;
                }
                i3 = i14;
                if (((TLRPC.Dialog) d42.get(i20)).id == uwVar.Q0) {
                    dialog = (TLRPC.Dialog) d42.get(i20);
                    break;
                } else {
                    i20++;
                    i14 = i3;
                }
            }
            if (dialog == null) {
                dialog = new TLRPC.TL_dialog();
                dialog.id = uwVar.Q0;
            }
            this.N.add(new k(this, 0, dialog));
            k2.p1.x(this, 20, this.N);
        } else {
            i3 = i14;
            if ((I == null || I.e()) && uwVar != null && this.h == 3 && uwVar.R0 != j10) {
                k2.p1.x(this, 20, this.N);
                int i21 = 0;
                while (true) {
                    if (i21 >= d42.size()) {
                        dialog3 = null;
                        break;
                    } else {
                        if (((TLRPC.Dialog) d42.get(i21)).id == uwVar.R0) {
                            dialog3 = (TLRPC.Dialog) d42.get(i21);
                            break;
                        }
                        i21++;
                    }
                }
                if (dialog3 == null) {
                    dialog3 = new TLRPC.TL_dialog();
                    dialog3.id = uwVar.R0;
                }
                z11 = false;
                this.N.add(new k(this, 0, dialog3));
                k2.p1.x(this, 20, this.N);
                this.F = z11;
                i10 = this.h;
                if ((i10 != 7 || i10 == 8) && I != null && I.d()) {
                    s12.H(I.a, false);
                    jo joVar = (jo) s12.d0.get(I.a);
                    tL_chatlists_chatlistUpdates = joVar != null ? null : joVar.c;
                    if (tL_chatlists_chatlistUpdates != null && tL_chatlists_chatlistUpdates.missing_peers.size() > 0) {
                        this.F = z10;
                        this.N.add(new k(this, tL_chatlists_chatlistUpdates));
                    }
                }
                requestPeerType = this.U;
                if (requestPeerType != null) {
                    k2.p1.x(this, 15, this.N);
                }
                if (!this.K || this.T) {
                    for (i11 = 0; i11 < d42.size(); i11++) {
                        if (this.h == 2 && (d42.get(i11) instanceof ow)) {
                            this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i11)));
                        } else {
                            this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i11)));
                        }
                    }
                    k2.p1.x(this, 10, this.N);
                }
                if (this.f == 0 && this.e) {
                    this.V = true;
                    if (requestPeerType != null) {
                        k2.p1.x(this, 16, this.N);
                    } else {
                        this.N.add(new k(this, F(), 0));
                    }
                    k2.p1.x(this, 8, this.N);
                    k2.p1.x(this, 7, this.N);
                    k2.p1.x(this, 13, this.N);
                } else {
                    ArrayList arrayList6 = this.d;
                    if (arrayList6 != null && !arrayList6.isEmpty() && (i12 = this.h) != 7 && i12 != 8) {
                        if (this.f == 0) {
                            this.V = true;
                            if (requestPeerType != null) {
                                k2.p1.x(this, 16, this.N);
                            } else {
                                this.N.add(new k(this, F(), 0));
                            }
                            k2.p1.x(this, 8, this.N);
                            k2.p1.x(this, 7, this.N);
                        } else {
                            for (int i22 = 0; i22 < d42.size(); i22++) {
                                this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i22)));
                            }
                            k2.p1.x(this, 8, this.N);
                            k2.p1.x(this, 7, this.N);
                        }
                        for (int i23 = 0; i23 < this.d.size(); i23++) {
                            this.N.add(new k(this, (TLRPC.TL_contact) this.d.get(i23)));
                        }
                        k2.p1.x(this, 10, this.N);
                        z12 = true;
                        if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.f > 0) {
                            k2.p1.x(this, 12, this.N);
                        }
                        if (this.n && this.h == 3) {
                            k2.p1.x(this, 21, this.N);
                        }
                        if (!z12) {
                            for (int i24 = 0; i24 < d42.size(); i24++) {
                                if (this.h == 2 && (d42.get(i24) instanceof ow)) {
                                    this.N.add(new k(this, 14, (TLRPC.Dialog) d42.get(i24)));
                                } else {
                                    this.N.add(new k(this, 0, (TLRPC.Dialog) d42.get(i24)));
                                }
                            }
                            if (j11 != 0 || this.R || (i13 = this.h) == 7 || i13 == 8 || hp.s1(i3).c2.get(i18)) {
                                int i25 = this.f;
                                if (i25 == 0) {
                                    this.V = true;
                                    if (requestPeerType != null) {
                                        k2.p1.x(this, 16, this.N);
                                    } else {
                                        this.N.add(new k(this, F(), 0));
                                    }
                                } else {
                                    if (i18 == 0 && i25 > 10 && this.h == 0) {
                                        k2.p1.x(this, 11, this.N);
                                    }
                                    k2.p1.x(this, 10, this.N);
                                }
                            } else {
                                if (this.f != 0) {
                                    k2.p1.x(this, 1, this.N);
                                }
                                k2.p1.x(this, 10, this.N);
                            }
                        }
                        if (s12.S0.isEmpty()) {
                            int i26 = 0;
                            while (i26 < this.N.size()) {
                                k kVar = (k) this.N.get(i26);
                                if (kVar.a == 0 && (dialog2 = kVar.c) != null && s12.w2(dialog2.id)) {
                                    this.N.remove(i26);
                                    i26--;
                                }
                                i26++;
                            }
                            return;
                        }
                        return;
                    }
                    if (this.E) {
                        int size6 = hp.s1(i3).s.size();
                        k2.p1.x(this, 2, this.N);
                        for (int i27 = 0; i27 < size6; i27++) {
                            this.N.add(new k(this, (TLRPC.RecentMeUrl) hp.s1(i3).s.get(i27)));
                        }
                        k2.p1.x(this, 3, this.N);
                    } else {
                        int i28 = this.h;
                        if (i28 == 11 || i28 == 13) {
                            k2.p1.x(this, 7, this.N);
                            k2.p1.x(this, 12, this.N);
                        } else if (i28 == 12) {
                            k2.p1.x(this, 7, this.N);
                        }
                    }
                }
                z12 = false;
                if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
                }
                k2.p1.x(this, 12, this.N);
                if (this.n) {
                    k2.p1.x(this, 21, this.N);
                }
                if (!z12) {
                }
                if (s12.S0.isEmpty()) {
                }
            }
        }
        z11 = false;
        this.F = z11;
        i10 = this.h;
        if (i10 != 7) {
        }
        s12.H(I.a, false);
        jo joVar2 = (jo) s12.d0.get(I.a);
        if (joVar2 != null) {
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
        k2.p1.x(this, 10, this.N);
    }

    public final void X(yu yuVar) {
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
        o4.c c2 = u4.o.c(gVar, true);
        this.a0 = false;
        if (yuVar != null) {
            yuVar.run();
        }
        this.N = arrayList2;
        c2.c(this);
    }

    @Override // u4.h0
    public final int b() {
        int size = this.N.size();
        this.w = size;
        return size;
    }

    @Override // u4.h0
    public final long c(int i3) {
        return ((k) this.N.get(i3)).k;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((k) this.N.get(i3)).a;
    }

    @Override // u4.h0
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
        z6 P1 = hp.s1(this.G).P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = P1.E(0, m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long o10 = m5.o(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (!z10 || P1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        this.S.getOrCreateStoryViewer().U(this.c, null, arrayList2, 0, null, null, new i7(this.L, true), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
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
        int i12 = this.G;
        uw uwVar = this.S;
        Object[] objArr = 0;
        if (i11 == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) J(i3);
            Object J = J(i3 + 1);
            TLRPC.Dialog dialog2 = J instanceof TLRPC.Dialog ? (TLRPC.Dialog) J : null;
            int i13 = this.h;
            ArrayList arrayList = this.y;
            if (i13 == 2 || i13 == 15) {
                f6 f6Var = (f6) view;
                long dialogId = f6Var.getDialogId();
                if (dialog.id != 0) {
                    chat = hp.s1(i12).M0(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (M0 = hp.s1(i12).M0(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = M0;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    String str3 = chat.title;
                    if (!t3.T(chat) || chat.megagroup) {
                        int i14 = chat.participants_count;
                        H = i14 != 0 ? bd.H(',', "Members", i14) : chat.has_geo ? bd.M0(2131748650, null) : !t3.t0(chat) ? bd.M0(2131748649, null).toLowerCase() : bd.M0(2131748646, null).toLowerCase();
                    } else {
                        int i15 = chat.participants_count;
                        H = i15 != 0 ? bd.H(',', "Subscribers", i15) : !t3.t0(chat) ? bd.M0(2131752329, null).toLowerCase() : bd.M0(2131752318, null).toLowerCase();
                    }
                    str2 = str3;
                    str = H;
                    chat2 = chat;
                } else {
                    TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(dialog.id));
                    if (a22 != 0) {
                        String p10 = l10.p(a22);
                        chat2 = a22;
                        str = l10.z(a22) ? "" : a22.bot ? bd.M0(2131753156, null) : bd.d0(i12, a22, null, null);
                        str2 = p10;
                    } else {
                        str = "";
                        chat2 = null;
                        str2 = null;
                    }
                }
                f6Var.N = dialog2 != null;
                f6Var.x(chat2, null, str2, str, false, false);
                f6Var.w(arrayList.contains(Long.valueOf(f6Var.getDialogId())), dialogId == f6Var.getDialogId());
                if (i3 < this.f + 1) {
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
            t2Var.c0(arrayList.contains(Long.valueOf(dialog.id)), false);
            if (i3 == 1 && uwVar != null && uwVar.O0 && uwVar.Q0 != 0 && dialog.top_message == 0) {
                mo I = I();
                if (I == null || I.e()) {
                    t2Var.setCustomMessage(m5.w(uwVar.Q0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else if (i3 == 1 && uwVar != null && this.h == 3 && uwVar.R0 != 0 && dialog.top_message == 0) {
                mo I2 = I();
                if (I2 == null || I2.e()) {
                    t2Var.setCustomMessage(m5.w(uwVar.R0));
                } else {
                    t2Var.setCustomMessage(null);
                }
            } else {
                t2Var.setCustomMessage(null);
            }
            t2Var.e0(dialog, this.h, this.r);
            if (t2Var.getMeasuredHeight() > 0 && t2Var.getMeasuredHeight() != t2Var.E()) {
                t2Var.requestLayout();
            }
            boolean z10 = t2Var.f;
            boolean z11 = this.K;
            if (z10 != z11) {
                t2Var.f = z11;
                t2Var.requestLayout();
            }
            j jVar = this.Q;
            if (jVar != null && i3 < 10) {
                long j10 = dialog.id;
                ArrayList arrayList2 = jVar.d;
                if (!jVar.a.contains(Long.valueOf(j10)) && !jVar.b.contains(Long.valueOf(j10)) && !jVar.c.contains(Long.valueOf(j10)) && !arrayList2.contains(Long.valueOf(j10))) {
                    arrayList2.add(Long.valueOf(j10));
                }
            }
        } else if (i11 == 4) {
            ((u2) view).setRecentMeUrl((TLRPC.RecentMeUrl) J(i3));
        } else if (i11 == 5) {
            z2 z2Var = (z2) view;
            int i16 = this.b0;
            int F = F();
            this.b0 = F;
            vy0 vy0Var = z2Var.n;
            TextView textView = z2Var.h;
            fh0 fh0Var = z2Var.f;
            if (z2Var.r != F) {
                z2Var.r = F;
                if (F == 0 || F == 1) {
                    M02 = bd.M0(2131748236, null);
                    textView.setText(bd.M0(2131748238, null));
                    i10 = R.raw.utyan_newborn;
                } else if (F != 2) {
                    fh0Var.setAutoRepeat(true);
                    M02 = bd.M0(2131750809, null);
                    textView.setText(bd.M0(2131750810, null));
                    i10 = R.raw.filter_new;
                } else {
                    fh0Var.setAutoRepeat(false);
                    if (this.x) {
                        textView.setText(bd.M0(2131750724, null));
                        M02 = bd.M0(2131750723, null);
                    } else {
                        textView.setText(bd.M0(2131750726, null));
                        M02 = bd.M0(2131750725, null);
                    }
                    i10 = R.raw.filter_no_chats;
                }
                fh0Var.setVisibility(0);
                if (z2Var.r == 1) {
                    if (z2Var.d) {
                        z2Var.a = 1.0f;
                        String M03 = bd.M0(2131748237, null);
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
                    fh0Var.f(i10, 100, 100, null);
                    fh0Var.d();
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
                z2Var.setOnUtyanAnimationUpdateListener(new q6(this, 5));
                if (!z2Var.d && this.f == 0) {
                    uwVar.L4(0.0f);
                    for (tw twVar : uwVar.f0) {
                        ((u4.b0) twVar.a.getLayoutManager()).u = true;
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
            ((pa) view).d((TLRPC.User) J(i3), null, null, false);
        } else if (i11 == 7) {
            n4 n4Var = (n4) view;
            int i18 = this.h;
            if (i18 != 11 && i18 != 12 && i18 != 13) {
                n4Var.setText(bd.M0((this.f == 0 && this.e) ? 2131751804 : 2131742836, null));
            } else if (i3 == 0) {
                n4Var.setText(bd.M0(2131749257, null));
            } else {
                n4Var.setText(bd.M0(2131749256, null));
            }
        } else if (i11 != 11) {
            TLRPC.RequestPeerType requestPeerType = this.U;
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
                        int i19 = ((ow) J(i3)).a;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 == 2) {
                                    n4Var2.setText(bd.M0(2131750775, null));
                                    break;
                                }
                            } else {
                                n4Var2.setText(bd.M0(2131748312, null));
                                break;
                            }
                        } else {
                            n4Var2.setText(bd.M0(2131748313, null));
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
                        TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((k) this.N.get(i3)).i;
                        if (tL_chatlists_chatlistUpdates != null) {
                            int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                            b3Var.b(org.telegram.messenger.g0.S2(bd.G(size, "FolderUpdatesTitle", new Object[0]), k6.I6, 0, null, null), bd.G(size, "FolderUpdatesSubtitle", new Object[0]));
                            break;
                        }
                        break;
                    default:
                        switch (i11) {
                            case 20:
                                x3 x3Var = (x3) view;
                                if (uwVar == null || !uwVar.O0) {
                                    if (this.h == 3) {
                                        if (i3 == 0) {
                                            x3Var.setText(bd.M0(2131750587, null));
                                            break;
                                        } else {
                                            x3Var.setText(bd.M0(2131746269, null));
                                            break;
                                        }
                                    }
                                } else if (i3 == 0) {
                                    x3Var.setText(bd.M0(2131746270, null));
                                    break;
                                } else {
                                    x3Var.setText(bd.M0(2131746269, null));
                                    break;
                                }
                                break;
                            case 21:
                                t2 t2Var2 = (t2) view;
                                o2 o2Var = new o2();
                                o2Var.a = bd.M0(2131744781, null);
                                o2Var.b = bd.M0(2131744782, null);
                                t2Var2.t2 = false;
                                t2Var2.u2 = false;
                                t2Var2.setDialog(o2Var);
                                if (t2Var2.getMeasuredHeight() > 0 && t2Var2.getMeasuredHeight() != t2Var2.E()) {
                                    t2Var2.requestLayout();
                                    break;
                                }
                                break;
                            case 22:
                                ((n4) view).setText((String) J(i3));
                                break;
                            case 23:
                                Object J2 = J(i3);
                                t2 t2Var3 = (t2) view;
                                if (J2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat3 = (TLRPC.Chat) J2;
                                    t2Var3.R0 = t3.e0(i12, chat3);
                                    t2Var3.setCustomMessageWithoutRebuild(bd.G(chat3.participants_count, "Members", new Object[0]));
                                    t2Var3.d0(-chat3.id, null, 0, false, false);
                                    break;
                                } else {
                                    TLRPC.User user = (TLRPC.User) J2;
                                    t2Var3.R0 = t3.f0(i12, user);
                                    t2Var3.setCustomMessageWithoutRebuild(bd.M0(2131753156, null));
                                    t2Var3.d0(user.id, null, 0, false, false);
                                    break;
                                }
                        }
                }
            } else {
                if (!(view instanceof l8)) {
                    return;
                }
                l8 l8Var = (l8) view;
                int i20 = k6.q6;
                l8Var.g(i20, i20);
                if (requestPeerType == null) {
                    l8Var.o(R.drawable.msg_groups_create, bd.M0(2131751747, null), this.f != 0);
                } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    l8Var.o(R.drawable.msg_channel_create, bd.M0(2131751752, null), true);
                } else {
                    l8Var.o(R.drawable.msg_groups_create, bd.M0(2131751746, null), true);
                }
                l8Var.y = true;
                l8Var.setOffsetFromImage(75);
            }
        } else {
            y8 y8Var = (y8) view;
            y8Var.setText(bd.M0(2131744277, null));
            if (this.P == null) {
                Drawable drawable = this.c.getResources().getDrawable(R.drawable.arrow_newchat);
                this.P = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(k6.x0(null, k6.B6, false), PorterDuff.Mode.MULTIPLY));
            }
            s70 textView2 = y8Var.getTextView();
            if (textView2 != null) {
                r6.y(textView2, this.P, k6.B6, null, PorterDuff.Mode.MULTIPLY);
            }
            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (uwVar == null || !uwVar.O3) ? this.P : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        }
        if (i3 < this.f + 1) {
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        int i3 = this.G;
        hp.s1(i3);
        if (hp.s1(i3).P1().K(t2Var.getDialogId())) {
            uw uwVar = this.S;
            uwVar.getOrCreateStoryViewer().getClass();
            uwVar.getOrCreateStoryViewer().R(uwVar.getParentActivity(), t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
        this.S.T4(t2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [org.telegram.ui.Cells.t2] */
    /* JADX WARN: Type inference failed for: r2v10, types: [org.telegram.ui.Components.iz] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.ViewGroup, org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View, org.telegram.ui.Cells.u2, org.telegram.ui.Cells.z] */
    /* JADX WARN: Type inference failed for: r2v16, types: [org.telegram.ui.Cells.z2] */
    /* JADX WARN: Type inference failed for: r2v17, types: [org.telegram.ui.Cells.pa] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View, org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, org.telegram.ui.Cells.x6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v20, types: [kg.l] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.view.View, kg.i] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.View, android.widget.LinearLayout, org.telegram.ui.Cells.n6] */
    /* JADX WARN: Type inference failed for: r2v24, types: [kg.h] */
    /* JADX WARN: Type inference failed for: r2v25, types: [org.telegram.ui.Cells.b3] */
    /* JADX WARN: Type inference failed for: r2v26, types: [org.telegram.ui.Components.sm] */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.ViewGroup, kg.l] */
    /* JADX WARN: Type inference failed for: r2v28, types: [org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r2v29, types: [org.telegram.ui.Cells.n4] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v34, types: [android.view.View, org.telegram.ui.Cells.l8] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ?? r22;
        n4 n4Var;
        int i10 = 4;
        long j10 = this.W;
        int i11 = 1;
        Context context = this.c;
        switch (i3) {
            case 0:
            case 21:
                int i12 = this.h;
                if (i12 == 2 || i12 == 15) {
                    r22 = new f6(context, null);
                } else {
                    t2 t2Var = new t2(this.S, this.c, false, this.G, null);
                    if (T()) {
                        j8 j8Var = new j8(this, i10);
                        t2Var.K1 = true;
                        t2Var.L1 = j8Var;
                    }
                    t2Var.setArchivedPullAnimation(this.M);
                    t2Var.setPreloader(this.Q);
                    t2Var.setDialogCellDelegate(this);
                    t2Var.setIsTransitionSupport(this.T);
                    if (i3 == 21) {
                        b7 b7Var = new b7(t2Var.getContext(), t2Var, false, R.drawable.forward_to_stories, t2Var.K4);
                        t2Var = t2Var;
                        t2Var.H = b7Var;
                        t2Var.G = true;
                    }
                    if (j10 != 0) {
                        t2Var.P0 = true;
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
                r22 = new iz(context, null);
                r22.setIsSingleCell(true);
                int i13 = i3 == 13 ? 18 : 7;
                r22.setViewType(i13);
                if (i13 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i3 == 13) {
                    r22.setItemsCount((int) ((org.telegram.messenger.g0.q.y * 0.5f) / org.telegram.messenger.g0.L(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new n4(context);
                r22.setText(bd.M0(2131746368, null));
                TextView textView = new TextView(context);
                k2.p1.t(textView, 1, 15.0f);
                org.telegram.messenger.camera.q.o(textView, k6.L6, null, null, 2131746367);
                textView.setGravity((bd.a0 ? 3 : 5) | 16);
                r22.addView(textView, mf.d(-1, -1.0f, (bd.a0 ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ii.m(this, 6));
                break;
            case 3:
                d2 d2Var = new d2(context, 4);
                r6.i(k6.a7, d2Var, null);
                View view = new View(context);
                r6.a0(view, context, R.drawable.greydivider, k6.b7);
                d2Var.addView(view, mf.c(-1.0f, -1));
                r22 = d2Var;
                break;
            case 4:
                r22 = new u2(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.n = new u8((e6) null);
                r22.x = org.telegram.messenger.g0.L(40.0f);
                r22.G = org.telegram.messenger.g0.L(10.0f);
                r22.I = h10.t0;
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
                uw uwVar = this.S;
                if (uwVar == null || !uwVar.O0) {
                    r22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.Cells.f1) null);
                Drawable Y0 = k6.Y0(context, R.drawable.greydivider, k6.b7);
                xp xpVar = new xp(new ColorDrawable(k6.x0(null, k6.a7, false)), Y0);
                xpVar.x = true;
                r22.setBackgroundDrawable(xpVar);
                E(r22, Y0);
                break;
            case 9:
            case 12:
            default:
                r22 = new l8(context);
                if (this.h == 15) {
                    r6.i(k6.d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
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
                r22 = new n6(context);
                r22.b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new b3(context);
                break;
            case 18:
                r22 = new sm(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new org.telegram.ui.Components.n6(this.c, this.G, null, new f(this, i11), null), mf.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
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
                if (j10 != 0) {
                    t2Var2.P0 = true;
                    t2Var2.Q0 = true;
                    n4Var = t2Var2;
                }
                r22 = n4Var;
                break;
        }
        r22.setLayoutParams(new u4.p0(-1, (i3 == 5 || i3 == 19) ? -1 : -2));
        return new bj0(r22);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof t2) {
            t2 t2Var = (t2) view;
            t2Var.a0(this.I, false);
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
