package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class x extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final s71 c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final a3.d n;
    public final /* synthetic */ y r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        oi.q qVar;
        this.r = yVar;
        this.b = new ArrayList();
        this.d = "";
        this.n = new a3.d(this, 17);
        this.a = i10;
        setClipChildren(false);
        setClipToPadding(false);
        i11 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
        int classGuid = yVar.getClassGuid();
        ai.e eVar = new ai.e(this, 3);
        a1.c cVar = new a1.c(this, 4);
        u6Var = ((org.telegram.ui.ActionBar.r2) yVar).resourceProvider;
        s71 s71Var = new s71(context, i11, classGuid, true, eVar, cVar, null, u6Var);
        this.c = s71Var;
        s71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        s71Var.g3.r = false;
        s71Var.setCaptureSectionsDecoratorAllowed(true);
        s71Var.setClipToPadding(false);
        s71Var.setOverScrollMode(0);
        addView(s71Var, kb1.g(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.r2) yVar).glassEngine;
        qVar.b(s71Var);
        s71Var.j(new ai.b(this, 3));
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        y yVar = this.r;
        if (yVar.O || this.e || this.f || this.h) {
            return;
        }
        this.e = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = true;
        int i13 = this.a;
        tL_payments_getStarsTransactions.inbound = i13 == 1;
        tL_payments_getStarsTransactions.outbound = i13 == 2;
        i10 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i10).getInputPeer(yVar.b);
        String str = this.d;
        tL_payments_getStarsTransactions.offset = str;
        tL_payments_getStarsTransactions.limit = 20;
        this.c.g3.O(false);
        i11 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new j(1, this, str));
        i12 = ((org.telegram.ui.ActionBar.r2) yVar).currentAccount;
        ConnectionsManager.getInstance(i12).bindRequestToGuid(sendRequest, yVar.getClassGuid());
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
