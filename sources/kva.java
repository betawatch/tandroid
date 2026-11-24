// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bwa b;

    public /* synthetic */ kva(bwa bwaVar, byte b) {
        this.a = b;
        this.b = bwaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bwa bwaVar = this.b;
        switch (b) {
            case 0:
                bwaVar.N1 = true;
                bwaVar.E0(null);
                gl.e3(new kva(bwaVar, (byte) 1), 240L);
                break;
            case 1:
                bwaVar.dismiss();
                break;
            default:
                qva qvaVar = bwaVar.s1;
                qvaVar.G = false;
                qvaVar.invalidate();
                break;
        }
    }
}
