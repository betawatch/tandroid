package bi;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k2 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.p6 c;
    public final g2 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public k2(Context context, int i10) {
        super(context);
        this.b = new RectF();
        pr prVar = pr.f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
        this.c = p6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i10;
        p6Var.setCallback(this);
        p6Var.o(false, true, false);
        p6Var.t(AndroidUtilities.dp(40.0f));
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.r(-1);
        p6Var.b = 17;
        this.d = new g2(this, 0);
    }

    public final void a(float f7, g2 g2Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f7);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 8));
        this.r.addListener(new h2(this, f7, g2Var, 0));
        this.r.setInterpolator(pr.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.c.q("", true, true);
        invalidate();
        a(0.0f, new g2(this, 1));
    }

    public final void c(l2 l2Var) {
        this.b.set(l2Var.getX() - getX(), l2Var.getY() - getY(), (l2Var.getX() - getX()) + l2Var.getWidth(), (l2Var.getY() - getY()) + l2Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        k2 k2Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, k2Var.n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = k2Var.e;
            int size = arrayList.size();
            rectF = k2Var.b;
            if (i11 >= size) {
                break;
            }
            xi0 xi0Var = (xi0) arrayList.get(i11);
            if (xi0Var.b0 >= xi0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                xi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.p6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                xi0Var.setAlpha((int) (k2Var.n * 255.0f));
                xi0Var.draw(canvas2);
            }
            i11++;
        }
        float centerX = rectF.centerX();
        float dp2 = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(centerX, dp2);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = k2Var.h;
            if (i12 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            j2 j2Var = (j2) arrayList2.get(i12);
            float f11 = j2Var.c;
            float f12 = j2Var.b;
            ImageReceiver imageReceiver = j2Var.f;
            float d = j2Var.i.d(f7, z10);
            float e7 = j2Var.j.e(j2Var.h);
            float dp3 = AndroidUtilities.dp(23.0f) + j2Var.g.c;
            float dp4 = AndroidUtilities.dp(18.0f);
            float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e7), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
            Paint paint = j2Var.e;
            int i13 = (int) (lerp2 * 255.0f);
            paint.setAlpha(i13);
            xi0 xi0Var2 = j2Var.d;
            if (xi0Var2 != null) {
                xi0Var2.setAlpha(i13);
            }
            imageReceiver.setAlpha(lerp2);
            canvas2.save();
            double d10 = d;
            float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f13 = (f12 * 2.0f) - 1.0f;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
            float f14 = 1.5f * ((f11 * 2.0f) - 1.0f);
            canvas2.rotate(f14);
            int i14 = i12;
            canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
            float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
            canvas2.scale(lerp3, lerp3);
            canvas2.translate((-dp3) / 2.0f, (-dp4) / 2.0f);
            float f15 = dp4 / 2.0f;
            canvas2.drawRoundRect(0.0f, 0.0f, dp3, dp4, f15, f15, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            j2Var.g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (xi0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                canvas2.rotate(f14);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                int dp5 = AndroidUtilities.dp(90.0f);
                int i15 = (-dp5) / 2;
                int i16 = dp5 / 2;
                xi0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                xi0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (d >= 1.0f || e7 >= 1.0f) {
                ((j2) arrayList2.get(i14)).f.onDetachedFromWindow();
                arrayList2.remove(i14);
                i10 = i14 - 1;
            } else {
                i10 = i14;
            }
            i12 = i10 + 1;
            k2Var = this;
            f7 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
