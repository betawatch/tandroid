package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ww implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLRPC.Updates c;

    public /* synthetic */ ww(rz rzVar, TLRPC.Updates updates, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = updates;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().L3(this.c, false);
                break;
            default:
                this.b.getMessagesController().L3(this.c, false);
                break;
        }
    }
}
