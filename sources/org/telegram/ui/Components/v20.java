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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v20 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public d40 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ w20 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(w20 w20Var, Context context) {
        super(context);
        this.r = w20Var;
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
        int A;
        int i12;
        int i13;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        int i14 = 0;
        if (!this.b) {
            this.n = 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof d40) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    i13 = i14;
                } else {
                    i13 = i14;
                    if (childAt.getMeasuredWidth() + i16 > dp) {
                        dp2 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i16 = i13;
                    }
                }
                if (childAt.getMeasuredWidth() + i17 > dp) {
                    dp3 = org.telegram.messenger.q.C(8.0f, childAt.getMeasuredHeight(), dp3);
                    i17 = i13;
                }
                int dp4 = AndroidUtilities.dp(13.0f) + i16;
                if (!this.b) {
                    if (contains) {
                        childAt.setTranslationX(AndroidUtilities.dp(13.0f) + i17);
                        childAt.setTranslationY(dp3);
                    } else if (arrayList2.isEmpty()) {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        this.n = Math.max(this.n, dp2);
                    } else {
                        float f7 = dp4;
                        if (childAt.getTranslationX() != f7) {
                            float[] fArr = new float[1];
                            fArr[i13] = f7;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[i13] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, dp2);
                    }
                }
                if (!contains) {
                    i16 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i16);
                }
                i17 = org.telegram.messenger.q.C(9.0f, childAt.getMeasuredWidth(), i17);
            } else {
                i13 = i14;
            }
            i15++;
            i14 = i13;
        }
        int i18 = i14;
        if (AndroidUtilities.isTablet()) {
            A = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            A = org.telegram.messenger.bi.A(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i16 < A) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i17 < A) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.b;
        w20 w20Var = this.r;
        if (z10) {
            i12 = i18;
        } else {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            w20Var.n = dp2;
            if (this.a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.a.playTogether(arrayList);
                i12 = i18;
                this.a.addListener(new u20(this, i12));
                this.f = NotificationCenter.getInstance(w20Var.a).setAnimationInProgress(this.f, null);
                this.a.start();
                this.b = true;
            } else {
                i12 = i18;
                this.h = dp5;
            }
        }
        int i19 = this.n;
        w20Var.e = i19 > 0 ? AndroidUtilities.dp(40.0f) + i19 : i12;
        setMeasuredDimension(size, this.h);
        t20 t20Var = w20Var.f;
        if (t20Var != null) {
            t20Var.a(w20Var.e);
        }
    }
}
