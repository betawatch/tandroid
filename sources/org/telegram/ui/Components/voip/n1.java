package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.f91;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n1 {
    public final a9.a a;
    public final a9.a b;
    public a9.a c;
    public a9.a d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public n1() {
        a9.a aVar = new a9.a(80, 80);
        this.a = aVar;
        a9.a aVar2 = new a9.a(80, 80);
        this.b = aVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        aVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        aVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) aVar2.a).setAlpha(180);
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

    public final void d(float f10, float f11) {
        float f12 = this.g * 1.12f;
        float f13 = -f10;
        float f14 = -f11;
        this.b.z(f13 - ((f12 - this.f) / 2.0f), f14 - ((f12 - this.g) / 2.0f), f12 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.w(f13, f14, this.f - f10, this.g - f11);
    }

    public final void e(boolean z4) {
        if (!this.i || z4) {
            this.i = z4;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i10 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.m1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            n1 n1Var = this.b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i11 = (int) (35.0f * floatValue);
                            n1Var.l.setAlpha(i11);
                            n1Var.k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.j.setAlpha(i11);
                            n1Var.c();
                            break;
                        default:
                            n1 n1Var2 = this.b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new f91(this, 5));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i11 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.m1
                public final /* synthetic */ n1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            n1 n1Var = this.b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i112 = (int) (35.0f * floatValue);
                            n1Var.l.setAlpha(i112);
                            n1Var.k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.j.setAlpha(i112);
                            n1Var.c();
                            break;
                        default:
                            n1 n1Var2 = this.b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
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
