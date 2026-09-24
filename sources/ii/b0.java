package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.rr;
import v7.p8;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        int b10 = p8.b(aVar);
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
        ofInt.setInterpolator(rr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
