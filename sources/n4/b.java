package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
