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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n20 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public w30 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ o20 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(o20 o20Var, Context context) {
        super(context);
        this.r = o20Var;
        this.c = new ArrayList();
        this.e = new ArrayList();
        this.f = -1;
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
        int y3;
        char c10;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        if (!this.b) {
            this.n = 0;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            arrayList = this.c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof w30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    if (childAt.getMeasuredWidth() + i13 > dp) {
                        dp2 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i13 = 0;
                    }
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.a2.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i14 = 0;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i13;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i14);
                        childAt.setTranslationY(dp3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.n = Math.max(this.n, dp2);
                    } else {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[c10] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[c10] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, dp2);
                    }
                }
                if (!contains) {
                    i13 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.a2.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (AndroidUtilities.isTablet()) {
            y3 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            y3 = org.telegram.messenger.em.y(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i13 < y3) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i14 < y3) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.b;
        o20 o20Var = this.r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            o20Var.n = dp2;
            if (this.a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.a.playTogether(arrayList);
                this.a.addListener(new m20(this, 0));
                this.f = NotificationCenter.getInstance(o20Var.a).setAnimationInProgress(this.f, null);
                this.a.start();
                this.b = true;
            } else {
                this.h = dp5;
            }
        }
        int i15 = this.n;
        o20Var.e = i15 > 0 ? AndroidUtilities.dp(40.0f) + i15 : 0;
        setMeasuredDimension(size, this.h);
        l20 l20Var = o20Var.f;
        if (l20Var != null) {
            l20Var.a(o20Var.e);
        }
    }
}
