package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class q2 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.a)), TLObject.FLAG_31));
    }
}
