package n4;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
