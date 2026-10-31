package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xy extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.ActionBar.p6 a;
    public final TextView b;
    public final View c;
    public final ei0 d;
    public boolean e;
    public int f;

    public xy(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, w7.b6.c(-2.0f, -2));
        this.c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ei0 ei0Var = new ei0(context);
        this.d = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        ei0Var.setImportantForAccessibility(2);
        ei0Var.setVisibility(8);
        linearLayout.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.c7, p6Var);
        org.telegram.messenger.m5.l(textView, 1, null, 2131748183);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 17));
        addView(linearLayout, w7.b6.c(-2.0f, -2));
        org.telegram.messenger.i0.Y3(textView, false, 2.0f, true, false);
        org.telegram.messenger.i0.Y3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(17));
    }

    public final void a(int i10, int i11, int i12) {
        int i13 = i10 != 0 ? 0 : 8;
        ei0 ei0Var = this.d;
        ei0Var.setVisibility(i13);
        if (i10 != 0) {
            ei0Var.f(i10, i11, i12, null);
            ei0Var.d();
        }
    }

    public final void b() {
        org.telegram.messenger.i0.Y3(this.b, false, 0.9f, true, true);
        org.telegram.messenger.i0.Y3(this.c, true, 1.0f, true, true);
    }

    public final void c() {
        org.telegram.messenger.i0.Y3(this.b, true, 0.9f, true, true);
        org.telegram.messenger.i0.Y3(this.c, false, 1.0f, true, true);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int paddingTop;
        this.e = true;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i14 - childAt.getMeasuredWidth()) / 2;
                View view = this.c;
                if (childAt == view && (view instanceof zz)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f;
                    if (i17 == 2) {
                        measuredHeight = (org.telegram.messenger.i0.L(100.0f) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else if (i17 == 1) {
                        measuredHeight = ((i15 / 2) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else {
                        measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    }
                }
                int i18 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i18, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i18);
            }
        }
        this.e = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e) {
            return;
        }
        super.requestLayout();
    }

    public void setProgressBarColor(int i10) {
        View view = this.c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        this.f = z10 ? 2 : 0;
    }

    public void setText(String str) {
        this.b.setText(str);
    }

    public void setTextColor(int i10) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.c7, this.a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(1.0f));
    }
}
