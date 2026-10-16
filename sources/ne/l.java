package ne;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import m2.t;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class l implements Iterable {
    public final j a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.a = new j(new t(this, kVar, false, 7), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        this.a.q(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
