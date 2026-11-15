package li;

import a8.p0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import di.rb;
import di.x2;
import hi.lb;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.p9;
import org.telegram.messenger.t3;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class k0 implements mi.e {
    public final Context a;
    public final e6 b;
    public final cc c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public j0 h;
    public rb i;
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

    public k0(Context context, e6 e6Var, cc ccVar, int i7, long j3) {
        this.a = context;
        this.b = e6Var;
        this.c = ccVar;
        this.d = i7;
        this.e = j3;
        this.f = np.s1(i7).M0(Long.valueOf(j3));
        this.o = np.s1(i7).f7.getLong(p0.o(j3, "community_requests_last_view_time_"), 0L);
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

    public final void b(u41 u41Var) {
        if (this.m || this.n || u41Var.f3.N0() + 10 <= u41Var.g3.E.size()) {
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
                    TLRPC.User a22 = np.s1(this.d).a2(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z10 = !communityPeerRequest.visible;
                    boolean z11 = i7 < size + (-1);
                    int i10 = mi.g.b;
                    b41 K = b41.K(mi.g.class);
                    K.G = new mi.f(o4, a22, z10);
                    K.H = this;
                    K.j = !z11;
                    arrayList.add(K);
                }
                i7++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(b41.p(29));
    }

    public final void d() {
        if (this.m || this.n || !t3.y(27, this.f)) {
            return;
        }
        this.m = true;
        np s12 = np.s1(this.d);
        String str = this.k;
        i0 i0Var = new i0(this, 1);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = s12.h1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        s12.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new d3.b(1), new x3(3, s12, i0Var));
    }

    public final void e() {
        int i7 = this.d;
        long currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        this.o = currentTime;
        np.s1(i7).f7.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            int i7 = 0;
            if (z11) {
                t1 M = t4.M(this.a, this.b, hd.M0(z10 ? 2131751983 : 2131751935, null), org.telegram.messenger.g0.X2(hd.G(this.l, z10 ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), hd.M0(z10 ? 2131754486 : 2131751604, null), new ai.q(12, this, z10));
                M.show();
                if (z10 || (textView = (TextView) M.d(-1)) == null) {
                    return;
                }
                q6.U(textView, j6.q7, null);
                return;
            }
            rb rbVar = this.i;
            if (rbVar != null) {
                rbVar.run();
            }
            this.i = null;
            t1 t1Var = new t1(3, this.a, this.b);
            this.q = t1Var;
            t1Var.setOnCancelListener(new lb(this, 3));
            this.q.r(500L);
            np s12 = np.s1(this.d);
            i0 i0Var = new i0(this, i7);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j3 = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s12.h1(j3);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z10;
            this.r = s12.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new d3.b(1), new p9(s12, j3, i0Var, 1));
        }
    }

    public final void g(long j3, boolean z10) {
        int i7;
        this.g.k(null, j3);
        this.l--;
        a();
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.I();
        }
        int i10 = z10 ? 2131751880 : 2131751879;
        int i11 = this.d;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i10, m5.s(i11, j3)));
        rb rbVar = this.i;
        if (rbVar != null) {
            rbVar.run();
        }
        this.i = new rb(this, j3, z10, 2);
        Context context = this.a;
        e6 e6Var = this.b;
        wb wbVar = new wb(context, e6Var, false);
        TLObject e22 = np.s1(i11).e2(j3);
        w8 w8Var = wbVar.a;
        if (e22 != null) {
            w8Var.setCount(1);
            w8Var.b(0, m10.t0, e22);
            i7 = 1;
        } else {
            i7 = 0;
        }
        w8Var.setTranslationX(org.telegram.messenger.g0.L(7.0f));
        w8Var.setScaleX(1.333f);
        w8Var.setScaleY(1.333f);
        w8Var.a(false);
        z70 z70Var = wbVar.b;
        z70Var.setSingleLine(false);
        z70Var.setMaxLines(2);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setText(X2);
        int i12 = 12;
        if (z70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (hd.a0) {
                ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (hd.a0) {
            w8Var.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        vb vbVar = new vb(context, e6Var, true, true);
        vbVar.e(hd.M0(2131743885, null));
        vbVar.b = new x2(this, j3, i12);
        vbVar.c = this.i;
        wbVar.setButton(vbVar);
        this.c.b(wbVar, 5000).j();
    }
}
