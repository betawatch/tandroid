package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
