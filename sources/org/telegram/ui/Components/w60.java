package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public j30 c;
    public boolean d;
    public final /* synthetic */ x60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(x60 x60Var, Context context) {
        super(context);
        this.e = x60Var;
        this.b = new ArrayList();
    }

    public final void a(j30 j30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        x60 x60Var = this.e;
        x60Var.b0.k(j30Var, j30Var.getUid());
        AnimatorSet animatorSet = x60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x60Var.Z.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x60Var.Z = animatorSet2;
            animatorSet2.addListener(new v60(this, i10));
            x60Var.Z.setDuration(150L);
            x60Var.Z.setInterpolator(jr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(j30Var, (Property<j30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(j30Var);
    }

    public final void b(j30 j30Var) {
        this.d = false;
        x60 x60Var = this.e;
        x60Var.b0.l(j30Var.getUid());
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = x60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x60Var.Z.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x60Var.Z = animatorSet2;
        animatorSet2.addListener(new bg.c3(28, this, j30Var));
        x60Var.Z.setDuration(150L);
        this.c = j30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<j30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<j30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<j30, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        f2.n1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i12;
        x60 x60Var = this.e;
        org.telegram.ui.ActionBar.w1 w1Var2 = x60Var.R;
        jh.e1 e1Var = x60Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof j30) {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    j30 j30Var = this.c;
                    if (childAt == j30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (j30Var != null) {
                        float f9 = dp4;
                        if (childAt.getTranslationX() != f9) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f9));
                        } else {
                            i12 = 1;
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.c) {
                    i14 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                w1Var = w1Var2;
            }
            i13++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = x60Var.i0 != null ? x60Var.c0 ? Math.min(x60Var.o0, dp6) : 0 : j7.l1.d(52.0f, Math.min(x60Var.o0, dp6), 0);
        int i16 = x60Var.q0;
        int dp7 = (x60Var.i0 != null || x60Var.b0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        x60Var.q0 = dp7;
        if (min != x60Var.k0 || i16 != dp7) {
            x60Var.k0 = min;
            if (e1Var.getAdapter() != null && e1Var.getAdapter().h() > 0 && (K = e1Var.K(0)) != null) {
                e1Var.getAdapter().m(0);
                x60Var.N.h1(0, K.a.getTop() - e1Var.getPaddingTop());
                if (e1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new cg.c1(this, 8));
                    ofFloat.setDuration(e1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(x60Var.o0, dp6);
        int i17 = x60Var.g0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new j6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > x60Var.o0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.u60
                public final /* synthetic */ w60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            x60 x60Var2 = this.b.e;
                            x60Var2.R.smoothScrollTo(0, dp6 - x60Var2.o0);
                            break;
                        default:
                            x60 x60Var3 = this.b.e;
                            x60Var3.R.smoothScrollTo(0, dp6 - x60Var3.o0);
                            break;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.u60
                public final /* synthetic */ w60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            x60 x60Var2 = this.b.e;
                            x60Var2.R.smoothScrollTo(0, dp6 - x60Var2.o0);
                            break;
                        default:
                            x60 x60Var3 = this.b.e;
                            x60Var3.R.smoothScrollTo(0, dp6 - x60Var3.o0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = x60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            x60Var.Z.addListener(new v60(this, 0));
            x60Var.Z.start();
            this.a = true;
        }
        if (x60Var.Z == null) {
            x60Var.g0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.f3) x60Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        e1Var.setTranslationY(0.0f);
    }
}
