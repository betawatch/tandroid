// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf b;

    public /* synthetic */ ba4(bf bfVar, byte b) {
        this.a = b;
        this.b = bfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bf bfVar = this.b;
        switch (b) {
            case 0:
                ((ja4) bfVar.c).a(bfVar.b, -4, (ArrayList) bfVar.d);
                break;
            case 1:
                ((ja4) bfVar.c).a(bfVar.b, -3, (ArrayList) bfVar.d);
                break;
            default:
                ((ja4) bfVar.c).a(bfVar.b, -4, (ArrayList) bfVar.d);
                break;
        }
    }
}
