package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ gc(int i9, long j10, long j11, MessagesController messagesController) {
        this.a = 0;
        this.b = messagesController;
        this.d = j10;
        this.c = i9;
        this.e = j11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                int i9 = this.c;
                long j10 = this.e;
                this.b.lambda$getChannelDifference$349(this.d, i9, j10, tLObject, tL_error);
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

    public /* synthetic */ gc(MessagesController messagesController, int i9, long j10, long j11, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = i9;
        this.d = j10;
        this.e = j11;
    }
}
