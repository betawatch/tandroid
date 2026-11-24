// default package

import android.animation.ValueAnimator;
import java.net.URL;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class jd1 {
    public int a;
    public long b;
    public Object c;

    public jd1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    public final void a(lk0 lk0Var, k88 k88Var) {
        int i;
        int b = rse.b(lk0Var);
        long j = lk0Var != null ? lk0Var.a : Long.MIN_VALUE;
        boolean z = j == this.b && this.a >= 0;
        this.b = j;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z || (i = this.a) == b) {
            this.a = b;
            k88Var.c(b);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, b);
        ofInt.addUpdateListener(new pk(this, k88Var, (byte) 25));
        ofInt.setInterpolator(s33.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }

    public final synchronized long b(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return 86400000L;
        }
        return (long) Math.min(Math.pow(2.0d, this.a) + ((long) (Math.random() * 1000.0d)), 1800000.0d);
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.a != 0) {
            ((t8c) this.c).a.getClass();
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public final synchronized void d() {
        this.a = 0;
    }

    public final synchronized void e(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            d();
            return;
        }
        this.a++;
        long b = b(i);
        ((t8c) this.c).a.getClass();
        this.b = System.currentTimeMillis() + b;
    }
}
