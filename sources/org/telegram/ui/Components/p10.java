package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p10 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public w20 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ q10 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(q10 q10Var, Context context) {
        super(context);
        this.r = q10Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
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
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i9);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.b) {
            this.n = 0;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            arrayList = this.c;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt instanceof w20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i12 > dp) {
                        dp2 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i12 = 0;
                    }
                }
                if (childAt.getMeasuredWidth() + i13 > dp) {
                    dp3 = org.telegram.messenger.l0.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i13 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i12;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i13);
                        childAt.setTranslationY(dp3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.n = Math.max(this.n, dp2);
                    } else {
                        float f10 = dp4;
                        if (childAt.getTranslationX() != f10) {
                            float[] fArr = new float[1];
                            fArr[c10] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f11 = dp2;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr2 = new float[1];
                            fArr2[c10] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, dp2);
                    }
                }
                if (!contains) {
                    i12 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i12);
                }
                i13 = org.telegram.messenger.l0.C(9.0f, childAt.getMeasuredWidth(), i13);
            }
            i11++;
        }
        if (AndroidUtilities.isTablet()) {
            y10 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y10 = org.telegram.messenger.ll.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i12 < y10) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i13 < y10) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.b;
        q10 q10Var = this.r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            q10Var.n = dp2;
            if (this.a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.a.playTogether(arrayList);
                this.a.addListener(new o10(this, 0));
                this.f = NotificationCenter.getInstance(q10Var.a).setAnimationInProgress(this.f, null);
                this.a.start();
                this.b = true;
            } else {
                this.h = dp5;
            }
        }
        int i14 = this.n;
        q10Var.e = i14 > 0 ? AndroidUtilities.dp(40.0f) + i14 : 0;
        setMeasuredDimension(size, this.h);
        n10 n10Var = q10Var.f;
        if (n10Var != null) {
            n10Var.a(q10Var.e);
        }
    }
}
