package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h90 extends k9 {
    public final /* synthetic */ ai.w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((j90) this.e.d).w) == 0 ? 0 : hg.c.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
