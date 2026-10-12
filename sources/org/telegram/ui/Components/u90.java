package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u90 extends n9 {
    public final /* synthetic */ bi.i7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(bi.i7 i7Var, Context context) {
        super(context, false);
        this.e = i7Var;
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((w90) this.e.d).w) == 0 ? 0 : com.google.android.gms.internal.play_billing.k3.v(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
