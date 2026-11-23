package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b80 extends d9 {
    public final /* synthetic */ di.d1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(di.d1 d1Var, Context context) {
        super(context, false);
        this.e = d1Var;
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((d80) this.e.d).x) == 0 ? 0 : com.google.android.gms.internal.vision.e2.v(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
