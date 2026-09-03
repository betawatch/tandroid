package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v80 extends d9 {
    public final /* synthetic */ dg.v3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(dg.v3 v3Var, Context context) {
        super(context, false);
        this.e = v3Var;
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((x80) this.e.b).w) == 0 ? 0 : e2.c.e(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
