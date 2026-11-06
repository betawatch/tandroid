package ii;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.k1;
import bi.kd;
import bi.r3;
import fi.ob;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class l0 implements ji.e {
    public final Context a;
    public final f6 b;
    public final hc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public k0 h;
    public kd i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public u1 q;
    public int r;
    public final a0.h g = new a0.h();
    public ArrayList j = new ArrayList();

    public l0(Context context, f6 f6Var, hc hcVar, int i7, long j3) {
        this.a = context;
        this.b = f6Var;
        this.c = hcVar;
        this.d = i7;
        this.e = j3;
        this.f = qp.s1(i7).M0(Long.valueOf(j3));
        this.o = qp.s1(i7).e7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!this.g.d(m5.o(((TL_communities.CommunityPeerRequest) this.j.get(i7)).peer))) {
                if (r2.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(q41 q41Var) {
        if (this.m || this.n || q41Var.e3.N0() + 10 <= q41Var.f3.D.size()) {
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
                long o4 = m5.o(communityPeerRequest.peer);
                a0.h hVar = this.g;
                if (hVar == null || !hVar.d(o4)) {
                    TLRPC.User a22 = qp.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z9 = !communityPeerRequest.visible;
                    boolean z10 = i7 < size + (-1);
                    int i10 = ji.g.b;
                    x31 K = x31.K(ji.g.class);
                    K.G = new ji.f(o4, a22, z9);
                    K.H = this;
                    K.j = !z10;
                    arrayList.add(K);
                }
                i7++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(x31.p(29));
    }

    public final void d() {
        if (this.m || this.n || !t3.y(27, this.f)) {
            return;
        }
        this.m = true;
        qp s12 = qp.s1(this.d);
        String str = this.k;
        j0 j0Var = new j0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = s12.h1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new x3(3, s12, j0Var));
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.o = currentTime;
        qp.s1(i7).e7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z9, boolean z10) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i7 = 0;
            if (z10) {
                u1 M = v4.M(this.a, this.b, hd.M0(z9 ? 2131751983 : 2131751935, null), org.telegram.messenger.g0.X2(hd.G(this.l, z9 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), hd.M0(z9 ? 2131754486 : 2131751605, null), new k1(11, this, z9));
                M.show();
                if (z9 || (textView = (TextView) M.d(-1)) == null) {
                    return;
                }
                r6.V(textView, k6.q7, null);
                return;
            }
            kd kdVar = this.i;
            if (kdVar != null) {
                kdVar.run();
            }
            this.i = null;
            u1 u1Var = new u1(3, this.a, this.b);
            this.q = u1Var;
            u1Var.setOnCancelListener(new ob(this, 3));
            this.q.r(500L);
            qp s12 = qp.s1(this.d);
            j0 j0Var = new j0(this, i7);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z9;
            this.r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new q9(s12, j3, j0Var, 1));
        }
    }

    public final void g(long j3, boolean z9) {
        int i7;
        this.g.k(null, j3);
        this.l--;
        a();
        k0 k0Var = this.h;
        if (k0Var != null) {
            k0Var.u();
        }
        int i10 = z9 ? 2131751880 : 2131751879;
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i10, m5.s(i11, j3)));
        kd kdVar = this.i;
        if (kdVar != null) {
            kdVar.run();
        }
        this.i = new kd(this, j3, z9, 2);
        Context context = this.a;
        f6 f6Var = this.b;
        bc bcVar = new bc(context, f6Var, false);
        TLObject e22 = qp.s1(i11).e2(j3);
        z8 z8Var = bcVar.a;
        if (e22 != null) {
            z8Var.setCount(1);
            z8Var.b(0, p10.s0, e22);
            i7 = 1;
        } else {
            i7 = 0;
        }
        z8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        z8Var.setScaleX(1.333f);
        z8Var.setScaleY(1.333f);
        z8Var.a(false);
        w70 w70Var = bcVar.b;
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(2);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setText(X2);
        if (w70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (hd.a0) {
                ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (hd.a0) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        ac acVar = new ac(context, f6Var, true, true);
        acVar.e(hd.M0(2131743886, null));
        acVar.b = new r3(this, j3, 11);
        acVar.c = this.i;
        bcVar.setButton(acVar);
        this.c.b(bcVar, 5000).j();
    }
}
