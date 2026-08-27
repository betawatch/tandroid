package j8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements i8.c {
    public final k5.i a;

    public d(k5.i iVar) {
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

    @Override // i8.c
    public final void onChannelClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.a.b).onChannelClosed((i8.d) bVar, i10, i11);
    }

    @Override // i8.c
    public final void onChannelOpened(i8.b bVar) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.a.b).onChannelOpened((i8.d) bVar);
    }

    @Override // i8.c
    public final void onInputClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.a.b).onInputClosed((i8.d) bVar, i10, i11);
    }

    @Override // i8.c
    public final void onOutputClosed(i8.b bVar, int i10, int i11) {
        y5.l.i(bVar, "channel must not be null");
        ((i8.k) this.a.b).onOutputClosed((i8.d) bVar, i10, i11);
    }
}
