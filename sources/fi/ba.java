package fi;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
