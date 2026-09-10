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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public w30 c;
    public boolean d;
    public final /* synthetic */ k70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(k70 k70Var, Context context) {
        super(context);
        this.e = k70Var;
        this.b = new ArrayList();
    }

    public final void a(w30 w30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        k70 k70Var = this.e;
        k70Var.f0.k(w30Var, w30Var.getUid());
        AnimatorSet animatorSet = k70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            k70Var.d0 = animatorSet2;
            animatorSet2.addListener(new i70(this, i10));
            k70Var.d0.setDuration(150L);
            k70Var.d0.setInterpolator(wr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(w30Var, (Property<w30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(w30Var);
    }

    public final void b(w30 w30Var) {
        this.d = false;
        k70 k70Var = this.e;
        k70Var.f0.l(w30Var.getUid());
        w30Var.setOnClickListener(null);
        AnimatorSet animatorSet = k70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            k70Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        k70Var.d0 = animatorSet2;
        animatorSet2.addListener(new bi.u3(25, this, w30Var));
        k70Var.d0.setDuration(150L);
        this.c = w30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<w30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        s4.c1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.x1 x1Var;
        int i12;
        k70 k70Var = this.e;
        org.telegram.ui.ActionBar.x1 x1Var2 = k70Var.V;
        bi.y1 y1Var = k70Var.d;
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
            if (childAt instanceof w30) {
                x1Var = x1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    w30 w30Var = this.c;
                    if (childAt == w30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (w30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
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
                    i14 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                x1Var = x1Var2;
            }
            i13++;
            x1Var2 = x1Var;
        }
        org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = k70Var.m0 != null ? k70Var.g0 ? Math.min(k70Var.s0, dp6) : 0 : hc.b.g(52.0f, Math.min(k70Var.s0, dp6), 0);
        int i16 = k70Var.u0;
        int dp7 = (k70Var.m0 != null || k70Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        k70Var.u0 = dp7;
        if (min != k70Var.o0 || i16 != dp7) {
            k70Var.o0 = min;
            if (y1Var.getAdapter() != null && y1Var.getAdapter().h() > 0 && (K = y1Var.K(0)) != null) {
                y1Var.getAdapter().m(0);
                k70Var.R.h1(0, K.a.getTop() - y1Var.getPaddingTop());
                if (y1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ai.m(this, 7));
                    ofFloat.setDuration(y1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(k70Var.s0, dp6);
        int i17 = k70Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new j6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > k70Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.h70
                public final /* synthetic */ j70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            k70 k70Var2 = this.b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.s0);
                            break;
                        default:
                            k70 k70Var3 = this.b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && x1Var3.getMeasuredHeight() + x1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.h70
                public final /* synthetic */ j70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            k70 k70Var2 = this.b.e;
                            k70Var2.V.smoothScrollTo(0, dp6 - k70Var2.s0);
                            break;
                        default:
                            k70 k70Var3 = this.b.e;
                            k70Var3.V.smoothScrollTo(0, dp6 - k70Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = k70Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            k70Var.d0.addListener(new i70(this, 0));
            k70Var.d0.start();
            this.a = true;
        }
        if (k70Var.d0 == null) {
            k70Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.h3) k70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        y1Var.setTranslationY(0.0f);
    }
}
