package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ah0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public final r0 a(int i7, int i10) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z9 ? kVar.q0 : kVar.p0, null, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final r0 b(int i7, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, g6 g6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i7));
        return f(-1, i7, i10, charSequence, i11, drawable, i12, charSequence2, g6Var);
    }

    public final r0 c(int i7, int i10, g6 g6Var) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z9 ? kVar.q0 : kVar.p0, null, org.telegram.messenger.g0.L(48.0f), null, g6Var);
    }

    public final r0 d(int i7, Drawable drawable) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, 0, null, z9 ? kVar.q0 : kVar.p0, drawable, org.telegram.messenger.g0.L(48.0f), null, null);
    }

    public final r0 e(int i7, String str) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, 0, str, z9 ? kVar.q0 : kVar.p0, null, 0, str, null);
    }

    public final r0 f(int i7, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, g6 g6Var) {
        Context context = getContext();
        boolean z9 = this.c;
        k kVar = this.b;
        r0 r0Var = new r0(context, this, i12, z9 ? kVar.s0 : kVar.r0, charSequence != null, g6Var);
        r0Var.setTag(Integer.valueOf(i10));
        if (charSequence != null) {
            r0Var.E.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13 != 0 ? i13 : -2, -1);
            int L = org.telegram.messenger.g0.L(14.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
            addView(r0Var, i7, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof ah0) {
                    r0Var.y.setAnimation((ah0) drawable);
                } else {
                    r0Var.y.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                r0Var.y.setImageResource(i11);
            }
            addView(r0Var, i7, new LinearLayout.LayoutParams(i13, -1));
        }
        r0Var.setOnClickListener(new ii.g(this, 13));
        if (charSequence2 != null) {
            r0Var.setContentDescription(charSequence2);
        }
        return r0Var;
    }

    public final r0 g(int i7, int i10, int i11) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z9 ? kVar.q0 : kVar.p0, null, i11, null, null);
    }

    public int getClosingSearchFieldWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u() && r0Var.v() && !r0Var.w()) {
                    View searchContainer = r0Var.getSearchContainer();
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
        boolean z9 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof r0) && childAt.getVisibility() == 0) {
                float x10 = childAt.getX();
                f10 = Math.min(f10, x10);
                f11 = Math.max(f11, childAt.getWidth() + x10);
                z9 = true;
            }
        }
        if (z9) {
            return (int) (f11 - f10);
        }
        return 0;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof r0) && childAt.getVisibility() != 8) {
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
            if ((childAt instanceof r0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final r0 h(int i7, int i10, int i11, String str) {
        boolean z9 = this.c;
        k kVar = this.b;
        return b(i7, i10, null, z9 ? kVar.q0 : kVar.p0, null, i11, str, null);
    }

    public final void i(boolean z9) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u() && r0Var.v()) {
                    n0 n0Var = r0Var.H;
                    if (n0Var == null || n0Var.b()) {
                        this.b.z(false);
                        r0Var.T(z9);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final r0 j(int i7) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i7));
        if (findViewWithTag instanceof r0) {
            return (r0) findViewWithTag;
        }
        return null;
    }

    public final int k() {
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof r0) {
                i7 = childAt.getMeasuredWidth() + i7;
            }
        }
        return i7;
    }

    public final x l(int i7, int i10, int i11, Drawable drawable, int i12, g6 g6Var) {
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
        xVar.h = g6Var;
        return xVar;
    }

    public final x m(Drawable drawable, g6 g6Var) {
        boolean z9 = this.c;
        k kVar = this.b;
        return l(14, 0, z9 ? kVar.q0 : kVar.p0, drawable, org.telegram.messenger.g0.L(48.0f), g6Var);
    }

    public final x n(g6 g6Var) {
        boolean z9 = this.c;
        k kVar = this.b;
        return l(32, R.drawable.call, z9 ? kVar.q0 : kVar.p0, null, org.telegram.messenger.g0.L(48.0f), g6Var);
    }

    public final void o(int i7) {
        j jVar = this.b.u0;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.k();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof r0) {
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
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.getSearchContainer() != null && r0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i7, int i10) {
        r0 j3 = j(i7);
        if (j3 != null) {
            j3.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                ((r0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                boolean z9 = this.c;
                k kVar = this.b;
                childAt.setBackgroundDrawable(l6.h0(z9 ? kVar.q0 : kVar.p0, 1, -1));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setEnabled(z9);
        }
    }

    public void setFilter(jg.o0 o0Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u()) {
                    r0Var.g0.add(o0Var);
                    if (r0Var.F.getTag() != null) {
                        r0Var.h0 = r0.size() - 1;
                    }
                    r0Var.D();
                    return;
                }
            }
        }
    }

    public void setGlassMode(boolean z9) {
        this.d = z9;
    }

    public void setOnLayoutListener(Runnable runnable) {
        this.f = runnable;
    }

    public void setPopupItemsSelectorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof r0) {
                ((r0) childAt).setPopupItemsSelectorColor(i7);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u()) {
                    r0Var.getSearchField().setCursorColor(i7);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u()) {
                    r0Var.P(str, false);
                    r0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                boolean z9 = this.c;
                k kVar = this.b;
                r0Var.setIconColor(z9 ? kVar.s0 : kVar.r0);
            }
        }
    }
}
