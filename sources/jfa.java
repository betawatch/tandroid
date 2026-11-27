// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jfa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zha b;
    public final /* synthetic */ int c;

    public /* synthetic */ jfa(zha zhaVar, int i, byte b) {
        this.a = b;
        this.b = zhaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        zha zhaVar = this.b;
        switch (b) {
            case 0:
                zhaVar.h.scrollBy(0, i);
                break;
            case 1:
                zhaVar.h.scrollBy(0, i);
                break;
            default:
                zhaVar.h.scrollBy(0, i);
                break;
        }
    }
}
