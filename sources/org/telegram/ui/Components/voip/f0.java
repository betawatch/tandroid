package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.b40;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f0 extends ImageView {
    public final /* synthetic */ b40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b40 b40Var, Context context) {
        super(context);
        this.a = b40Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        b40 b40Var = this.a;
        b40Var.f0.invalidate();
        b40Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
