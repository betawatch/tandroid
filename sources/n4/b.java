package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class b extends ka.c {
    @Override // ka.c
    public final a G() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // ka.c
    public final ka.c k0(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // ka.c
    public final void p0(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
