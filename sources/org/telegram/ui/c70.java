package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c70 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.u5 a;
    public final org.telegram.ui.Components.u8 b;
    public boolean c;
    public int d;
    public final /* synthetic */ d70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(d70 d70Var, Context context) {
        super(context);
        this.e = d70Var;
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        this.d = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(true);
        u5Var.setRightPadding(org.telegram.messenger.i0.L(68.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.j5, null);
        addView(u5Var, w7.b6.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.b = u8Var;
        u8Var.a.a = true;
        u8Var.setStyle(11);
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
        addView(u8Var, w7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 0, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.c = true;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.setVisibility(8);
        super.onMeasure(i10, i11);
        u5Var.setVisibility(0);
        u5Var.getLayoutParams().width = getMeasuredWidth();
        this.c = false;
        this.e.g();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.t6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
