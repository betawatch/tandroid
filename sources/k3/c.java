package k3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements f5.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ c(a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    @Override // f5.j
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b) obj).onSeekStarted(this.b);
                break;
            default:
                ((b) obj).c(this.b);
                break;
        }
    }
}
