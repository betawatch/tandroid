package ne;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import mi.q;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l implements Iterable {
    public final j a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.a = new j(new q(this, kVar, false, 5), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        this.a.q(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
