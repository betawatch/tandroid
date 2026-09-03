package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 extends ImageView {
    public final /* synthetic */ x30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x30 x30Var, Context context) {
        super(context);
        this.a = x30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        x30 x30Var = this.a;
        x30Var.c0.invalidate();
        x30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
