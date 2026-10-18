package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class o90 extends k9 {
    public final /* synthetic */ ai.w1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(ai.w1 w1Var, Context context) {
        super(context, false);
        this.e = w1Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((q90) this.e.d).w) == 0 ? 0 : com.google.android.gms.internal.play_billing.k3.v(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
