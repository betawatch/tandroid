// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lfc {
    public final ep a;
    public final ep b;
    public ep c;
    public ep d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public lfc() {
        ep epVar = new ep(80, 80);
        this.a = epVar;
        ep epVar2 = new ep(80, 80);
        this.b = epVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        epVar2.i(0.0f, 0.0f, 80.0f, 80.0f);
        epVar.i(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(kk7.m1);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) epVar2.a).setAlpha(kk7.J2);
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f, float f2) {
        float f3 = this.g * 1.12f;
        float f4 = -f;
        float f5 = -f2;
        this.b.k(f4 - ((f3 - this.f) / 2.0f), f5 - ((f3 - this.g) / 2.0f), f3 / ((Bitmap) r1.c).getHeight(), this.h);
        this.d.i(f4, f5, this.f - f, this.g - f2);
    }

    public final void e(boolean z) {
        if (!this.i || z) {
            this.i = z;
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final byte b = 0;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kfc
                public final /* synthetic */ lfc b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b2 = b;
                    lfc lfcVar = this.b;
                    lfcVar.getClass();
                    switch (b2) {
                        case 0:
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i = (int) (35.0f * floatValue);
                            lfcVar.l.setAlpha(i);
                            lfcVar.k.setAlpha((int) (floatValue * 102.0f));
                            lfcVar.j.setAlpha(i);
                            lfcVar.c();
                            break;
                        default:
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) lfcVar.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) lfcVar.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            lfcVar.c();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new iab(this, (byte) 18));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final byte b2 = 1;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kfc
                public final /* synthetic */ lfc b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b22 = b2;
                    lfc lfcVar = this.b;
                    lfcVar.getClass();
                    switch (b22) {
                        case 0:
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i = (int) (35.0f * floatValue);
                            lfcVar.l.setAlpha(i);
                            lfcVar.k.setAlpha((int) (floatValue * 102.0f));
                            lfcVar.j.setAlpha(i);
                            lfcVar.c();
                            break;
                        default:
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) lfcVar.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) lfcVar.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            lfcVar.c();
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
