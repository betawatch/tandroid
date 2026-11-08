package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class o70 extends z8 {
    public final /* synthetic */ bi.s1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(bi.s1 s1Var, Context context) {
        super(context, false);
        this.e = s1Var;
    }

    @Override // org.telegram.ui.Components.z8, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((q70) this.e.d).x) == 0 ? 0 : com.google.android.recaptcha.internal.a.e(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
