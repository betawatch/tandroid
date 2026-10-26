package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ml0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nl0 d;
    public final /* synthetic */ pl0 e;

    public ml0(pl0 pl0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, nl0 nl0Var) {
        this.e = pl0Var;
        this.a = h0Var;
        this.b = arrayList;
        this.c = z10;
        this.d = nl0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        final ArrayList arrayList;
        int height;
        long min;
        View view2;
        pl0 pl0Var = this.e;
        HashMap hashMap = (HashMap) pl0Var.k;
        mm0 mm0Var = (mm0) pl0Var.e;
        mm0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        mm0Var.C0();
        int childCount = mm0Var.getChildCount();
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
            View childAt = mm0Var.getChildAt(i18);
            arrayList2.add(childAt);
            if (childAt.getTop() < i19) {
                i19 = childAt.getTop();
            }
            if (childAt.getBottom() > i20) {
                i20 = childAt.getBottom();
            }
            if (childAt instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) childAt).b(true, false);
            }
            s4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || pl0Var.c)) {
                mm0Var.getClass();
                long i22 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) view2).b(false, false);
                    }
                    arrayList.remove(view2);
                    gb1 gb1Var = (gb1) pl0Var.i;
                    if (gb1Var != null) {
                        gb1Var.S(view2);
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
                mm0Var.addView(view3);
                ((s4.c0) pl0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.s4) {
                ((org.telegram.ui.Cells.s4) view3).b(true, true);
            }
        }
        if (i25 == Integer.MAX_VALUE) {
            i25 = 0;
        }
        gb1 gb1Var2 = (gb1) pl0Var.i;
        if (gb1Var2 != null) {
            gb1Var2.O();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i23 = mm0Var.getHeight() - i25;
            }
            height = (z11 ? -i19 : i20 - mm0Var.getHeight()) + i23;
        }
        final int paddingBottom = mm0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) pl0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) pl0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        pl0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i26 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i27;
                pl0 pl0Var2 = ml0.this.e;
                mm0 mm0Var2 = (mm0) pl0Var2.e;
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
                    float y3 = view4.getY();
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= mm0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i27) * floatValue);
                        } else {
                            view4.setTranslationY(i27 * floatValue);
                        }
                    }
                    i28++;
                }
                int paddingBottom2 = paddingBottom - mm0Var2.getPaddingBottom();
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
                mm0Var2.invalidate();
                ol0 ol0Var = (ol0) pl0Var2.h;
                if (ol0Var != null) {
                    ol0Var.d();
                }
            }
        });
        ((ValueAnimator) pl0Var.g).addListener(new ll0(0, this, arrayList2));
        if (!pl0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i26 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) pl0Var.g).setDuration(min);
            ((ValueAnimator) pl0Var.g).setInterpolator(ds.h);
        } else if (z10) {
            ((ValueAnimator) pl0Var.g).setDuration(150L);
            ((ValueAnimator) pl0Var.g).setInterpolator(ds.g);
        } else {
            long measuredHeight2 = (long) (((i26 / mm0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) pl0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) pl0Var.g).setInterpolator(ds.h);
        }
        ((ValueAnimator) pl0Var.g).start();
    }
}
