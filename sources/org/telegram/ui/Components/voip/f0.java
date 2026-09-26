package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.v30;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
