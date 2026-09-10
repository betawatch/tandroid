package hi;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.wr;
import v7.f8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class c0 {
    public int a;
    public long b;
    public Object c;

    public c0(int i10, URL url, long j3) {
        this.a = i10;
        this.c = url;
        this.b = j3;
    }

    public void a(a aVar, a1.c cVar) {
        int i10;
        int b10 = f8.b(aVar);
        long j3 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j3 == this.b && this.a >= 0;
        this.b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i10 = this.a) == b10) {
            this.a = b10;
            cVar.g(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new gg.t1(4, this, cVar));
        ofInt.setInterpolator(wr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
