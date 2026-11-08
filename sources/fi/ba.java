package fi;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
