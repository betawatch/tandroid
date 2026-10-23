package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ml0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.g0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nl0 d;
    public final /* synthetic */ pl0 e;

    public ml0(pl0 pl0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, nl0 nl0Var) {
        this.e = pl0Var;
        this.a = g0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = nl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        pl0 pl0Var = this.e;
        HashMap hashMap = (HashMap) pl0Var.k;
        mm0 mm0Var = (mm0) pl0Var.e;
        mm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        mm0Var.B0();
        int childCount = mm0Var.getChildCount();
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
            View childAt = mm0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).d(true, false);
            }
            s4.g0 g0Var = this.a;
            if (g0Var != null && (g0Var.b || pl0Var.c)) {
                mm0Var.getClass();
                long i22 = g0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).d(false, false);
                    }
                    arrayList.remove(view2);
                    w7.a6 a6Var = (w7.a6) pl0Var.i;
                    if (a6Var != null) {
                        a6Var.d(view2);
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
        int i23 = 0;
        int i24 = 0;
        int i25 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i24 < size) {
            Object obj = arrayList.get(i24);
            i24++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i23) {
                i23 = bottom;
            }
            if (top2 < i25) {
                i25 = top2;
            }
            if (view3.getParent() == null) {
                mm0Var.addView(view3);
                ((s4.b0) pl0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).d(true, true);
            }
        }
        int i26 = i25 == Integer.MAX_VALUE ? 0 : i25;
        w7.a6 a6Var2 = (w7.a6) pl0Var.i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = mm0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - mm0Var.getHeight()) + i23;
        }
        final int paddingBottom = mm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) pl0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) pl0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        pl0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ll0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                pl0 pl0Var2 = ml0.this.e;
                mm0 mm0Var2 = (mm0) pl0Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    z13 = z12;
                    i28 = i27;
                    if (i29 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i29);
                    float y3 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= mm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - mm0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i30 = 0; i30 < size3; i30++) {
                    View view5 = (View) arrayList4.get(i30);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i28) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i28));
                    }
                }
                mm0Var2.invalidate();
                ol0 ol0Var = (ol0) pl0Var2.h;
                if (ol0Var != null) {
                    ol0Var.a();
                }
            }
        });
        ((ValueAnimator) pl0Var.g).addListener(new ai.ne(29, this, arrayList2));
        if (!pl0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) pl0Var.g).setDuration(min);
            ((ValueAnimator) pl0Var.g).setInterpolator(bs.h);
        } else if (z10) {
            ((ValueAnimator) pl0Var.g).setDuration(150L);
            ((ValueAnimator) pl0Var.g).setInterpolator(bs.g);
        } else {
            long measuredHeight2 = (long) (((i27 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) pl0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) pl0Var.g).setInterpolator(bs.h);
        }
        ((ValueAnimator) pl0Var.g).start();
    }
}
