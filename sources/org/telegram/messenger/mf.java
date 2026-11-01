package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ mf(vi viVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = document;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vi viVar = this.b;
                TLRPC.Document document = this.c;
                try {
                    viVar.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                vi viVar2 = this.b;
                TLRPC.Document document2 = this.c;
                try {
                    viVar2.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document2.id + "' AND type = 2").stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
        }
    }
}
