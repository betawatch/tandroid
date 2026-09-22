package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.qr;
import v7.o8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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

    public void a(a aVar, ei.d5 d5Var) {
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
            d5Var.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new ai.x(6, this, d5Var));
        ofInt.setInterpolator(qr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
