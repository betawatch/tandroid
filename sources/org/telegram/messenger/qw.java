package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ qw(az azVar, TLRPC.Message message, int i7, int i10) {
        this.a = i10;
        this.b = azVar;
        this.c = message;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        TLRPC.Message message = this.c;
        az azVar = this.b;
        switch (i7) {
            case 0:
                message.send_state = 2;
                azVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                azVar.d0(message.id);
                azVar.i0(message.id, i10 != 0);
                break;
            default:
                message.send_state = 0;
                azVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                break;
        }
    }
}
