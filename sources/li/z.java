package li;

import android.animation.ValueAnimator;
import bi.de;
import java.net.URL;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class z {
    public int a;
    public long b;
    public Object c;

    public z(int i7, URL url, long j3) {
        this.a = i7;
        this.c = url;
        this.b = j3;
    }

    public void a(a aVar, l2.x xVar) {
        int i7;
        int b10 = c8.l1.b(aVar);
        long j3 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z9 = j3 == this.b && this.a >= 0;
        this.b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z9 || (i7 = this.a) == b10) {
            this.a = b10;
            xVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
        ofInt.addUpdateListener(new de(8, this, xVar));
        ofInt.setInterpolator(xq.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
