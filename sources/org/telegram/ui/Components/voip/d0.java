package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.g30;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d0 extends ImageView {
    public final /* synthetic */ g30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g30 g30Var, Context context) {
        super(context);
        this.a = g30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        g30 g30Var = this.a;
        g30Var.b0.invalidate();
        g30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
