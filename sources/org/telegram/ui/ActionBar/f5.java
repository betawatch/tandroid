package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f5 extends LinearLayout {
    public final z4 a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final te.h e;
    public boolean f;

    public f5(Context context, z4 z4Var, boolean z10) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new te.h(new d5(this), kr.h, 380L);
        this.f = true;
        this.a = z4Var;
        this.b = z10;
        setOrientation(0);
        setGravity(21);
    }

    public static int f(View view) {
        int measuredWidth;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (view.getMeasuredWidth() > 0 || (measuredWidth = layoutParams.width) <= 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public static boolean h(View view) {
        if (view.getVisibility() != 8) {
            return !(view instanceof g5) || ((g5) view).D0;
        }
        return false;
    }

    public final g5 a() {
        return b(10, R.drawable.ic_ab_other);
    }

    public final g5 b(int i7, int i10) {
        return c(i7, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final g5 c(int i7, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        z4 z4Var = this.a;
        boolean z10 = this.b;
        g5 g5Var = new g5(context, this, z10 ? z4Var.j0 : z4Var.i0, z10 ? z4Var.h0 : z4Var.g0, str != null, z4Var.a);
        g5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            g5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof nh0) {
                g5Var.y.setAnimation((nh0) drawable);
            } else if (drawable != null) {
                g5Var.y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                g5Var.y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i12 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i12;
            layoutParams.leftMargin = i12;
        }
        addView(g5Var, -1, layoutParams);
        g5Var.setOnClickListener(new bi.k5(this, g5Var, i7, 3));
        if (charSequence != null) {
            g5Var.setContentDescription(charSequence);
        }
        return g5Var;
    }

    public final void d(int i7, int i10, int i11, String str) {
        c(i7, i10, null, null, i11, str);
    }

    public final void e() {
        int i7;
        Iterator it = this.c.values().iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((e5) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        te.h hVar = this.e;
        float f10 = hVar.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.b;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            te.e eVar = (te.e) obj;
            e5 e5Var = (e5) eVar.a;
            View view = e5Var.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b10 = eVar.b();
            e5Var.b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + layoutParams.leftMargin) - view.getLeft());
            e5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof q0) {
                ((q0) childAt).p();
            }
        }
    }

    public float getPillWidth() {
        te.g gVar = this.e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.c.a) + gVar.f.a;
    }

    public float getTargetPillWidth() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (h(getChildAt(i7))) {
                f10 += f(r4);
            }
        }
        if (f10 > 0.0f) {
            return f10 + org.telegram.messenger.g0.L(8.0f);
        }
        return 0.0f;
    }

    public final void i() {
        z4 z4Var = this.a;
        boolean z10 = this.b;
        int i7 = z10 ? z4Var.h0 : z4Var.g0;
        int i10 = z10 ? z4Var.j0 : z4Var.i0;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                TextView textView = q0Var.F;
                q0Var.setIconColor(i7);
                if (textView != null) {
                    textView.setTextColor(i7);
                }
                q0Var.setBackground(n6.h0(i10, textView != null ? 5 : 1, -1));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        HashMap hashMap;
        super.onLayout(z10, i7, i10, i11, i12);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            hashMap = this.c;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            e5 e5Var = (e5) hashMap.get(childAt);
            if (e5Var != null && h(childAt)) {
                arrayList.add(e5Var);
            }
            i13++;
        }
        this.e.m(arrayList, !this.f && isLaidOut());
        this.f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            e5 e5Var2 = (e5) hashMap.get(childAt2);
            if (e5Var2 != null && !e5Var2.b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof g5) {
                    ((g5) childAt2).Y();
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
        this.c.put(view, new e5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
