package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
