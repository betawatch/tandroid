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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class f80 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.n30 d;
    public org.telegram.ui.Components.n30 e;
    public int f;
    public final /* synthetic */ g80 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(g80 g80Var, Context context) {
        super(context);
        this.h = g80Var;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.n30 n30Var) {
        g80 g80Var = this.h;
        g80Var.v = true;
        g80Var.F.remove(n30Var.getKey());
        g80Var.G.remove(n30Var);
        n30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.al0(7, this, n30Var));
        this.a.setInterpolator(org.telegram.ui.Components.rr.h);
        this.a.setDuration(320L);
        this.e = n30Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.n30, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.n30, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.n30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int A;
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
            if (childAt instanceof org.telegram.ui.Components.n30) {
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
                    org.telegram.ui.Components.n30 n30Var = this.e;
                    if (childAt == n30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i15);
                        childAt.setTranslationY(dp3);
                    } else if (n30Var != null) {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f7));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f10));
                        }
                        i13 = Math.max(i13, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i13 = Math.max(i13, dp2);
                    }
                }
                if (childAt != this.e) {
                    i14 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i14);
                }
                i15 = org.telegram.messenger.f0.C(9.0f, childAt.getMeasuredWidth(), i15);
            }
            i12++;
        }
        int i16 = 3;
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.ok.A(158.0f, Math.min(point.x, point.y), 3);
        }
        int dp5 = i13 > 0 ? AndroidUtilities.dp(34.0f) + i13 : 0;
        g80 g80Var = this.h;
        boolean z10 = dp5 > g80Var.x - AndroidUtilities.dp(12.0f);
        if (dp - i14 < A && !z10) {
            dp2 += AndroidUtilities.dp(34.0f);
            i13 = Math.max(i13, dp2);
            i14 = 0;
        }
        boolean z11 = (i13 > 0 ? AndroidUtilities.dp(34.0f) + i13 : 0) > g80Var.x - AndroidUtilities.dp(12.0f);
        if (!this.b) {
            int dp6 = AndroidUtilities.dp(28.0f) + dp3;
            g80Var.I = dp2;
            if (this.a != null) {
                this.f = AndroidUtilities.dp(28.0f) + dp2;
                this.a.playTogether(arrayList);
                this.a.start();
                this.b = true;
            } else {
                this.f = dp6;
            }
        }
        if (z11) {
            max = g80Var.x - AndroidUtilities.dp(12.0f);
        } else {
            max = Math.max(AndroidUtilities.dp(37.0f), Math.min(i13 > 0 ? AndroidUtilities.dp(31.0f) + i13 : 0, g80Var.x - AndroidUtilities.dp(12.0f)));
        }
        g80Var.b.a(max);
        e80 e80Var = g80Var.d;
        if (e80Var != null) {
            int max2 = Math.max(0, childCount - (this.e != null ? 1 : 0));
            float b10 = org.telegram.messenger.f0.b(6.0f, i13, 0);
            float f11 = i14;
            boolean z12 = max2 <= 0;
            float f12 = 0.0f;
            ViewPropertyAnimator scaleY = e80Var.c.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.5f).scaleY(z12 ? 1.0f : 0.5f);
            org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.h;
            org.telegram.messenger.ok.s(scaleY, rrVar, 320L);
            ViewPropertyAnimator translationY = e80Var.d.animate().translationY(z11 ? ((e80Var.getHeight() - e80Var.getPaddingTop()) - e80Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f) : b10);
            if (z11) {
                f12 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f12 = Math.max(-AndroidUtilities.dp(36.0f), f11 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f12).setInterpolator(rrVar).setDuration(320L).start();
            e80Var.f.e.post(new c0(e80Var, b10, i16));
        }
        setMeasuredDimension(size, this.f);
    }
}
