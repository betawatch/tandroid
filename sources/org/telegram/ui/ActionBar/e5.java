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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e5 extends LinearLayout {
    public final y4 a;
    public final boolean b;
    public final HashMap c;
    public final ArrayList d;
    public final qe.h e;
    public boolean f;

    public e5(Context context, y4 y4Var, boolean z10) {
        super(context);
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new qe.h(new c5(this), xq.h, 380L);
        this.f = true;
        this.a = y4Var;
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
            return !(view instanceof f5) || ((f5) view).D0;
        }
        return false;
    }

    public final f5 a() {
        return b(10, R.drawable.ic_ab_other);
    }

    public final f5 b(int i3, int i10) {
        return c(i3, i10, null, null, org.telegram.messenger.g0.L(48.0f), null);
    }

    public final f5 c(int i3, int i10, String str, Drawable drawable, int i11, CharSequence charSequence) {
        LinearLayout.LayoutParams layoutParams;
        Context context = getContext();
        y4 y4Var = this.a;
        boolean z10 = this.b;
        f5 f5Var = new f5(context, this, z10 ? y4Var.j0 : y4Var.i0, z10 ? y4Var.h0 : y4Var.g0, str != null, y4Var.a);
        f5Var.setTag(Integer.valueOf(i3));
        if (str != null) {
            f5Var.F.setText(str);
            if (i11 == 0) {
                i11 = -2;
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int L = org.telegram.messenger.g0.L(6.0f);
            layoutParams.rightMargin = L;
            layoutParams.leftMargin = L;
        } else {
            if (drawable instanceof ch0) {
                f5Var.y.setAnimation((ch0) drawable);
            } else if (drawable != null) {
                f5Var.y.setImageDrawable(drawable);
            } else if (i10 != 0) {
                f5Var.y.setImageResource(i10);
            }
            layoutParams = new LinearLayout.LayoutParams(i11, -1);
            int i12 = -org.telegram.messenger.g0.L(5.0f);
            layoutParams.rightMargin = i12;
            layoutParams.leftMargin = i12;
        }
        addView(f5Var, -1, layoutParams);
        f5Var.setOnClickListener(new ai.h3(this, f5Var, i3, 3));
        if (charSequence != null) {
            f5Var.setContentDescription(charSequence);
        }
        return f5Var;
    }

    public final void d(int i3, int i10, int i11, String str) {
        c(i3, i10, null, null, i11, str);
    }

    public final void e() {
        int i3;
        Iterator it = this.c.values().iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((d5) it.next()).b = false;
            }
        }
        float width = getWidth() - getPaddingRight();
        qe.h hVar = this.e;
        float f10 = hVar.d.f.a;
        float min = Math.min(1.0f, getPillWidth() / org.telegram.messenger.g0.L(46.0f));
        ArrayList arrayList = hVar.b;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qe.e eVar = (qe.e) obj;
            d5 d5Var = (d5) eVar.a;
            View view = d5Var.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            RectF b10 = eVar.b();
            d5Var.b = true;
            view.setTranslationX((((width - Math.max(f10, b10.right)) + b10.left) + layoutParams.leftMargin) - view.getLeft());
            d5Var.c(eVar.c(), min);
        }
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q0) {
                ((q0) childAt).o();
            }
        }
    }

    public float getPillWidth() {
        qe.g gVar = this.e.d;
        return (org.telegram.messenger.g0.L(8.0f) * gVar.c.a) + gVar.f.a;
    }

    public float getTargetPillWidth() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (h(getChildAt(i3))) {
                f10 += f(r4);
            }
        }
        if (f10 > 0.0f) {
            return f10 + org.telegram.messenger.g0.L(8.0f);
        }
        return 0.0f;
    }

    public final void i() {
        y4 y4Var = this.a;
        boolean z10 = this.b;
        int i3 = z10 ? y4Var.h0 : y4Var.g0;
        int i10 = z10 ? y4Var.j0 : y4Var.i0;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                TextView textView = q0Var.F;
                q0Var.setIconColor(i3);
                if (textView != null) {
                    textView.setTextColor(i3);
                }
                q0Var.setBackground(k6.h0(i10, textView != null ? 5 : 1, -1));
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        HashMap hashMap;
        super.onLayout(z10, i3, i10, i11, i12);
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
            d5 d5Var = (d5) hashMap.get(childAt);
            if (d5Var != null && h(childAt)) {
                arrayList.add(d5Var);
            }
            i13++;
        }
        this.e.m(arrayList, !this.f && isLaidOut());
        this.f = false;
        e();
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            d5 d5Var2 = (d5) hashMap.get(childAt2);
            if (d5Var2 != null && !d5Var2.b && childAt2.getVisibility() != 8 && !h(childAt2)) {
                if (childAt2 instanceof f5) {
                    ((f5) childAt2).X();
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
        this.c.put(view, new d5(view));
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.c.remove(view);
    }
}
