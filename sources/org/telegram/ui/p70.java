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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p70 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public org.telegram.ui.Components.w20 d;
    public org.telegram.ui.Components.w20 e;
    public int f;
    public final /* synthetic */ q70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(q70 q70Var, Context context) {
        super(context);
        this.h = q70Var;
        this.c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.w20 w20Var) {
        q70 q70Var = this.h;
        q70Var.v = true;
        q70Var.B.remove(w20Var.getKey());
        q70Var.C.remove(w20Var);
        w20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.a.setupEndValues();
            this.a.cancel();
        }
        this.b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.su0(5, this, w20Var));
        this.a.setInterpolator(org.telegram.ui.Components.gr.h);
        this.a.setDuration(320L);
        this.e = w20Var;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.Components.w20, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int y10;
        int max;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(6.0f);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.c;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Components.w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), TLObject.FLAG_30));
                if (childAt != this.e && childAt.getMeasuredWidth() + i13 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i13;
                if (!this.b) {
                    org.telegram.ui.Components.w20 w20Var = this.e;
                    if (childAt == w20Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (w20Var != null) {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f11));
                        }
                        i12 = Math.max(i12, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i12 = Math.max(i12, dp2);
                    }
                }
                if (childAt != this.e) {
                    i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i11++;
        }
        int i15 = 3;
        if (AndroidUtilities.isTablet()) {
            y10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y10 = org.telegram.messenger.ll.y(158.0f, Math.min(point.x, point.y), 3);
        }
        int dp5 = i12 > 0 ? AndroidUtilities.dp(34.0f) + i12 : 0;
        q70 q70Var = this.h;
        boolean z10 = dp5 > q70Var.x - AndroidUtilities.dp(12.0f);
        if (dp - i13 < y10 && !z10) {
            dp2 += AndroidUtilities.dp(34.0f);
            i12 = Math.max(i12, dp2);
            i13 = 0;
        }
        boolean z11 = (i12 > 0 ? AndroidUtilities.dp(34.0f) + i12 : 0) > q70Var.x - AndroidUtilities.dp(12.0f);
        if (!this.b) {
            int dp6 = AndroidUtilities.dp(28.0f) + dp3;
            q70Var.E = dp2;
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
            max = q70Var.x - AndroidUtilities.dp(12.0f);
        } else {
            max = Math.max(AndroidUtilities.dp(37.0f), Math.min(i12 > 0 ? AndroidUtilities.dp(31.0f) + i12 : 0, q70Var.x - AndroidUtilities.dp(12.0f)));
        }
        q70Var.b.a(max);
        o70 o70Var = q70Var.d;
        if (o70Var != null) {
            int max2 = Math.max(0, childCount - (this.e != null ? 1 : 0));
            float b10 = org.telegram.messenger.l0.b(6.0f, i12, 0);
            float f12 = i13;
            boolean z12 = max2 <= 0;
            float f13 = 0.0f;
            ViewPropertyAnimator scaleY = o70Var.c.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.5f).scaleY(z12 ? 1.0f : 0.5f);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            org.telegram.messenger.ll.r(scaleY, grVar, 320L);
            ViewPropertyAnimator translationY = o70Var.d.animate().translationY(z11 ? ((o70Var.getHeight() - o70Var.getPaddingTop()) - o70Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f) : b10);
            if (z11) {
                f13 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f13 = Math.max(-AndroidUtilities.dp(36.0f), f12 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f13).setInterpolator(grVar).setDuration(320L).start();
            o70Var.f.e.post(new d0(o70Var, b10, i15));
        }
        setMeasuredDimension(size, this.f);
    }
}
