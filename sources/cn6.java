// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class cn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ cn6(hq6 hq6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            default:
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
