package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class lc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ lc(int i10, long j3, long j10, MessagesController messagesController) {
        this.a = 0;
        this.b = messagesController;
        this.d = j3;
        this.c = i10;
        this.e = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                long j3 = this.e;
                this.b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                break;
            case 1:
                long j10 = this.d;
                long j11 = this.e;
                this.b.lambda$sendTyping$172(this.c, j10, j11, tLObject, tL_error);
                break;
            default:
                long j12 = this.d;
                long j13 = this.e;
                this.b.lambda$sendTyping$174(this.c, j12, j13, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ lc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j3;
        this.e = j10;
    }
}
