package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TLRPC.Updates c;
    public final /* synthetic */ TLRPC.Message d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ fy(az azVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = updates;
        this.d = message;
        this.e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                az azVar = this.b;
                azVar.getMessagesController().V3(this.c, false);
                g0.g3(new mw(azVar, this.d, this.e, 0));
                break;
            default:
                az azVar2 = this.b;
                azVar2.getMessagesController().V3(this.c, false);
                g0.g3(new mw(azVar2, this.d, this.e, 1));
                break;
        }
    }
}
