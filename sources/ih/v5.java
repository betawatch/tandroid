package ih;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ v5(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                eg.n1.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
