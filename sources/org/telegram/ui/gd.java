package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gd(int i3, gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, long j10) {
        this.b = i3;
        this.d = dVar;
        this.e = t2Var;
        this.c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    gi.d dVar = xdVar.K0;
                    if (!dVar.R) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i3 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.hp.s1(i3).j1(this.c);
                        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new org.telegram.ui.ActionBar.h6(3, xdVar, context));
                        break;
                    }
                }
                break;
            default:
                gi.d dVar2 = (gi.d) this.d;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i10 = this.b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new ci.x(i10, dVar2, t2Var, this.c));
                break;
        }
    }

    public /* synthetic */ gd(xd xdVar, int i3, long j10, Context context) {
        this.d = xdVar;
        this.b = i3;
        this.c = j10;
        this.e = context;
    }
}
