package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ f2.o0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wk0 d;
    public final /* synthetic */ c2.z e;

    public vk0(c2.z zVar, f2.o0 o0Var, ArrayList arrayList, boolean z4, wk0 wk0Var) {
        this.e = zVar;
        this.a = o0Var;
        this.b = arrayList;
        this.c = z4;
        this.d = wk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        c2.z zVar = this.e;
        HashMap hashMap = (HashMap) zVar.k;
        rl0 rl0Var = (rl0) zVar.e;
        rl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        rl0Var.B0();
        int childCount = rl0Var.getChildCount();
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z4 = false;
        while (true) {
            arrayList = this.b;
            if (i18 >= childCount) {
                break;
            }
            View childAt = rl0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) childAt).c(true, false);
            }
            f2.o0 o0Var = this.a;
            if (o0Var != null && (o0Var.b || zVar.c)) {
                rl0Var.getClass();
                long i22 = o0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    k7.c6 c6Var = (k7.c6) zVar.i;
                    if (c6Var != null) {
                        c6Var.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i21 = top;
                    }
                    z4 = true;
                }
            }
            i18++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size) {
            Object obj = arrayList.get(i25);
            i25++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i24) {
                i24 = bottom;
            }
            if (top2 < i23) {
                i23 = top2;
            }
            if (view3.getParent() == null) {
                rl0Var.addView(view3);
                ((f2.i0) zVar.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).c(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        k7.c6 c6Var2 = (k7.c6) zVar.i;
        if (c6Var2 != null) {
            c6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z10 = this.c;
            if (!z10) {
                i24 = rl0Var.getHeight() - i26;
            }
            height = (z10 ? -i19 : i20 - rl0Var.getHeight()) + i24;
        }
        final int paddingBottom = rl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) zVar.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) zVar.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zVar.g = ofFloat;
        final boolean z11 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.uk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z12;
                int i28;
                c2.z zVar2 = vk0.this.e;
                rl0 rl0Var2 = (rl0) zVar2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    z12 = z11;
                    i28 = i27;
                    if (i29 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i29);
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= rl0Var2.getMeasuredHeight()) {
                        if (z12) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - rl0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i30 = 0; i30 < size3; i30++) {
                    View view5 = (View) arrayList4.get(i30);
                    if (z12) {
                        view5.setTranslationY(((1.0f - floatValue) * i28) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i28));
                    }
                }
                rl0Var2.invalidate();
                xk0 xk0Var = (xk0) zVar2.h;
                if (xk0Var != null) {
                    xk0Var.e();
                }
            }
        });
        ((ValueAnimator) zVar.g).addListener(new dg.y2(25, this, arrayList2));
        if (!zVar.d) {
            if (z4) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / rl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) zVar.g).setDuration(min);
            ((ValueAnimator) zVar.g).setInterpolator(mr.h);
        } else if (z4) {
            ((ValueAnimator) zVar.g).setDuration(150L);
            ((ValueAnimator) zVar.g).setInterpolator(mr.g);
        } else {
            long measuredHeight2 = (long) (((i27 / rl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) zVar.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) zVar.g).setInterpolator(mr.h);
        }
        ((ValueAnimator) zVar.g).start();
    }
}
