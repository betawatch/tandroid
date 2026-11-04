package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k70 extends x8 {
    public final /* synthetic */ ci.l1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(ci.l1 l1Var, Context context) {
        super(context, false);
        this.e = l1Var;
    }

    @Override // org.telegram.ui.Components.x8, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((m70) this.e.d).x) == 0 ? 0 : com.google.android.recaptcha.internal.a.e(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
