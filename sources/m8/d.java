package m8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d implements l8.c {
    public final androidx.biometric.f0 a;

    public d(androidx.biometric.f0 f0Var) {
        this.a = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // l8.c
    public final void onChannelClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.a.b).onChannelClosed((l8.d) bVar, i10, i11);
    }

    @Override // l8.c
    public final void onChannelOpened(l8.b bVar) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.a.b).onChannelOpened((l8.d) bVar);
    }

    @Override // l8.c
    public final void onInputClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.a.b).onInputClosed((l8.d) bVar, i10, i11);
    }

    @Override // l8.c
    public final void onOutputClosed(l8.b bVar, int i10, int i11) {
        b6.m.i(bVar, "channel must not be null");
        ((l8.k) this.a.b).onOutputClosed((l8.d) bVar, i10, i11);
    }
}
