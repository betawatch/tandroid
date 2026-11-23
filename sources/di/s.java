package di;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final g51 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final ca.r n;
    public final /* synthetic */ t r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Context context, int i7) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        ri.q qVar;
        this.r = tVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new ca.r(this, 9);
        this.a = i7;
        setClipChildren(false);
        setClipToPadding(false);
        i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
        int classGuid = tVar.getClassGuid();
        bi.b bVar = new bi.b(this, 14);
        a1.c cVar = new a1.c(this, 23);
        i6Var = ((org.telegram.ui.ActionBar.g2) tVar).resourceProvider;
        g51 g51Var = new g51(context, i10, classGuid, true, bVar, cVar, null, i6Var);
        this.c = g51Var;
        g51Var.s1(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), false);
        g51Var.g3.r = false;
        g51Var.setCaptureSectionsDecoratorAllowed(true);
        g51Var.setClipToPadding(false);
        g51Var.setOverScrollMode(0);
        addView(g51Var, c8.na.c(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.g2) tVar).glassEngine;
        qVar.b(g51Var);
        g51Var.j(new bi.v1(this, 7));
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
        i7 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
        tL_payments_getStarsTransactions.peer = mp.u1(i7).l1(tVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.g3.O(false);
        i10 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new bi.o1(4, this, str));
        i11 = ((org.telegram.ui.ActionBar.g2) tVar).currentAccount;
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
