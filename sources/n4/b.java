package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
