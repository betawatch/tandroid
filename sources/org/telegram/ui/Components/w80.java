package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w80 extends d9 {
    public final /* synthetic */ eg.t3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(eg.t3 t3Var, Context context) {
        super(context, false);
        this.e = t3Var;
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((y80) this.e.b).w) == 0 ? 0 : e2.c.e(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
