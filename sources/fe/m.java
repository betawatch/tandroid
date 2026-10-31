package fe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m implements Iterable {
    public final k a;

    public m(l lVar, Interpolator interpolator, long j10) {
        this.a = new k(new hf.b(this, lVar, false, 18), interpolator, j10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }

    public final void l(Object obj, boolean z10) {
        this.a.q(obj != null ? Collections.singletonList(obj) : null, z10);
    }
}
