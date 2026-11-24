// default package

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m99 implements Iterable {
    public final x66 a;

    public m99(l99 l99Var, Interpolator interpolator, long j) {
        this.a = new x66(new wm4(this, l99Var, false, (byte) 23), interpolator, j);
    }

    public final void h(Object obj, boolean z) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
