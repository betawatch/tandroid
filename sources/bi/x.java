package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x extends FrameLayout {
    public final int a;
    public final ArrayList b;
    public final r71 c;
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
        r71 r71Var = new r71(context, i11, classGuid, true, eVar, cVar, null, u6Var);
        this.c = r71Var;
        r71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        r71Var.g3.r = false;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        r71Var.setClipToPadding(false);
        r71Var.setOverScrollMode(0);
        addView(r71Var, gb1.g(-1.0f, -1));
        qVar = ((org.telegram.ui.ActionBar.r2) yVar).glassEngine;
        qVar.b(r71Var);
        r71Var.j(new ai.b(this, 3));
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
