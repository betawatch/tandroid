// default package

import java.util.function.IntSupplier;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class er implements IntSupplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ er(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((gr) obj).l3.f() << 1;
            case 1:
                return ((gr) obj).n3.f() << 1;
            case 2:
                return ConnectionsManager.getInstance(((gr) obj).b).isTestBackend() ? 5 : 20;
            case 3:
                return ConnectionsManager.getInstance(((gr) obj).b).isTestBackend() ? 5 : 20;
            case 4:
                return !ConnectionsManager.getInstance(((gr) obj).b).isTestBackend() ? 100 : 5;
            case 5:
                return ConnectionsManager.getInstance(((gr) obj).b).isTestBackend() ? 10 : 30;
            default:
                return bm2.f(((on9) obj).U, -1290001879, 1375731712);
        }
    }
}
