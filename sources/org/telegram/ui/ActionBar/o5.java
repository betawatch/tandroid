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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o5 extends LinearLayout {
    public final i5 a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final fe.k e;
    public boolean f;

    public o5(Context context, i5 i5Var, boolean z10) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new fe.k(new m5(this), gr.h, 380L);
        this.f = true;
        this.a = i5Var;
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
            return !(view instanceof p5) || ((p5) view).C0;
        }
        return false;
    }

    public final p5 a() {
        return b(10, R.drawable.ic_ab_other);
    }

    public final p5 b(int i10, int i11) {
        return c(i10, i11, null, null, org.telegram.messenger.i0.L(48.0f), null);
    }

    public final p5 c(int i10, int i11, String str, Drawable drawable, int i12, CharSequence charSequence) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        i5 i5Var = this.a;
        boolean z10 = this.b;
        p5 p5Var = new p5(context, this, z10 ? i5Var.i0 : i5Var.h0, z10 ? i5Var.g0 : i5Var.f0, str != null, i5Var.a);
        p5Var.setTag(Integer.valueOf(i10));
        if (str != null) {
            p5Var.E.setText(str);
            if (i12 == 0) {
                i12 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int L = org.telegram.messenger.i0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof bi0) {
                p5Var.y.setAnimation((bi0) drawable);
            } else if (drawable != null) {
                p5Var.y.setImageDrawable(drawable);
            } else if (i11 != 0) {
                p5Var.y.setImageResource(i11);
            }
            layoutParams = new LinearLayout.LayoutParams(i12, -1);
            int i13 = -org.telegram.messenger.i0.L(5.0f);
            layoutParams.rightMargin = i13;
            layoutParams.leftMargin = i13;
        }
        addView(p5Var, -1, layoutParams);
        p5Var.setOnClickListener(new jg.w1(this, p5Var, i10, 1));
        if (charSequence != null) {
            p5Var.setContentDescription(charSequence);
        }
        return p5Var;
    }

    public final void d(int i10, int i11, String str, int i12) {
        c(i10, i11, null, null, i12, str);
    }

    public final void e() {
        int i10;
        Iterator it = this.c.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((n5) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        fe.k kVar = this.e;
        float f7 = kVar.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.i0.L(46.0f));
        ArrayList arrayList = kVar.b;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            fe.h hVar = (fe.h) obj;
            n5 n5Var = (n5) hVar.a;
            View view = n5Var.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b10 = hVar.b();
            n5Var.b = true;
            view.setTranslationX((((width - Math.max(f7, b10.right)) + b10.left) + layoutParams.leftMargin) - view.getLeft());
            n5Var.c(hVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t0) {
                ((t0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        fe.j jVar = this.e.d;
        return (org.telegram.messenger.i0.L(8.0f) * jVar.c.a) + jVar.f.a;
    }

    public float getTargetPillWidth() {
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (h(getChildAt(i10))) {
                f7 += f(r4);
            }
        }
        if (f7 > 0.0f) {
            return f7 + org.telegram.messenger.i0.L(8.0f);
        }
        return 0.0f;
    }

    public final void i() {
        i5 i5Var = this.a;
        boolean z10 = this.b;
        int i10 = z10 ? i5Var.g0 : i5Var.f0;
        int i11 = z10 ? i5Var.i0 : i5Var.h0;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                TextView textView = t0Var.E;
                t0Var.setIconColor(i10);
                if (textView != null) {
                    textView.setTextColor(i10);
                }
                t0Var.setBackground(t6.h0(i11, textView != null ? 5 : 1, -1));
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
            n5 n5Var = (n5) hashMap.get(childAt);
            if (n5Var != null && h(childAt)) {
                arrayList.add(n5Var);
            }
            i14++;
        }
        this.e.q(arrayList, !this.f && isLaidOut());
        this.f = false;
        e();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            n5 n5Var2 = (n5) hashMap.get(childAt2);
            if (n5Var2 != null && !n5Var2.b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof p5) {
                    ((p5) childAt2).X();
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
        this.c.put(view, new n5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
