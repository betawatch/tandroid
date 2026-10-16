package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ il0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = serializable;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.e;
        Serializable serializable = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                ((org.telegram.ui.ActionBar.a2) obj5).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.e3 e3Var = ql0.a;
                    if (e3Var != null) {
                        e3Var.dismiss();
                        ql0.a = null;
                    }
                    ql0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), R.raw.error).j();
                    break;
                } else {
                    m51Var.run();
                    break;
                }
            case 1:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                bi.n9 n9Var = (bi.n9) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c6 c6Var2 = c1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.zc(c1Var, c6Var2).e0("UNKNOWN_BUTTON", false);
                        c1Var.x(n9Var, "requested_chat_failed", org.telegram.ui.web.c1.A(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.zc(c1Var, c6Var2).f0(tL_error, false);
                        c1Var.x(n9Var, "requested_chat_failed", org.telegram.ui.web.c1.A(str2, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(c1Var.M).lambda$processUpdates$377(updates, false);
                    c1Var.x(n9Var, "requested_chat_sent", org.telegram.ui.web.c1.A(str2, "req_id"));
                    long j10 = c1Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(c1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = c1Var.c;
                    if (h0Var != null) {
                        h0Var.b();
                        break;
                    }
                }
                break;
            default:
                zh.r3.d0((zh.r3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
