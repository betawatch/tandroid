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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public v30 c;
    public boolean d;
    public final /* synthetic */ x70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(x70 x70Var, Context context) {
        super(context);
        this.e = x70Var;
        this.b = new ArrayList();
    }

    public final void a(v30 v30Var, boolean z10) {
        int i10 = 1;
        this.d = true;
        x70 x70Var = this.e;
        x70Var.f0.k(v30Var, v30Var.getUid());
        AnimatorSet animatorSet = x70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x70Var.d0.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            x70Var.d0 = animatorSet2;
            animatorSet2.addListener(new v70(this, i10));
            x70Var.d0.setDuration(150L);
            x70Var.d0.setInterpolator(bs.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(v30Var, (Property<v30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(v30Var);
    }

    public final void b(v30 v30Var) {
        this.d = false;
        x70 x70Var = this.e;
        x70Var.f0.l(v30Var.getUid());
        v30Var.setOnClickListener(null);
        AnimatorSet animatorSet = x70Var.d0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            x70Var.d0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        x70Var.d0 = animatorSet2;
        animatorSet2.addListener(new ai.ne(28, this, v30Var));
        x70Var.d0.setDuration(150L);
        this.c = v30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<v30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        s4.b1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.u1 u1Var;
        int i12;
        x70 x70Var = this.e;
        org.telegram.ui.ActionBar.u1 u1Var2 = x70Var.V;
        ai.u1 u1Var3 = x70Var.d;
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
            if (childAt instanceof v30) {
                u1Var = u1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.v0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    v30 v30Var = this.c;
                    if (childAt == v30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (v30Var != null) {
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
                    i14 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.v0.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                u1Var = u1Var2;
            }
            i13++;
            u1Var2 = u1Var;
        }
        org.telegram.ui.ActionBar.u1 u1Var4 = u1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = x70Var.m0 != null ? x70Var.g0 ? Math.min(x70Var.s0, dp6) : 0 : i2.o1.g(52.0f, Math.min(x70Var.s0, dp6), 0);
        int i16 = x70Var.u0;
        int dp7 = (x70Var.m0 != null || x70Var.f0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        x70Var.u0 = dp7;
        if (min != x70Var.o0 || i16 != dp7) {
            x70Var.o0 = min;
            if (u1Var3.getAdapter() != null && u1Var3.getAdapter().h() > 0 && (K = u1Var3.K(0)) != null) {
                u1Var3.getAdapter().m(0);
                x70Var.R.h1(0, K.a.getTop() - u1Var3.getPaddingTop());
                if (u1Var3.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ci.u4(this, 8));
                    ofFloat.setDuration(u1Var3.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(x70Var.s0, dp6);
        int i17 = x70Var.k0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new l6(this, 29));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > x70Var.s0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.u70
                public final /* synthetic */ w70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            x70 x70Var2 = this.b.e;
                            x70Var2.V.smoothScrollTo(0, dp6 - x70Var2.s0);
                            break;
                        default:
                            x70 x70Var3 = this.b.e;
                            x70Var3.V.smoothScrollTo(0, dp6 - x70Var3.s0);
                            break;
                    }
                }
            });
        } else if (!z10 && u1Var4.getMeasuredHeight() + u1Var4.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.u70
                public final /* synthetic */ w70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            x70 x70Var2 = this.b.e;
                            x70Var2.V.smoothScrollTo(0, dp6 - x70Var2.s0);
                            break;
                        default:
                            x70 x70Var3 = this.b.e;
                            x70Var3.V.smoothScrollTo(0, dp6 - x70Var3.s0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = x70Var.d0) != null) {
            animatorSet.playTogether(arrayList);
            x70Var.d0.addListener(new v70(this, 0));
            x70Var.d0.start();
            this.a = true;
        }
        if (x70Var.d0 == null) {
            x70Var.k0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.h3) x70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        u1Var3.setTranslationY(0.0f);
    }
}
