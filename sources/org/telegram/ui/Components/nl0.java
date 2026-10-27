package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nl0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ol0 d;
    public final /* synthetic */ ql0 e;

    public nl0(ql0 ql0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, ol0 ol0Var) {
        this.e = ql0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = ol0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        ql0 ql0Var = this.e;
        HashMap hashMap = (HashMap) ql0Var.k;
        nm0 nm0Var = (nm0) ql0Var.e;
        nm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        nm0Var.C0();
        int childCount = nm0Var.getChildCount();
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
            View childAt = nm0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) childAt).b(true, false);
            }
            s4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || ql0Var.c)) {
                nm0Var.getClass();
                long i22 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    kb1 kb1Var = (kb1) ql0Var.i;
                    if (kb1Var != null) {
                        kb1Var.S(view2);
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
                nm0Var.addView(view3);
                ((s4.c0) ql0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) view3).b(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i25 = 0;
        }
        kb1 kb1Var2 = (kb1) ql0Var.i;
        if (kb1Var2 != null) {
            kb1Var2.O();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = nm0Var.getHeight() - i25;
            }
            height = (z11 ? -i19 : i20 - nm0Var.getHeight()) + i23;
        }
        final int paddingBottom = nm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ql0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ql0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ql0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i26 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ll0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                ql0 ql0Var2 = nl0.this.e;
                nm0 nm0Var2 = (nm0) ql0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= nm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - nm0Var2.getPaddingBottom();
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
                nm0Var2.invalidate();
                pl0 pl0Var = (pl0) ql0Var2.h;
                if (pl0Var != null) {
                    pl0Var.d();
                }
            }
        });
        ((ValueAnimator) ql0Var.g).addListener(new ml0(0, this, arrayList2));
        if (!ql0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i26 / nm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) ql0Var.g).setDuration(min);
            ((ValueAnimator) ql0Var.g).setInterpolator(ds.h);
        } else if (z10) {
            ((ValueAnimator) ql0Var.g).setDuration(150L);
            ((ValueAnimator) ql0Var.g).setInterpolator(ds.g);
        } else {
            long measuredHeight2 = (long) (((i26 / nm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) ql0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) ql0Var.g).setInterpolator(ds.h);
        }
        ((ValueAnimator) ql0Var.g).start();
    }
}
