package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class il0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.g0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jl0 d;
    public final /* synthetic */ ll0 e;

    public il0(ll0 ll0Var, s4.g0 g0Var, ArrayList arrayList, boolean z10, jl0 jl0Var) {
        this.e = ll0Var;
        this.a = g0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = jl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        ll0 ll0Var = this.e;
        HashMap hashMap = (HashMap) ll0Var.k;
        im0 im0Var = (im0) ll0Var.e;
        im0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        im0Var.B0();
        int childCount = im0Var.getChildCount();
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
            View childAt = im0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).e(true, false);
            }
            s4.g0 g0Var = this.a;
            if (g0Var != null && (g0Var.b || ll0Var.c)) {
                im0Var.getClass();
                long i22 = g0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).e(false, false);
                    }
                    arrayList.remove(view2);
                    w7.a6 a6Var = (w7.a6) ll0Var.i;
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
                im0Var.addView(view3);
                ((s4.b0) ll0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).e(true, true);
            }
        }
        int i26 = i25 == Integer.MAX_VALUE ? 0 : i25;
        w7.a6 a6Var2 = (w7.a6) ll0Var.i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = im0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - im0Var.getHeight()) + i23;
        }
        final int paddingBottom = im0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ll0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ll0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ll0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.hl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                ll0 ll0Var2 = il0.this.e;
                im0 im0Var2 = (im0) ll0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= im0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - im0Var2.getPaddingBottom();
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
                im0Var2.invalidate();
                kl0 kl0Var = (kl0) ll0Var2.h;
                if (kl0Var != null) {
                    kl0Var.b();
                }
            }
        });
        ((ValueAnimator) ll0Var.g).addListener(new ai.me(29, this, arrayList2));
        if (!ll0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / im0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) ll0Var.g).setDuration(min);
            ((ValueAnimator) ll0Var.g).setInterpolator(bs.h);
        } else if (z10) {
            ((ValueAnimator) ll0Var.g).setDuration(150L);
            ((ValueAnimator) ll0Var.g).setInterpolator(bs.g);
        } else {
            long measuredHeight2 = (long) (((i27 / im0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) ll0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) ll0Var.g).setInterpolator(bs.h);
        }
        ((ValueAnimator) ll0Var.g).start();
    }
}
