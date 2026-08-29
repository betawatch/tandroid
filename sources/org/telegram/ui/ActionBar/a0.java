package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class a0 extends LinearLayout {
    public boolean a;
    public final l b;
    public boolean c;
    public boolean d;
    public ArrayList e;
    public Runnable f;

    public a0(Context context, l lVar) {
        super(context);
        this.a = true;
        setOrientation(0);
        this.b = lVar;
    }

    public final w0 a(int i10, int i11) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, i11, null, z10 ? lVar.m0 : lVar.l0, null, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 b(int i10, int i11, CharSequence charSequence, int i12, Drawable drawable, int i13, CharSequence charSequence2, c6 c6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        return f(-1, i10, i11, charSequence, i12, drawable, i13, charSequence2, c6Var);
    }

    public final w0 c(int i10, int i11, c6 c6Var) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, i11, null, z10 ? lVar.m0 : lVar.l0, null, AndroidUtilities.dp(48.0f), null, c6Var);
    }

    public final w0 d(int i10, Drawable drawable) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, 0, null, z10 ? lVar.m0 : lVar.l0, drawable, AndroidUtilities.dp(48.0f), null, null);
    }

    public final w0 e(int i10, String str) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, 0, str, z10 ? lVar.m0 : lVar.l0, null, 0, str, null);
    }

    public final w0 f(int i10, int i11, int i12, CharSequence charSequence, int i13, Drawable drawable, int i14, CharSequence charSequence2, c6 c6Var) {
        Context context = getContext();
        boolean z10 = this.c;
        l lVar = this.b;
        w0 w0Var = new w0(context, this, i13, z10 ? lVar.o0 : lVar.n0, charSequence != null, c6Var);
        w0Var.setTag(Integer.valueOf(i11));
        if (charSequence != null) {
            w0Var.A.setText(charSequence);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14 != 0 ? i14 : -2, -1);
            int dp = AndroidUtilities.dp(14.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            addView(w0Var, i10, layoutParams);
        } else {
            if (drawable != null) {
                if (drawable instanceof xi0) {
                    w0Var.x.setAnimation((xi0) drawable);
                } else {
                    w0Var.x.setImageDrawable(drawable);
                }
            } else if (i12 != 0) {
                w0Var.x.setImageResource(i12);
            }
            addView(w0Var, i10, new LinearLayout.LayoutParams(i14, -1));
        }
        w0Var.setOnClickListener(new y(this, 0));
        if (charSequence2 != null) {
            w0Var.setContentDescription(charSequence2);
        }
        return w0Var;
    }

    public final w0 g(int i10, int i11, int i12) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, i11, null, z10 ? lVar.m0 : lVar.l0, null, i12, null, null);
    }

    public int getItemsWidth() {
        int childCount = getChildCount();
        float f9 = Float.POSITIVE_INFINITY;
        float f10 = Float.NEGATIVE_INFINITY;
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                float x4 = childAt.getX();
                f9 = Math.min(f9, x4);
                f10 = Math.max(f10, childAt.getWidth() + x4);
                z10 = true;
            }
        }
        if (z10) {
            return (int) (f10 - f9);
        }
        return 0;
    }

    public int getVisibleItemsMeasuredWidth() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof w0) && childAt.getVisibility() != 8) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public int getVisibleItemsMeasuredWidthWithAlpha() {
        int childCount = getChildCount();
        float f9 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof w0) && childAt.getVisibility() == 0) {
                f9 = (childAt.getAlpha() * childAt.getMeasuredWidth()) + f9;
            }
        }
        return (int) f9;
    }

    public final w0 h(int i10, int i11, String str, int i12) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(i10, i11, null, z10 ? lVar.m0 : lVar.l0, null, i12, str, null);
    }

    public final w0 i(int i10, String str, Drawable drawable) {
        boolean z10 = this.c;
        l lVar = this.b;
        return b(1, 0, null, z10 ? lVar.m0 : lVar.l0, drawable, i10, str, null);
    }

    public final void j(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
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

    public final w0 k(int i10) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i10));
        if (findViewWithTag instanceof w0) {
            return (w0) findViewWithTag;
        }
        return null;
    }

    public final int l() {
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                i10 = childAt.getMeasuredWidth() + i10;
            }
        }
        return i10;
    }

    public final z m(int i10, int i11, int i12, Drawable drawable, int i13, c6 c6Var) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i10));
        z zVar = new z();
        zVar.i = 1.0f;
        zVar.l = 8;
        zVar.a = this;
        zVar.b = i10;
        zVar.c = i11;
        zVar.e = i12;
        zVar.f = drawable;
        zVar.g = i13;
        zVar.h = c6Var;
        return zVar;
    }

    public final z n(Drawable drawable, c6 c6Var) {
        boolean z10 = this.c;
        l lVar = this.b;
        return m(14, 0, z10 ? lVar.m0 : lVar.l0, drawable, AndroidUtilities.dp(48.0f), c6Var);
    }

    public final void o(int i10) {
        k kVar = this.b.q0;
        if (kVar != null) {
            kVar.b(i10);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
        l lVar = this.b;
        if (lVar != null) {
            lVar.g();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.d) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
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
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.getSearchContainer() != null && w0Var.getSearchContainer().getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(int i10, int i11) {
        w0 k9 = k(i10);
        if (k9 != null) {
            k9.setVisibility(i11);
        }
    }

    public final void r(float f9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).setTransitionOffset(f9);
            }
        }
    }

    public final void s() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                boolean z10 = this.c;
                l lVar = this.b;
                childAt.setBackgroundDrawable(g6.f0(z10 ? lVar.m0 : lVar.l0, 1, -1));
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

    public void setFilter(rf.f0 f0Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.c0.add(f0Var);
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

    public void setPopupItemsSelectorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                ((w0) childAt).setPopupItemsSelectorColor(i10);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                if (w0Var.C) {
                    w0Var.getSearchField().setCursorColor(i10);
                    return;
                }
            }
        }
    }

    public void setSearchFieldText(String str) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                boolean z10 = this.c;
                l lVar = this.b;
                w0Var.setIconColor(z10 ? lVar.o0 : lVar.n0);
            }
        }
    }
}
