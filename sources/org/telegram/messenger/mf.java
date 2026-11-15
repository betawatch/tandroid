package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ mf(si siVar, TLRPC.Document document, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si siVar = this.b;
                TLRPC.Document document = this.c;
                try {
                    siVar.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                si siVar2 = this.b;
                TLRPC.Document document2 = this.c;
                try {
                    siVar2.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
