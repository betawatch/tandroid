package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ia extends pa {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.hm0 K;

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
                ei.e2 e2Var = ((uo) this.K).c.Y2.a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(uo uoVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = uoVar;
    }
}
