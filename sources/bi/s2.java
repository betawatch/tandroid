package bi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i10) {
            case 0:
                h7.g0((h7) obj6, (Utilities.Callback2) obj5, (ArrayList) obj4, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                h7.n0((h7) obj6, (qf.c) obj5, (vg.n1) obj4, (q3) obj3, (TL_stars.starGiftDepositPayload) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                v51 v51Var = (v51) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                ((org.telegram.ui.ActionBar.e2) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.k3 k3Var = dl0.a;
                    if (k3Var != null) {
                        k3Var.dismiss();
                        dl0.a = null;
                    }
                    dl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var)), R.raw.error).j();
                    break;
                } else {
                    v51Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj6;
                di.x7 x7Var = (di.x7) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u6 u6Var2 = a1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.wc(a1Var, u6Var2).f0("UNKNOWN_BUTTON", false);
                        a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.wc(a1Var, u6Var2).g0(tL_error, false);
                        a1Var.x(x7Var, "requested_chat_failed", org.telegram.ui.web.a1.A(str2, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(a1Var.M).lambda$processUpdates$379(updates, false);
                    a1Var.x(x7Var, "requested_chat_sent", org.telegram.ui.web.a1.A(str2, "req_id"));
                    long j10 = a1Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.e0 e0Var = new org.telegram.ui.web.e0(a1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(e0Var);
                    }
                    org.telegram.ui.web.g0 g0Var = a1Var.c;
                    if (g0Var != null) {
                        g0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
