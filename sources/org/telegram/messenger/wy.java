package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class wy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wy(rz rzVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.getMessagesController().L3(this.c, false);
                i0.g3(new fx(rzVar, this.d, this.e, 0));
                break;
            default:
                rz rzVar2 = this.b;
                rzVar2.getMessagesController().L3(this.c, false);
                i0.g3(new fx(rzVar2, this.d, this.e, 1));
                break;
        }
    }
}
