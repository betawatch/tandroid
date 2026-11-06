package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class tw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tw(gz gzVar, TLRPC.Message message, boolean z9, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = message;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                gzVar.getClass();
                TLRPC.Message message = this.c;
                gzVar.d0(message.id);
                gzVar.i0(message.id, this.d);
                break;
            case 1:
                gz gzVar2 = this.b;
                gzVar2.getClass();
                TLRPC.Message message2 = this.c;
                gzVar2.d0(message2.id);
                gzVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
