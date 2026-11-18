package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ q8(int i7, TLRPC.User user) {
        this.a = i7;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.User user = this.b;
        switch (i7) {
            case 0:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                wg.j0.m1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
