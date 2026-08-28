package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class nq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nq(Object obj, org.telegram.ui.Components.e00 e00Var, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = e00Var;
        this.c = i9;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z10;
        int i9;
        float f10;
        int i10 = this.a;
        int i11 = this.c;
        Object obj = this.d;
        View view = this.b;
        float f11 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                jr jrVar = (jr) obj;
                jrVar.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = jrVar.c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = jrVar.c.getChildAt(i14);
                    if (childAt != view) {
                        jrVar.c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
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
                    f2.z0 layoutManager = jrVar.c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new xp(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) obj;
                org.telegram.ui.Components.fk fkVar = ekVar.T;
                fkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = fkVar.r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                while (i9 < childCount2) {
                    View childAt2 = fkVar.r.getChildAt(i9);
                    if (view != null) {
                        fkVar.r.getClass();
                        i9 = RecyclerView.R(childAt2) < i11 ? i9 + 1 : 0;
                    }
                    childAt2.setAlpha(0.0f);
                    int min2 = (int) ((Math.min(fkVar.r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / fkVar.r.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay(min2);
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ck(this));
                ekVar.Q.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    fkVar.r.addView(view);
                    f2.z0 layoutManager2 = fkVar.r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.ck(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) obj;
                SparseArray sparseArray = dk0Var.b;
                org.telegram.ui.Components.wk0 wk0Var = dk0Var.a;
                wk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                dk0Var.h.remove(this);
                int childCount3 = wk0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount3) {
                    View childAt3 = wk0Var.getChildAt(i15);
                    wk0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        dk0Var.d = z11;
                        wk0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new dh.b(this, R, 6));
                        ofFloat5.addListener(new mh.o2(this, R, 8));
                        ofFloat5.setStartDelay((int) ((Math.min(wk0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / wk0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i15++;
                    z11 = true;
                }
                dk0Var.g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new fg.j(28, this, animatorSet3));
                return false;
            default:
                f10 f10Var = (f10) obj;
                f10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gh.f1 f1Var = f10Var.b;
                int childCount4 = f1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount4) {
                    View childAt4 = f1Var.getChildAt(i16);
                    if (view != null) {
                        f1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            i16++;
                            f11 = 0.0f;
                            i12 = 2;
                            i13 = 0;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    int min3 = (int) ((Math.min(f1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / f1Var.getMeasuredHeight()) * f10);
                    float[] fArr = new float[i12];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                    ofFloat6.setStartDelay(min3);
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i16++;
                    f11 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new v00(this));
                f10Var.h0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    f1Var.addView(view);
                    f2.z0 layoutManager3 = f1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new v00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
