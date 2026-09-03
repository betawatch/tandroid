package lh;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ya0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = t7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = f6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ya0 ya0Var;
        ya0 ya0Var2;
        switch (this.a) {
            case 0:
                t7 t7Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j11 = this.s;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                qc X = (R == null || R.visibleDialog != null) ? qc.X() : qc.a0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(t7Var.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            t7.e0(context, f6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            z9 z9Var = new z9(context, f6Var, j10, 6, str, new o2(t7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            z9Var.setOnDismissListener(new g6(callback2, zArr, 2));
                            z9Var.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        ai.r(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new f6(t7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    t7Var.D = false;
                    t7Var.E = true;
                    t7Var.G = 0L;
                    t7Var.V();
                    t7Var.Q(j11);
                    t7Var.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(t7Var.a).contains(j11)) {
                        MessagesController.getInstance(t7Var.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(t7Var.a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity != null && (ya0Var = launchActivity.u0) != null) {
                        ya0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                t7 t7Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                qc X2 = (R2 == null || R2.visibleDialog != null) ? qc.X() : qc.a0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(t7Var2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            t7.e0(context2, f6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            z9 z9Var2 = new z9(context2, f6Var2, j12, 6, str2, new o2(t7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                            z9Var2.setOnDismissListener(new g6(callback22, zArr2, 1));
                            z9Var2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        ai.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, X2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new f6(t7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    t7Var2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(t7Var2.a).contains(j13)) {
                        MessagesController.getInstance(t7Var2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(t7Var2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.D1;
                    if (launchActivity2 != null && (ya0Var2 = launchActivity2.u0) != null) {
                        ya0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = t7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = f6Var;
        this.n = j10;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j11;
    }
}
