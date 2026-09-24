package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import n4.y;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class m implements Iterable {
    public final k a;

    public m(l lVar, Interpolator interpolator, long j3) {
        this.a = new k(new y(this, lVar, false, 23), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
