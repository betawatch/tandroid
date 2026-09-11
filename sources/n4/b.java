package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b extends mg.n {
    @Override // mg.n
    public final a d() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // mg.n
    public final mg.n x(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // mg.n
    public final void z(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
