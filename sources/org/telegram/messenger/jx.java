package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ jx(rz rzVar, TLRPC.Message message, int i10, int i11) {
        this.a = i11;
        this.b = rzVar;
        this.c = message;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        TLRPC.Message message = this.c;
        rz rzVar = this.b;
        switch (i10) {
            case 0:
                message.send_state = 2;
                rzVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                rzVar.d0(message.id);
                rzVar.i0(message.id, i11 != 0);
                break;
            default:
                message.send_state = 0;
                rzVar.getNotificationCenter().k(20, Integer.valueOf(i11));
                break;
        }
    }
}
