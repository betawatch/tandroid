package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ju extends Dialog {
    public final /* synthetic */ ai.y3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(ai.y3 y3Var, Context context) {
        super(context);
        this.a = y3Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ku kuVar = (ku) this.a.b;
        kuVar.a.k(false);
        kuVar.a.e();
    }
}
