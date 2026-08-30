package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ nc(int i10, long j10, long j11, MessagesController messagesController) {
        this.a = 0;
        this.b = messagesController;
        this.d = j10;
        this.c = i10;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                long j10 = this.e;
                this.b.lambda$getChannelDifference$349(this.d, i10, j10, tLObject, tL_error);
                break;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.b.lambda$sendTyping$172(this.c, j11, j12, tLObject, tL_error);
                break;
            default:
                long j13 = this.d;
                long j14 = this.e;
                this.b.lambda$sendTyping$174(this.c, j13, j14, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ nc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j10;
        this.e = j11;
    }
}
