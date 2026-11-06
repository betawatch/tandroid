package fi;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
