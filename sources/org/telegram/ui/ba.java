package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ba extends ia {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ org.telegram.ui.Components.il0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ca caVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, c6Var);
        this.G = caVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ia
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((ca) this.G).c.r;
            default:
                ig.f fVar = ((wo) this.G).c.W2.a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(wo woVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = woVar;
    }
}
