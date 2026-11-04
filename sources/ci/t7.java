package ci;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ n10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject w;
    public final /* synthetic */ TLObject x;

    public /* synthetic */ t7(e9 e9Var, TLObject tLObject, TLRPC.TL_error tL_error, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = e9Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = n10Var;
        this.f = context;
        this.h = e6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.w = tLObject2;
        this.x = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p80 p80Var;
        p80 p80Var2;
        switch (this.a) {
            case 0:
                e9 e9Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                n10 n10Var = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.e6 e6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.x;
                long j11 = this.s;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                org.telegram.ui.Components.fc X = (Q == null || Q.visibleDialog != null) ? org.telegram.ui.Components.fc.X() : org.telegram.ui.Components.fc.a0(Q);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!hp.s1(e9Var.a).j7) {
                            boolean[] zArr = {false};
                            mb mbVar = new mb(context, e6Var, j10, 6, str, new z2(e9Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, n10Var), 0L);
                            mbVar.setOnDismissListener(new u7(n10Var, zArr, 2));
                            mbVar.show();
                            break;
                        } else {
                            n10Var.a(Boolean.FALSE, null);
                            e9.c0(context, e6Var);
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        n10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        n10Var.a(Boolean.FALSE, null);
                        X.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new q7(e9Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                    e9Var.D = false;
                    e9Var.E = true;
                    e9Var.G = 0L;
                    e9Var.U();
                    e9Var.P(j11);
                    e9Var.S(true);
                    n10Var.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(e9Var.a).b();
                    if (b10 != null && b10.a(j11)) {
                        hp.s1(e9Var.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    hp.s1(e9Var.a).e7.edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.K1;
                    if (launchActivity != null && (p80Var = launchActivity.y0) != null) {
                        p80Var.c(true);
                        break;
                    }
                }
                break;
            default:
                e9 e9Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                n10 n10Var2 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.x;
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                org.telegram.ui.Components.fc X2 = (Q2 == null || Q2.visibleDialog != null) ? org.telegram.ui.Components.fc.X() : org.telegram.ui.Components.fc.a0(Q2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!hp.s1(e9Var2.a).j7) {
                            boolean[] zArr2 = {false};
                            mb mbVar2 = new mb(context2, e6Var2, j12, 6, str2, new z2(e9Var2, zArr2, j13, tLObject3, tL_textWithEntities, n10Var2), 0L);
                            mbVar2.setOnDismissListener(new u7(n10Var2, zArr2, 1));
                            mbVar2.show();
                            break;
                        } else {
                            n10Var2.a(Boolean.FALSE, null);
                            e9.c0(context2, e6Var2);
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        n10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        n10Var2.a(Boolean.FALSE, null);
                        X2.Q(R.raw.error, 36, bd.a0(null, null, 2131743888, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new q7(e9Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                    e9Var2.S(true);
                    n10Var2.a(Boolean.TRUE, null);
                    org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(e9Var2.a).b();
                    if (b11 != null && b11.a(j13)) {
                        hp.s1(e9Var2.a).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    hp.s1(e9Var2.a).e7.edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.K1;
                    if (launchActivity2 != null && (p80Var2 = launchActivity2.y0) != null) {
                        p80Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t7(e9 e9Var, TLObject tLObject, TLRPC.TL_error tL_error, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = e9Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = n10Var;
        this.f = context;
        this.h = e6Var;
        this.n = j10;
        this.r = str;
        this.w = tL_payments_paymentFormStarGift;
        this.x = starGift;
        this.s = j11;
    }
}
