// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jh implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jh(int i, c51 c51Var, nx0 nx0Var, long j) {
        this.b = i;
        this.d = c51Var;
        this.e = nx0Var;
        this.c = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.e;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i = this.b;
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new gg(i, (c51) frameLayout, (nx0) obj, this.c));
                break;
            default:
                ij1 ij1Var = (ij1) frameLayout;
                Activity activity = (Activity) obj;
                if (view.isEnabled()) {
                    c51 c51Var = ij1Var.J0;
                    if (!c51Var.R) {
                        c51Var.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i2 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = uc7.s1(i2).j1(this.c);
                        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ql(ij1Var, activity, (byte) 12));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ jh(ij1 ij1Var, int i, long j, Activity activity) {
        this.d = ij1Var;
        this.b = i;
        this.c = j;
        this.e = activity;
    }
}
