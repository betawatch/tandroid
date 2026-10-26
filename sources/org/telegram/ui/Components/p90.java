package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class p90 extends m9 {
    public final /* synthetic */ bi.t1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(bi.t1 t1Var, Context context) {
        super(context, false);
        this.e = t1Var;
    }

    @Override // org.telegram.ui.Components.m9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((r90) this.e.d).w) == 0 ? 0 : c3.h0.w(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
