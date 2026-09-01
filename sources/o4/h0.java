package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.l8;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h0 {
    public int a;
    public long b;
    public Object c;

    public h0(int i10, URL url, long j10) {
        this.a = i10;
        this.c = url;
        this.b = j10;
    }

    public void a(wh.a aVar, sf.g gVar) {
        int i10;
        int b10 = l8.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z4 = j10 == this.b && this.a >= 0;
        this.b = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z4 || (i10 = this.a) == b10) {
            this.a = b10;
            gVar.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new xh.d(1, this, gVar));
        ofInt.setInterpolator(pr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
