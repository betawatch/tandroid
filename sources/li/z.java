package li;

import android.animation.ValueAnimator;
import bi.de;
import java.net.URL;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        ofInt.setInterpolator(wq.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
