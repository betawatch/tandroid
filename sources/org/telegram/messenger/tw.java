package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = message;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                gzVar.getClass();
                TLRPC.Message message = this.c;
                gzVar.d0(message.id);
                gzVar.i0(message.id, this.d);
                break;
            case 1:
                gz gzVar2 = this.b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.c;
                gzVar2.d0(message2.id);
                gzVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
