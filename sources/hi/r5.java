package hi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.i20;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r5 extends FrameLayout {
    public View a;
    public ArrayList b;
    public q5 c;
    public String d;
    public boolean e;
    public z10 f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i7, int i10, String str) {
        o5 o5Var = new o5(this, getContext(), i7, i10);
        o5Var.setContentDescription(str);
        this.b.add(o5Var);
        addView(o5Var);
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
        ofFloat.addUpdateListener(new j3(this, 2));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(er.h);
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
            o5 o5Var = (o5) arrayList.get(i7);
            if (o5Var.a != 4) {
                i7++;
            } else if (o5Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i7, boolean z10) {
        ArrayList arrayList = this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            o5 o5Var = (o5) arrayList.get(i10);
            if (o5Var.a == i7) {
                o5Var.setVisibility(z10 ? 0 : 8);
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
                f10 = er.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
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
        q5 q5Var = this.c;
        q5Var.layout(i13 - q5Var.getMeasuredWidth(), (i14 - this.c.getMeasuredHeight()) / 2, i13, (this.c.getMeasuredHeight() + i14) / 2);
        int L = (i13 - org.telegram.messenger.g0.L(32.33f)) - this.c.getMeasuredWidth();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            if (((o5) arrayList.get(i16)).getVisibility() == 0) {
                i15++;
            }
        }
        int min = Math.min(org.telegram.messenger.g0.L(c() ? 20.0f : 30.0f), i15 < 2 ? 0 : i20.A(40.0f, i15, L) / (i15 - 1));
        int y10 = i20.y(40.0f, i14, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i14) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f) + (!c() ? (i20.A(40.0f, i15, L) - ((i15 - 1) * min)) / 2 : 0);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((o5) arrayList.get(i17)).getVisibility() == 0) {
                ((o5) arrayList.get(i17)).layout(L3, y10, org.telegram.messenger.g0.L(40.0f) + L3, L2);
                L3 = org.telegram.messenger.k5.C(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(z10 z10Var) {
        this.f = z10Var;
    }

    public void setShareEnabled(boolean z10) {
        if (this.h != z10) {
            this.h = z10;
            q5 q5Var = this.c;
            q5Var.s = z10;
            q5Var.invalidate();
        }
    }
}
