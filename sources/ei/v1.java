package ei;

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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v1 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.g6 c;
    public final t1 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public v1(Context context, int i3) {
        super(context);
        this.b = new RectF();
        xq xqVar = xq.f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.c = g6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i3;
        g6Var.setCallback(this);
        g6Var.r(false, true);
        g6Var.w(org.telegram.messenger.g0.L(40.0f));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.u(-1);
        g6Var.b = 17;
        this.d = new t1(this, 0);
    }

    public final void a(float f10, t1 t1Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f10);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 18));
        this.r.addListener(new ci.p6(this, f10, t1Var, 1));
        this.r.setInterpolator(xq.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        org.telegram.messenger.g0.r(this.d);
        this.c.t("", true, true);
        invalidate();
        a(0.0f, new t1(this, 1));
    }

    public final void c(w1 w1Var) {
        this.b.set(w1Var.getX() - getX(), w1Var.getY() - getY(), (w1Var.getX() - getX()) + w1Var.getWidth(), (w1Var.getY() - getY()) + w1Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        RectF rectF;
        int i3;
        v1 v1Var = this;
        Canvas canvas2 = canvas;
        float f12 = 1.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, v1Var.n);
        float f13 = 90.0f;
        int L = (int) (org.telegram.messenger.g0.L(90.0f) * T1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = v1Var.e;
            int size = arrayList.size();
            f10 = 255.0f;
            f11 = 2.0f;
            rectF = v1Var.b;
            if (i10 >= size) {
                break;
            }
            ch0 ch0Var = (ch0) arrayList.get(i10);
            if (ch0Var.b0 >= ch0Var.e[0]) {
                arrayList.remove(i10);
                i10--;
            } else {
                float f14 = L / 2.0f;
                ch0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f14), (int) (rectF.centerY() - f14), (int) t4.c.c(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f14), (int) (rectF.centerY() + f14));
                ch0Var.setAlpha((int) (v1Var.n * 255.0f));
                ch0Var.draw(canvas2);
            }
            i10++;
        }
        float centerX = rectF.centerX();
        float L2 = rectF.top - org.telegram.messenger.g0.L(1.0f);
        canvas2.save();
        canvas2.translate(centerX, L2);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = v1Var.h;
            if (i11 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            u1 u1Var = (u1) arrayList2.get(i11);
            float f15 = u1Var.c;
            float f16 = u1Var.b;
            ImageReceiver imageReceiver = u1Var.f;
            float e10 = u1Var.i.e(z10, f12);
            float d = u1Var.j.d(u1Var.h);
            float f17 = f13;
            float L3 = org.telegram.messenger.g0.L(23.0f) + u1Var.g.c;
            float L4 = org.telegram.messenger.g0.L(18.0f);
            float f18 = f10;
            float f19 = f11;
            float f20 = f12;
            float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.T1(f12, 0.0f, d), Utilities.l(Math.min(org.telegram.messenger.g0.z1(e10, f12, 0.85f), org.telegram.messenger.g0.z1(e10, 0.0f, 0.12f))));
            Paint paint = u1Var.e;
            int i12 = (int) (T12 * f18);
            paint.setAlpha(i12);
            ch0 ch0Var2 = u1Var.d;
            if (ch0Var2 != null) {
                ch0Var2.setAlpha(i12);
            }
            imageReceiver.setAlpha(T12);
            canvas2.save();
            double d10 = e10;
            float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f21 = (f16 * f19) - f20;
            canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
            float f22 = 1.5f * ((f15 * f19) - f20);
            canvas2.rotate(f22);
            int i13 = i11;
            canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-org.telegram.messenger.g0.L(200.0f)));
            canvas2.translate(org.telegram.messenger.g0.L(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
            float T13 = org.telegram.messenger.g0.T1(0.4f, f20, T12);
            canvas2.scale(T13, T13);
            canvas2.translate((-L3) / f19, (-L4) / f19);
            float f23 = L4 / f19;
            canvas2.drawRoundRect(0.0f, 0.0f, L3, L4, f23, f23, paint);
            imageReceiver.h(canvas2, null);
            Canvas canvas3 = canvas2;
            u1Var.g.c(org.telegram.messenger.g0.L(18.0f), f23, T12, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (ch0Var2 != null) {
                canvas2.save();
                canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
                canvas2.rotate(f22);
                canvas2.translate(0.0f, (-org.telegram.messenger.g0.L(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                canvas2.translate(sin * org.telegram.messenger.g0.L(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                int L5 = org.telegram.messenger.g0.L(f17);
                int i14 = (-L5) / 2;
                int i15 = L5 / 2;
                ch0Var2.setBounds(i14, org.telegram.messenger.g0.L(8.0f) + i14, i15, org.telegram.messenger.g0.L(8.0f) + i15);
                ch0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (e10 >= 1.0f || d >= 1.0f) {
                ((u1) arrayList2.get(i13)).f.R();
                arrayList2.remove(i13);
                i3 = i13 - 1;
            } else {
                i3 = i13;
            }
            i11 = i3 + 1;
            v1Var = this;
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
