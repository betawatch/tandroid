package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
