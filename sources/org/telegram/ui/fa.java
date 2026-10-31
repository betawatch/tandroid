package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fa extends la {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.sk0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, p6Var);
        this.K = gaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.la
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ga) this.K).c.r;
            default:
                org.telegram.ui.ActionBar.n0 n0Var = ((ap) this.K).c.h3.b;
                if (n0Var == null) {
                    return null;
                }
                return n0Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ap apVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.K = apVar;
    }
}
