package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q90 extends m9 {
    public final /* synthetic */ bi.t1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(bi.t1 t1Var, Context context) {
        super(context, false);
        this.e = t1Var;
    }

    @Override // org.telegram.ui.Components.m9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((s90) this.e.d).w) == 0 ? 0 : c3.h0.w(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
