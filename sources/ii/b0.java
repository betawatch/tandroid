package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.hs;
import v7.n8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public void a(a aVar, ei.c5 c5Var) {
        int i10;
        int b10 = n8.b(aVar);
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
            c5Var.e(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new ai.x(6, this, c5Var));
        ofInt.setInterpolator(hs.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
