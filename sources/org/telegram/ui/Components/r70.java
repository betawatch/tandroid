package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r70 extends w8 {
    public final /* synthetic */ di.e1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(di.e1 e1Var, Context context) {
        super(context, false);
        this.e = e1Var;
    }

    @Override // org.telegram.ui.Components.w8, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((t70) this.e.d).x) == 0 ? 0 : com.google.android.gms.internal.vision.e2.v(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
