// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ po2 b;

    public /* synthetic */ ko2(po2 po2Var, byte b) {
        this.a = b;
        this.b = po2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                po2Var.b0();
                break;
            default:
                nm7 notificationCenter = po2Var.getNotificationCenter();
                int i = oc7.s5;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
