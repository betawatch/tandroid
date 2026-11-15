package di;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v8 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ s10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject w;
    public final /* synthetic */ TLObject x;

    public /* synthetic */ l7(v8 v8Var, TLObject tLObject, TLRPC.TL_error tL_error, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = v8Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = s10Var;
        this.f = context;
        this.h = e6Var;
        this.n = j3;
        this.r = str;
        this.s = j10;
        this.w = tLObject2;
        this.x = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r80 r80Var;
        r80 r80Var2;
        switch (this.a) {
            case 0:
                v8 v8Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                s10 s10Var = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.e6 e6Var = this.h;
                long j3 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.x;
                long j10 = this.s;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                org.telegram.ui.Components.cc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.cc.X() : org.telegram.ui.Components.cc.a0(Q);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!np.s1(v8Var.a).k7) {
                            boolean[] zArr = {false};
                            cb cbVar = new cb(context, e6Var, j3, 6, str, new ai.e(v8Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, s10Var), 0L);
                            cbVar.setOnDismissListener(new m7(s10Var, zArr, 2));
                            cbVar.show();
                            break;
                        } else {
                            s10Var.a(Boolean.FALSE, null);
                            v8.c0(context, e6Var);
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        s10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        s10Var.a(Boolean.FALSE, null);
                        X.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new i7(v8Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                    v8Var.D = false;
                    v8Var.E = true;
                    v8Var.G = 0L;
                    v8Var.U();
                    v8Var.P(j10);
                    v8Var.S(true);
                    s10Var.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(v8Var.a).b();
                    if (b10 != null && b10.a(j10)) {
                        np.s1(v8Var.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                    }
                    np.s1(v8Var.a).f7.edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null && (r80Var = launchActivity.w0) != null) {
                        r80Var.c(true);
                        break;
                    }
                }
                break;
            default:
                v8 v8Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                s10 s10Var2 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.h;
                long j11 = this.n;
                String str2 = this.r;
                long j12 = this.s;
                TLObject tLObject3 = this.w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.x;
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                org.telegram.ui.Components.cc X2 = (Q2 == null || Q2.visibleDialog != null) ? org.telegram.ui.Components.cc.X() : org.telegram.ui.Components.cc.a0(Q2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!np.s1(v8Var2.a).k7) {
                            boolean[] zArr2 = {false};
                            cb cbVar2 = new cb(context2, e6Var2, j11, 6, str2, new ai.e(v8Var2, zArr2, j12, tLObject3, tL_textWithEntities, s10Var2, 2), 0L);
                            cbVar2.setOnDismissListener(new m7(s10Var2, zArr2, 1));
                            cbVar2.show();
                            break;
                        } else {
                            s10Var2.a(Boolean.FALSE, null);
                            v8.c0(context2, e6Var2);
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        s10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        s10Var2.a(Boolean.FALSE, null);
                        X2.Q(R.raw.error, 36, hd.a0(null, null, 2131743878, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new i7(v8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                    v8Var2.S(true);
                    s10Var2.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(v8Var2.a).b();
                    if (b11 != null && b11.a(j12)) {
                        np.s1(v8Var2.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                    }
                    np.s1(v8Var2.a).f7.edit().putBoolean("show_gift_for_" + j12, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.H1;
                    if (launchActivity2 != null && (r80Var2 = launchActivity2.w0) != null) {
                        r80Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l7(v8 v8Var, TLObject tLObject, TLRPC.TL_error tL_error, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.b = v8Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = s10Var;
        this.f = context;
        this.h = e6Var;
        this.n = j3;
        this.r = str;
        this.w = tL_payments_paymentFormStarGift;
        this.x = starGift;
        this.s = j10;
    }
}
