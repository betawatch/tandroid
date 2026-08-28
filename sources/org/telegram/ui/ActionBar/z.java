package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public final w0 a(int i9, int i10) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, i10, null, z10 ? kVar.m0 : kVar.l0, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i9, int i10, CharSequence charSequence, int i11, Drawable drawable, int i12, CharSequence charSequence2, b6 b6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i9));
        return f(-1, i9, i10, charSequence, i11, drawable, i12, charSequence2, b6Var);
    }

    public final w0 c(int i9, int i10, b6 b6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, i10, null, z10 ? kVar.m0 : kVar.l0, null, AndroidUtilities.dp(48.0f), null, b6Var);
    }

    public final w0 d(int i9, Drawable drawable) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, 0, null, z10 ? kVar.m0 : kVar.l0, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i9, String str) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, 0, str, z10 ? kVar.m0 : kVar.l0, null, 0, str, null);
    }

    public final w0 f(int i9, int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, b6 b6Var) {
        Context context = getContext();
        boolean z10 = this.c;
        k kVar = this.b;
        w0 w0Var = new w0(context, this, i12, z10 ? kVar.o0 : kVar.n0, charSequence != null, b6Var);
        w0Var.setTag(Integer.valueOf(i10));
        if (charSequence != null) {
            w0Var.A.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13 != 0 ? i13 : -2, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(w0Var, i9, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof mi0) {
                    w0Var.x.setAnimation((mi0) drawable);
                } else {
                    w0Var.x.setImageDrawable(drawable);
                }
            } else if (i11 != 0) {
                w0Var.x.setImageResource(i11);
            }
            addView(w0Var, i9, new LinearLayout.LayoutParams(i13, -1));
        }
        w0Var.setOnClickListener(new x(this, 0));
        if (charSequence2 != null) {
            w0Var.setContentDescription(charSequence2);
        }
        return w0Var;
    }

    public final w0 g(int i9, int i10, int i11) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, i10, null, z10 ? kVar.m0 : kVar.l0, null, i11, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f10 = Float.POSITIVE_INFINITY;
        float f11 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
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
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() != 8) {
                i9 = childAt.getMeasuredWidth() + i9;
            }
        }
        return i9;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f10 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f10;
            }
        }
        return (int) f10;
    }

    public final w0 h(int i9, int i10, String str, int i11) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(i9, i10, null, z10 ? kVar.m0 : kVar.l0, null, i11, str, null);
    }

    public final w0 i(int i9, String str, Drawable drawable) {
        boolean z10 = this.c;
        k kVar = this.b;
        return b(1, 0, null, z10 ? kVar.m0 : kVar.l0, drawable, i9, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C && w0Var.s()) {
                    e5 e5Var = w0Var.D;
                    if (e5Var == null || e5Var.b()) {
                        this.b.v(false);
                        w0Var.L(z10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final w0 k(int i9) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i9));
        if (findViewWithTag instanceof w0) {
            return (w0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                i9 = childAt.getMeasuredWidth() + i9;
            }
        }
        return i9;
    }

    public final y m(int i9, int i10, int i11, Drawable drawable, int i12, b6 b6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i9));
        y yVar = new y();
        yVar.i = 1.0f;
        yVar.l = 8;
        yVar.a = this;
        yVar.b = i9;
        yVar.c = i10;
        yVar.e = i11;
        yVar.f = drawable;
        yVar.g = i12;
        yVar.h = b6Var;
        return yVar;
    }

    public final y n(Drawable drawable, b6 b6Var) {
        boolean z10 = this.c;
        k kVar = this.b;
        return m(14, 0, z10 ? kVar.m0 : kVar.l0, drawable, AndroidUtilities.dp(48.0f), b6Var);
    }

    public final void o(int i9) {
        j jVar = this.b.q0;
        if (jVar != null) {
            jVar.b(i9);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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
    public final void onMeasure(int i9, int i10) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof w0) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.leftMargin = -AndroidUtilities.dp(5.0f);
                        marginLayoutParams.rightMargin = -AndroidUtilities.dp(5.0f);
                    }
                }
            }
        }
        super.onMeasure(i9, i10);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.getSearchContainer() != null && w0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i9, int i10) {
        w0 k10 = k(i9);
        if (k10 != null) {
            k10.setVisibility(i10);
        }
    }

    public final void r(float f10) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f10);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                boolean z10 = this.c;
                k kVar = this.b;
                childAt.setBackgroundDrawable(f6.f0(z10 ? kVar.m0 : kVar.l0, 1, -1));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setEnabled(z10);
        }
    }

    public void setFilter(of.m0 m0Var) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.c0.add(m0Var);
                    if (w0Var.B.getTag() != null) {
                        w0Var.d0 = r0.size() - 1;
                    }
                    w0Var.y();
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

    public void setPopupItemsSelectorColor(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setPopupItemsSelectorColor(i9);
            }
        }
    }

    public void setSearchCursorColor(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.getSearchField().setCursorColor(i9);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.H(str, false);
                    w0Var.getSearchField().setSelection(str.length());
                }
            }
        }
    }

    public final void t() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                boolean z10 = this.c;
                k kVar = this.b;
                w0Var.setIconColor(z10 ? kVar.o0 : kVar.n0);
            }
        }
    }
}
