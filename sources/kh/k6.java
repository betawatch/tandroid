package kh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k6 extends FrameLayout {
    public View a;
    public ArrayList b;
    public j6 c;
    public String d;
    public boolean e;
    public Utilities.Callback f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i9, int i10, String str) {
        i6 i6Var = new i6(this, getContext(), i9, i10);
        i6Var.setContentDescription(str);
        this.b.add(i6Var);
        addView(i6Var);
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
        ofFloat.addUpdateListener(new g4(this, 1));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(gr.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                break;
            }
            i6 i6Var = (i6) arrayList.get(i9);
            if (i6Var.a != 4) {
                i9++;
            } else if (i6Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i9, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i6 i6Var = (i6) arrayList.get(i10);
            if (i6Var.a == i9) {
                i6Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * AndroidUtilities.dp(16.0f));
        for (int i9 = 1; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            float f10 = this.n;
            if (this.r) {
                f10 = gr.h.getInterpolation(AndroidUtilities.cascade(f10, i9 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * AndroidUtilities.dp(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        ArrayList arrayList = this.b;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        this.a.layout(0, 0, i13, i14);
        j6 j6Var = this.c;
        j6Var.layout(i13 - j6Var.getMeasuredWidth(), (i14 - this.c.getMeasuredHeight()) / 2, i13, (this.c.getMeasuredHeight() + i14) / 2);
        int dp = (i13 - AndroidUtilities.dp(32.33f)) - this.c.getMeasuredWidth();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            if (((i6) arrayList.get(i16)).getVisibility() == 0) {
                i15++;
            }
        }
        int min = Math.min(AndroidUtilities.dp(c() ? 20.0f : 30.0f), i15 < 2 ? 0 : ll.A(40.0f, i15, dp) / (i15 - 1));
        int y10 = ll.y(40.0f, i14, 2);
        int dp2 = (AndroidUtilities.dp(40.0f) + i14) / 2;
        int dp3 = AndroidUtilities.dp(12.33f) + (!c() ? (ll.A(40.0f, i15, dp) - ((i15 - 1) * min)) / 2 : 0);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((i6) arrayList.get(i17)).getVisibility() == 0) {
                ((i6) arrayList.get(i17)).layout(dp3, y10, AndroidUtilities.dp(40.0f) + dp3, dp2);
                dp3 = org.telegram.messenger.l0.C(40.0f, min, dp3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.f = callback;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            j6 j6Var = this.c;
            j6Var.s = z10;
            j6Var.invalidate();
        }
    }
}
