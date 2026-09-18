package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gu extends Dialog {
    public final /* synthetic */ ai.y3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.a = y3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        hu huVar = (hu) this.a.b;
        huVar.a.k(false);
        huVar.a.e();
    }
}
