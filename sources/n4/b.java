package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class b extends k2.e {
    @Override // k2.e
    public final a a() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // k2.e
    public final k2.e m(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // k2.e
    public final void o(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
