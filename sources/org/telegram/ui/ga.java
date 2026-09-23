package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ga extends na {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.ll0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = haVar;
        this.a = true;
    }

    @Override // org.telegram.ui.na
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).c.r;
            default:
                ci.h2 h2Var = ((ep) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ep epVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = epVar;
    }
}
