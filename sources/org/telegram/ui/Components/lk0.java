package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lk0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ s4.h0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mk0 d;
    public final /* synthetic */ ok0 e;

    public lk0(ok0 ok0Var, s4.h0 h0Var, ArrayList arrayList, boolean z10, mk0 mk0Var) {
        this.e = ok0Var;
        this.a = h0Var;
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
        ok0 ok0Var = this.e;
        HashMap hashMap = (HashMap) ok0Var.k;
        ll0 ll0Var = (ll0) ok0Var.e;
        ll0Var.removeOnLayoutChangeListener(this);
        final ArrayList arrayList2 = new ArrayList();
        ll0Var.B0();
        int childCount = ll0Var.getChildCount();
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
            View childAt = ll0Var.getChildAt(i18);
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
            s4.h0 h0Var = this.a;
            if (h0Var != null && (h0Var.b || ok0Var.c)) {
                ll0Var.getClass();
                long i22 = h0Var.i(RecyclerView.R(childAt));
                if (hashMap.containsKey(Long.valueOf(i22)) && (view2 = (View) hashMap.get(Long.valueOf(i22))) != 0) {
                    if (view2 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view2).e(false, false);
                    }
                    arrayList.remove(view2);
                    w7.y5 y5Var = (w7.y5) ok0Var.i;
                    if (y5Var != null) {
                        y5Var.d(view2);
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
                ll0Var.addView(view3);
                ((s4.c0) ok0Var.f).M(view3);
            }
            if (view3 instanceof org.telegram.ui.Cells.n4) {
                ((org.telegram.ui.Cells.n4) view3).e(true, true);
            }
        }
        int i26 = i23 == Integer.MAX_VALUE ? 0 : i23;
        w7.y5 y5Var2 = (w7.y5) ok0Var.i;
        if (y5Var2 != null) {
            y5Var2.b();
        }
        if (arrayList.isEmpty()) {
            height = Math.abs(i21);
        } else {
            boolean z11 = this.c;
            if (!z11) {
                i24 = ll0Var.getHeight() - i26;
            }
            height = (z11 ? -i19 : i20 - ll0Var.getHeight()) + i24;
        }
        final int paddingBottom = ll0Var.getPaddingBottom();
        ValueAnimator valueAnimator = (ValueAnimator) ok0Var.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) ok0Var.g).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ok0Var.g = ofFloat;
        final boolean z12 = this.c;
        final int i27 = height;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.kk0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                boolean z13;
                int i28;
                ok0 ok0Var2 = lk0.this.e;
                ll0 ll0Var2 = (ll0) ok0Var2.e;
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
                    if (view4.getY() + view4.getMeasuredHeight() >= 0.0f && y3 <= ll0Var2.getMeasuredHeight()) {
                        if (z13) {
                            view4.setTranslationY((-i28) * floatValue);
                        } else {
                            view4.setTranslationY(i28 * floatValue);
                        }
                    }
                    i29++;
                }
                int paddingBottom2 = paddingBottom - ll0Var2.getPaddingBottom();
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
                ll0Var2.invalidate();
                nk0 nk0Var = (nk0) ok0Var2.h;
                if (nk0Var != null) {
                    nk0Var.b();
                }
            }
        });
        ((ValueAnimator) ok0Var.g).addListener(new bi.t(28, this, arrayList2));
        if (!ok0Var.d) {
            if (z10) {
                min = 600;
            } else {
                long measuredHeight = (long) (((i27 / ll0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
                min = Math.min(measuredHeight >= 300 ? measuredHeight : 300L, 1300L);
            }
            ((ValueAnimator) ok0Var.g).setDuration(min);
            ((ValueAnimator) ok0Var.g).setInterpolator(pr.h);
        } else if (z10) {
            ((ValueAnimator) ok0Var.g).setDuration(150L);
            ((ValueAnimator) ok0Var.g).setInterpolator(pr.g);
        } else {
            long measuredHeight2 = (long) (((i27 / ll0Var.getMeasuredHeight()) + 1.0f) * 200.0f);
            ((ValueAnimator) ok0Var.g).setDuration(Math.min(measuredHeight2 >= 300 ? measuredHeight2 : 300L, 1300L));
            ((ValueAnimator) ok0Var.g).setInterpolator(pr.h);
        }
        ((ValueAnimator) ok0Var.g).start();
    }
}
