package oe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import m4.w1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l implements Iterable {
    public final j a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.a = new j(new w1(this, kVar, false, 7), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        this.a.q(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
