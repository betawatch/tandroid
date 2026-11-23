package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mw(az azVar, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                az azVar = this.b;
                azVar.getClass();
                TLRPC.Message message = this.c;
                azVar.d0(message.id);
                azVar.i0(message.id, this.d);
                break;
            case 1:
                az azVar2 = this.b;
                azVar2.getClass();
                TLRPC.Message message2 = this.c;
                azVar2.d0(message2.id);
                azVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
