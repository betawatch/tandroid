package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pq(Object obj, org.telegram.ui.Components.p00 p00Var, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = p00Var;
        this.c = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        int i10;
        float f9;
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
                jr jrVar = (jr) obj;
                jrVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = jrVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = jrVar.c.getChildAt(i15);
                    if (childAt != view) {
                        jrVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            int min = (int) ((Math.min(jrVar.c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jrVar.c.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay(min);
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    jrVar.c.addView(view);
                    f2.w0 layoutManager = jrVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new bm(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) obj;
                org.telegram.ui.Components.jk jkVar = ikVar.T;
                jkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = jkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i10 < childCount2) {
                    View childAt2 = jkVar.r.getChildAt(i10);
                    if (view != null) {
                        jkVar.r.getClass();
                        i10 = RecyclerView.R(childAt2) < i12 ? i10 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(jkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.gk(this));
                ikVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    jkVar.r.addView(view);
                    f2.w0 layoutManager2 = jkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.gk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) obj;
                SparseArray sparseArray = pk0Var.b;
                org.telegram.ui.Components.jl0 jl0Var = pk0Var.a;
                jl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                pk0Var.h.remove(this);
                int childCount3 = jl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = jl0Var.getChildAt(i16);
                    jl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        pk0Var.d = z11;
                        jl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        int i17 = 6;
                        ofFloat5.addUpdateListener(new gh.b(this, R, i17));
                        ofFloat5.addListener(new org.telegram.ui.Cells.z3(this, R, i17));
                        ofFloat5.setStartDelay((int) ((Math.min(jl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / jl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z11 = true;
                }
                pk0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ok0(1, this, animatorSet3));
                return false;
            default:
                h10 h10Var = (h10) obj;
                h10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                jh.e1 e1Var = h10Var.b;
                int childCount4 = e1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount4) {
                    View childAt4 = e1Var.getChildAt(i18);
                    if (view != null) {
                        e1Var.getClass();
                        f9 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            i18++;
                            f10 = 0.0f;
                            i13 = 2;
                            i14 = 0;
                        }
                    } else {
                        f9 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    int min3 = (int) ((Math.min(e1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / e1Var.getMeasuredHeight()) * f9);
                    float[] fArr = new float[i13];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i18++;
                    f10 = 0.0f;
                    i13 = 2;
                    i14 = 0;
                }
                animatorSet4.addListener(new x00(this));
                h10Var.h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    e1Var.addView(view);
                    f2.w0 layoutManager3 = e1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new x00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
