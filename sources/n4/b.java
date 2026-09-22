package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b extends k2.e {
    @Override // k2.e
    public final k2.e K(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // k2.e
    public final void U(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }

    @Override // k2.e
    public final a g() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }
}
