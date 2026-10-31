package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.zs;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 {
    public final j2.f a;
    public final j2.f b;
    public j2.f c;
    public j2.f d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public x0() {
        j2.f fVar = new j2.f(80, 80);
        this.a = fVar;
        j2.f fVar2 = new j2.f(80, 80);
        this.b = fVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(zs.n1);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) fVar2.a).setAlpha(zs.K2);
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
        this.b.z(f12 - ((f11 - this.f) / 2.0f), f13 - ((f11 - this.g) / 2.0f), f11 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.x(f12, f13, this.f - f7, this.g - f10);
    }

    public final void e(boolean z10) {
        if (!this.i || z10) {
            this.i = z10;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i10 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.w0
                public final /* synthetic */ x0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            x0 x0Var = this.b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i11 = (int) (35.0f * floatValue);
                            x0Var.l.setAlpha(i11);
                            x0Var.k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.j.setAlpha(i11);
                            x0Var.c();
                            break;
                        default:
                            x0 x0Var2 = this.b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new s9(this, 25));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i11 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.w0
                public final /* synthetic */ x0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            x0 x0Var = this.b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i112 = (int) (35.0f * floatValue);
                            x0Var.l.setAlpha(i112);
                            x0Var.k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.j.setAlpha(i112);
                            x0Var.c();
                            break;
                        default:
                            x0 x0Var2 = this.b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
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
