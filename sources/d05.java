// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d05 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8c b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ d05(i8c i8cVar, Exception exc, byte b) {
        this.a = b;
        this.b = i8cVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                i8cVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 1:
                i8cVar.a(null, exc.getMessage() != null ? exc.getMessage() : "NULL_ERROR");
                break;
            case 2:
                i8cVar.a(null, exc.getMessage());
                break;
            default:
                i8cVar.a(null, exc.getMessage());
                break;
        }
    }
}
