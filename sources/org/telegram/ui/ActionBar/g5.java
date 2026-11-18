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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g5 extends LinearLayout {
    public final a5 a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final te.h e;
    public boolean f;

    public g5(Context context, a5 a5Var, boolean z10) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new te.h(new e5(this), lr.h, 380L);
        this.f = true;
        this.a = a5Var;
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
            return !(view instanceof h5) || ((h5) view).D0;
        }
        return false;
    }

    public final h5 a() {
        return b(10, R.drawable.ic_ab_other);
    }

    public final h5 b(int i7, int i10) {
        return c(i7, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final h5 c(int i7, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        a5 a5Var = this.a;
        boolean z10 = this.b;
        h5 h5Var = new h5(context, this, z10 ? a5Var.j0 : a5Var.i0, z10 ? a5Var.h0 : a5Var.g0, str != null, a5Var.a);
        h5Var.setTag(Integer.valueOf(i7));
        if (str != null) {
            h5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof mh0) {
                h5Var.y.setAnimation((mh0) drawable);
            } else if (drawable != null) {
                h5Var.y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                h5Var.y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i12 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i12;
            layoutParams.leftMargin = i12;
        }
        addView(h5Var, -1, layoutParams);
        h5Var.setOnClickListener(new bi.f5(this, h5Var, i7, 3));
        if (charSequence != null) {
            h5Var.setContentDescription(charSequence);
        }
        return h5Var;
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
                ((f5) it.next()).b = false;
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
            f5 f5Var = (f5) eVar.a;
            View view = f5Var.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b10 = eVar.b();
            f5Var.b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + layoutParams.leftMargin) - view.getLeft());
            f5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof r0) {
                ((r0) childAt).p();
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
        a5 a5Var = this.a;
        boolean z10 = this.b;
        int i7 = z10 ? a5Var.h0 : a5Var.g0;
        int i10 = z10 ? a5Var.j0 : a5Var.i0;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                TextView textView = r0Var.F;
                r0Var.setIconColor(i7);
                if (textView != null) {
                    textView.setTextColor(i7);
                }
                r0Var.setBackground(n6.h0(i10, textView != null ? 5 : 1, -1));
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
            f5 f5Var = (f5) hashMap.get(childAt);
            if (f5Var != null && h(childAt)) {
                arrayList.add(f5Var);
            }
            i13++;
        }
        this.e.m(arrayList, !this.f && isLaidOut());
        this.f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            f5 f5Var2 = (f5) hashMap.get(childAt2);
            if (f5Var2 != null && !f5Var2.b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof h5) {
                    ((h5) childAt2).Y();
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
        this.c.put(view, new f5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
