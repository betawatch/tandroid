package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.y9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l1 {
    public final b8 a;
    public final b8 b;
    public b8 c;
    public b8 d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public l1() {
        b8 b8Var = new b8(80, 80);
        this.a = b8Var;
        b8 b8Var2 = new b8(80, 80);
        this.b = b8Var2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(ks.n1);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) b8Var2.a).setAlpha(ks.K2);
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.g * 1.12f;
        float f13 = -f10;
        float f14 = -f11;
        this.b.m(f13 - ((f12 - this.f) / 2.0f), f14 - ((f12 - this.g) / 2.0f), f12 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.k(f13, f14, this.f - f10, this.g - f11);
    }

    public final void e(boolean z10) {
        if (!this.i || z10) {
            this.i = z10;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i7 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.k1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i7) {
                        case 0:
                            l1 l1Var = this.b;
                            l1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            l1Var.l.setAlpha(i10);
                            l1Var.k.setAlpha((int) (floatValue * 102.0f));
                            l1Var.j.setAlpha(i10);
                            l1Var.c();
                            break;
                        default:
                            l1 l1Var2 = this.b;
                            l1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) l1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) l1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            l1Var2.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new y9(this, 15));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i10 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.k1
                public final /* synthetic */ l1 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            l1 l1Var = this.b;
                            l1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i102 = (int) (35.0f * floatValue);
                            l1Var.l.setAlpha(i102);
                            l1Var.k.setAlpha((int) (floatValue * 102.0f));
                            l1Var.j.setAlpha(i102);
                            l1Var.c();
                            break;
                        default:
                            l1 l1Var2 = this.b;
                            l1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) l1Var2.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) l1Var2.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            l1Var2.c();
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
