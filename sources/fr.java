// default package

import java.util.function.IntSupplier;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fr implements IntSupplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hr) obj).t3.f() << 1;
            case 1:
                return ((hr) obj).v3.f() << 1;
            case 2:
                return ConnectionsManager.getInstance(((hr) obj).b).isTestBackend() ? 5 : 20;
            case 3:
                return ConnectionsManager.getInstance(((hr) obj).b).isTestBackend() ? 5 : 20;
            case 4:
                return !ConnectionsManager.getInstance(((hr) obj).b).isTestBackend() ? 100 : 5;
            case 5:
                return ConnectionsManager.getInstance(((hr) obj).b).isTestBackend() ? 10 : 30;
            default:
                return vm2.f(((er9) obj).U, -1290001879, 1375731712);
        }
    }
}
