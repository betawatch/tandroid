package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends mg.n {
    @Override // mg.n
    public final a d() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // mg.n
    public final mg.n x(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // mg.n
    public final void z(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
