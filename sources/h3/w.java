package h3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements d5.l, d5.k {
    public final /* synthetic */ k0 a;

    public /* synthetic */ w(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // d5.l
    public void e(Object obj, d5.g gVar) {
        ((a2) obj).onEvents(this.a.f, new z1(gVar));
    }

    @Override // d5.k
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.a.N);
    }
}
