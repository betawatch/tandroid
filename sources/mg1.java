// default package

import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mg1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ p8c d;

    public /* synthetic */ mg1(gta gtaVar, TLObject tLObject, TLRPC.TL_error tL_error, p8c p8cVar) {
        this.b = tLObject;
        this.c = tL_error;
        this.d = p8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject == null) {
                    d Q = LaunchActivity.Q();
                    if (tL_error == null || Q == null || !"CHANNEL_PRIVATE".equals(tL_error.text)) {
                        u21.Y().g0(tL_error, false);
                    } else {
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity == null || !launchActivity.isFinishing()) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = k96.M0(R.string.AppName, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            HashMap hashMap = new HashMap();
                            int i = bkb.K5;
                            hashMap.put("info1", Integer.valueOf(bkb.w0(null, i, false)));
                            hashMap.put("info2", Integer.valueOf(bkb.w0(null, i, false)));
                            alertDialog$Builder.l(R.raw.not_available, 52, bkb.w0(null, i, false), hashMap);
                            hdVar.X = true;
                            hdVar.S = k96.M0(2131752317, null);
                            hdVar.U = k96.M0(2131752429, null);
                            b00.t(null, 2131752029, alertDialog$Builder, null);
                        }
                    }
                    p8cVar.a(null);
                    break;
                } else {
                    p8cVar.a((TL_stories.TL_premium_boostsStatus) tLObject);
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    gta.c(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                    p8cVar.a(null);
                    break;
                } else {
                    p8cVar.a((TLRPC.TL_payments_paymentFormStarGift) tLObject);
                    break;
                }
        }
    }

    public /* synthetic */ mg1(TLObject tLObject, p8c p8cVar, TLRPC.TL_error tL_error) {
        this.b = tLObject;
        this.d = p8cVar;
        this.c = tL_error;
    }
}
