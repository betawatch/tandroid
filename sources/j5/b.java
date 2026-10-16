package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.es;
import v7.u8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b {
    public long a;
    public int b;
    public Object c;

    public b(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(ji.a aVar, f1.a aVar2) {
        int i10;
        int b10 = u8.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i10 = this.b) == b10) {
            this.b = b10;
            aVar2.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new l0(7, this, aVar2));
        ofInt.setInterpolator(es.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
