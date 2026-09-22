package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ga extends na {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.kl0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = haVar;
        this.a = true;
    }

    @Override // org.telegram.ui.na
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).c.r;
            default:
                ci.h2 h2Var = ((ip) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ip ipVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = ipVar;
    }
}
