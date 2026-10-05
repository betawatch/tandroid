package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
