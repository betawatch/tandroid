package i8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements h8.c {
    public final fa.c a;

    public d(fa.c cVar) {
        this.a = cVar;
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

    @Override // h8.c
    public final void onChannelClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.a.b).onChannelClosed((h8.d) bVar, i9, i10);
    }

    @Override // h8.c
    public final void onChannelOpened(h8.b bVar) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.a.b).onChannelOpened((h8.d) bVar);
    }

    @Override // h8.c
    public final void onInputClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.a.b).onInputClosed((h8.d) bVar, i9, i10);
    }

    @Override // h8.c
    public final void onOutputClosed(h8.b bVar, int i9, int i10) {
        x5.l.i(bVar, "channel must not be null");
        ((h8.k) this.a.b).onOutputClosed((h8.d) bVar, i9, i10);
    }
}
