package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
