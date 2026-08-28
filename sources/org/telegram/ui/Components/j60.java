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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public w20 c;
    public boolean d;
    public final /* synthetic */ k60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(k60 k60Var, Context context) {
        super(context);
        this.e = k60Var;
        this.b = new ArrayList();
    }

    public final void a(w20 w20Var, boolean z10) {
        int i9 = 1;
        this.d = true;
        k60 k60Var = this.e;
        k60Var.b0.k(w20Var, w20Var.getUid());
        AnimatorSet animatorSet = k60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k60Var.Z.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            k60Var.Z = animatorSet2;
            animatorSet2.addListener(new i60(this, i9));
            k60Var.Z.setDuration(150L);
            k60Var.Z.setInterpolator(gr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w20Var, (Property<w20, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(w20Var);
    }

    public final void b(w20 w20Var) {
        this.d = false;
        k60 k60Var = this.e;
        k60Var.b0.l(w20Var.getUid());
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = k60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k60Var.Z.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k60Var.Z = animatorSet2;
        animatorSet2.addListener(new fg.j(25, this, w20Var));
        k60Var.Z.setDuration(150L);
        this.c = w20Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w20, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList;
        f2.q1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.w1 w1Var;
        int i11;
        k60 k60Var = this.e;
        org.telegram.ui.ActionBar.w1 w1Var2 = k60Var.R;
        gh.f1 f1Var = k60Var.d;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.b;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof w20) {
                w1Var = w1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i13 > dp) {
                    dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i13;
                if (!this.a) {
                    w20 w20Var = this.c;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.c) {
                    i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i14);
            } else {
                w1Var = w1Var2;
            }
            i12++;
            w1Var2 = w1Var;
        }
        org.telegram.ui.ActionBar.w1 w1Var3 = w1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = k60Var.i0 != null ? k60Var.c0 ? Math.min(k60Var.o0, dp6) : 0 : org.telegram.messenger.l0.b(52.0f, Math.min(k60Var.o0, dp6), 0);
        int i15 = k60Var.q0;
        int dp7 = (k60Var.i0 != null || k60Var.b0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        k60Var.q0 = dp7;
        if (min != k60Var.k0 || i15 != dp7) {
            k60Var.k0 = min;
            if (f1Var.getAdapter() != null && f1Var.getAdapter().h() > 0 && (K = f1Var.K(0)) != null) {
                f1Var.getAdapter().m(0);
                k60Var.N.h1(0, K.a.getTop() - f1Var.getPaddingTop());
                if (f1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new f2.f0(this, 7));
                    ofFloat.setDuration(f1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(k60Var.o0, dp6);
        int i16 = k60Var.g0;
        if (i16 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i16, min2);
            ofInt.addUpdateListener(new e6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > k60Var.o0) {
            final int i17 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.h60
                public final /* synthetic */ j60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            k60 k60Var2 = this.b.e;
                            k60Var2.R.smoothScrollTo(0, dp6 - k60Var2.o0);
                            break;
                        default:
                            k60 k60Var3 = this.b.e;
                            k60Var3.R.smoothScrollTo(0, dp6 - k60Var3.o0);
                            break;
                    }
                }
            });
        } else if (!z10 && w1Var3.getMeasuredHeight() + w1Var3.getScrollY() > dp6) {
            final int i18 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.h60
                public final /* synthetic */ j60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            k60 k60Var2 = this.b.e;
                            k60Var2.R.smoothScrollTo(0, dp6 - k60Var2.o0);
                            break;
                        default:
                            k60 k60Var3 = this.b.e;
                            k60Var3.R.smoothScrollTo(0, dp6 - k60Var3.o0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = k60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            k60Var.Z.addListener(new i60(this, 0));
            k60Var.Z.start();
            this.a = true;
        }
        if (k60Var.Z == null) {
            k60Var.g0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.f3) k60Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        f1Var.setTranslationY(0.0f);
    }
}
