package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class l implements Iterable {
    public final j a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.a = new j(new of.b(27, this, kVar), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        this.a.r(obj != null ? Collections.singletonList(obj) : null, z10);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
