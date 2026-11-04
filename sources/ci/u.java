package ci;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final l41 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final ai.s n;
    public final /* synthetic */ v r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, int i3) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        pi.q qVar;
        this.r = vVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new ai.s(this, 25);
        this.a = i3;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
        int classGuid = vVar.getClassGuid();
        ai.c cVar = new ai.c(this, 12);
        a1.c cVar2 = new a1.c(this, 11);
        e6Var = ((org.telegram.ui.ActionBar.d2) vVar).resourceProvider;
        l41 l41Var = new l41(context, i10, classGuid, true, cVar, cVar2, null, e6Var);
        this.c = l41Var;
        l41Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        l41Var.g3.r = false;
        l41Var.setCaptureSectionsDecoratorAllowed(true);
        l41Var.setClipToPadding(false);
        l41Var.setOverScrollMode(0);
        addView(l41Var, mf.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.d2) vVar).glassEngine;
        qVar.b(l41Var);
        l41Var.j(new ai.j5(this, 5));
    }

    public final void a() {
        int i3;
        int i10;
        int i11;
        v vVar = this.r;
        if (vVar.P || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i12 = this.a;
        tL_payments_getStarsTransactions.inbound = i12 == 1;
        tL_payments_getStarsTransactions.outbound = i12 == 2;
        i3 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
        tL_payments_getStarsTransactions.peer = hp.s1(i3).j1(vVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.g3.O(false);
        i10 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new ai.f3(3, this, str));
        i11 = ((org.telegram.ui.ActionBar.d2) vVar).currentAccount;
        ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, vVar.getClassGuid());
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
