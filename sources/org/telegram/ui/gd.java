package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gd(int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.b = i7;
        this.d = eVar;
        this.e = w2Var;
        this.c = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xd xdVar = (xd) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    hi.e eVar = xdVar.K0;
                    if (!eVar.R) {
                        eVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.np.u1(i7).l1(this.c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new u7(2, xdVar, context));
                        break;
                    }
                }
                break;
            default:
                hi.e eVar2 = (hi.e) this.d;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i10 = this.b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new di.v(i10, eVar2, w2Var, this.c));
                break;
        }
    }

    public /* synthetic */ gd(xd xdVar, int i7, long j3, Context context) {
        this.d = xdVar;
        this.b = i7;
        this.c = j3;
        this.e = context;
    }
}
