// default package

import android.os.CancellationSignal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g23 implements ur4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CancellationSignal) obj2).cancel();
                break;
            default:
                ((va1) obj2).resumeWith(g9cVar);
                break;
        }
        return g9cVar;
    }
}
