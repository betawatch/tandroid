package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ia extends pa {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.ll0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = jaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.pa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).c.r;
            default:
                ci.h2 h2Var = ((ip) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ip ipVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = ipVar;
    }
}
