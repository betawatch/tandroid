package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ha extends oa {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.vl0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.K = iaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.oa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).c.r;
            default:
                ci.h2 h2Var = ((gp) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(gp gpVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.K = gpVar;
    }
}
