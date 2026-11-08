package fi;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ba implements o2 {
    public final /* synthetic */ va a;

    public ba(va vaVar) {
        this.a = vaVar;
    }

    @Override // fi.o2
    public final void setInvert(float f10) {
        va vaVar = this.a;
        org.telegram.messenger.g0.o3(vaVar.n, f10 > 0.5f);
        org.telegram.messenger.g0.r3(vaVar.n, f10 > 0.5f);
    }

    @Override // fi.o2
    public final void invalidate() {
    }
}
