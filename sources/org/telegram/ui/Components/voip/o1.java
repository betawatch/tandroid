package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.p11;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o1 {
    public final bg.c2 a;
    public final bg.c2 b;
    public bg.c2 c;
    public bg.c2 d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public o1() {
        bg.c2 c2Var = new bg.c2(80, 80);
        this.a = c2Var;
        bg.c2 c2Var2 = new bg.c2(80, 80);
        this.b = c2Var2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        c2Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        c2Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) c2Var2.d).setAlpha(180);
    }

    public final void a(View view) {
        this.m.add(view);
    }

    public final Paint b() {
        return this.i ? this.k : (Paint) this.b.d;
    }

    public final void c() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f9, float f10) {
        float f11 = this.g * 1.12f;
        float f12 = -f9;
        float f13 = -f10;
        this.b.y(f12 - ((f11 - this.f) / 2.0f), f13 - ((f11 - this.g) / 2.0f), f11 / ((Bitmap) r1.b).getHeight(), this.h);
        this.d.w(f12, f13, this.f - f9, this.g - f10);
    }

    public final void e(boolean z10) {
        if (!this.i || z10) {
            this.i = z10;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i10 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.n1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            o1 o1Var = this.b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i11 = (int) (35.0f * floatValue);
                            o1Var.l.setAlpha(i11);
                            o1Var.k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.j.setAlpha(i11);
                            o1Var.c();
                            break;
                        default:
                            o1 o1Var2 = this.b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.b.d).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.a.d).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new p11(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i11 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.n1
                public final /* synthetic */ o1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            o1 o1Var = this.b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i112 = (int) (35.0f * floatValue);
                            o1Var.l.setAlpha(i112);
                            o1Var.k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.j.setAlpha(i112);
                            o1Var.c();
                            break;
                        default:
                            o1 o1Var2 = this.b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.b.d).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.a.d).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            break;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        }
        c();
    }
}
