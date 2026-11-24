// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gc b;

    public /* synthetic */ fc(gc gcVar, byte b) {
        this.a = b;
        this.b = gcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gc gcVar = this.b;
        switch (b) {
            case 0:
                gcVar.invalidateSelf();
                break;
            default:
                ((lm) gcVar.d).e(true, 0.0f);
                gcVar.invalidateSelf();
                break;
        }
    }
}
