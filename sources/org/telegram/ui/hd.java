package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hd(int i7, fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, long j3) {
        this.b = i7;
        this.d = dVar;
        this.e = v2Var;
        this.c = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zd zdVar = (zd) this.d;
                Context context = (Context) this.e;
                if (view.isEnabled()) {
                    fi.d dVar = zdVar.J0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i7 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = org.telegram.messenger.qp.s1(i7).j1(this.c);
                        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ld(0, zdVar, context));
                        break;
                    }
                }
                break;
            default:
                fi.d dVar2 = (fi.d) this.d;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.e;
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i10 = this.b;
                ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new bi.b0(i10, dVar2, v2Var, this.c));
                break;
        }
    }

    public /* synthetic */ hd(zd zdVar, int i7, long j3, Context context) {
        this.d = zdVar;
        this.b = i7;
        this.c = j3;
        this.e = context;
    }
}
