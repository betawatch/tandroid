package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q1 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.i6 c;
    public final o1 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public q1(Context context, int i10) {
        super(context);
        this.b = new RectF();
        er erVar = er.f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.c = i6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i10;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.b = 17;
        this.d = new o1(this, 0);
    }

    public final void a(float f10, o1 o1Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f10);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new ag.u(this, 20));
        this.r.addListener(new hh.n5(this, f10, o1Var, 1));
        this.r.setInterpolator(er.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.c.q("", true, true);
        invalidate();
        a(0.0f, new o1(this, 1));
    }

    public final void c(r1 r1Var) {
        this.b.set(r1Var.getX() - getX(), r1Var.getY() - getY(), (r1Var.getX() - getX()) + r1Var.getWidth(), (r1Var.getY() - getY()) + r1Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        q1 q1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, q1Var.n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = q1Var.e;
            int size = arrayList.size();
            rectF = q1Var.b;
            if (i11 >= size) {
                break;
            }
            oi0 oi0Var = (oi0) arrayList.get(i11);
            if (oi0Var.X >= oi0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f11 = dp / 2.0f;
                oi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                oi0Var.setAlpha((int) (q1Var.n * 255.0f));
                oi0Var.draw(canvas2);
            }
            i11++;
        }
        float centerX = rectF.centerX();
        float dp2 = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(centerX, dp2);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = q1Var.h;
            if (i12 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            p1 p1Var = (p1) arrayList2.get(i12);
            float f12 = p1Var.c;
            float f13 = p1Var.b;
            ImageReceiver imageReceiver = p1Var.f;
            float d = p1Var.i.d(f10, z10);
            float e9 = p1Var.j.e(p1Var.h);
            float dp3 = AndroidUtilities.dp(23.0f) + p1Var.g.c;
            float dp4 = AndroidUtilities.dp(18.0f);
            float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, e9), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f10, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
            Paint paint = p1Var.e;
            int i13 = (int) (lerp2 * 255.0f);
            paint.setAlpha(i13);
            oi0 oi0Var2 = p1Var.d;
            if (oi0Var2 != null) {
                oi0Var2.setAlpha(i13);
            }
            imageReceiver.setAlpha(lerp2);
            canvas2.save();
            double d10 = d;
            float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f14 = (f13 * 2.0f) - 1.0f;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
            float f15 = 1.5f * ((f12 * 2.0f) - 1.0f);
            canvas2.rotate(f15);
            int i14 = i12;
            canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
            float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
            canvas2.scale(lerp3, lerp3);
            canvas2.translate((-dp3) / 2.0f, (-dp4) / 2.0f);
            float f16 = dp4 / 2.0f;
            canvas2.drawRoundRect(0.0f, 0.0f, dp3, dp4, f16, f16, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            p1Var.g.c(AndroidUtilities.dp(18.0f), f16, lerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (oi0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                canvas2.rotate(f15);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                int dp5 = AndroidUtilities.dp(90.0f);
                int i15 = (-dp5) / 2;
                int i16 = dp5 / 2;
                oi0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                oi0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (d >= 1.0f || e9 >= 1.0f) {
                ((p1) arrayList2.get(i14)).f.onDetachedFromWindow();
                arrayList2.remove(i14);
                i10 = i14 - 1;
            } else {
                i10 = i14;
            }
            i12 = i10 + 1;
            q1Var = this;
            f10 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
