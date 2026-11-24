// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ cp6(hs6 hs6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                try {
                    hs6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            default:
                try {
                    hs6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
