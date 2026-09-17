package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
