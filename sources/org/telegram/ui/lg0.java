package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class lg0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public TLRPC.User a;
    public org.telegram.ui.Components.p80 b;
    public org.telegram.ui.Components.zz c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.p80 p80Var = this.b;
        org.telegram.ui.Components.zz zzVar = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z10 = zzVar.getVisibility() == 0;
        p80Var.setVisibility(8);
        if (z10) {
            zzVar.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            zzVar.getLayoutParams().width = getMeasuredWidth();
            zzVar.setVisibility(0);
        }
        p80Var.setVisibility(0);
        p80Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
