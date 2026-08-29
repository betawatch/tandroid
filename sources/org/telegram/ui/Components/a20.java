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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a20 extends ViewGroup {
    public AnimatorSet a;
    public boolean b;
    public final ArrayList c;
    public j30 d;
    public final ArrayList e;
    public int f;
    public int h;
    public int n;
    public final /* synthetic */ b20 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(b20 b20Var, Context context) {
        super(context);
        this.r = b20Var;
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
        int x4;
        char c3;
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
            if (childAt instanceof j30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                ArrayList arrayList2 = this.e;
                boolean contains = arrayList2.contains(childAt);
                if (contains) {
                    c3 = 0;
                } else {
                    c3 = 0;
                    if (childAt.getMeasuredWidth() + i13 > dp) {
                        dp2 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp2);
                        i13 = 0;
                    }
                }
                if (childAt.getMeasuredWidth() + i14 > dp) {
                    dp3 = org.telegram.messenger.x3.C(8.0f, childAt.getMeasuredHeight(), dp3);
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
                        float f9 = dp4;
                        if (childAt.getTranslationX() != f9) {
                            float[] fArr = new float[1];
                            fArr[c3] = f9;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, fArr));
                        }
                        float f10 = dp2;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr2 = new float[1];
                            fArr2[c3] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, fArr2));
                        }
                        this.n = Math.max(this.n, dp2);
                    }
                }
                if (!contains) {
                    i13 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i13);
                }
                i14 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i14);
            }
            i12++;
        }
        if (AndroidUtilities.isTablet()) {
            x4 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x4 = org.telegram.ui.b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (dp - i13 < x4) {
            dp2 += AndroidUtilities.dp(40.0f);
        }
        if (dp - i14 < x4) {
            dp3 += AndroidUtilities.dp(40.0f);
        }
        boolean z10 = this.b;
        b20 b20Var = this.r;
        if (!z10) {
            int dp5 = AndroidUtilities.dp(42.0f) + dp3;
            b20Var.n = dp2;
            if (this.a != null) {
                this.h = AndroidUtilities.dp(42.0f) + dp2;
                this.a.playTogether(arrayList);
                this.a.addListener(new z10(this, 0));
                this.f = NotificationCenter.getInstance(b20Var.a).setAnimationInProgress(this.f, null);
                this.a.start();
                this.b = true;
            } else {
                this.h = dp5;
            }
        }
        int i15 = this.n;
        b20Var.e = i15 > 0 ? AndroidUtilities.dp(40.0f) + i15 : 0;
        setMeasuredDimension(size, this.h);
        y10 y10Var = b20Var.f;
        if (y10Var != null) {
            y10Var.a(b20Var.e);
        }
    }
}
