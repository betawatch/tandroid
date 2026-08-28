package fh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ l6(int i9, TLRPC.User user) {
        this.a = i9;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        TLRPC.User user = this.b;
        switch (i9) {
            case 0:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                bg.t1.b0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
