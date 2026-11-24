// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.d3(new kva(bwaVar, (byte) 1), 240L);
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
