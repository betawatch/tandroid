package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class y extends LinearLayout {
    public boolean a;
    public final k b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public y(Context context, k kVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = kVar;
    }

    public final q0 a(int i7, int i10) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z10 ? kVar.r0 : kVar.q0, null, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 b(int i7, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, i6 i6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i7));
        return f(-1, i7, i10, charSequence, i11, drawable, i12, charSequence2, i6Var);
    }

    public final q0 c(int i7, int i10, i6 i6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z10 ? kVar.r0 : kVar.q0, null, org.telegram.messenger.g0.L(48.0f), null, i6Var);
    }

    public final q0 d(int i7, Drawable drawable) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, 0, null, z10 ? kVar.r0 : kVar.q0, drawable, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final q0 e(int i7, String str) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, 0, str, z10 ? kVar.r0 : kVar.q0, null, 0, str, null);
    }

    public final q0 f(int i7, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, i6 i6Var) {
        Context context = getContext();
        boolean z10 = this.c;
        k kVar = this.b;
        q0 q0Var = new q0(context, this, i12, z10 ? kVar.t0 : kVar.s0, charSequence != null, i6Var);
        q0Var.setTag(Integer.valueOf(i10));
        if (charSequence != null) {
            q0Var.F.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13 != 0 ? i13 : -2, -1);
            int L = org.telegram.messenger.g0.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(q0Var, i7, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof nh0) {
                    q0Var.y.setAnimation((nh0) drawable);
                } else {
                    q0Var.y.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                q0Var.y.setImageResource(i11);
            }
            addView(q0Var, i7, new LinearLayout.LayoutParams(i13, -1));
        }
        q0Var.setOnClickListener(new hi.z4(this, 20));
        if (charSequence2 != null) {
            q0Var.setContentDescription(charSequence2);
        }
        return q0Var;
    }

    public final q0 g(int i7, int i10, int i11) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z10 ? kVar.r0 : kVar.q0, null, i11, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v() && q0Var.w() && !q0Var.x()) {
                    View searchContainer = q0Var.getSearchContainer();
                    while (searchContainer != null && searchContainer.getParent() != this) {
                        searchContainer = searchContainer.getParent() instanceof View ? (View) searchContainer.getParent() : null;
                    }
                    if (searchContainer != null && searchContainer.getVisibility() != 8) {
                        int measuredWidth = searchContainer.getMeasuredWidth() + i7;
                        if (searchContainer.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchContainer.getLayoutParams();
                            i7 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + measuredWidth;
                        } else {
                            i7 = measuredWidth;
                        }
                    }
                }
            }
        }
        return i7;
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof q0) && childAt.getVisibility() == 0) {
                float x10 = childAt.getX();
                f10 = Math.min(f10, x10);
                f11 = Math.max(f11, childAt.getWidth() + x10);
                z10 = true;
            }
        }
        if (z10) {
            return (int) (f11 - f10);
        }
        return 0;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof q0) && childAt.getVisibility() != 8) {
                i7 = childAt.getMeasuredWidth() + i7;
            }
        }
        return i7;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof q0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final q0 h(int i7, int i10, int i11, String str) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z10 ? kVar.r0 : kVar.q0, null, i11, str, null);
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v() && q0Var.w()) {
                    m0 m0Var = q0Var.I;
                    if (m0Var == null || m0Var.b()) {
                        this.b.A(false);
                        q0Var.U(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final q0 j(int i7) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i7));
        if (findViewWithTag instanceof q0) {
            return (q0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                i7 = childAt.getMeasuredWidth() + i7;
            }
        }
        return i7;
    }

    public final x l(int i7, int i10, int i11, Drawable drawable, int i12, i6 i6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i7));
        x xVar = new x();
        xVar.i = 1.0f;
        xVar.l = 8;
        xVar.a = this;
        xVar.b = i7;
        xVar.c = i10;
        xVar.e = i11;
        xVar.f = drawable;
        xVar.g = i12;
        xVar.h = i6Var;
        return xVar;
    }

    public final x m(Drawable drawable, i6 i6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return l(14, 0, z10 ? kVar.r0 : kVar.q0, drawable, org.telegram.messenger.g0.L(48.0f), i6Var);
    }

    public final x n(i6 i6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return l(32, R.drawable.call, z10 ? kVar.r0 : kVar.q0, null, org.telegram.messenger.g0.L(48.0f), i6Var);
    }

    public final void o(int i7) {
        j jVar = this.b.v0;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.m();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof q0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -org.telegram.messenger.g0.L(5.0f);
                        marginLayoutParams.rightMargin = -org.telegram.messenger.g0.L(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.getSearchContainer() != null && q0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i7, int i10) {
        q0 j3 = j(i7);
        if (j3 != null) {
            j3.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                ((q0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                boolean z10 = this.c;
                k kVar = this.b;
                childAt.setBackgroundDrawable(n6.h0(z10 ? kVar.r0 : kVar.q0, 1, -1));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setEnabled(z10);
        }
    }

    public void setFilter(jg.o0 o0Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.h0.add(o0Var);
                    if (q0Var.G.getTag() != null) {
                        q0Var.i0 = r0.size() - 1;
                    }
                    q0Var.E();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z10) {
        this.d = z10;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setPopupItemsSelectorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                ((q0) childAt).setPopupItemsSelectorColor(i7);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.getSearchField().setCursorColor(i7);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.Q(str, false);
                    q0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                boolean z10 = this.c;
                k kVar = this.b;
                q0Var.setIconColor(z10 ? kVar.t0 : kVar.s0);
            }
        }
    }
}
