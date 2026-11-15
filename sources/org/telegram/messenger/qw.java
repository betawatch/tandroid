package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class qw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ qw(ez ezVar, TLRPC.Message message, boolean z10, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ez ezVar = this.b;
                ezVar.getClass();
                TLRPC.Message message = this.c;
                ezVar.d0(message.id);
                ezVar.i0(message.id, this.d);
                break;
            case 1:
                ez ezVar2 = this.b;
                ezVar2.getClass();
                TLRPC.Message message2 = this.c;
                ezVar2.d0(message2.id);
                ezVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
