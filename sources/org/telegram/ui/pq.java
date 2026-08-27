package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pq(Object obj, org.telegram.ui.Components.h00 h00Var, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = h00Var;
        this.c = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        float f10;
        int i11 = this.a;
        int i12 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        switch (i11) {
            case 0:
                lr lrVar = (lr) obj;
                lrVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = lrVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = lrVar.c.getChildAt(i15);
                    if (childAt != view) {
                        lrVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(lrVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / lrVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    lrVar.c.addView(view);
                    f2.x0 layoutManager = lrVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new am(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ak akVar = (org.telegram.ui.Components.ak) obj;
                org.telegram.ui.Components.bk bkVar = akVar.T;
                bkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = bkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = bkVar.r.getChildAt(i10);
                    if (view != null) {
                        bkVar.r.getClass();
                        i10 = RecyclerView.R(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(bkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / bkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.yj(this));
                akVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    bkVar.r.addView(view);
                    f2.x0 layoutManager2 = bkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.yj(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) obj;
                SparseArray sparseArray = gk0Var.b;
                org.telegram.ui.Components.zk0 zk0Var = gk0Var.a;
                zk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gk0Var.h.remove(this);
                int childCount3 = zk0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = zk0Var.getChildAt(i16);
                    zk0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        gk0Var.d = true;
                        zk0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new eh.b(this, R, 6));
                        ofFloat5.addListener(new nh.n2(this, R, 8));
                        ofFloat5.setStartDelay((int) ((Math.min(zk0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / zk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                gk0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.fk0(0, this, animatorSet3));
                return false;
            default:
                i10 i10Var = (i10) obj;
                i10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                hh.f1 f1Var = i10Var.b;
                int childCount4 = f1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = f1Var.getChildAt(i17);
                    if (view != null) {
                        f1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            i17++;
                            f11 = 0.0f;
                            i13 = 2;
                            i14 = 0;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    int min3 = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / f1Var.getMeasuredHeight()) * f10);
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f11 = 0.0f;
                    i13 = 2;
                    i14 = 0;
                }
                animatorSet4.addListener(new y00(this));
                i10Var.h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    f1Var.addView(view);
                    f2.x0 layoutManager3 = f1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new y00(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
