package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ k6(int i7, TLRPC.User user) {
        this.a = i7;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.User user = this.b;
        switch (i7) {
            case 0:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                wg.h0.l1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
