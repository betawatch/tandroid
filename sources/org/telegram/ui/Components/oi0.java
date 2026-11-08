package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oi0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ v4.g0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pi0 d;
    public final /* synthetic */ ri0 e;

    public oi0(ri0 ri0Var, v4.g0 g0Var, ArrayList arrayList, boolean z9, pi0 pi0Var) {
        this.e = ri0Var;
        this.a = g0Var;
        this.b = arrayList;
        this.c = z9;
        this.d = pi0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        ri0 ri0Var = this.e;
        HashMap hashMap = (HashMap) ri0Var.k;
        pj0 pj0Var = (pj0) ri0Var.e;
        pj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        pj0Var.C0();
        int childCount = pj0Var.getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z9 = false;
        while (true) {
            arrayList = this.b;
            if (i17 >= childCount) {
                break;
            }
            View childAt = pj0Var.getChildAt(i17);
            arrayList2.add(childAt);
            if (childAt.getTop() < i18) {
                i18 = childAt.getTop();
            }
            if (childAt.getBottom() > i19) {
                i19 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, false);
            }
            v4.g0 g0Var = this.a;
            if (g0Var != null && (g0Var.b || ri0Var.c)) {
                pj0Var.getClass();
                long c10 = g0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c10)) && (view2 = (View) hashMap.get(Long.valueOf(c10))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    c8.ja jaVar = (c8.ja) ri0Var.i;
                    if (jaVar != null) {
                        jaVar.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i20 = top;
                    }
                    z9 = true;
                }
            }
            i17++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i21 = 0;
        int i22 = 0;
        int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        while (i22 < size) {
            Object obj = arrayList.get(i22);
            i22++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i21) {
                i21 = bottom;
            }
            if (top2 < i23) {
                i23 = top2;
            }
            if (view3.getParent() == null) {
                pj0Var.addView(view3);
                ((v4.b0) ri0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).c(true, true);
            }
        }
        int i24 = i23 == Integer.MAX_VALUE ? 0 : i23;
        c8.ja jaVar2 = (c8.ja) ri0Var.i;
        if (jaVar2 != null) {
            jaVar2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i20);
        } else {
            boolean z10 = this.c;
            if (!z10) {
                i21 = pj0Var.getHeight() - i24;
            }
            height = (z10 ? -i18 : i19 - pj0Var.getHeight()) + i21;
        }
        final int paddingBottom = pj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ri0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ri0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ri0Var.g = ofFloat;
        final boolean z11 = this.c;
        final int i25 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ni0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z12;
                int i26;
                ri0 ri0Var2 = oi0.this.e;
                pj0 pj0Var2 = (pj0) ri0Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i27 = 0;
                while (true) {
                    z12 = z11;
                    i26 = i25;
                    if (i27 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i27);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= pj0Var2.getMeasuredHeight()) {
                        if (z12) {
                            view4.setTranslationY((-i26) * floatValue);
                        } else {
                            view4.setTranslationY(i26 * floatValue);
                        }
                    }
                    i27++;
                }
                int paddingBottom2 = paddingBottom - pj0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    View view5 = (View) arrayList4.get(i28);
                    if (z12) {
                        view5.setTranslationY(((1.0f - floatValue) * i26) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i26));
                    }
                }
                pj0Var2.invalidate();
                qi0 qi0Var = (qi0) ri0Var2.h;
                if (qi0Var != null) {
                    qi0Var.e();
                }
            }
        });
        ((ValueAnimator) ri0Var.g).addListener(new v50(1, this, arrayList2));
        if (!ri0Var.d) {
            if (z9) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i25 / pj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) ri0Var.g).setDuration(min);
            ((ValueAnimator) ri0Var.g).setInterpolator(xq.h);
        } else if (z9) {
            ((ValueAnimator) ri0Var.g).setDuration(150L);
            ((ValueAnimator) ri0Var.g).setInterpolator(xq.g);
        } else {
            long measuredHeight2 = (long) (((i25 / pj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) ri0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) ri0Var.g).setInterpolator(xq.h);
        }
        ((ValueAnimator) ri0Var.g).start();
    }
}
