package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
