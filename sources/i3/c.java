package i3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d5.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ c(a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // d5.k
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b) obj).onSeekStarted(this.b);
                break;
            default:
                ((b) obj).f(this.b);
                break;
        }
    }
}
