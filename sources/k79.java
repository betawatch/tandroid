// default package

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k79 implements Iterable {
    public final x46 a;

    public k79(j79 j79Var, Interpolator interpolator, long j) {
        this.a = new x46(new wk4(this, j79Var, false, (byte) 23), interpolator, j);
    }

    public final void h(Object obj, boolean z) {
        this.a.m(obj != null ? Collections.singletonList(obj) : null, z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
