package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ md(int i9, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, long j10) {
        this.b = i9;
        this.d = dVar;
        this.e = f3Var;
        this.c = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fe feVar = (fe) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    kh.d dVar = feVar.P0;
                    if (!dVar.J) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i9 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i9).getInputPeer(this.c);
                        ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new rc(1, feVar, context));
                        break;
                    }
                }
                break;
            default:
                kh.d dVar2 = (kh.d) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i10 = this.b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new gh.v(i10, dVar2, f3Var, this.c));
                break;
        }
    }

    public /* synthetic */ md(fe feVar, int i9, long j10, Context context) {
        this.d = feVar;
        this.b = i9;
        this.c = j10;
        this.e = context;
    }
}
