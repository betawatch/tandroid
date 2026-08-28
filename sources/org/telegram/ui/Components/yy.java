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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yy extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final org.telegram.ui.ActionBar.b6 a;
    public final TextView b;
    public final View c;
    public final pi0 d;
    public boolean e;
    public int f;

    public yy(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = b6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, g7.e6.c(-2.0f, -2));
        this.c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        pi0 pi0Var = new pi0(context);
        this.d = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        pi0Var.setImportantForAccessibility(2);
        pi0Var.setVisibility(8);
        linearLayout.addView(pi0Var, g7.e6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.c7, b6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 17));
        addView(linearLayout, g7.e6.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new jh.d(18));
    }

    public final void a(int i9, int i10, int i11) {
        int i12 = i9 != 0 ? 0 : 8;
        pi0 pi0Var = this.d;
        pi0Var.setVisibility(i12);
        if (i9 != 0) {
            pi0Var.f(i9, i10, i11, null);
            pi0Var.d();
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredHeight;
        int paddingTop;
        this.e = true;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i13 - childAt.getMeasuredWidth()) / 2;
                View view = this.c;
                if (childAt == view && (view instanceof e00)) {
                    measuredHeight = (i14 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i16 = this.f;
                    if (i16 == 2) {
                        measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
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

    public void setProgressBarColor(int i9) {
        View view = this.c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i9);
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

    public void setTextColor(int i9) {
        this.b.setTextColor(i9);
    }

    public void setTextSize(int i9) {
        this.b.setTextSize(1, i9);
    }

    public void setTopImage(int i9) {
        TextView textView = this.b;
        if (i9 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(i9).mutate();
        if (mutate != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.c7, this.a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
