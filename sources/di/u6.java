package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class u6 extends FrameLayout {
    public View a;
    public ArrayList b;
    public t6 c;
    public String d;
    public boolean e;
    public Utilities.Callback f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i10, int i11, String str) {
        s6 s6Var = new s6(this, getContext(), i10, i11);
        s6Var.setContentDescription(str);
        this.b.add(s6Var);
        addView(s6Var);
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
        ofFloat.addUpdateListener(new ah.d0(this, 22));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(pr.h);
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
            s6 s6Var = (s6) arrayList.get(i10);
            if (s6Var.a != 4) {
                i10++;
            } else if (s6Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s6 s6Var = (s6) arrayList.get(i11);
            if (s6Var.a == i10) {
                s6Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(16.0f));
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float f7 = this.n;
            if (this.r) {
                f7 = pr.h.getInterpolation(AndroidUtilities.cascade(f7, i10 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f7);
            childAt.setTranslationY((1.0f - f7) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.b;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.a.layout(0, 0, i14, i15);
        t6 t6Var = this.c;
        t6Var.layout(i14 - t6Var.getMeasuredWidth(), (i15 - this.c.getMeasuredHeight()) / 2, i14, (this.c.getMeasuredHeight() + i15) / 2);
        int dp = (i14 - AndroidUtilities.dp(32.33f)) - this.c.getMeasuredWidth();
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((s6) arrayList.get(i17)).getVisibility() == 0) {
                i16++;
            }
        }
        int min = Math.min(AndroidUtilities.dp(c() ? 20.0f : 30.0f), i16 < 2 ? 0 : wl.A(40.0f, i16, dp) / (i16 - 1));
        int y3 = wl.y(40.0f, i15, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i15) / 2;
        int dp3 = AndroidUtilities.dp(12.33f) + (!c() ? (wl.A(40.0f, i16, dp) - ((i16 - 1) * min)) / 2 : 0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (((s6) arrayList.get(i18)).getVisibility() == 0) {
                ((s6) arrayList.get(i18)).layout(dp3, y3, AndroidUtilities.dp(40.0f) + dp3, dp2);
                dp3 = org.telegram.messenger.w1.C(40.0f, min, dp3);
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
            t6 t6Var = this.c;
            t6Var.s = z10;
            t6Var.invalidate();
        }
    }
}
