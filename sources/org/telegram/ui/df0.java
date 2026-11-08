package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class df0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public TLRPC.User a;
    public org.telegram.ui.Components.w70 b;
    public org.telegram.ui.Components.mz c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.w70 w70Var = this.b;
        org.telegram.ui.Components.mz mzVar = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z9 = mzVar.getVisibility() == 0;
        w70Var.setVisibility(8);
        if (z9) {
            mzVar.setVisibility(8);
        }
        super.onMeasure(i7, makeMeasureSpec);
        if (z9) {
            mzVar.getLayoutParams().width = getMeasuredWidth();
            mzVar.setVisibility(0);
        }
        w70Var.setVisibility(0);
        w70Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        this.d = false;
        super.onMeasure(i7, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
