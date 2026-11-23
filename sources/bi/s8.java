package bi;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ s8(int i7, TLRPC.User user) {
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
