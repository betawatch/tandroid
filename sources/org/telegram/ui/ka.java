package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
