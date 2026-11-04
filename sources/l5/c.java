package l5;

import android.animation.ValueAnimator;
import b8.ne;
import ci.uc;
import java.net.URL;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public long a;
    public int b;
    public Object c;

    public c(int i3, URL url, long j10) {
        this.b = i3;
        this.c = url;
        this.a = j10;
    }

    public void a(mi.a aVar, b bVar) {
        int i3;
        int b10 = ne.b(aVar);
        long j10 = aVar != null ? aVar.a : Long.MIN_VALUE;
        boolean z10 = j10 == this.a && this.b >= 0;
        this.a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
        if (!z10 || (i3 = this.b) == b10) {
            this.b = b10;
            bVar.e(b10);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, b10);
        ofInt.addUpdateListener(new uc(8, this, bVar));
        ofInt.setInterpolator(xq.f);
        ofInt.setDuration(200L);
        this.c = ofInt;
        ofInt.start();
    }
}
