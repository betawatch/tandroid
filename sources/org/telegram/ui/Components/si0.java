package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class si0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ u4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ti0 d;
    public final /* synthetic */ vi0 e;

    public si0(vi0 vi0Var, u4.h0 h0Var, ArrayList arrayList, boolean z10, ti0 ti0Var) {
        this.e = vi0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = ti0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        vi0 vi0Var = this.e;
        HashMap hashMap = (HashMap) vi0Var.k;
        tj0 tj0Var = (tj0) vi0Var.e;
        tj0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        tj0Var.C0();
        int childCount = tj0Var.getChildCount();
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
            View childAt = tj0Var.getChildAt(i17);
            arrayList2.add(childAt);
            if (childAt.getTop() < i18) {
                i18 = childAt.getTop();
            }
            if (childAt.getBottom() > i19) {
                i19 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) childAt).b(true, false);
            }
            u4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || vi0Var.c)) {
                tj0Var.getClass();
                long c2 = h0Var.c(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(c2)) && (view2 = (View) hashMap.get(Long.valueOf(c2))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    b8.of ofVar = (b8.of) vi0Var.i;
                    if (ofVar != null) {
                        ofVar.d(view2);
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
                tj0Var.addView(view3);
                ((u4.b0) vi0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.p4) {
                ((org.telegram.ui.Cells.p4) view3).b(true, true);
            }
        }
        if (i23 == Integer.MAX_VALUE) {
            i23 = 0;
        }
        b8.of ofVar2 = (b8.of) vi0Var.i;
        if (ofVar2 != null) {
            ofVar2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i20);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i21 = tj0Var.getHeight() - i23;
            }
            height = (z11 ? -i18 : i19 - tj0Var.getHeight()) + i21;
        }
        final int paddingBottom = tj0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) vi0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) vi0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        vi0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i24 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.qi0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i25;
                vi0 vi0Var2 = si0.this.e;
                tj0 tj0Var2 = (tj0) vi0Var2.e;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ArrayList arrayList3 = arrayList;
                int size2 = arrayList3.size();
                int i26 = 0;
                while (true) {
                    z13 = z12;
                    i25 = i24;
                    if (i26 >= size2) {
                        break;
                    }
                    View view4 = (View) arrayList3.get(i26);
                    float y9 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y9 <= tj0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i25) * floatValue);
                        } else {
                            view4.setTranslationY(i25 * floatValue);
                        }
                    }
                    i26++;
                }
                int paddingBottom2 = paddingBottom - tj0Var2.getPaddingBottom();
                ArrayList arrayList4 = arrayList2;
                int size3 = arrayList4.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    View view5 = (View) arrayList4.get(i27);
                    if (z13) {
                        view5.setTranslationY(((1.0f - floatValue) * i25) + paddingBottom2);
                    } else {
                        view5.setTranslationY((1.0f - floatValue) * (-i25));
                    }
                }
                tj0Var2.invalidate();
                ui0 ui0Var = (ui0) vi0Var2.h;
                if (ui0Var != null) {
                    ui0Var.h();
                }
            }
        });
        ((ValueAnimator) vi0Var.g).addListener(new ri0(0, this, arrayList2));
        if (!vi0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i24 / tj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) vi0Var.g).setDuration(min);
            ((ValueAnimator) vi0Var.g).setInterpolator(xq.h);
        } else if (z10) {
            ((ValueAnimator) vi0Var.g).setDuration(150L);
            ((ValueAnimator) vi0Var.g).setInterpolator(xq.g);
        } else {
            long measuredHeight2 = (long) (((i24 / tj0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) vi0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) vi0Var.g).setInterpolator(xq.h);
        }
        ((ValueAnimator) vi0Var.g).start();
    }
}
