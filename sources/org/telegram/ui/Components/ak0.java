package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ak0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ f2.r0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bk0 d;
    public final /* synthetic */ c2.y e;

    public ak0(c2.y yVar, f2.r0 r0Var, ArrayList arrayList, boolean z10, bk0 bk0Var) {
        this.e = yVar;
        this.a = r0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = bk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        c2.y yVar = this.e;
        HashMap hashMap = (HashMap) yVar.k;
        wk0 wk0Var = (wk0) yVar.e;
        wk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        wk0Var.B0();
        int childCount = wk0Var.getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.b;
            if (i17 >= childCount) {
                break;
            }
            View childAt = wk0Var.getChildAt(i17);
            arrayList2.add(childAt);
            if (childAt.getTop() < i18) {
                i18 = childAt.getTop();
            }
            if (childAt.getBottom() > i19) {
                i19 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) childAt).c(true, false);
            }
            f2.r0 r0Var = this.a;
            if (r0Var != null && (r0Var.b || yVar.c)) {
                wk0Var.getClass();
                long i21 = r0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i21)) && (view2 = (View) hashMap.get(Long.valueOf(i21))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    g7.f6 f6Var = (g7.f6) yVar.i;
                    if (f6Var != null) {
                        f6Var.d(view2);
                    }
                    int top = childAt.getTop() - view2.getTop();
                    if (top != 0) {
                        i20 = top;
                    }
                    z10 = true;
                }
            }
            i17++;
        }
        hashMap.clear();
        int size = arrayList.size();
        int i22 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i23 = 0;
        int i24 = 0;
        while (i24 < size) {
            Object obj = arrayList.get(i24);
            i24++;
            View view3 = (View) obj;
            int bottom = view3.getBottom();
            int top2 = view3.getTop();
            if (bottom > i23) {
                i23 = bottom;
            }
            if (top2 < i22) {
                i22 = top2;
            }
            if (view3.getParent() == null) {
                wk0Var.addView(view3);
                ((f2.m0) yVar.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        int i25 = i22 == Integer.MAX_VALUE ? 0 : i22;
        g7.f6 f6Var2 = (g7.f6) yVar.i;
        if (f6Var2 != null) {
            f6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i20);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = wk0Var.getHeight() - i25;
            }
            height = (z11 ? -i18 : i19 - wk0Var.getHeight()) + i23;
        }
        final int paddingBottom = wk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) yVar.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) yVar.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        yVar.g = ofFloat;
        final boolean z12 = this.c;
        final int i26 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.zj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                c2.y yVar2 = ak0.this.e;
                wk0 wk0Var2 = (wk0) yVar2.e;
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
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= wk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - wk0Var2.getPaddingBottom();
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
                wk0Var2.invalidate();
                ck0 ck0Var = (ck0) yVar2.h;
                if (ck0Var != null) {
                    ck0Var.b();
                }
            }
        });
        ((ValueAnimator) yVar.g).addListener(new fg.j(26, this, arrayList2));
        if (!yVar.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i26 / wk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) yVar.g).setDuration(min);
            ((ValueAnimator) yVar.g).setInterpolator(gr.h);
        } else if (z10) {
            ((ValueAnimator) yVar.g).setDuration(150L);
            ((ValueAnimator) yVar.g).setInterpolator(gr.g);
        } else {
            long measuredHeight2 = (long) (((i26 / wk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) yVar.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) yVar.g).setInterpolator(gr.h);
        }
        ((ValueAnimator) yVar.g).start();
    }
}
