package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class b extends k2.e {
    @Override // k2.e
    public final a a() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // k2.e
    public final k2.e k(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // k2.e
    public final void m(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
