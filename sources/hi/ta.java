package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class ta implements v2 {
    public final /* synthetic */ nb a;

    public ta(nb nbVar) {
        this.a = nbVar;
    }

    @Override // hi.v2
    public final void setInvert(float f10) {
        nb nbVar = this.a;
        org.telegram.messenger.g0.n3(nbVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.q3(nbVar.n, f10 > 0.5f);
    }

    @Override // hi.v2
    public final void invalidate() {
    }
}
