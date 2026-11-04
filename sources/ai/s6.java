package ai;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ s6(int i3, TLRPC.User user) {
        this.a = i3;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.User user = this.b;
        switch (i3) {
            case 0:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                xg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
