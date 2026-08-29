package jh;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oa0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s7 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ e6(s7 s7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = s7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = c6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa0 oa0Var;
        oa0 oa0Var2;
        switch (this.a) {
            case 0:
                s7 s7Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.c6 c6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j11 = this.s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                tc X = (R == null || R.visibleDialog != null) ? tc.X() : tc.a0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(s7Var.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            s7.e0(context, c6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            y9 y9Var = new y9(context, c6Var, j10, 6, str, new n2(s7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                            y9Var.setOnDismissListener(new g6(callback2, zArr, 2));
                            y9Var.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        th.r(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new f6(s7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    s7Var.D = false;
                    s7Var.E = true;
                    s7Var.G = 0L;
                    s7Var.V();
                    s7Var.Q(j11);
                    s7Var.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(s7Var.a).contains(j11)) {
                        MessagesController.getInstance(s7Var.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    MessagesController.getInstance(s7Var.a).getMainSettings().edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null && (oa0Var = launchActivity.t0) != null) {
                        oa0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                s7 s7Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                tc X2 = (R2 == null || R2.visibleDialog != null) ? tc.X() : tc.a0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(s7Var2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            s7.e0(context2, c6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            y9 y9Var2 = new y9(context2, c6Var2, j12, 6, str2, new n2(s7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                            y9Var2.setOnDismissListener(new g6(callback22, zArr2, 1));
                            y9Var2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        th.r(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, X2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new f6(s7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    s7Var2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(s7Var2.a).contains(j13)) {
                        MessagesController.getInstance(s7Var2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    MessagesController.getInstance(s7Var2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.C1;
                    if (launchActivity2 != null && (oa0Var2 = launchActivity2.t0) != null) {
                        oa0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e6(s7 s7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = s7Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = c6Var;
        this.n = j10;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j11;
    }
}
