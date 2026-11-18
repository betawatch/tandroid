package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public View a;
    public ArrayList b;
    public o5 c;
    public String d;
    public boolean e;
    public x10 f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i7, int i10, String str) {
        n5 n5Var = new n5(this, getContext(), i7, i10);
        n5Var.setContentDescription(str);
        this.b.add(n5Var);
        addView(n5Var);
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
        ofFloat.addUpdateListener(new k3(this, 2));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(lr.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                break;
            }
            n5 n5Var = (n5) arrayList.get(i7);
            if (n5Var.a != 4) {
                i7++;
            } else if (n5Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i7, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            n5 n5Var = (n5) arrayList.get(i10);
            if (n5Var.a == i7) {
                n5Var.setVisibility(z10 ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * org.telegram.messenger.g0.L(16.0f));
        for (int i7 = 1; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f10 = this.n;
            if (this.r) {
                f10 = lr.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.b;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        this.a.layout(0, 0, i13, i14);
        o5 o5Var = this.c;
        o5Var.layout(i13 - o5Var.getMeasuredWidth(), (i14 - this.c.getMeasuredHeight()) / 2, i13, (this.c.getMeasuredHeight() + i14) / 2);
        int L = (i13 - org.telegram.messenger.g0.L(32.33f)) - this.c.getMeasuredWidth();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            if (((n5) arrayList.get(i16)).getVisibility() == 0) {
                i15++;
            }
        }
        int min = Math.min(org.telegram.messenger.g0.L(c() ? 20.0f : 30.0f), i15 < 2 ? 0 : n10.B(40.0f, i15, L) / (i15 - 1));
        int z11 = n10.z(40.0f, i14, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i14) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f) + (!c() ? (n10.B(40.0f, i15, L) - ((i15 - 1) * min)) / 2 : 0);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((n5) arrayList.get(i17)).getVisibility() == 0) {
                ((n5) arrayList.get(i17)).layout(L3, z11, org.telegram.messenger.g0.L(40.0f) + L3, L2);
                L3 = org.telegram.messenger.f3.C(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(x10 x10Var) {
        this.f = x10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            o5 o5Var = this.c;
            o5Var.s = z10;
            o5Var.invalidate();
        }
    }
}
