package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ nf(ui uiVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = uiVar;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                TLRPC.Document document = this.c;
                try {
                    uiVar.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                ui uiVar2 = this.b;
                TLRPC.Document document2 = this.c;
                try {
                    uiVar2.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
