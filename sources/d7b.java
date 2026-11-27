// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e7b b;

    public /* synthetic */ d7b(e7b e7bVar, byte b) {
        this.a = b;
        this.b = e7bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e7b e7bVar = this.b;
        switch (b) {
            case 0:
                f7b f7bVar = e7bVar.v;
                f7bVar.s = 0;
                f7bVar.requestLayout();
                g7b g7bVar = f7bVar.K;
                g7bVar.L(g7bVar.getWidth(), g7bVar.getHeight());
                g7bVar.requestLayout();
                break;
            case 1:
                f7b f7bVar2 = e7bVar.v;
                f7bVar2.s = 0;
                f7bVar2.requestLayout();
                g7b g7bVar2 = f7bVar2.K;
                g7bVar2.L(g7bVar2.getWidth(), g7bVar2.getHeight());
                g7bVar2.requestLayout();
                break;
            case 2:
                e7bVar.v.post(new d7b(e7bVar, (byte) 3));
                break;
            default:
                e7bVar.v.y = true;
                break;
        }
    }
}
