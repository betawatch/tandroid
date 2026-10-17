package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ j30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j30 j30Var, Context context) {
        super(context);
        this.a = j30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j30 j30Var = this.a;
        j30Var.f0.invalidate();
        j30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
