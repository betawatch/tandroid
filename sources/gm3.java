// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gm3 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ p8c c;

    public /* synthetic */ gm3(p8c p8cVar, String str) {
        this.c = p8cVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                p8cVar.a(str);
                break;
            default:
                gl.c3(new lw8(p8cVar, hv8.c(str, gl.L(240.0f), w34.c, 0.75f, null), (byte) 1));
                break;
        }
    }

    public /* synthetic */ gm3(String str, p8c p8cVar) {
        this.b = str;
        this.c = p8cVar;
    }
}
