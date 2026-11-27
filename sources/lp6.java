// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class lp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ lp6(ls6 ls6Var, TLRPC.Document document, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Document document = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                try {
                    ls6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            default:
                try {
                    ls6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
