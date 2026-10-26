package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ja extends qa {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.lm0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ka kaVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, u6Var);
        this.K = kaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.qa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ka) this.K).c.r;
            default:
                fi.c2 c2Var = ((yo) this.K).c.i3.b;
                if (c2Var == null) {
                    return null;
                }
                return c2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(yo yoVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = yoVar;
    }
}
