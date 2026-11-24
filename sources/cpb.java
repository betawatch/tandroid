// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cpb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jpb b;

    public /* synthetic */ cpb(jpb jpbVar, byte b) {
        this.a = b;
        this.b = jpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jpb jpbVar = this.b;
        switch (b) {
            case 0:
                jpbVar.b(false);
                break;
            case 1:
                jpbVar.c();
                break;
            default:
                jpbVar.b(false);
                break;
        }
    }
}
