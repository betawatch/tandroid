package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t80 extends i9 {
    public final /* synthetic */ ai.v7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((v80) this.e.d).w) == 0 ? 0 : hg.c.g(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
