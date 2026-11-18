package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class da extends ia {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ org.telegram.ui.Components.bk0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, i6Var);
        this.L = eaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ia
    public final String getUsernameEditable() {
        switch (this.K) {
            case 0:
                return ((ea) this.L).c.r;
            default:
                ah.i iVar = ((ho) this.L).c.i3.b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ho hoVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = hoVar;
    }
}
