// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new lw8(p8cVar, hv8.c(str, gl.L(240.0f), w34.c, 0.75f, null), (byte) 1));
                break;
        }
    }

    public /* synthetic */ gm3(String str, p8c p8cVar) {
        this.b = str;
        this.c = p8cVar;
    }
}
