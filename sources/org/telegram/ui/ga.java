package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ga extends na {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.kl0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ha haVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = haVar;
        this.a = true;
    }

    @Override // org.telegram.ui.na
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ha) this.K).c.r;
            default:
                di.h2 h2Var = ((jp) this.K).c.a3.a;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(jp jpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = jpVar;
    }
}
