package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.c4;
import di.vb;
import hi.lb;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p9;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class k0 implements mi.e {
    public final Context a;
    public final h6 b;
    public final lc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public j0 h;
    public vb i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public t1 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public k0(Context context, h6 h6Var, lc lcVar, int i7, long j3) {
        this.a = context;
        this.b = h6Var;
        this.c = lcVar;
        this.d = i7;
        this.e = j3;
        this.f = np.u1(i7).O0(Long.valueOf(j3));
        this.o = np.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!this.g.d(n5.o(((TL_communities.CommunityPeerRequest) this.j.get(i7)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(h51 h51Var) {
        if (this.m || this.n || h51Var.f3.N0() + 10 <= h51Var.g3.E.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.j;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = this.j;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i7);
                long o4 = n5.o(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(o4)) {
                    TLRPC.User c22 = np.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i7 < size + (-1);
                    int i10 = mi.g.b;
                    o41 K = o41.K(mi.g.class);
                    K.H = new mi.f(o4, c22, z10);
                    K.I = this;
                    K.j = !z11;
                    arrayList.add(K);
                }
                i7++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(o41.p(29));
    }

    public final void d() {
        if (this.m || this.n || !v3.y(27, this.f)) {
            return;
        }
        this.m = true;
        np u12 = np.u1(this.d);
        String str = this.k;
        i0 i0Var = new i0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = u12.j1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, i0Var));
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.o = currentTime;
        np.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i7 = 0;
            if (z11) {
                t1 M = c5.M(this.a, this.b, hd.N0(z10 ? 2131751971 : 2131751923, null), org.telegram.messenger.g0.W2(hd.G(this.l, z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), hd.N0(z10 ? 2131754483 : 2131751592, null), new ch.k(11, this, z10));
                M.show();
                if (z10 || (textView = (TextView) M.d(-1)) == null) {
                    return;
                }
                t6.U(textView, m6.q7, null);
                return;
            }
            vb vbVar = this.i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.i = null;
            t1 t1Var = new t1(3, this.a, this.b);
            this.q = t1Var;
            t1Var.setOnCancelListener(new lb(this, 3));
            this.q.r(500L);
            np u12 = np.u1(this.d);
            i0 i0Var = new i0(this, i7);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new p9(u12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        this.g.k(null, j3);
        this.l--;
        a();
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.F();
        }
        int i10 = z10 ? 2131751868 : 2131751867;
        int i11 = this.d;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, i10, n5.s(i11, j3)));
        vb vbVar = this.i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.i = new vb(this, j3, z10, 2);
        Context context = this.a;
        h6 h6Var = this.b;
        fc fcVar = new fc(context, h6Var, false);
        TLObject g22 = np.u1(i11).g2(j3);
        e9 e9Var = fcVar.a;
        if (g22 != null) {
            e9Var.setCount(1);
            e9Var.b(0, k10.t0, g22);
            i7 = 1;
        } else {
            i7 = 0;
        }
        e9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        e9Var.setScaleX(1.333f);
        e9Var.setScaleY(1.333f);
        e9Var.a(false);
        m80 m80Var = fcVar.b;
        m80Var.setSingleLine(false);
        m80Var.setMaxLines(2);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setText(W2);
        if (m80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (hd.a0) {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (hd.a0) {
            e9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        ec ecVar = new ec(context, h6Var, true, true);
        ecVar.e(hd.N0(2131743640, null));
        ecVar.b = new c4(this, j3, 13);
        ecVar.c = this.i;
        fcVar.setButton(ecVar);
        this.c.b(fcVar, 5000).j();
    }
}
