package gh;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ h6(v7 v7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = v7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = b6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la0 la0Var;
        la0 la0Var2;
        switch (this.a) {
            case 0:
                v7 v7Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.b6 b6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j11 = this.s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                oc X = (R == null || R.visibleDialog != null) ? oc.X() : oc.a0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(v7Var.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            v7.e0(context, b6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            ea eaVar = new ea(context, b6Var, j10, 6, str, new p2(v7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            eaVar.setOnDismissListener(new j6(callback2, zArr, 2));
                            eaVar.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new i6(v7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    v7Var.D = false;
                    v7Var.E = true;
                    v7Var.G = 0L;
                    v7Var.V();
                    v7Var.Q(j11);
                    v7Var.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(v7Var.a).contains(j11)) {
                        MessagesController.getInstance(v7Var.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(v7Var.a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null && (la0Var = launchActivity.t0) != null) {
                        la0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                v7 v7Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.b6 b6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                oc X2 = (R2 == null || R2.visibleDialog != null) ? oc.X() : oc.a0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(v7Var2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            v7.e0(context2, b6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            ea eaVar2 = new ea(context2, b6Var2, j12, 6, str2, new p2(v7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                            eaVar2.setOnDismissListener(new j6(callback22, zArr2, 1));
                            eaVar2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, X2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new i6(v7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    v7Var2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(v7Var2.a).contains(j13)) {
                        MessagesController.getInstance(v7Var2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(v7Var2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.C1;
                    if (launchActivity2 != null && (la0Var2 = launchActivity2.t0) != null) {
                        la0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h6(v7 v7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = v7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = b6Var;
        this.n = j10;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j11;
    }
}
