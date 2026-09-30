package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ v30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v30 v30Var, Context context) {
        super(context);
        this.a = v30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        v30 v30Var = this.a;
        v30Var.f0.invalidate();
        v30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
