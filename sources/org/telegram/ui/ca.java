package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ca extends ha {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ org.telegram.ui.Components.sj0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(da daVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, e6Var);
        this.L = daVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ha
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((da) this.L).c.r;
            default:
                bh.g gVar = ((zn) this.L).c.i3.b;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(zn znVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = znVar;
    }
}
