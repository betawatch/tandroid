package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ uw(ez ezVar, TLRPC.Message message, int i7, int i10) {
        this.a = i10;
        this.b = ezVar;
        this.c = message;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        TLRPC.Message message = this.c;
        ez ezVar = this.b;
        switch (i7) {
            case 0:
                message.send_state = 2;
                ezVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                ezVar.d0(message.id);
                ezVar.i0(message.id, i10 != 0);
                break;
            default:
                message.send_state = 0;
                ezVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                break;
        }
    }
}
