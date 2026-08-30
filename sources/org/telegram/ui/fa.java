package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fa extends ma {
    public final /* synthetic */ int G = 1;
    public final /* synthetic */ org.telegram.ui.Components.rl0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ga gaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.H = gaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ma
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ga) this.H).c.r;
            default:
                kg.f fVar = ((bp) this.H).c.X2.a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(bp bpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = bpVar;
    }
}
