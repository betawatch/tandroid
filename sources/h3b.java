// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i3b b;

    public /* synthetic */ h3b(i3b i3bVar, byte b) {
        this.a = b;
        this.b = i3bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i3b i3bVar = this.b;
        switch (b) {
            case 0:
                j3b j3bVar = i3bVar.v;
                j3bVar.s = 0;
                j3bVar.requestLayout();
                k3b k3bVar = j3bVar.K;
                k3bVar.L(k3bVar.getWidth(), k3bVar.getHeight());
                k3bVar.requestLayout();
                break;
            case 1:
                j3b j3bVar2 = i3bVar.v;
                j3bVar2.s = 0;
                j3bVar2.requestLayout();
                k3b k3bVar2 = j3bVar2.K;
                k3bVar2.L(k3bVar2.getWidth(), k3bVar2.getHeight());
                k3bVar2.requestLayout();
                break;
            case 2:
                i3bVar.v.post(new h3b(i3bVar, (byte) 3));
                break;
            default:
                i3bVar.v.y = true;
                break;
        }
    }
}
