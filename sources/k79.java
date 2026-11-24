// default package

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
