package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ka extends ra {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.hm0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(la laVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = laVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ra
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((la) this.K).c.r;
            default:
                ei.e2 e2Var = ((wo) this.K).c.Y2.a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(wo woVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = woVar;
    }
}
