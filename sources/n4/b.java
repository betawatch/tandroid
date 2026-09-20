package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b extends ka.c {
    @Override // ka.c
    public final a J() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // ka.c
    public final ka.c k0(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // ka.c
    public final void n0(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
