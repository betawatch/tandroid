package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g60 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.m5 a;
    public final org.telegram.ui.Components.y8 b;
    public boolean c;
    public int d;
    public final /* synthetic */ h60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(h60 h60Var, Context context) {
        super(context);
        this.e = h60Var;
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        this.d = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.a = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(68.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.j5, null);
        addView(m5Var, c8.ha.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.b = y8Var;
        y8Var.a.a = true;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(y8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 0, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.c = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.setVisibility(8);
        super.onMeasure(i7, i10);
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth();
        this.c = false;
        this.e.g();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.m6.H1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
