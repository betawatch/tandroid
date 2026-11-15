package m5;

import android.animation.ValueAnimator;
import c8.ca;
import ch.v;
import java.net.URL;
import ki.e;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b {
    public long a;
    public int b;
    public Object c;

    public b(int i7, URL url, long j3) {
        this.b = i7;
        this.c = url;
        this.a = j3;
    }

    public void a(oi.a aVar, e eVar) {
        int i7;
        int b10 = ca.b(aVar);
        long j3 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j3 == this.a && this.b >= 0;
        this.a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i7 = this.b) == b10) {
            this.b = b10;
            eVar.d(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
        ofInt.addUpdateListener(new v(8, this, eVar));
        ofInt.setInterpolator(er.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
