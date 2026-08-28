package i3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d5.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ c(a aVar, int i9) {
        this.a = i9;
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
