// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fp2 implements co2 {
    public final Context a;
    public final vnb b;
    public final d31 c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f;
    public ep2 h;
    public dp2 i;
    public String k;
    public int l;
    public boolean m;
    public boolean n;
    public long o;
    public int p;
    public id q;
    public int r;
    public final zh6 g = new zh6();
    public final ArrayList j = new ArrayList();

    public fp2(Context context, vnb vnbVar, d31 d31Var, int i, long j) {
        this.a = context;
        this.b = vnbVar;
        this.c = d31Var;
        this.d = i;
        this.e = j;
        this.f = uc7.s1(i).M0(Long.valueOf(j));
        this.o = uc7.s1(i).X3.getLong(qu6.n(j, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        this.p = 0;
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!this.g.d(wf3.n(((TL_communities.CommunityPeerRequest) arrayList.get(i)).peer))) {
                if (r3.date <= this.o) {
                    return;
                } else {
                    this.p++;
                }
            }
        }
    }

    public final void b(q9c q9cVar) {
        if (this.m || this.n || q9cVar.f3.M0() + 10 <= q9cVar.g3.E.size()) {
            return;
        }
        d();
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.j;
        if (arrayList2.isEmpty()) {
            return;
        }
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList2.get(i);
                long n = wf3.n(communityPeerRequest.peer);
                if (!this.g.d(n)) {
                    TLRPC.User X1 = uc7.s1(this.d).X1(Long.valueOf(communityPeerRequest.requested_by));
                    boolean z = !communityPeerRequest.visible;
                    boolean z2 = i < size + (-1);
                    int i2 = eo2.b;
                    b8c K = b8c.K(eo2.class);
                    K.H = new do2(n, X1, z);
                    K.I = this;
                    K.j = !z2;
                    arrayList.add(K);
                }
                i++;
            }
        }
        if (this.n) {
            return;
        }
        arrayList.add(b8c.p(29));
    }

    public final void d() {
        if (this.m || this.n || !xc2.y(27, this.f)) {
            return;
        }
        byte b = 1;
        this.m = true;
        uc7 s1 = uc7.s1(this.d);
        String str = this.k;
        cp2 cp2Var = new cp2(this, b);
        TL_communities.TL_communities_getPeerLinkRequests tL_communities_getPeerLinkRequests = new TL_communities.TL_communities_getPeerLinkRequests();
        tL_communities_getPeerLinkRequests.community = s1.h1(this.e);
        tL_communities_getPeerLinkRequests.offset = str;
        tL_communities_getPeerLinkRequests.limit = 100;
        s1.getConnectionsManager().sendRequestTyped(tL_communities_getPeerLinkRequests, new ic((byte) 0), new ia7(s1, cp2Var, b));
    }

    public final void e() {
        int i = this.d;
        long currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        this.o = currentTime;
        uc7.s1(i).X3.edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z, boolean z2) {
        TextView textView;
        if (this.q == null && this.r == 0) {
            byte b = 0;
            if (z2) {
                id M = jj.M(this.a, this.b, ob6.M0(z ? 2131751948 : 2131751900, null), hl.S2(ob6.G(this.l, z ? "CommunityAddAllChatsMessage" : "CommunityDeclineAllMessage", new Object[0])), ob6.M0(z ? 2131754479 : 2131751569, null), new xac((byte) 13, this, z));
                M.show();
                if (z || (textView = (TextView) M.c(-1)) == null) {
                    return;
                }
                yob.X(textView, aob.q7, null);
                return;
            }
            dp2 dp2Var = this.i;
            if (dp2Var != null) {
                dp2Var.run();
            }
            this.i = null;
            id idVar = new id(3, this.b, this.a);
            this.q = idVar;
            idVar.setOnCancelListener(new cs0(this, (byte) 7));
            this.q.q(500L);
            uc7 s1 = uc7.s1(this.d);
            cp2 cp2Var = new cp2(this, b);
            TL_communities.TL_communities_toggleAllPeerLinkRequestApproval tL_communities_toggleAllPeerLinkRequestApproval = new TL_communities.TL_communities_toggleAllPeerLinkRequestApproval();
            long j = this.e;
            tL_communities_toggleAllPeerLinkRequestApproval.community = s1.h1(j);
            tL_communities_toggleAllPeerLinkRequestApproval.reject = !z;
            this.r = s1.getConnectionsManager().sendRequestTyped(tL_communities_toggleAllPeerLinkRequestApproval, new ic((byte) 0), new iv4((Object) s1, j, (Object) cp2Var, (byte) 2));
        }
    }

    public final void g(long j, boolean z) {
        int i;
        this.g.k(j, null);
        this.l--;
        a();
        ep2 ep2Var = this.h;
        if (ep2Var != null) {
            ep2Var.W();
        }
        int i2 = z ? 2131751845 : 2131751844;
        int i3 = this.d;
        SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, i2, wf3.r(i3, j)));
        dp2 dp2Var = this.i;
        if (dp2Var != null) {
            dp2Var.run();
        }
        this.i = new dp2((Object) this, j, z, (byte) 0);
        vnb vnbVar = this.b;
        Context context = this.a;
        u21 u21Var = new u21(vnbVar, context, false);
        TLObject b2 = uc7.s1(i3).b2(j);
        jc0 jc0Var = u21Var.a;
        if (b2 != null) {
            jc0Var.setCount(1);
            jc0Var.b(0, yac.t0, b2);
            i = 1;
        } else {
            i = 0;
        }
        jc0Var.setTranslationX(hl.L(7.0f));
        jc0Var.setScaleX(1.333f);
        jc0Var.setScaleY(1.333f);
        jc0Var.a(false);
        p66 p66Var = u21Var.b;
        p66Var.setSingleLine(false);
        p66Var.setMaxLines(2);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setText(S2);
        if (p66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = hl.L(74 - ((3 - i) * 12));
            if (ob6.a0) {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (ob6.a0) {
            jc0Var.setTranslationX(hl.L(32 - ((i - 1) * 12)));
        }
        t21 t21Var = new t21(vnbVar, context, true, true);
        t21Var.e(ob6.M0(2131743540, null));
        t21Var.b = new kt((Object) this, j, (byte) 11);
        t21Var.c = this.i;
        u21Var.setButton(t21Var);
        this.c.b(u21Var, 5000).j();
    }
}
