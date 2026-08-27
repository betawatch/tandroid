package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g80 extends b9 {
    public final /* synthetic */ hh.h1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(hh.h1 h1Var, Context context) {
        super(context, false);
        this.e = h1Var;
    }

    @Override // org.telegram.ui.Components.b9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((i80) this.e.d).w) == 0 ? 0 : i0.a.e(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
