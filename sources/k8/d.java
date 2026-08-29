package k8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements j8.c {
    public final m5.i a;

    public d(m5.i iVar) {
        this.a = iVar;
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

    @Override // j8.c
    public final void onChannelClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.a.b).onChannelClosed((j8.d) bVar, i10, i11);
    }

    @Override // j8.c
    public final void onChannelOpened(j8.b bVar) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.a.b).onChannelOpened((j8.d) bVar);
    }

    @Override // j8.c
    public final void onInputClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.a.b).onInputClosed((j8.d) bVar, i10, i11);
    }

    @Override // j8.c
    public final void onOutputClosed(j8.b bVar, int i10, int i11) {
        z5.l.i(bVar, "channel must not be null");
        ((j8.k) this.a.b).onOutputClosed((j8.d) bVar, i10, i11);
    }
}
