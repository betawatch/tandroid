package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fa extends ma {
    public final /* synthetic */ int G = 1;
    public final /* synthetic */ org.telegram.ui.Components.sl0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, g6Var);
        this.H = gaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ma
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ga) this.H).c.r;
            default:
                lg.f fVar = ((bp) this.H).c.X2.a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(bp bpVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = bpVar;
    }
}
