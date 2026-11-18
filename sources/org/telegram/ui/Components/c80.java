package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c80 extends e9 {
    public final /* synthetic */ di.d1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(di.d1 d1Var, Context context) {
        super(context, false);
        this.e = d1Var;
    }

    @Override // org.telegram.ui.Components.e9, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((e80) this.e.d).x) == 0 ? 0 : com.google.android.gms.internal.vision.e2.v(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
