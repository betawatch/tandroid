package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h80 extends u8 {
    public final /* synthetic */ jg.a3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(jg.a3 a3Var, Context context) {
        super(context, false);
        this.e = a3Var;
    }

    @Override // org.telegram.ui.Components.u8, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(Math.min(3, ((j80) this.e.b).x) == 0 ? 0 : i0.a.e(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
