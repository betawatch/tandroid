package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.i8;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h0 {
    public long a;
    public int b;
    public Object c;

    public h0(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(vh.a aVar, rh.e eVar) {
        int i10;
        int b10 = i8.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z4 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z4 || (i10 = this.b) == b10) {
            this.b = b10;
            eVar.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new wh.d(1, this, eVar));
        ofInt.setInterpolator(nr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
