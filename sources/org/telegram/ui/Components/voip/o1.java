package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o1 {
    public final com.google.firebase.messaging.m a;
    public final com.google.firebase.messaging.m b;
    public com.google.firebase.messaging.m c;
    public com.google.firebase.messaging.m d;
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
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(80, 80);
        this.a = mVar;
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m(80, 80);
        this.b = mVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) mVar2.a).setAlpha(180);
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
        this.b.B(f12 - ((f11 - this.f) / 2.0f), f13 - ((f11 - this.g) / 2.0f), f11 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.z(f12, f13, this.f - f7, this.g - f10);
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
                            ((Paint) o1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new v61(this, 10));
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
                            ((Paint) o1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
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
