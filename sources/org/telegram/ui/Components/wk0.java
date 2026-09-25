package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xk0 d;
    public final /* synthetic */ zk0 e;

    public wk0(zk0 zk0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, xk0 xk0Var) {
        this.e = zk0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = xk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        zk0 zk0Var = this.e;
        HashMap hashMap = (HashMap) zk0Var.k;
        wl0 wl0Var = (wl0) zk0Var.e;
        wl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        wl0Var.B0();
        int childCount = wl0Var.getChildCount();
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
            View childAt = wl0Var.getChildAt(i18);
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
            s4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || zk0Var.c)) {
                wl0Var.getClass();
                long i22 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.z5 z5Var = (w7.z5) zk0Var.i;
                    if (z5Var != null) {
                        z5Var.d(view2);
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
                wl0Var.addView(view3);
                ((s4.c0) zk0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.o4) {
                ((org.telegram.ui.Cells.o4) view3).c(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        w7.z5 z5Var2 = (w7.z5) zk0Var.i;
        if (z5Var2 != null) {
            z5Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i24 = wl0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - wl0Var.getHeight()) + i24;
        }
        final int paddingBottom = wl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) zk0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) zk0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zk0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.vk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                zk0 zk0Var2 = wk0.this.e;
                wl0 wl0Var2 = (wl0) zk0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= wl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - wl0Var2.getPaddingBottom();
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
                wl0Var2.invalidate();
                yk0 yk0Var = (yk0) zk0Var2.h;
                if (yk0Var != null) {
                    yk0Var.a();
                }
            }
        });
        ((ValueAnimator) zk0Var.g).addListener(new ai.z(28, this, arrayList2));
        if (!zk0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / wl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) zk0Var.g).setDuration(min);
            ((ValueAnimator) zk0Var.g).setInterpolator(rr.h);
        } else if (z10) {
            ((ValueAnimator) zk0Var.g).setDuration(150L);
            ((ValueAnimator) zk0Var.g).setInterpolator(rr.g);
        } else {
            long measuredHeight2 = (long) (((i27 / wl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) zk0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) zk0Var.g).setInterpolator(rr.h);
        }
        ((ValueAnimator) zk0Var.g).start();
    }
}
