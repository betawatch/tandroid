package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.g0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uj0 d;
    public final /* synthetic */ wj0 e;

    public tj0(wj0 wj0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, uj0 uj0Var) {
        this.e = wj0Var;
        this.a = g0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = uj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        wj0 wj0Var = this.e;
        HashMap hashMap = (HashMap) wj0Var.k;
        uk0 uk0Var = (uk0) wj0Var.e;
        uk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        uk0Var.C0();
        int childCount = uk0Var.getChildCount();
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
            View childAt = uk0Var.getChildAt(i18);
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
            if (g0Var != null && (g0Var.b || wj0Var.c)) {
                uk0Var.getClass();
                long c10 = g0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.r4) {
                        ((org.telegram.ui.Cells.r4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    w7.d6 d6Var = (w7.d6) wj0Var.i;
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
                uk0Var.addView(view3);
                ((s4.a0) wj0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.r4) {
                ((org.telegram.ui.Cells.r4) view3).b(true, true);
            }
        }
        int i25 = i24 == Integer.MAX_VALUE ? 0 : i24;
        w7.d6 d6Var2 = (w7.d6) wj0Var.i;
        if (d6Var2 != null) {
            d6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i22 = uk0Var.getHeight() - i25;
            }
            height = (z11 ? -i19 : i20 - uk0Var.getHeight()) + i22;
        }
        final int paddingBottom = uk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) wj0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) wj0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        wj0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i26 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                wj0 wj0Var2 = tj0.this.e;
                uk0 uk0Var2 = (uk0) wj0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= uk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - uk0Var2.getPaddingBottom();
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
                uk0Var2.invalidate();
                vj0 vj0Var = (vj0) wj0Var2.h;
                if (vj0Var != null) {
                    vj0Var.g();
                }
            }
        });
        ((ValueAnimator) wj0Var.g).addListener(new bg.f(26, this, arrayList2));
        if (!wj0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i26 / uk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) wj0Var.g).setDuration(min);
            ((ValueAnimator) wj0Var.g).setInterpolator(gr.h);
        } else if (z10) {
            ((ValueAnimator) wj0Var.g).setDuration(150L);
            ((ValueAnimator) wj0Var.g).setInterpolator(gr.g);
        } else {
            long measuredHeight2 = (long) (((i26 / uk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) wj0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) wj0Var.g).setInterpolator(gr.h);
        }
        ((ValueAnimator) wj0Var.g).start();
    }
}
