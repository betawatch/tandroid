// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class he7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf7 b;
    public final /* synthetic */ TLRPC.TL_chatFull c;

    public /* synthetic */ he7(jf7 jf7Var, TLRPC.TL_chatFull tL_chatFull, byte b) {
        this.a = b;
        this.b = jf7Var;
        this.c = tL_chatFull;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatFull tL_chatFull = this.c;
        jf7 jf7Var = this.b;
        switch (b) {
            case 0:
                jn7 notificationCenter = jf7Var.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(31, tL_chatFull, 0, bool, bool);
                break;
            default:
                jn7 notificationCenter2 = jf7Var.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(31, tL_chatFull, 0, bool2, bool2);
                break;
        }
    }
}
