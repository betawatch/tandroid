// default package

import android.os.CancellationSignal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n13 implements qp4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n13(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CancellationSignal) obj2).cancel();
                break;
            default:
                ((na1) obj2).resumeWith(g5cVar);
                break;
        }
        return g5cVar;
    }
}
