package m8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements l8.c {
    public final androidx.biometric.e0 a;

    public d(androidx.biometric.e0 e0Var) {
        this.a = e0Var;
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
