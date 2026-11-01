package lg;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(g gVar, int i10, int i11) {
        this.a = i11;
        this.b = gVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                gVar.postOnAnimation(new c(gVar, this.c, 1));
                break;
            default:
                g gVar2 = this.b;
                int i10 = this.c;
                if (gVar2.e && !gVar2.r && i10 == gVar2.E) {
                    gVar2.y = true;
                    gVar2.requestRender();
                    break;
                }
                break;
        }
    }
}
