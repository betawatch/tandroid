package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ int d;

    public /* synthetic */ pw(zy zyVar, TLRPC.Message message, int i7, int i10) {
        this.a = i10;
        this.b = zyVar;
        this.c = message;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        TLRPC.Message message = this.c;
        zy zyVar = this.b;
        switch (i7) {
            case 0:
                message.send_state = 2;
                zyVar.getNotificationCenter().k(23, Integer.valueOf(message.id));
                zyVar.d0(message.id);
                zyVar.i0(message.id, i10 != 0);
                break;
            default:
                message.send_state = 0;
                zyVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                break;
        }
    }
}
