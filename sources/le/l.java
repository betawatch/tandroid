package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import n4.y;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l implements Iterable {
    public final j a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.a = new j(new y(this, kVar, false, 23), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
