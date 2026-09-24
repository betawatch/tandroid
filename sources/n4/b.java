package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
