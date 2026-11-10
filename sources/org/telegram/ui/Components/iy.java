package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iy extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.ActionBar.h6 a;
    public final TextView b;
    public final View c;
    public final ch0 d;
    public boolean e;
    public int f;

    public iy(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, c8.ha.c(-2.0f, -2));
        this.c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ch0 ch0Var = new ch0(context);
        this.d = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        ch0Var.setImportantForAccessibility(2);
        ch0Var.setVisibility(8);
        linearLayout.addView(ch0Var, c8.ha.t(org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.c7, h6Var);
        org.telegram.messenger.k5.m(textView, 1, null, 2131748167);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 17));
        addView(linearLayout, c8.ha.c(-2.0f, -2));
        org.telegram.messenger.g0.Z3(textView, false, 2.0f, true, false);
        org.telegram.messenger.g0.Z3(radialProgressView, false, 1.0f, true, false);
        setOnTouchListener(new ei.b(18));
    }

    public final void a(int i7, int i10, int i11) {
        int i12 = i7 != 0 ? 0 : 8;
        ch0 ch0Var = this.d;
        ch0Var.setVisibility(i12);
        if (i7 != 0) {
            ch0Var.f(i7, i10, i11, null);
            ch0Var.d();
        }
    }

    public final void b() {
        org.telegram.messenger.g0.Z3(this.b, false, 0.9f, true, true);
        org.telegram.messenger.g0.Z3(this.c, true, 1.0f, true, true);
    }

    public final void c() {
        org.telegram.messenger.g0.Z3(this.b, true, 0.9f, true, true);
        org.telegram.messenger.g0.Z3(this.c, false, 1.0f, true, true);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        int paddingTop;
        this.e = true;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i13 - childAt.getMeasuredWidth()) / 2;
                View view = this.c;
                if (childAt == view && (view instanceof lz)) {
                    measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i16 = this.f;
                    if (i16 == 2) {
                        measuredHeight = (org.telegram.messenger.g0.L(100.0f) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else if (i16 == 1) {
                        measuredHeight = ((i14 / 2) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else {
                        measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    }
                }
                int i17 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i17, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i17);
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

    public void setProgressBarColor(int i7) {
        View view = this.c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        }
    }

    public void setShowAtCenter(boolean z9) {
        this.f = z9 ? 1 : 0;
    }

    public void setShowAtTop(boolean z9) {
        this.f = z9 ? 2 : 0;
    }

    public void setText(String str) {
        this.b.setText(str);
    }

    public void setTextColor(int i7) {
        TextView textView = this.b;
        org.telegram.ui.ActionBar.t6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextSize(int i7) {
        this.b.setTextSize(1, i7);
    }

    public void setTopImage(int i7) {
        TextView textView = this.b;
        if (i7 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        if (mutate != null) {
            org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.c7, this.a, PorterDuff.Mode.MULTIPLY);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(1.0f));
    }
}
