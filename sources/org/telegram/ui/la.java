package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class la extends sa {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.lm0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ma maVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.K = maVar;
        this.a = true;
    }

    @Override // org.telegram.ui.sa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ma) this.K).c.r;
            default:
                di.g2 g2Var = ((lp) this.K).c.Y2.a;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(lp lpVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = lpVar;
    }
}
