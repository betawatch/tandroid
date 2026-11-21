package org.telegram.ui;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class da extends ia {
    public final /* synthetic */ int K = 0;
    public final /* synthetic */ org.telegram.ui.Components.dk0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, h6Var);
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
    public da(ho hoVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.L = hoVar;
    }
}
