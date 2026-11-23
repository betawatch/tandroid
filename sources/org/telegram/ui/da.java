package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class da extends ia {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ org.telegram.ui.Components.dk0 L;

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
                ah.i iVar = ((go) this.L).c.i3.b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(go goVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = goVar;
    }
}
