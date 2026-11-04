package ji;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.cc;
import ci.e1;
import ci.e3;
import gi.ob;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k9;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 implements ki.e {
    public final Context a;
    public final e6 b;
    public final fc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public h0 h;
    public cc i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public s1 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public i0(Context context, e6 e6Var, fc fcVar, int i3, long j10) {
        this.a = context;
        this.b = e6Var;
        this.c = fcVar;
        this.d = i3;
        this.e = j10;
        this.f = hp.s1(i3).M0(Long.valueOf(j10));
        this.o = hp.s1(i3).e7.getLong(a1.g.p(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!this.g.d(m5.o(((TL_communities.CommunityPeerRequest) this.j.get(i3)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(l41 l41Var) {
        if (this.m || this.n || l41Var.f3.N0() + 10 <= l41Var.g3.E.size()) {
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
            int i3 = 0;
            while (i3 < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i3);
                long o10 = m5.o(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(o10)) {
                    TLRPC.User a22 = hp.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i3 < size + (-1);
                    int i10 = ki.g.b;
                    r31 K = r31.K(ki.g.class);
                    K.G = new ki.f(o10, a22, z10);
                    K.H = this;
                    K.j = !z11;
                    arrayList.add(K);
                }
                i3++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(r31.p(29));
    }

    public final void d() {
        if (this.m || this.n || !t3.y(27, this.f)) {
            return;
        }
        this.m = true;
        hp s12 = hp.s1(this.d);
        String str = this.k;
        g0 g0Var = new g0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = s12.h1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new c3.b(1), new x3(2, s12, g0Var));
    }

    public final void e() {
        int i3 = this.d;
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        this.o = currentTime;
        hp.s1(i3).e7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i3 = 0;
            if (z11) {
                s1 O = t4.O(this.a, this.b, bd.M0(z10 ? 2131751983 : 2131751935, null), org.telegram.messenger.g0.X2(bd.G(this.l, z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), bd.M0(z10 ? 2131754486 : 2131751605, null), new e1(11, this, z10));
                O.show();
                if (z10 || (textView = (TextView) O.d(-1)) == null) {
                    return;
                }
                r6.V(textView, k6.q7, null);
                return;
            }
            cc ccVar = this.i;
            if (ccVar != null) {
                ccVar.run();
            }
            this.i = null;
            s1 s1Var = new s1(3, this.a, this.b);
            this.q = s1Var;
            s1Var.setOnCancelListener(new ob(this, 3));
            this.q.r(500L);
            hp s12 = hp.s1(this.d);
            g0 g0Var = new g0(this, i3);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j10 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j10);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new c3.b(1), new k9(s12, j10, g0Var, 1));
        }
    }

    public final void g(long j10, boolean z10) {
        int i3;
        this.g.k(null, j10);
        this.l--;
        a();
        h0 h0Var = this.h;
        if (h0Var != null) {
            h0Var.H0();
        }
        int i10 = z10 ? 2131751880 : 2131751879;
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, i10, m5.s(i11, j10)));
        cc ccVar = this.i;
        if (ccVar != null) {
            ccVar.run();
        }
        this.i = new cc(this, j10, z10, 2);
        Context context = this.a;
        e6 e6Var = this.b;
        zb zbVar = new zb(context, e6Var, false);
        TLObject e22 = hp.s1(i11).e2(j10);
        x8 x8Var = zbVar.a;
        if (e22 != null) {
            x8Var.setCount(1);
            x8Var.b(0, h10.t0, e22);
            i3 = 1;
        } else {
            i3 = 0;
        }
        x8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        x8Var.setScaleX(1.333f);
        x8Var.setScaleY(1.333f);
        x8Var.a(false);
        s70 s70Var = zbVar.b;
        s70Var.setSingleLine(false);
        s70Var.setMaxLines(2);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setText(X2);
        if (s70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i3) * 12));
            if (bd.a0) {
                ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (bd.a0) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i3 - 1) * 12)));
        }
        yb ybVar = new yb(context, e6Var, true, true);
        ybVar.e(bd.M0(2131743895, null));
        ybVar.b = new e3(this, j10, 11);
        ybVar.c = this.i;
        zbVar.setButton(ybVar);
        this.c.b(zbVar, 5000).j();
    }
}
