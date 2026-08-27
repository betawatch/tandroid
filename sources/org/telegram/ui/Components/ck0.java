package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ck0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ f2.q0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dk0 d;
    public final /* synthetic */ c2.x e;

    public ck0(c2.x xVar, f2.q0 q0Var, ArrayList arrayList, boolean z10, dk0 dk0Var) {
        this.e = xVar;
        this.a = q0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = dk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        c2.x xVar = this.e;
        HashMap hashMap = (HashMap) xVar.k;
        zk0 zk0Var = (zk0) xVar.e;
        zk0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        zk0Var.B0();
        int childCount = zk0Var.getChildCount();
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
            View childAt = zk0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.l4) {
                ((org.telegram.ui.Cells.l4) childAt).c(true, false);
            }
            f2.q0 q0Var = this.a;
            if (q0Var != null && (q0Var.b || xVar.c)) {
                zk0Var.getClass();
                long i22 = q0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.l4) {
                        ((org.telegram.ui.Cells.l4) view2).c(false, false);
                    }
                    arrayList.remove(view2);
                    h7.a6 a6Var = (h7.a6) xVar.i;
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
                zk0Var.addView(view3);
                ((f2.k0) xVar.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.l4) {
                ((org.telegram.ui.Cells.l4) view3).c(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        h7.a6 a6Var2 = (h7.a6) xVar.i;
        if (a6Var2 != null) {
            a6Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i24 = zk0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - zk0Var.getHeight()) + i24;
        }
        final int paddingBottom = zk0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) xVar.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) xVar.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        xVar.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.bk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                c2.x xVar2 = ck0.this.e;
                zk0 zk0Var2 = (zk0) xVar2.e;
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
                    float y10 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y10 <= zk0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - zk0Var2.getPaddingBottom();
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
                zk0Var2.invalidate();
                ek0 ek0Var = (ek0) xVar2.h;
                if (ek0Var != null) {
                    ek0Var.b();
                }
            }
        });
        ((ValueAnimator) xVar.g).addListener(new ag.x1(28, this, arrayList2));
        if (!xVar.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / zk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) xVar.g).setDuration(min);
            ((ValueAnimator) xVar.g).setInterpolator(er.h);
        } else if (z10) {
            ((ValueAnimator) xVar.g).setDuration(150L);
            ((ValueAnimator) xVar.g).setInterpolator(er.g);
        } else {
            long measuredHeight2 = (long) (((i27 / zk0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) xVar.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) xVar.g).setInterpolator(er.h);
        }
        ((ValueAnimator) xVar.g).start();
    }
}
