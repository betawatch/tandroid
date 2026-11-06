package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ly(gz gzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z9, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = updates;
        this.d = message;
        this.e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                gzVar.getMessagesController().O3(this.c, false);
                g0.h3(new tw(gzVar, this.d, this.e, 0));
                break;
            default:
                gz gzVar2 = this.b;
                gzVar2.getMessagesController().O3(this.c, false);
                g0.h3(new tw(gzVar2, this.d, this.e, 1));
                break;
        }
    }
}
