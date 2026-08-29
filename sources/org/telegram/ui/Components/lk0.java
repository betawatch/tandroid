package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ f2.p0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mk0 d;
    public final /* synthetic */ c2.z e;

    public lk0(c2.z zVar, f2.p0 p0Var, ArrayList arrayList, boolean z10, mk0 mk0Var) {
        this.e = zVar;
        this.a = p0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = mk0Var;
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
        jl0 jl0Var = (jl0) zVar.e;
        jl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        jl0Var.B0();
        int childCount = jl0Var.getChildCount();
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
            View childAt = jl0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.m4) {
                ((org.telegram.ui.Cells.m4) childAt).b(true, false);
            }
            f2.p0 p0Var = this.a;
            if (p0Var != null && (p0Var.b || zVar.c)) {
                jl0Var.getClass();
                long i22 = p0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.m4) {
                        ((org.telegram.ui.Cells.m4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    i7.g6 g6Var = (i7.g6) zVar.i;
                    if (g6Var != null) {
                        g6Var.d(view2);
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
                jl0Var.addView(view3);
                ((f2.j0) zVar.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.m4) {
                ((org.telegram.ui.Cells.m4) view3).b(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        i7.g6 g6Var2 = (i7.g6) zVar.i;
        if (g6Var2 != null) {
            g6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i24 = jl0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - jl0Var.getHeight()) + i24;
        }
        final int paddingBottom = jl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) zVar.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) zVar.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zVar.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                c2.z zVar2 = lk0.this.e;
                jl0 jl0Var2 = (jl0) zVar2.e;
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
                    float y8 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y8 <= jl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - jl0Var2.getPaddingBottom();
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
                jl0Var2.invalidate();
                nk0 nk0Var = (nk0) zVar2.h;
                if (nk0Var != null) {
                    nk0Var.a();
                }
            }
        });
        ((ValueAnimator) zVar.g).addListener(new bg.c3(29, this, arrayList2));
        if (!zVar.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / jl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) zVar.g).setDuration(min);
            ((ValueAnimator) zVar.g).setInterpolator(jr.h);
        } else if (z10) {
            ((ValueAnimator) zVar.g).setDuration(150L);
            ((ValueAnimator) zVar.g).setInterpolator(jr.g);
        } else {
            long measuredHeight2 = (long) (((i27 / jl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) zVar.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) zVar.g).setInterpolator(jr.h);
        }
        ((ValueAnimator) zVar.g).start();
    }
}
