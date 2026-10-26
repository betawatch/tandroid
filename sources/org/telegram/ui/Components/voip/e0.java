package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.m30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ m30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m30 m30Var, Context context) {
        super(context);
        this.a = m30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        m30 m30Var = this.a;
        m30Var.f0.invalidate();
        m30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
