package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.g0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tj0 d;
    public final /* synthetic */ vj0 e;

    public sj0(vj0 vj0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, tj0 tj0Var) {
        this.e = vj0Var;
        this.a = g0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = tj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        vj0 vj0Var = this.e;
        HashMap hashMap = (HashMap) vj0Var.k;
        tk0 tk0Var = (tk0) vj0Var.e;
        tk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        tk0Var.C0();
        int childCount = tk0Var.getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.b;
            if (i18 >= childCount) {
                break;
            }
            View childAt = tk0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) childAt).b(true, false);
            }
            s4.g0 g0Var = this.a;
            if (g0Var != null && (g0Var.b || vj0Var.c)) {
                tk0Var.getClass();
                long c10 = g0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    w7.d6 d6Var = (w7.d6) vj0Var.i;
                    if (d6Var != null) {
                        d6Var.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i21 = top;
                    }
                    z10 = true;
                }
            }
            i18++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i22 = 0;
        int i23 = 0;
        int i24 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i23 < size) {
            Object obj = arrayList.get(i23);
            i23++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i22) {
                i22 = bottom;
            }
            if (top2 < i24) {
                i24 = top2;
            }
            if (view3.getParent() == null) {
                tk0Var.addView(view3);
                ((s4.a0) vj0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) view3).b(true, true);
            }
        }
        int i25 = i24 == Integer.MAX_VALUE ? 0 : i24;
        w7.d6 d6Var2 = (w7.d6) vj0Var.i;
        if (d6Var2 != null) {
            d6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i22 = tk0Var.getHeight() - i25;
            }
            height = (z11 ? -i19 : i20 - tk0Var.getHeight()) + i22;
        }
        final int paddingBottom = tk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) vj0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) vj0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vj0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i26 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.rj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                vj0 vj0Var2 = sj0.this.e;
                tk0 tk0Var2 = (tk0) vj0Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i28 = 0;
                while (true) {
                    z13 = z12;
                    i27 = i26;
                    if (i28 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i28);
                    float y3 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= tk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - tk0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i29 = 0; i29 < size3; i29++) {
                    View view5 = (View) arrayList4.get(i29);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i27) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i27));
                    }
                }
                tk0Var2.invalidate();
                uj0 uj0Var = (uj0) vj0Var2.h;
                if (uj0Var != null) {
                    uj0Var.g();
                }
            }
        });
        ((ValueAnimator) vj0Var.g).addListener(new bg.f(26, this, arrayList2));
        if (!vj0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i26 / tk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) vj0Var.g).setDuration(min);
            ((ValueAnimator) vj0Var.g).setInterpolator(gr.h);
        } else if (z10) {
            ((ValueAnimator) vj0Var.g).setDuration(150L);
            ((ValueAnimator) vj0Var.g).setInterpolator(gr.g);
        } else {
            long measuredHeight2 = (long) (((i26 / tk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) vj0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) vj0Var.g).setInterpolator(gr.h);
        }
        ((ValueAnimator) vj0Var.g).start();
    }
}
