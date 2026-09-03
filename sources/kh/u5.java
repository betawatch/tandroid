package kh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ u5(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                gg.m1.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
