package m5;

import android.animation.ValueAnimator;
import c8.ea;
import ch.w;
import java.net.URL;
import ki.e;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        int b10 = ea.b(aVar);
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
            eVar.c(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
        ofInt.addUpdateListener(new w(8, this, eVar));
        ofInt.setInterpolator(lr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
