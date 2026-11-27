// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class im8 extends FrameLayout {
    public View a;
    public ArrayList b;
    public hm8 c;
    public String d;
    public boolean e;
    public pcc f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i, int i2, String str) {
        gm8 gm8Var = new gm8(this, getContext(), i, i2);
        gm8Var.setContentDescription(str);
        this.b.add(gm8Var);
        addView(gm8Var);
    }

    public final void b(boolean z, boolean z2) {
        if (this.r == z) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z;
        if (!z2) {
            this.n = z ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new pv7(this, (byte) 13));
        boolean z3 = this.r;
        ValueAnimator valueAnimator2 = this.s;
        if (z3) {
            valueAnimator2.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            valueAnimator2.setDuration(350L);
            this.s.setInterpolator(k43.h);
        }
        this.s.start();
    }

    public final boolean c() {
        ArrayList arrayList = this.b;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            gm8 gm8Var = (gm8) arrayList.get(i);
            if (gm8Var.a != 4) {
                i++;
            } else if (gm8Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i, boolean z) {
        ArrayList arrayList = this.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            gm8 gm8Var = (gm8) arrayList.get(i2);
            if (gm8Var.a == i) {
                gm8Var.setVisibility(z ? 0 : 8);
            }
        }
    }

    public final void e() {
        View view = this.a;
        view.setAlpha(this.n);
        view.setTranslationY((1.0f - this.n) * hl.L(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float f = this.n;
            if (this.r) {
                f = k43.h.getInterpolation(hl.s(f, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f);
            childAt.setTranslationY((1.0f - f) * hl.L(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.b;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.a.layout(0, 0, i5, i6);
        hm8 hm8Var = this.c;
        hm8Var.layout(i5 - hm8Var.getMeasuredWidth(), (i6 - this.c.getMeasuredHeight()) / 2, i5, (this.c.getMeasuredHeight() + i6) / 2);
        int L = (i5 - hl.L(32.33f)) - this.c.getMeasuredWidth();
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (((gm8) arrayList.get(i8)).getVisibility() == 0) {
                i7++;
            }
        }
        int min = Math.min(hl.L(c() ? 20.0f : 30.0f), i7 < 2 ? 0 : (L - (hl.L(40.0f) * i7)) / (i7 - 1));
        int D = ik8.D(40.0f, i6, 2);
        int L2 = (hl.L(40.0f) + i6) / 2;
        int L3 = hl.L(12.33f) + (!c() ? ((L - (hl.L(40.0f) * i7)) - ((i7 - 1) * min)) / 2 : 0);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((gm8) arrayList.get(i9)).getVisibility() == 0) {
                ((gm8) arrayList.get(i9)).layout(L3, D, hl.L(40.0f) + L3, L2);
                L3 = uh9.w(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(pcc pccVar) {
        this.f = pccVar;
    }

    public void setShareEnabled(boolean z) {
        if (this.h != z) {
            this.h = z;
            hm8 hm8Var = this.c;
            hm8Var.s = z;
            hm8Var.invalidate();
        }
    }
}
