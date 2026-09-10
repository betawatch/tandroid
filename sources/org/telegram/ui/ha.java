package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ha extends oa {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.ul0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = iaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.oa
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ia) this.K).c.r;
            default:
                bi.t2 t2Var = ((kp) this.K).c.a3.a;
                if (t2Var == null) {
                    return null;
                }
                return t2Var.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(kp kpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = kpVar;
    }
}
