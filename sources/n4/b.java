package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b extends l2.g {
    @Override // l2.g
    public final l2.g J(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // l2.g
    public final void W(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }

    @Override // l2.g
    public final a c() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }
}
