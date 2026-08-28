package j4;

import android.animation.ValueAnimator;
import g7.v6;
import java.net.URL;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x0 {
    public long a;
    public int b;
    public Object c;

    public x0(int i9, URL url, long j10) {
        this.b = i9;
        this.c = url;
        this.a = j10;
    }

    public void a(qh.a aVar, kh.p pVar) {
        int i9;
        int b10 = v6.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i9 = this.b) == b10) {
            this.b = b10;
            pVar.h(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i9, b10);
        ofInt.addUpdateListener(new f2.g(26, this, pVar));
        ofInt.setInterpolator(gr.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
