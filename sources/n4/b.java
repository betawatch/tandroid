package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class b extends ka.c {
    @Override // ka.c
    public final a a() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // ka.c
    public final ka.c i(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // ka.c
    public final void j(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
