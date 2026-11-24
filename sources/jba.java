// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lba b;

    public /* synthetic */ jba(lba lbaVar, byte b) {
        this.a = b;
        this.b = lbaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        lba lbaVar = this.b;
        switch (b) {
            case 0:
                lbaVar.post(new jba(lbaVar, b2));
                break;
            default:
                lbaVar.c0.N0 = true;
                lbaVar.I.clear();
                lbaVar.J.clear();
                lbaVar.K.clear();
                lbaVar.invalidate();
                break;
        }
    }
}
