package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class xw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ xw(gz gzVar, TLRPC.Message message, int i7, int i10) {
        this.a = i10;
        this.b = gzVar;
        this.c = message;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        TLRPC.Message message = this.c;
        gz gzVar = this.b;
        switch (i7) {
            case 0:
                message.send_state = 2;
                gzVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                gzVar.d0(message.id);
                gzVar.i0(message.id, i10 != 0);
                break;
            default:
                message.send_state = 0;
                gzVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                break;
        }
    }
}
