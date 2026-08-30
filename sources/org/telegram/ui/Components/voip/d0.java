package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d0 extends ImageView {
    public final /* synthetic */ v30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v30 v30Var, Context context) {
        super(context);
        this.a = v30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        v30 v30Var = this.a;
        v30Var.c0.invalidate();
        v30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
