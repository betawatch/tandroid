package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final u41 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final ch.w n;
    public final /* synthetic */ t r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        ri.q qVar;
        this.r = tVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new ch.w(this, 6);
        this.a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 13);
        a1.c cVar = new a1.c(this, 22);
        e6Var = ((org.telegram.ui.ActionBar.e2) tVar).resourceProvider;
        u41 u41Var = new u41(context, i10, classGuid, true, bVar, cVar, null, e6Var);
        this.c = u41Var;
        u41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        u41Var.g3.r = false;
        u41Var.setCaptureSectionsDecoratorAllowed(true);
        u41Var.setClipToPadding(false);
        u41Var.setOverScrollMode(0);
        addView(u41Var, c8.ja.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.e2) tVar).glassEngine;
        qVar.b(u41Var);
        u41Var.j(new bi.z4(this, 6));
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        t tVar = this.r;
        if (tVar.P || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i12 = this.a;
        tL_payments_getStarsTransactions.inbound = i12 == 1;
        tL_payments_getStarsTransactions.outbound = i12 == 2;
        i7 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
        tL_payments_getStarsTransactions.peer = np.s1(i7).j1(tVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.g3.O(false);
        i10 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.v2(3, this, str));
        i11 = ((org.telegram.ui.ActionBar.e2) tVar).currentAccount;
        ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, tVar.getClassGuid());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.n);
        super.onDetachedFromWindow();
    }
}
