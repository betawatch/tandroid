// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
