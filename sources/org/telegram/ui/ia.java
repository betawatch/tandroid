package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ia extends pa {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.lm0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(ja jaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.K = jaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.pa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ja) this.K).c.r;
            default:
                ei.e2 e2Var = ((wo) this.K).c.b3.a;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(wo woVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = woVar;
    }
}
