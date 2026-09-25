package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pd(int i10, ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, long j3) {
        this.b = i10;
        this.d = dVar;
        this.e = e3Var;
        this.c = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                je jeVar = (je) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    ci.d dVar = jeVar.T0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i10 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.v1(24, jeVar, context));
                        break;
                    }
                }
                break;
            default:
                ci.d dVar2 = (ci.d) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.random.nextInt();
                int i11 = this.b;
                ConnectionsManager.getInstance(i11).sendRequest(createconferencecall, new ai.k8(i11, dVar2, e3Var, this.c));
                break;
        }
    }

    public /* synthetic */ pd(je jeVar, int i10, long j3, Context context) {
        this.d = jeVar;
        this.b = i10;
        this.c = j3;
        this.e = context;
    }
}
