package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class z extends LinearLayout {
    public boolean a;
    public final k b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public z(Context context, k kVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = kVar;
    }

    public final v0 a(int i10, int i11) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.l0, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final v0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, c6 c6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, c6Var);
    }

    public final v0 c(int i10, int i11, c6 c6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.l0, null, AndroidUtilities.dp(48.0f), null, c6Var);
    }

    public final v0 d(int i10, Drawable drawable) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, 0, null, z10 ? kVar.m0 : kVar.l0, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final v0 e(int i10, String str) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, 0, str, z10 ? kVar.m0 : kVar.l0, null, 0, str, null);
    }

    public final v0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, c6 c6Var) {
        Context context = getContext();
        boolean z10 = this.c;
        k kVar = this.b;
        v0 v0Var = new v0(context, this, i13, z10 ? kVar.o0 : kVar.n0, charSequence != null, c6Var);
        v0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            v0Var.A.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14 != 0 ? i14 : -2, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(v0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof oi0) {
                    v0Var.x.setAnimation((oi0) drawable);
                } else {
                    v0Var.x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                v0Var.x.setImageResource(i12);
            }
            addView(v0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        v0Var.setOnClickListener(new x(this, 0));
        if (charSequence2 != null) {
            v0Var.setContentDescription(charSequence2);
        }
        return v0Var;
    }

    public final v0 g(int i10, int i11, int i12) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.l0, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v0) && childAt.getVisibility() == 0) {
                float x8 = childAt.getX();
                f10 = Math.min(f10, x8);
                f11 = Math.max(f11, childAt.getWidth() + x8);
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
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof v0) && childAt.getVisibility() != 8) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof v0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final v0 h(int i10, int i11, String str, int i12) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i10, i11, null, z10 ? kVar.m0 : kVar.l0, null, i12, str, null);
    }

    public final v0 i(int i10, String str, Drawable drawable) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(1, 0, null, z10 ? kVar.m0 : kVar.l0, drawable, i10, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C && v0Var.s()) {
                    e5 e5Var = v0Var.D;
                    if (e5Var == null || e5Var.b()) {
                        this.b.w(false);
                        v0Var.L(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final v0 k(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof v0) {
            return (v0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v0) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public final y m(int i10, int i11, int i12, Drawable drawable, int i13, c6 c6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        y yVar = new y();
        yVar.i = 1.0f;
        yVar.l = 8;
        yVar.a = this;
        yVar.b = i10;
        yVar.c = i11;
        yVar.e = i12;
        yVar.f = drawable;
        yVar.g = i13;
        yVar.h = c6Var;
        return yVar;
    }

    public final y n(Drawable drawable, c6 c6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return m(14, 0, z10 ? kVar.m0 : kVar.l0, drawable, AndroidUtilities.dp(48.0f), c6Var);
    }

    public final void o(int i10) {
        j jVar = this.b.q0;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        k kVar = this.b;
        if (kVar != null) {
            kVar.g();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof v0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -AndroidUtilities.dp(5.0f);
                        marginLayoutParams.rightMargin = -AndroidUtilities.dp(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.getSearchContainer() != null && v0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        v0 k10 = k(i10);
        if (k10 != null) {
            k10.setVisibility(i11);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                ((v0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                boolean z10 = this.c;
                k kVar = this.b;
                childAt.setBackgroundDrawable(g6.f0(z10 ? kVar.m0 : kVar.l0, 1, -1));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setEnabled(z10);
        }
    }

    public void setFilter(pf.e0 e0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    v0Var.c0.add(e0Var);
                    if (v0Var.B.getTag() != null) {
                        v0Var.d0 = r0.size() - 1;
                    }
                    v0Var.y();
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

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v0) {
                ((v0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    v0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                if (v0Var.C) {
                    v0Var.H(str, false);
                    v0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v0) {
                v0 v0Var = (v0) childAt;
                boolean z10 = this.c;
                k kVar = this.b;
                v0Var.setIconColor(z10 ? kVar.o0 : kVar.n0);
            }
        }
    }
}
