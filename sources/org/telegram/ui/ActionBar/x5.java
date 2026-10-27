package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.pa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x5 extends LinearLayout {
    public final r5 a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final oe.j e;
    public boolean f;

    public x5(Context context, r5 r5Var, boolean z10) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new oe.j(new v5(this), ds.h, 380L);
        this.f = true;
        this.a = r5Var;
        this.b = z10;
        setOrientation(0);
        setGravity(21);
    }

    public static int e(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean g(View view) {
        if (view.getVisibility() != 8) {
            return !(view instanceof y5) || ((y5) view).A0;
        }
        return false;
    }

    public final y5 a(int i10, int i11) {
        return b(i10, i11, null, null, AndroidUtilities.dp(48.0f), null);
    }

    public final y5 b(int i10, int i11, String str, Drawable drawable, int i12, CharSequence charSequence) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        r5 r5Var = this.a;
        boolean z10 = this.b;
        y5 y5Var = new y5(context, this, z10 ? r5Var.g0 : r5Var.f0, z10 ? r5Var.e0 : r5Var.d0, str != null, r5Var.a);
        y5Var.setTag(Integer.valueOf(i10));
        if (str != null) {
            y5Var.E.setText(str);
            if (i12 == 0) {
                i12 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int dp = AndroidUtilities.dp(6.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
        } else {
            if (drawable instanceof yj0) {
                y5Var.x.setAnimation((yj0) drawable);
            } else if (drawable != null) {
                y5Var.x.setImageDrawable(drawable);
            } else if (i11 != 0) {
                y5Var.x.setImageResource(i11);
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int i13 = -AndroidUtilities.dp(5.0f);
            layoutParams.rightMargin = i13;
            layoutParams.leftMargin = i13;
        }
        addView(y5Var, -1, layoutParams);
        y5Var.setOnClickListener(new pa(this, y5Var, i10, 1));
        if (charSequence != null) {
            y5Var.setContentDescription(charSequence);
        }
        return y5Var;
    }

    public final void c(int i10, int i11, String str, int i12) {
        b(i10, i11, null, null, i12, str);
    }

    public final void d() {
        int i10;
        Iterator it = this.c.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((w5) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        oe.j jVar = this.e;
        float f7 = jVar.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / AndroidUtilities.dp(46.0f));
        ArrayList arrayList = jVar.b;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            oe.g gVar = (oe.g) obj;
            w5 w5Var = (w5) gVar.a;
            View view = w5Var.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b10 = gVar.b();
            w5Var.b = true;
            view.setTranslationX((((width - Math.max(f7, b10.right)) + b10.left) + layoutParams.leftMargin) - view.getLeft());
            w5Var.c(gVar.c(), min);
        }
    }

    public final void f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof w0) {
                ((w0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        oe.i iVar = this.e.d;
        return (AndroidUtilities.dp(8.0f) * iVar.c.a) + iVar.f.a;
    }

    public float getTargetPillWidth() {
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (g(getChildAt(i10))) {
                f7 += e(r4);
            }
        }
        if (f7 > 0.0f) {
            return f7 + AndroidUtilities.dp(8.0f);
        }
        return 0.0f;
    }

    public final void h() {
        r5 r5Var = this.a;
        boolean z10 = this.b;
        int i10 = z10 ? r5Var.e0 : r5Var.d0;
        int i11 = z10 ? r5Var.g0 : r5Var.f0;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof w0) {
                w0 w0Var = (w0) childAt;
                TextView textView = w0Var.E;
                w0Var.setIconColor(i10);
                if (textView != null) {
                    textView.setTextColor(i10);
                }
                w0Var.setBackground(y6.g0(i11, textView != null ? 5 : 1, -1));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        HashMap hashMap;
        super.onLayout(z10, i10, i11, i12, i13);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            hashMap = this.c;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            w5 w5Var = (w5) hashMap.get(childAt);
            if (w5Var != null && g(childAt)) {
                arrayList.add(w5Var);
            }
            i14++;
        }
        this.e.q(arrayList, !this.f && isLaidOut());
        this.f = false;
        d();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            w5 w5Var2 = (w5) hashMap.get(childAt2);
            if (w5Var2 != null && !w5Var2.b && childAt2.getVisibility() != 8 && !g(childAt2)) {
                if (childAt2 instanceof y5) {
                    ((y5) childAt2).X();
                } else {
                    childAt2.setVisibility(8);
                }
            }
        }
        this.a.invalidate();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.c.put(view, new w5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
