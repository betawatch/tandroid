package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ lf(ui uiVar, TLRPC.Document document, int i10) {
        this.a = i10;
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
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                ui uiVar2 = this.b;
                TLRPC.Document document2 = this.c;
                try {
                    uiVar2.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}
