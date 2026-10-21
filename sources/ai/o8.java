package ai;

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
import org.telegram.ui.ja0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ga b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ o8(ga gaVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = gaVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = d6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ja0 ja0Var;
        ja0 ja0Var2;
        switch (this.a) {
            case 0:
                ga gaVar = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.d6 d6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j11 = this.s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                org.telegram.ui.Components.xc X = (R == null || R.visibleDialog != null) ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(gaVar.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            ga.e0(context, d6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            cd cdVar = new cd(context, d6Var, j10, 6, str, new q3(gaVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            cdVar.setOnDismissListener(new q8(callback2, zArr, 2));
                            cdVar.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        i2.e.s(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new p8(gaVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    gaVar.D = false;
                    gaVar.E = true;
                    gaVar.G = 0L;
                    gaVar.V();
                    gaVar.Q(j11);
                    gaVar.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(gaVar.a).contains(j11)) {
                        MessagesController.getInstance(gaVar.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(gaVar.a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null && (ja0Var = launchActivity.x0) != null) {
                        ja0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                ga gaVar2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                org.telegram.ui.Components.xc X2 = (R2 == null || R2.visibleDialog != null) ? org.telegram.ui.Components.xc.X() : org.telegram.ui.Components.xc.a0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(gaVar2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            ga.e0(context2, d6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            cd cdVar2 = new cd(context2, d6Var2, j12, 6, str2, new q3(gaVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                            cdVar2.setOnDismissListener(new q8(callback22, zArr2, 1));
                            cdVar2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        i2.e.s(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, X2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new p8(gaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    gaVar2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(gaVar2.a).contains(j13)) {
                        MessagesController.getInstance(gaVar2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(gaVar2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.H1;
                    if (launchActivity2 != null && (ja0Var2 = launchActivity2.x0) != null) {
                        ja0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o8(ga gaVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = gaVar;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = d6Var;
        this.n = j10;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j11;
    }
}
