package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class da extends ia {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.oj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.K = eaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ia
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ea) this.K).c.r;
            default:
                ah.i iVar = ((eo) this.K).c.h3.b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(eo eoVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = eoVar;
    }
}
