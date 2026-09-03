package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c80 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.p30 d;
    public org.telegram.ui.Components.p30 e;
    public int f;
    public final /* synthetic */ d80 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(d80 d80Var, Context context) {
        super(context);
        this.h = d80Var;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.p30 p30Var) {
        d80 d80Var = this.h;
        d80Var.v = true;
        d80Var.C.remove(p30Var.getKey());
        d80Var.D.remove(p30Var);
        p30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ex0(4, this, p30Var));
        this.a.setInterpolator(org.telegram.ui.Components.pr.h);
        this.a.setDuration(320L);
        this.e = p30Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.p30, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.p30, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.p30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int x10;
        int max;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(6.0f);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            arrayList = this.c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.p30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                if (childAt != this.e && childAt.getMeasuredWidth() + i14 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i14 = 0;
                }
                if (childAt.getMeasuredWidth() + i15 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i15 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i14;
                if (!this.b) {
                    org.telegram.ui.Components.p30 p30Var = this.e;
                    if (childAt == p30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (p30Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f11));
                        }
                        i13 = Math.max(i13, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i13 = Math.max(i13, dp2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.y3.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i12++;
        }
        int i16 = 3;
        if (AndroidUtilities.isTablet()) {
            x10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x10 = b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        int dp5 = i13 > 0 ? AndroidUtilities.dp(34.0f) + i13 : 0;
        d80 d80Var = this.h;
        boolean z4 = dp5 > d80Var.x - AndroidUtilities.dp(12.0f);
        if (dp - i14 < x10 && !z4) {
            dp2 += AndroidUtilities.dp(34.0f);
            i13 = Math.max(i13, dp2);
            i14 = 0;
        }
        boolean z10 = (i13 > 0 ? AndroidUtilities.dp(34.0f) + i13 : 0) > d80Var.x - AndroidUtilities.dp(12.0f);
        if (!this.b) {
            int dp6 = AndroidUtilities.dp(28.0f) + dp3;
            d80Var.F = dp2;
            if (this.a != null) {
                this.f = AndroidUtilities.dp(28.0f) + dp2;
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.f = dp6;
            }
        }
        if (z10) {
            max = d80Var.x - AndroidUtilities.dp(12.0f);
        } else {
            max = Math.max(AndroidUtilities.dp(37.0f), Math.min(i13 > 0 ? AndroidUtilities.dp(31.0f) + i13 : 0, d80Var.x - AndroidUtilities.dp(12.0f)));
        }
        d80Var.b.a(max);
        b80 b80Var = d80Var.d;
        if (b80Var != null) {
            int max2 = Math.max(0, childCount - (this.e != null ? 1 : 0));
            float c3 = l.d.c(6.0f, i13, 0);
            float f12 = i14;
            boolean z11 = max2 <= 0;
            float f13 = 0.0f;
            ViewPropertyAnimator scaleY = b80Var.c.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.5f).scaleY(z11 ? 1.0f : 0.5f);
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            b.p(scaleY, prVar, 320L);
            ViewPropertyAnimator translationY = b80Var.d.animate().translationY(z10 ? ((b80Var.getHeight() - b80Var.getPaddingTop()) - b80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f) : c3);
            if (z10) {
                f13 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f13 = Math.max(-AndroidUtilities.dp(36.0f), f12 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f13).setInterpolator(prVar).setDuration(320L).start();
            b80Var.f.e.post(new d0(b80Var, c3, i16));
        }
        setMeasuredDimension(size, this.f);
    }
}
