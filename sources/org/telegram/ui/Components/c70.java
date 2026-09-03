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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c70 extends ViewGroup {
    public boolean a;
    public final ArrayList b;
    public o30 c;
    public boolean d;
    public final /* synthetic */ d70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(d70 d70Var, Context context) {
        super(context);
        this.e = d70Var;
        this.b = new ArrayList();
    }

    public final void a(o30 o30Var, boolean z4) {
        int i10 = 1;
        this.d = true;
        d70 d70Var = this.e;
        d70Var.c0.k(o30Var, o30Var.getUid());
        AnimatorSet animatorSet = d70Var.a0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d70Var.a0.cancel();
        }
        this.a = false;
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            d70Var.a0 = animatorSet2;
            animatorSet2.addListener(new b70(this, i10));
            d70Var.a0.setDuration(150L);
            d70Var.a0.setInterpolator(mr.f);
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.SCALE_X, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.SCALE_Y, 0.01f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        addView(o30Var);
    }

    public final void b(o30 o30Var) {
        this.d = false;
        d70 d70Var = this.e;
        d70Var.c0.l(o30Var.getUid());
        o30Var.setOnClickListener(null);
        AnimatorSet animatorSet = d70Var.a0;
        if (animatorSet != null) {
            animatorSet.setupEndValues();
            d70Var.a0.cancel();
        }
        this.a = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        d70Var.a0 = animatorSet2;
        animatorSet2.addListener(new dg.y2(24, this, o30Var));
        d70Var.a0.setDuration(150L);
        this.c = o30Var;
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<o30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<o30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList.add(ObjectAnimator.ofFloat(this.c, (Property<o30, Float>) View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        f2.l1 K;
        ViewGroup viewGroup;
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.x1 x1Var;
        int i12;
        d70 d70Var = this.e;
        org.telegram.ui.ActionBar.x1 x1Var2 = d70Var.S;
        lh.e1 e1Var = d70Var.d;
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
            if (childAt instanceof o30) {
                x1Var = x1Var2;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                if (childAt != this.c && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 = org.telegram.messenger.y3.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i14;
                if (!this.a) {
                    o30 o30Var = this.c;
                    if (childAt == o30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (o30Var != null) {
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
                    i14 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i15);
            } else {
                x1Var = x1Var2;
            }
            i13++;
            x1Var2 = x1Var;
        }
        org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
        int dp5 = AndroidUtilities.dp(42.0f) + dp3;
        final int dp6 = AndroidUtilities.dp(42.0f) + dp2;
        int min = d70Var.j0 != null ? d70Var.d0 ? Math.min(d70Var.p0, dp6) : 0 : kf.k0.c(52.0f, Math.min(d70Var.p0, dp6), 0);
        int i16 = d70Var.r0;
        int dp7 = (d70Var.j0 != null || d70Var.c0.m() <= 0) ? 0 : AndroidUtilities.dp(56.0f);
        d70Var.r0 = dp7;
        if (min != d70Var.l0 || i16 != dp7) {
            d70Var.l0 = min;
            if (e1Var.getAdapter() != null && e1Var.getAdapter().h() > 0 && (K = e1Var.K(0)) != null) {
                e1Var.getAdapter().m(0);
                d70Var.O.h1(0, K.a.getTop() - e1Var.getPaddingTop());
                if (e1Var.getItemAnimator() != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new eg.b1(this, 7));
                    ofFloat.setDuration(e1Var.getItemAnimator().i()).start();
                }
            }
        }
        int min2 = Math.min(d70Var.p0, dp6);
        int i17 = d70Var.h0;
        if (i17 != min2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i17, min2);
            ofInt.addUpdateListener(new f6(this, 28));
            arrayList.add(ofInt);
        }
        boolean z4 = this.d;
        if (z4 && dp6 > d70Var.p0) {
            final int i18 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.a70
                public final /* synthetic */ c70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            d70 d70Var2 = this.b.e;
                            d70Var2.S.smoothScrollTo(0, dp6 - d70Var2.p0);
                            break;
                        default:
                            d70 d70Var3 = this.b.e;
                            d70Var3.S.smoothScrollTo(0, dp6 - d70Var3.p0);
                            break;
                    }
                }
            });
        } else if (!z4 && x1Var3.getMeasuredHeight() + x1Var3.getScrollY() > dp6) {
            final int i19 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.a70
                public final /* synthetic */ c70 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i19) {
                        case 0:
                            d70 d70Var2 = this.b.e;
                            d70Var2.S.smoothScrollTo(0, dp6 - d70Var2.p0);
                            break;
                        default:
                            d70 d70Var3 = this.b.e;
                            d70Var3.S.smoothScrollTo(0, dp6 - d70Var3.p0);
                            break;
                    }
                }
            });
        }
        if (!this.a && (animatorSet = d70Var.a0) != null) {
            animatorSet.playTogether(arrayList);
            d70Var.a0.addListener(new b70(this, 0));
            d70Var.a0.start();
            this.a = true;
        }
        if (d70Var.a0 == null) {
            d70Var.h0 = min2;
            viewGroup = ((org.telegram.ui.ActionBar.g3) d70Var).containerView;
            viewGroup.invalidate();
        }
        setMeasuredDimension(size, Math.max(dp6, dp5));
        e1Var.setTranslationY(0.0f);
    }
}
