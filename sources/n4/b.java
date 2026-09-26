package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
