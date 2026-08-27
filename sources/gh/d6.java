package gh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ d6(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                cg.o1.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
