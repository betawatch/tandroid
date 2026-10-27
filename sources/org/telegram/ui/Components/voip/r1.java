package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.i31;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r1 {
    public final aa.m0 a;
    public final aa.m0 b;
    public aa.m0 c;
    public aa.m0 d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public r1() {
        aa.m0 m0Var = new aa.m0(80, 80);
        this.a = m0Var;
        aa.m0 m0Var2 = new aa.m0(80, 80);
        this.b = m0Var2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        m0Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        m0Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) m0Var2.a).setAlpha(180);
    }

    public final void a(View view) {
        this.m.add(view);
    }

    public final Paint b() {
        return this.i ? this.k : (Paint) this.b.a;
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

    public final void d(float f7, float f10) {
        float f11 = this.g * 1.12f;
        float f12 = -f7;
        float f13 = -f10;
        this.b.y(f12 - ((f11 - this.f) / 2.0f), f13 - ((f11 - this.g) / 2.0f), f11 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.w(f12, f13, this.f - f7, this.g - f10);
    }

    public final void e(boolean z10) {
        if (!this.i || z10) {
            this.i = z10;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i10 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.q1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            r1 r1Var = this.b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i11 = (int) (35.0f * floatValue);
                            r1Var.l.setAlpha(i11);
                            r1Var.k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.j.setAlpha(i11);
                            r1Var.c();
                            break;
                        default:
                            r1 r1Var2 = this.b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new i31(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i11 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.q1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            r1 r1Var = this.b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i112 = (int) (35.0f * floatValue);
                            r1Var.l.setAlpha(i112);
                            r1Var.k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.j.setAlpha(i112);
                            r1Var.c();
                            break;
                        default:
                            r1 r1Var2 = this.b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
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
