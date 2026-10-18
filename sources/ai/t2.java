package ai;

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
import org.telegram.ui.Components.f51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wk0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                k7.h0((k7) obj6, (Utilities.Callback2) obj5, (ArrayList) obj4, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                k7.c1((k7) obj6, (pf.c) obj5, (ug.m1) obj4, (s3) obj3, (TL_stars.starGiftDepositPayload) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                f51 f51Var = (f51) obj5;
                String str = (String) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                ((org.telegram.ui.ActionBar.b2) obj6).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.f3 f3Var = wk0.a;
                    if (f3Var != null) {
                        f3Var.dismiss();
                        wk0.a = null;
                    }
                    wk0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var)), R.raw.error).j();
                    break;
                } else {
                    f51Var.run();
                    break;
                }
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj6;
                ci.y7 y7Var = (ci.y7) obj5;
                String str2 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.d6 d6Var2 = b1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.xc(b1Var, d6Var2).e0("UNKNOWN_BUTTON", false);
                        b1Var.x(y7Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.xc(b1Var, d6Var2).f0(tL_error, false);
                        b1Var.x(y7Var, "requested_chat_failed", org.telegram.ui.web.b1.A(str2, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(b1Var.M).lambda$processUpdates$377(updates, false);
                    b1Var.x(y7Var, "requested_chat_sent", org.telegram.ui.web.b1.A(str2, "req_id"));
                    long j10 = b1Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(b1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = b1Var.c;
                    if (h0Var != null) {
                        h0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
