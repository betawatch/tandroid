package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final r41 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final a3.f n;
    public final /* synthetic */ z r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        oi.q qVar;
        this.r = zVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new a3.f(this, 15);
        this.a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        int classGuid = zVar.getClassGuid();
        ai.e eVar = new ai.e(this, 2);
        a1.c cVar = new a1.c(this, 10);
        g6Var = ((org.telegram.ui.ActionBar.f2) zVar).resourceProvider;
        r41 r41Var = new r41(context, i10, classGuid, true, eVar, cVar, null, g6Var);
        this.c = r41Var;
        r41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        r41Var.f3.r = false;
        r41Var.setCaptureSectionsDecoratorAllowed(true);
        r41Var.setClipToPadding(false);
        r41Var.setOverScrollMode(0);
        addView(r41Var, c8.ha.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.f2) zVar).glassEngine;
        qVar.b(r41Var);
        r41Var.j(new ai.b(this, 2));
    }

    public final void a() {
        int i7;
        int i10;
        int i11;
        z zVar = this.r;
        if (zVar.O || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i12 = this.a;
        tL_payments_getStarsTransactions.inbound = i12 == 1;
        tL_payments_getStarsTransactions.outbound = i12 == 2;
        i7 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        tL_payments_getStarsTransactions.peer = qp.s1(i7).j1(zVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.f3.O(false);
        i10 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new j(1, this, str));
        i11 = ((org.telegram.ui.ActionBar.f2) zVar).currentAccount;
        ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, zVar.getClassGuid());
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
