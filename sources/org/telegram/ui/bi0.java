package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class bi0 extends FrameLayout {
    public TLRPC.User a;
    public org.telegram.ui.Components.d90 b;
    public org.telegram.ui.Components.t00 c;
    public boolean d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.d90 d90Var = this.b;
        org.telegram.ui.Components.t00 t00Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z10 = t00Var.getVisibility() == 0;
        d90Var.setVisibility(8);
        if (z10) {
            t00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            t00Var.getLayoutParams().width = getMeasuredWidth();
            t00Var.setVisibility(0);
        }
        d90Var.setVisibility(0);
        d90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
