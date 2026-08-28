package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s1 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.i6 c;
    public final q1 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public s1(Context context, int i9) {
        super(context);
        this.b = new RectF();
        gr grVar = gr.f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.c = i6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i9;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.b = 17;
        this.d = new q1(this, 0);
    }

    public final void a(float f10, q1 q1Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f10);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 17));
        this.r.addListener(new gh.o5(this, f10, q1Var, 1));
        this.r.setInterpolator(gr.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.c.q("", true, true);
        invalidate();
        a(0.0f, new q1(this, 1));
    }

    public final void c(t1 t1Var) {
        this.b.set(t1Var.getX() - getX(), t1Var.getY() - getY(), (t1Var.getX() - getX()) + t1Var.getWidth(), (t1Var.getY() - getY()) + t1Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i9;
        s1 s1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, s1Var.n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = s1Var.e;
            int size = arrayList.size();
            rectF = s1Var.b;
            if (i10 >= size) {
                break;
            }
            mi0 mi0Var = (mi0) arrayList.get(i10);
            if (mi0Var.X >= mi0Var.e[0]) {
                arrayList.remove(i10);
                i10--;
            } else {
                float f11 = dp / 2.0f;
                mi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) aa.d.w(AndroidUtilities.dp(15.0f), lerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                mi0Var.setAlpha((int) (s1Var.n * 255.0f));
                mi0Var.draw(canvas2);
            }
            i10++;
        }
        float centerX = rectF.centerX();
        float dp2 = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(centerX, dp2);
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = s1Var.h;
            if (i11 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            r1 r1Var = (r1) arrayList2.get(i11);
            float f12 = r1Var.c;
            float f13 = r1Var.b;
            ImageReceiver imageReceiver = r1Var.f;
            float d = r1Var.i.d(f10, z10);
            float e10 = r1Var.j.e(r1Var.h);
            float dp3 = AndroidUtilities.dp(23.0f) + r1Var.g.c;
            float dp4 = AndroidUtilities.dp(18.0f);
            float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, e10), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f10, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
            Paint paint = r1Var.e;
            int i12 = (int) (lerp2 * 255.0f);
            paint.setAlpha(i12);
            mi0 mi0Var2 = r1Var.d;
            if (mi0Var2 != null) {
                mi0Var2.setAlpha(i12);
            }
            imageReceiver.setAlpha(lerp2);
            canvas2.save();
            double d9 = d;
            float sin = (float) Math.sin(Math.pow(d9, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f14 = (f13 * 2.0f) - 1.0f;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
            float f15 = 1.5f * ((f12 * 2.0f) - 1.0f);
            canvas2.rotate(f15);
            int i13 = i11;
            canvas2.translate(0.0f, ((float) Math.pow(d9, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d9, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d9, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d9, 0.20000000298023224d)))) * (-6.0f));
            float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
            canvas2.scale(lerp3, lerp3);
            canvas2.translate((-dp3) / 2.0f, (-dp4) / 2.0f);
            float f16 = dp4 / 2.0f;
            canvas2.drawRoundRect(0.0f, 0.0f, dp3, dp4, f16, f16, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            r1Var.g.c(AndroidUtilities.dp(18.0f), f16, lerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (mi0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                canvas2.rotate(f15);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d9, 0.800000011920929d)));
                canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d9, 0.5d)), 0.0f);
                int dp5 = AndroidUtilities.dp(90.0f);
                int i14 = (-dp5) / 2;
                int i15 = dp5 / 2;
                mi0Var2.setBounds(i14, AndroidUtilities.dp(8.0f) + i14, i15, AndroidUtilities.dp(8.0f) + i15);
                mi0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (d >= 1.0f || e10 >= 1.0f) {
                ((r1) arrayList2.get(i13)).f.onDetachedFromWindow();
                arrayList2.remove(i13);
                i9 = i13 - 1;
            } else {
                i9 = i13;
            }
            i11 = i9 + 1;
            s1Var = this;
            f10 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
