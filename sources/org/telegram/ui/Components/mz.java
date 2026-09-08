package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mz extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.ActionBar.f6 a;
    public final TextView b;
    public final View c;
    public final aj0 d;
    public boolean e;
    public int f;

    public mz(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, w7.x5.c(-2.0f, -2));
        this.c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        aj0 aj0Var = new aj0(context);
        this.d = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        aj0Var.setImportantForAccessibility(2);
        aj0Var.setVisibility(8);
        linearLayout.addView(aj0Var, w7.x5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c7, f6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 17));
        addView(linearLayout, w7.x5.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new ci.d(18));
    }

    public final void a(int i10, int i11, int i12) {
        int i13 = i10 != 0 ? 0 : 8;
        aj0 aj0Var = this.d;
        aj0Var.setVisibility(i13);
        if (i10 != 0) {
            aj0Var.f(i10, i11, i12, null);
            aj0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.c, false, 1.0f, true);
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
                if (childAt == view && (view instanceof t00)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f;
                    if (i17 == 2) {
                        measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
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
        this.b.setTextColor(i10);
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
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.c7, this.a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
