// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ie7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ ie7(kf7 kf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                jn7 notificationCenter = kf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                break;
            default:
                jn7 notificationCenter2 = kf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
