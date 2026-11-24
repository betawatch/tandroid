// default package

import java.util.function.IntSupplier;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements IntSupplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ es(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((gs) obj).l3.f() << 1;
            case 1:
                return ((gs) obj).n3.f() << 1;
            case 2:
                return ConnectionsManager.getInstance(((gs) obj).b).isTestBackend() ? 5 : 20;
            case 3:
                return ConnectionsManager.getInstance(((gs) obj).b).isTestBackend() ? 5 : 20;
            case 4:
                return !ConnectionsManager.getInstance(((gs) obj).b).isTestBackend() ? 100 : 5;
            case 5:
                return ConnectionsManager.getInstance(((gs) obj).b).isTestBackend() ? 10 : 30;
            default:
                return on2.f(((pp9) obj).U, -1290001879, 1375731712);
        }
    }
}
