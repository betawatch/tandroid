package li;

import android.animation.ValueAnimator;
import bi.de;
import java.net.URL;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    public void a(a aVar, l2.y yVar) {
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
            yVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
        ofInt.addUpdateListener(new de(8, this, yVar));
        ofInt.setInterpolator(xq.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
