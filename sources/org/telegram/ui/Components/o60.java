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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o60 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public a30 c;
    public boolean d;
    public final /* synthetic */ p60 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(p60 p60Var, Context context) {
        super(context);
        this.e = p60Var;
        this.b = new ArrayList();
    }

    public final void a(a30 a30Var, boolean z10) {
        this.d = true;
        p60 p60Var = this.e;
        p60Var.b0.k(a30Var, a30Var.getUid());
        AnimatorSet animatorSet = p60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p60Var.Z.cancel();
        }
        this.a = false;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            p60Var.Z = animatorSet2;
            animatorSet2.addListener(new n60(this, 1));
            p60Var.Z.setDuration(150L);
            p60Var.Z.setInterpolator(er.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(a30Var);
    }

    public final void b(a30 a30Var) {
        this.d = false;
        p60 p60Var = this.e;
        p60Var.b0.l(a30Var.getUid());
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = p60Var.Z;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            p60Var.Z.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        p60Var.Z = animatorSet2;
        animatorSet2.addListener(new ag.x1(27, this, a30Var));
        p60Var.Z.setDuration(150L);
        this.c = a30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        f2.o1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.v1 v1Var;
        int i12;
        p60 p60Var = this.e;
        org.telegram.ui.ActionBar.v1 v1Var2 = p60Var.R;
        hh.f1 f1Var = p60Var.d;
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
            if (childAt instanceof a30) {
                v1Var = v1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.y1.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    a30 a30Var = this.c;
                    if (childAt == a30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (a30Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        } else {
                            i12 = 1;
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i12];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                    }
                }
                if (childAt != this.c) {
                    i14 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                v1Var = v1Var2;
            }
            i13++;
            v1Var2 = v1Var;
        }
        org.telegram.ui.ActionBar.v1 v1Var3 = v1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = p60Var.i0 != null ? p60Var.c0 ? Math.min(p60Var.o0, dp6) : 0 : i0.a.d(52.0f, Math.min(p60Var.o0, dp6), 0);
        int i16 = p60Var.q0;
        int dp7 = (p60Var.i0 != null || p60Var.b0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        p60Var.q0 = dp7;
        if (min != p60Var.k0 || i16 != dp7) {
            p60Var.k0 = min;
            if (f1Var.getAdapter() != null && f1Var.getAdapter().h() > 0 && (K = f1Var.K(0)) != null) {
                f1Var.getAdapter().m(0);
                p60Var.N.h1(0, K.a.getTop() - f1Var.getPaddingTop());
                if (f1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ag.q1(this, 8));
                    ofFloat.setDuration(f1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(p60Var.o0, dp6);
        int i17 = p60Var.g0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new e6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z10 = this.d;
        if (z10 && dp6 > p60Var.o0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.m60
                public final /* synthetic */ o60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            p60 p60Var2 = this.b.e;
                            p60Var2.R.smoothScrollTo(0, dp6 - p60Var2.o0);
                            break;
                        default:
                            p60 p60Var3 = this.b.e;
                            p60Var3.R.smoothScrollTo(0, dp6 - p60Var3.o0);
                            break;
                    }
                }
            });
        } else if (!z10 && v1Var3.getMeasuredHeight() + v1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.m60
                public final /* synthetic */ o60 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            p60 p60Var2 = this.b.e;
                            p60Var2.R.smoothScrollTo(0, dp6 - p60Var2.o0);
                            break;
                        default:
                            p60 p60Var3 = this.b.e;
                            p60Var3.R.smoothScrollTo(0, dp6 - p60Var3.o0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = p60Var.Z) != null) {
            animatorSet.playTogether(arrayList);
            p60Var.Z.addListener(new n60(this, 0));
            p60Var.Z.start();
            this.a = true;
        }
        if (p60Var.Z == null) {
            p60Var.g0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.e3) p60Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        f1Var.setTranslationY(0.0f);
    }
}
