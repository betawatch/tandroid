package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class da extends ia {
    public final /* synthetic */ int J = 0;
    public final /* synthetic */ org.telegram.ui.Components.oj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, h6Var);
        this.K = eaVar;
        this.a = true;
    }

    @Override // org.telegram.ui.ia
    public final String getUsernameEditable() {
        switch (this.J) {
            case 0:
                return ((ea) this.K).c.r;
            default:
                ah.i iVar = ((go) this.K).c.h3.b;
                if (iVar == null) {
                    return null;
                }
                return iVar.getText().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(go goVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.K = goVar;
    }
}
