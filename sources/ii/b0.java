package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.tr;
import v7.o8;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class b0 {
    public int a;
    public long b;
    public Object c;

    public b0(int i10, URL url, long j3) {
        this.a = i10;
        this.c = url;
        this.b = j3;
    }

    public void a(a aVar, ei.f fVar) {
        int i10;
        int b10 = o8.b(aVar);
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
            fVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new ai.x(6, this, fVar));
        ofInt.setInterpolator(tr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
