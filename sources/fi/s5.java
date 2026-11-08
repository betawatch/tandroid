package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public View a;
    public ArrayList b;
    public r5 c;
    public String d;
    public boolean e;
    public c20 f;
    public boolean h;
    public float n;
    public boolean r;
    public ValueAnimator s;

    public final void a(int i7, int i10, String str) {
        q5 q5Var = new q5(this, getContext(), i7, i10);
        q5Var.setContentDescription(str);
        this.b.add(q5Var);
        addView(q5Var);
    }

    public final void b(boolean z9, boolean z10) {
        if (this.r == z9) {
            return;
        }
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.r = z9;
        if (!z10) {
            this.n = z9 ? 1.0f : 0.0f;
            e();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z9 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 1));
        if (this.r) {
            this.s.setDuration(450L);
            this.s.setInterpolator(new LinearInterpolator());
        } else {
            this.s.setDuration(350L);
            this.s.setInterpolator(xq.h);
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
            q5 q5Var = (q5) arrayList.get(i7);
            if (q5Var.a != 4) {
                i7++;
            } else if (q5Var.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i7, boolean z9) {
        ArrayList arrayList = this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q5 q5Var = (q5) arrayList.get(i10);
            if (q5Var.a == i7) {
                q5Var.setVisibility(z9 ? 0 : 8);
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
                f10 = xq.h.getInterpolation(org.telegram.messenger.g0.s(f10, i7 - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f10);
            childAt.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.L(24.0f));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.b;
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        this.a.layout(0, 0, i13, i14);
        r5 r5Var = this.c;
        r5Var.layout(i13 - r5Var.getMeasuredWidth(), (i14 - this.c.getMeasuredHeight()) / 2, i13, (this.c.getMeasuredHeight() + i14) / 2);
        int L = (i13 - org.telegram.messenger.g0.L(32.33f)) - this.c.getMeasuredWidth();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            if (((q5) arrayList.get(i16)).getVisibility() == 0) {
                i15++;
            }
        }
        int min = Math.min(org.telegram.messenger.g0.L(c() ? 20.0f : 30.0f), i15 < 2 ? 0 : org.telegram.messenger.camera.q.A(40.0f, i15, L) / (i15 - 1));
        int y10 = org.telegram.messenger.camera.q.y(40.0f, i14, 2);
        int L2 = (org.telegram.messenger.g0.L(40.0f) + i14) / 2;
        int L3 = org.telegram.messenger.g0.L(12.33f) + (!c() ? (org.telegram.messenger.camera.q.A(40.0f, i15, L) - ((i15 - 1) * min)) / 2 : 0);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (((q5) arrayList.get(i17)).getVisibility() == 0) {
                ((q5) arrayList.get(i17)).layout(L3, y10, org.telegram.messenger.g0.L(40.0f) + L3, L2);
                L3 = org.telegram.messenger.k5.C(40.0f, min, L3);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
    }

    public void setOnClickListener(c20 c20Var) {
        this.f = c20Var;
    }

    public void setShareEnabled(boolean z9) {
        if (this.h != z9) {
            this.h = z9;
            r5 r5Var = this.c;
            r5Var.s = z9;
            r5Var.invalidate();
        }
    }
}
