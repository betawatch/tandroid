package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.e4;
import di.vb;
import hi.gc;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o9;
import org.telegram.messenger.v3;
import org.telegram.messenger.z3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j0 implements mi.e {
    public final Context a;
    public final i6 b;
    public final kc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public i0 h;
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

    public j0(Context context, i6 i6Var, kc kcVar, int i7, long j3) {
        this.a = context;
        this.b = i6Var;
        this.c = kcVar;
        this.d = i7;
        this.e = j3;
        this.f = mp.u1(i7).O0(Long.valueOf(j3));
        this.o = mp.u1(i7).h7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
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

    public final void b(g51 g51Var) {
        if (this.m || this.n || g51Var.f3.N0() + 10 <= g51Var.g3.E.size()) {
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
                    TLRPC.User c22 = mp.u1(this.d).c2(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i7 < size + (-1);
                    int i10 = mi.g.b;
                    n41 K = n41.K(mi.g.class);
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
        arrayList.add(n41.p(29));
    }

    public final void d() {
        if (this.m || this.n || !v3.y(27, this.f)) {
            return;
        }
        this.m = true;
        mp u12 = mp.u1(this.d);
        String str = this.k;
        h0 h0Var = new h0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = u12.j1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        u12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new z3(3, u12, h0Var));
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.o = currentTime;
        mp.u1(i7).h7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i7 = 0;
            if (z11) {
                t1 M = b5.M(this.a, this.b, gd.N0(z10 ? 2131751971 : 2131751923, null), org.telegram.messenger.g0.W2(gd.G(this.l, z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), gd.N0(z10 ? 2131754483 : 2131751592, null), new ch.k(11, this, z10));
                M.show();
                if (z10 || (textView = (TextView) M.d(-1)) == null) {
                    return;
                }
                u6.U(textView, n6.q7, null);
                return;
            }
            vb vbVar = this.i;
            if (vbVar != null) {
                vbVar.run();
            }
            this.i = null;
            t1 t1Var = new t1(3, this.a, this.b);
            this.q = t1Var;
            t1Var.setOnCancelListener(new gc(this, 3));
            this.q.r(500L);
            mp u12 = mp.u1(this.d);
            h0 h0Var = new h0(this, i7);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = u12.j1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.r = u12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new o9(u12, j3, h0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        this.g.k(null, j3);
        this.l--;
        a();
        i0 i0Var = this.h;
        if (i0Var != null) {
            i0Var.o();
        }
        int i10 = z10 ? 2131751868 : 2131751867;
        int i11 = this.d;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i10, n5.s(i11, j3)));
        vb vbVar = this.i;
        if (vbVar != null) {
            vbVar.run();
        }
        this.i = new vb(this, j3, z10, 2);
        Context context = this.a;
        i6 i6Var = this.b;
        ec ecVar = new ec(context, i6Var, false);
        TLObject g22 = mp.u1(i11).g2(j3);
        d9 d9Var = ecVar.a;
        if (g22 != null) {
            d9Var.setCount(1);
            d9Var.b(0, i10.t0, g22);
            i7 = 1;
        } else {
            i7 = 0;
        }
        d9Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        d9Var.setScaleX(1.333f);
        d9Var.setScaleY(1.333f);
        d9Var.a(false);
        j80 j80Var = ecVar.b;
        j80Var.setSingleLine(false);
        j80Var.setMaxLines(2);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setText(W2);
        if (j80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (gd.a0) {
                ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (gd.a0) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        dc dcVar = new dc(context, i6Var, true, true);
        dcVar.e(gd.N0(2131743638, null));
        dcVar.b = new e4(this, j3, 13);
        dcVar.c = this.i;
        ecVar.setButton(dcVar);
        this.c.b(ecVar, 5000).j();
    }
}
