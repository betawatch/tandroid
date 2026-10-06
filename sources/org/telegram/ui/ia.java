package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ia extends pa {
    public final /* synthetic */ int J = 1;
    public final /* synthetic */ org.telegram.ui.Components.yl0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, d6Var);
        this.K = jaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.pa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).c.r;
            default:
                ci.h2 h2Var = ((fp) this.K).c.h3.b;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(fp fpVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = fpVar;
    }
}
