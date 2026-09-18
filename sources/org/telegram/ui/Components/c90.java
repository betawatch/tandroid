package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class c90 extends k9 {
    public final /* synthetic */ ai.v7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((e90) this.e.d).w) == 0 ? 0 : hg.k0.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
