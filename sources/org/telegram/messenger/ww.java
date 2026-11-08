package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ ww(gz gzVar, TLRPC.Message message, int i7, int i10) {
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
