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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dl0(Object obj, Object obj2, Serializable serializable, Object obj3, int i10) {
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
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                String str = (String) serializable;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                ((org.telegram.ui.ActionBar.b2) obj5).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    org.telegram.ui.ActionBar.f3 f3Var2 = il0.a;
                    if (f3Var2 != null) {
                        f3Var2.dismiss();
                        il0.a = null;
                    }
                    il0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, e6Var)), R.raw.error).j();
                    break;
                } else {
                    il0.a = f3Var;
                    f3Var.show();
                    break;
                }
            case 1:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj5;
                ai.da daVar = (ai.da) obj4;
                String str2 = (String) serializable;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = d1Var.e;
                if (updates == null) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.vc(d1Var, e6Var2).c0("UNKNOWN_BUTTON", false);
                        d1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                        break;
                    } else {
                        new org.telegram.ui.Components.vc(d1Var, e6Var2).d0(tL_error, false);
                        d1Var.y(daVar, "requested_chat_failed", org.telegram.ui.web.d1.B(str2, "req_id"));
                        break;
                    }
                } else {
                    MessagesController.getInstance(d1Var.M).processUpdates(updates, false);
                    d1Var.y(daVar, "requested_chat_sent", org.telegram.ui.web.d1.B(str2, "req_id"));
                    long j3 = d1Var.U.id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    org.telegram.ui.web.f0 f0Var = new org.telegram.ui.web.f0(d1Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(f0Var);
                    }
                    org.telegram.ui.web.h0 h0Var = d1Var.c;
                    if (h0Var != null) {
                        h0Var.b();
                        break;
                    }
                }
                break;
            default:
                yh.z3.c0((yh.z3) obj5, (Utilities.Callback2) obj4, (ArrayList) serializable, (Runnable) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
