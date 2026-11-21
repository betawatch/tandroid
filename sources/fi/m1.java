package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class m1 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.n6 c;
    public final k1 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public m1(Context context, int i7) {
        super(context);
        this.b = new RectF();
        nr nrVar = nr.f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false);
        this.c = n6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i7;
        n6Var.setCallback(this);
        n6Var.r(false, true);
        n6Var.w(org.telegram.messenger.g0.L(40.0f));
        n6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        n6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        n6Var.N = org.telegram.messenger.g0.q.x;
        n6Var.u(-1);
        n6Var.b = 17;
        this.d = new k1(this, 0);
    }

    public final void a(float f10, k1 k1Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f10);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 18));
        this.r.addListener(new di.j6(this, f10, k1Var, 1));
        this.r.setInterpolator(nr.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        org.telegram.messenger.g0.r(this.d);
        this.c.t("", true, true);
        invalidate();
        a(0.0f, new k1(this, 1));
    }

    public final void c(n1 n1Var) {
        this.b.set(n1Var.getX() - getX(), n1Var.getY() - getY(), (n1Var.getX() - getX()) + n1Var.getWidth(), (n1Var.getY() - getY()) + n1Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        RectF rectF;
        int i7;
        m1 m1Var = this;
        Canvas canvas2 = canvas;
        float f12 = 1.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, m1Var.n);
        float f13 = 90.0f;
        int L = (int) (org.telegram.messenger.g0.L(90.0f) * T1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = m1Var.e;
            int size = arrayList.size();
            f10 = 255.0f;
            f11 = 2.0f;
            rectF = m1Var.b;
            if (i10 >= size) {
                break;
            }
            oh0 oh0Var = (oh0) arrayList.get(i10);
            if (oh0Var.b0 >= oh0Var.e[0]) {
                arrayList.remove(i10);
                i10--;
            } else {
                float f14 = L / 2.0f;
                oh0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f14), (int) (rectF.centerY() - f14), (int) p5.c.e(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f14), (int) (rectF.centerY() + f14));
                oh0Var.setAlpha((int) (m1Var.n * 255.0f));
                oh0Var.draw(canvas2);
            }
            i10++;
        }
        float centerX = rectF.centerX();
        float L2 = rectF.top - org.telegram.messenger.g0.L(1.0f);
        canvas2.save();
        canvas2.translate(centerX, L2);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = m1Var.h;
            if (i11 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            l1 l1Var = (l1) arrayList2.get(i11);
            float f15 = l1Var.c;
            float f16 = l1Var.b;
            ImageReceiver imageReceiver = l1Var.f;
            float e10 = l1Var.i.e(z10, f12);
            float d = l1Var.j.d(l1Var.h);
            float f17 = f13;
            float L3 = org.telegram.messenger.g0.L(23.0f) + l1Var.g.c;
            float L4 = org.telegram.messenger.g0.L(18.0f);
            float f18 = f10;
            float f19 = f11;
            float f20 = f12;
            float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.T1(f12, 0.0f, d), Utilities.l(Math.min(org.telegram.messenger.g0.z1(e10, f12, 0.85f), org.telegram.messenger.g0.z1(e10, 0.0f, 0.12f))));
            Paint paint = l1Var.e;
            int i12 = (int) (T12 * f18);
            paint.setAlpha(i12);
            oh0 oh0Var2 = l1Var.d;
            if (oh0Var2 != null) {
                oh0Var2.setAlpha(i12);
            }
            imageReceiver.setAlpha(T12);
            canvas2.save();
            double d2 = e10;
            float sin = (float) Math.sin(Math.pow(d2, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f21 = (f16 * f19) - f20;
            canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
            float f22 = 1.5f * ((f15 * f19) - f20);
            canvas2.rotate(f22);
            int i13 = i11;
            canvas2.translate(0.0f, ((float) Math.pow(d2, 0.800000011920929d)) * (-org.telegram.messenger.g0.L(200.0f)));
            canvas2.translate(org.telegram.messenger.g0.L(5.0f) * sin * ((float) Math.pow(d2, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d2, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d2, 0.20000000298023224d)))) * (-6.0f));
            float T13 = org.telegram.messenger.g0.T1(0.4f, f20, T12);
            canvas2.scale(T13, T13);
            canvas2.translate((-L3) / f19, (-L4) / f19);
            float f23 = L4 / f19;
            canvas2.drawRoundRect(0.0f, 0.0f, L3, L4, f23, f23, paint);
            imageReceiver.h(canvas2, null);
            Canvas canvas3 = canvas2;
            l1Var.g.c(org.telegram.messenger.g0.L(18.0f), f23, T12, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (oh0Var2 != null) {
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
                canvas2.rotate(f22);
                canvas2.translate(0.0f, (-org.telegram.messenger.g0.L(200.0f)) * ((float) Math.pow(d2, 0.800000011920929d)));
                canvas2.translate(sin * org.telegram.messenger.g0.L(5.0f) * ((float) Math.pow(d2, 0.5d)), 0.0f);
                int L5 = org.telegram.messenger.g0.L(f17);
                int i14 = (-L5) / 2;
                int i15 = L5 / 2;
                oh0Var2.setBounds(i14, org.telegram.messenger.g0.L(8.0f) + i14, i15, org.telegram.messenger.g0.L(8.0f) + i15);
                oh0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (e10 >= 1.0f || d >= 1.0f) {
                ((l1) arrayList2.get(i13)).f.R();
                arrayList2.remove(i13);
                i7 = i13 - 1;
            } else {
                i7 = i13;
            }
            i11 = i7 + 1;
            m1Var = this;
            f13 = f17;
            f10 = f18;
            f11 = f19;
            f12 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
