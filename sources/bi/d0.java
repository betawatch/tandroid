package bi;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class d0 {
    public int a;
    public long b;
    public Object c;

    public d0(int i10, URL url, long j10) {
        this.a = i10;
        this.c = url;
        this.b = j10;
    }

    public void a(a aVar, a1.c cVar) {
        int i10;
        int b10 = v7.a5.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j10 == this.b && this.a >= 0;
        this.b = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i10 = this.a) == b10) {
            this.a = b10;
            cVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new ag.p2(4, this, cVar));
        ofInt.setInterpolator(gr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
