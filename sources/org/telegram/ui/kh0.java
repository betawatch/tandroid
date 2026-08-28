package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class kh0 extends FrameLayout {
    public TLRPC.User a;
    public org.telegram.ui.Components.l80 b;
    public org.telegram.ui.Components.e00 c;
    public boolean d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.l80 l80Var = this.b;
        org.telegram.ui.Components.e00 e00Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z10 = e00Var.getVisibility() == 0;
        l80Var.setVisibility(8);
        if (z10) {
            e00Var.setVisibility(8);
        }
        super.onMeasure(i9, makeMeasureSpec);
        if (z10) {
            e00Var.getLayoutParams().width = getMeasuredWidth();
            e00Var.setVisibility(0);
        }
        l80Var.setVisibility(0);
        l80Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i9, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
