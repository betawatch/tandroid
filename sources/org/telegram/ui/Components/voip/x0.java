package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.w9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x0 {
    public final l2.e a;
    public final l2.e b;
    public l2.e c;
    public l2.e d;
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
        l2.e eVar = new l2.e(80, 80);
        this.a = eVar;
        l2.e eVar2 = new l2.e(80, 80);
        this.b = eVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        eVar2.m(0.0f, 0.0f, 80.0f, 80.0f);
        eVar.m(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(hs.n1);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) eVar2.a).setAlpha(hs.K2);
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.g * 1.12f;
        float f13 = -f10;
        float f14 = -f11;
        this.b.o(f13 - ((f12 - this.f) / 2.0f), f14 - ((f12 - this.g) / 2.0f), f12 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.m(f13, f14, this.f - f10, this.g - f11);
    }

    public final void e(boolean z10) {
        if (!this.i || z10) {
            this.i = z10;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i3 = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.w0
                public final /* synthetic */ x0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
                        case 0:
                            x0 x0Var = this.b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            x0Var.l.setAlpha(i10);
                            x0Var.k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.j.setAlpha(i10);
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
            ofFloat.addListener(new w9(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i10 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.voip.w0
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
                            int i102 = (int) (35.0f * floatValue);
                            x0Var.l.setAlpha(i102);
                            x0Var.k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.j.setAlpha(i102);
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
