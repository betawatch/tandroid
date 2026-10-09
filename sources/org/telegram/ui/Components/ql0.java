package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ql0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.i0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rl0 d;
    public final /* synthetic */ tl0 e;

    public ql0(tl0 tl0Var, s4.i0 i0Var, ArrayList arrayList, boolean z10, rl0 rl0Var) {
        this.e = tl0Var;
        this.a = i0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = rl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        tl0 tl0Var = this.e;
        HashMap hashMap = (HashMap) tl0Var.k;
        qm0 qm0Var = (qm0) tl0Var.e;
        qm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        qm0Var.B0();
        int childCount = qm0Var.getChildCount();
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
            View childAt = qm0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) childAt).c(true, false);
            }
            s4.i0 i0Var = this.a;
            if (i0Var != null && (i0Var.b || tl0Var.c)) {
                qm0Var.getClass();
                long i22 = i0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.y5 y5Var = (w7.y5) tl0Var.i;
                    if (y5Var != null) {
                        y5Var.d(view2);
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
                qm0Var.addView(view3);
                ((s4.d0) tl0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        int i26 = i25 == Integer.MAX_VALUE ? 0 : i25;
        w7.y5 y5Var2 = (w7.y5) tl0Var.i;
        if (y5Var2 != null) {
            y5Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = qm0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - qm0Var.getHeight()) + i23;
        }
        final int paddingBottom = qm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) tl0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) tl0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        tl0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.pl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                tl0 tl0Var2 = ql0.this.e;
                qm0 qm0Var2 = (qm0) tl0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= qm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - qm0Var2.getPaddingBottom();
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
                qm0Var2.invalidate();
                sl0 sl0Var = (sl0) tl0Var2.h;
                if (sl0Var != null) {
                    sl0Var.a();
                }
            }
        });
        ((ValueAnimator) tl0Var.g).addListener(new ai.z(28, this, arrayList2));
        if (!tl0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / qm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) tl0Var.g).setDuration(min);
            ((ValueAnimator) tl0Var.g).setInterpolator(hs.h);
        } else if (z10) {
            ((ValueAnimator) tl0Var.g).setDuration(150L);
            ((ValueAnimator) tl0Var.g).setInterpolator(hs.g);
        } else {
            long measuredHeight2 = (long) (((i27 / qm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) tl0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) tl0Var.g).setInterpolator(hs.h);
        }
        ((ValueAnimator) tl0Var.g).start();
    }
}
