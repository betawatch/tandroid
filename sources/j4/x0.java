package j4;

import ag.t2;
import android.animation.ValueAnimator;
import h7.z6;
import java.net.URL;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x0 {
    public long a;
    public int b;
    public Object c;

    public x0(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(rh.a aVar, lh.p pVar) {
        int i10;
        int b10 = z6.b(aVar);
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
            pVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new t2(27, this, pVar));
        ofInt.setInterpolator(er.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
