package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.bs;
import w7.i;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c {
    public long a;
    public int b;
    public Object c;

    public c(int i10, URL url, long j10) {
        this.b = i10;
        this.c = url;
        this.a = j10;
    }

    public void a(ki.a aVar, b bVar) {
        int i10;
        int b10 = i.b(aVar);
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
            bVar.j(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
        ofInt.addUpdateListener(new l0(8, this, bVar));
        ofInt.setInterpolator(bs.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
