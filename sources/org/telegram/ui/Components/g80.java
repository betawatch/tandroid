package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g80 extends nh0 {
    public final /* synthetic */ j80 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(j80 j80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.q1 = j80Var;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        this.q1.E = null;
    }
}
