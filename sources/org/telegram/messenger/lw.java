package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ TLRPC.Message c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lw(yy yyVar, TLRPC.Message message, boolean z10, int i3) {
        this.a = i3;
        this.b = yyVar;
        this.c = message;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.getClass();
                TLRPC.Message message = this.c;
                yyVar.d0(message.id);
                yyVar.i0(message.id, this.d);
                break;
            case 1:
                yy yyVar2 = this.b;
                yyVar2.getClass();
                TLRPC.Message message2 = this.c;
                yyVar2.d0(message2.id);
                yyVar2.i0(message2.id, this.d);
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
