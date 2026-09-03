package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.w30;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e0 extends ImageView {
    public final /* synthetic */ w30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(w30 w30Var, Context context) {
        super(context);
        this.a = w30Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        w30 w30Var = this.a;
        w30Var.c0.invalidate();
        w30Var.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }
}
