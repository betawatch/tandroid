package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zk0 d;
    public final /* synthetic */ bl0 e;

    public yk0(bl0 bl0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, zk0 zk0Var) {
        this.e = bl0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = zk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        bl0 bl0Var = this.e;
        HashMap hashMap = (HashMap) bl0Var.k;
        yl0 yl0Var = (yl0) bl0Var.e;
        yl0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        yl0Var.C0();
        int childCount = yl0Var.getChildCount();
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
            View childAt = yl0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).c(true, false);
            }
            s4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || bl0Var.c)) {
                yl0Var.getClass();
                long i22 = h0Var.i(RecyclerView.S(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    w7.z5 z5Var = (w7.z5) bl0Var.i;
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
                yl0Var.addView(view3);
                ((s4.c0) bl0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).c(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        w7.z5 z5Var2 = (w7.z5) bl0Var.i;
        if (z5Var2 != null) {
            z5Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i24 = yl0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - yl0Var.getHeight()) + i24;
        }
        final int paddingBottom = yl0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) bl0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) bl0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        bl0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.xk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                bl0 bl0Var2 = yk0.this.e;
                yl0 yl0Var2 = (yl0) bl0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= yl0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - yl0Var2.getPaddingBottom();
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
                yl0Var2.invalidate();
                al0 al0Var = (al0) bl0Var2.h;
                if (al0Var != null) {
                    al0Var.a();
                }
            }
        });
        ((ValueAnimator) bl0Var.g).addListener(new ai.z(28, this, arrayList2));
        if (!bl0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / yl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) bl0Var.g).setDuration(min);
            ((ValueAnimator) bl0Var.g).setInterpolator(qr.h);
        } else if (z10) {
            ((ValueAnimator) bl0Var.g).setDuration(150L);
            ((ValueAnimator) bl0Var.g).setInterpolator(qr.g);
        } else {
            long measuredHeight2 = (long) (((i27 / yl0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) bl0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) bl0Var.g).setInterpolator(qr.h);
        }
        ((ValueAnimator) bl0Var.g).start();
    }
}
