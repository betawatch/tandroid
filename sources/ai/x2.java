package ai;

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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x2 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.q6 c;
    public final t2 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public x2(Context context, int i10) {
        super(context);
        this.b = new RectF();
        hs hsVar = hs.f;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.c = q6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i10;
        q6Var.setCallback(this);
        q6Var.r(false, true);
        q6Var.w(AndroidUtilities.dp(40.0f));
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.u(-1);
        q6Var.b = 17;
        this.d = new t2(this, 0);
    }

    public final void a(float f7, t2 t2Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f7);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new a(this, 7));
        this.r.addListener(new u2(this, f7, t2Var, 0));
        this.r.setInterpolator(hs.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.c.t("", true, true);
        invalidate();
        a(0.0f, new t2(this, 1));
    }

    public final void c(y2 y2Var) {
        this.b.set(y2Var.getX() - getX(), y2Var.getY() - getY(), (y2Var.getX() - getX()) + y2Var.getWidth(), (y2Var.getY() - getY()) + y2Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        int i10;
        x2 x2Var = this;
        Canvas canvas2 = canvas;
        float f11 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, x2Var.n);
        float f12 = 90.0f;
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = x2Var.e;
            int size = arrayList.size();
            f7 = 255.0f;
            f10 = 2.0f;
            rectF = x2Var.b;
            if (i11 >= size) {
                break;
            }
            ck0 ck0Var = (ck0) arrayList.get(i11);
            if (ck0Var.a0 >= ck0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f13 = dp / 2.0f;
                ck0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f13), (int) (rectF.centerY() - f13), (int) sc.v.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f13), (int) (rectF.centerY() + f13));
                ck0Var.setAlpha((int) (x2Var.n * 255.0f));
                ck0Var.draw(canvas2);
            }
            i11++;
        }
        float centerX = rectF.centerX();
        float dp2 = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(centerX, dp2);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = x2Var.h;
            if (i12 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            w2 w2Var = (w2) arrayList2.get(i12);
            float f14 = w2Var.c;
            float f15 = w2Var.b;
            ImageReceiver imageReceiver = w2Var.f;
            float d = w2Var.i.d(f11, z10);
            float e7 = w2Var.j.e(w2Var.h);
            float f16 = f12;
            float dp3 = AndroidUtilities.dp(23.0f) + w2Var.g.c;
            float dp4 = AndroidUtilities.dp(18.0f);
            float f17 = f7;
            float f18 = f10;
            float f19 = f11;
            float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f11, 0.0f, e7), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f11, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
            Paint paint = w2Var.e;
            int i13 = (int) (lerp2 * f17);
            paint.setAlpha(i13);
            ck0 ck0Var2 = w2Var.d;
            if (ck0Var2 != null) {
                ck0Var2.setAlpha(i13);
            }
            imageReceiver.setAlpha(lerp2);
            canvas2.save();
            double d10 = d;
            float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f20 = (f15 * f18) - f19;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f20, 0.0f);
            float f21 = 1.5f * ((f14 * f18) - f19);
            canvas2.rotate(f21);
            int i14 = i12;
            canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
            float lerp3 = AndroidUtilities.lerp(0.4f, f19, lerp2);
            canvas2.scale(lerp3, lerp3);
            canvas2.translate((-dp3) / f18, (-dp4) / f18);
            float f22 = dp4 / f18;
            canvas2.drawRoundRect(0.0f, 0.0f, dp3, dp4, f22, f22, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            w2Var.g.c(AndroidUtilities.dp(18.0f), f22, lerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (ck0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f20, 0.0f);
                canvas2.rotate(f21);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                int dp5 = AndroidUtilities.dp(f16);
                int i15 = (-dp5) / 2;
                int i16 = dp5 / 2;
                ck0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                ck0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (d >= 1.0f || e7 >= 1.0f) {
                ((w2) arrayList2.get(i14)).f.onDetachedFromWindow();
                arrayList2.remove(i14);
                i10 = i14 - 1;
            } else {
                i10 = i14;
            }
            i12 = i10 + 1;
            x2Var = this;
            f12 = f16;
            f7 = f17;
            f10 = f18;
            f11 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
