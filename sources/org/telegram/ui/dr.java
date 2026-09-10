package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dr implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dr(Object obj, org.telegram.ui.Components.a10 a10Var, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = a10Var;
        this.c = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        float f7;
        int i11 = this.a;
        int i12 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f10 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        boolean z11 = true;
        switch (i11) {
            case 0:
                wr wrVar = (wr) obj;
                wrVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = wrVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = wrVar.c.getChildAt(i15);
                    if (childAt != view) {
                        wrVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(wrVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / wrVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    wrVar.c.addView(view);
                    s4.o0 layoutManager = wrVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new org.telegram.ui.Cells.v5(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.sk skVar = (org.telegram.ui.Components.sk) obj;
                org.telegram.ui.Components.tk tkVar = skVar.X;
                tkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = tkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = tkVar.r.getChildAt(i10);
                    if (view != null) {
                        tkVar.r.getClass();
                        i10 = RecyclerView.R(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(tkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / tkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.qk(this));
                skVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    tkVar.r.addView(view);
                    s4.o0 layoutManager2 = tkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.qk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) obj;
                SparseArray sparseArray = zk0Var.b;
                org.telegram.ui.Components.vl0 vl0Var = zk0Var.a;
                vl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                zk0Var.h.remove(this);
                int childCount3 = vl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = vl0Var.getChildAt(i16);
                    vl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        zk0Var.d = z11;
                        vl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.s2(this, R, 5));
                        ofFloat5.addListener(new di.y2(this, R, 9));
                        ofFloat5.setStartDelay((int) ((Math.min(vl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / vl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z11 = true;
                }
                zk0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new bi.u3(28, this, animatorSet3));
                return false;
            default:
                z10 z10Var = (z10) obj;
                z10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bi.y1 y1Var = z10Var.b;
                int childCount4 = y1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = y1Var.getChildAt(i17);
                    if (view != null) {
                        y1Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            i17++;
                            f10 = 0.0f;
                            i13 = 2;
                            i14 = 0;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    int min3 = (int) ((Math.min(y1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / y1Var.getMeasuredHeight()) * f7);
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f10 = 0.0f;
                    i13 = 2;
                    i14 = 0;
                }
                animatorSet4.addListener(new p10(this));
                z10Var.l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    y1Var.addView(view);
                    s4.o0 layoutManager3 = y1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new p10(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
