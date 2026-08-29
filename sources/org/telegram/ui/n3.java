package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n3 extends ph.m3 {
    public boolean V;
    public final /* synthetic */ q3 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(q3 q3Var, Context context) {
        super(context);
        this.W = q3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.V = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.V = false;
        int size = View.MeasureSpec.getSize(i11);
        z3 z3Var = this.W.G.G;
        if (z3Var != null) {
            z3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V) {
            return;
        }
        super.requestLayout();
    }
}
