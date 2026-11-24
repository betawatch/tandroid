// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class be7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf7 b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ be7(cf7 cf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                nm7 notificationCenter = cf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                break;
            default:
                nm7 notificationCenter2 = cf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
