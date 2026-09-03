package lh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                hg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
