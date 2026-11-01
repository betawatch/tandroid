package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fx(rz rzVar, TLRPC.Message message, boolean z10, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.getClass();
                TLRPC.Message message = this.c;
                rzVar.d0(message.id);
                rzVar.i0(message.id, this.d);
                break;
            case 1:
                rz rzVar2 = this.b;
                rzVar2.getClass();
                TLRPC.Message message2 = this.c;
                rzVar2.d0(message2.id);
                rzVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
