package bi;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qa0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ca b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ k8(ca caVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = caVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = u6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa0 qa0Var;
        qa0 qa0Var2;
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.u6 u6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j11 = this.s;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                org.telegram.ui.Components.wc Y = (R == null || R.visibleDialog != null) ? org.telegram.ui.Components.wc.Y() : org.telegram.ui.Components.wc.b0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(caVar.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            ca.e0(context, u6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            tc tcVar = new tc(context, u6Var, j10, 6, str, new m3(caVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            tcVar.setOnDismissListener(new m8(callback2, zArr, 2));
                            tcVar.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        ic.a.s(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, Y, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new l8(caVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    caVar.D = false;
                    caVar.E = true;
                    caVar.G = 0L;
                    caVar.V();
                    caVar.Q(j11);
                    caVar.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(caVar.a).contains(j11)) {
                        MessagesController.getInstance(caVar.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(caVar.a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null && (qa0Var = launchActivity.x0) != null) {
                        qa0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                ca caVar2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.u6 u6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                org.telegram.ui.Components.wc Y2 = (R2 == null || R2.visibleDialog != null) ? org.telegram.ui.Components.wc.Y() : org.telegram.ui.Components.wc.b0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(caVar2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            ca.e0(context2, u6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            tc tcVar2 = new tc(context2, u6Var2, j12, 6, str2, new m3(caVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                            tcVar2.setOnDismissListener(new m8(callback22, zArr2, 1));
                            tcVar2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        ic.a.s(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, Y2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new l8(caVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    caVar2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(caVar2.a).contains(j13)) {
                        MessagesController.getInstance(caVar2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(caVar2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.I1;
                    if (launchActivity2 != null && (qa0Var2 = launchActivity2.x0) != null) {
                        qa0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ k8(ca caVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = caVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = u6Var;
        this.n = j10;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j11;
    }
}
