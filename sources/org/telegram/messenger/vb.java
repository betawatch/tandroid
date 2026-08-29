package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class vb implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.b = messagesController;
        this.c = j10;
        this.f = j11;
        this.d = i10;
        this.e = i11;
        this.g = z10;
        this.h = inputPeer;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).lambda$deleteDialog$142(this.c, this.f, this.d, this.e, this.g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.b).lambda$deleteMessagesRange$466(this.c, this.d, this.e, this.f, this.g, (Runnable) this.h, tLObject, tL_error);
                break;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) this.b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ vb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.c = j10;
        this.f = j11;
        this.e = i11;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    public /* synthetic */ vb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.b = messagesController;
        this.c = j10;
        this.d = i10;
        this.e = i11;
        this.f = j11;
        this.g = z10;
        this.h = runnable;
    }
}
