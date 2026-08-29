package nh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w5 extends FrameLayout {
    public View a;
    public ArrayList b;
    public v5 c;
    public String d;
    public boolean e;
    public Utilities.Callback f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i10, int i11, String str) {
        u5 u5Var = new u5(this, getContext(), i10, i11);
        u5Var.setContentDescription(str);
        this.b.add(u5Var);
        addView(u5Var);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.r == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z10;
        if (!z11) {
            this.n = z10 ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 10));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(jr.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            u5 u5Var = (u5) arrayList.get(i10);
            if (u5Var.a != 4) {
                i10++;
            } else if (u5Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u5 u5Var = (u5) arrayList.get(i11);
            if (u5Var.a == i10) {
                u5Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f9 = this.n;
            if (this.r) {
                f9 = jr.h.getInterpolation(AndroidUtilities.cascade(f9, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f9);
            childAt.setTranslationY((1.0f - f9) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.b;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.a.layout(0, 0, i14, i15);
        v5 v5Var = this.c;
        v5Var.layout(i14 - v5Var.getMeasuredWidth(), (i15 - this.c.getMeasuredHeight()) / 2, i14, (this.c.getMeasuredHeight() + i15) / 2);
        int dp = (i14 - AndroidUtilities.dp(32.33f)) - this.c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((u5) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        int min = Math.min(AndroidUtilities.dp(c() ? 20.0f : 30.0f), i16 < 2 ? 0 : org.telegram.ui.b.z(40.0f, i16, dp) / (i16 - 1));
        int x4 = org.telegram.ui.b.x(40.0f, i15, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i15) / 2;
        int dp3 = AndroidUtilities.dp(12.33f) + (!c() ? (org.telegram.ui.b.z(40.0f, i16, dp) - ((i16 - 1) * min)) / 2 : 0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((u5) arrayList.get(i18)).getVisibility() == 0) {
                ((u5) arrayList.get(i18)).layout(dp3, x4, AndroidUtilities.dp(40.0f) + dp3, dp2);
                dp3 = org.telegram.messenger.x3.C(40.0f, min, dp3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            v5 v5Var = this.c;
            v5Var.s = z10;
            v5Var.invalidate();
        }
    }
}
