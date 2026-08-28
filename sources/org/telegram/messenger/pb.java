package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pb(int i9, int i10, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.b = messagesController;
        this.c = j10;
        this.f = j11;
        this.d = i9;
        this.e = i10;
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

    public /* synthetic */ pb(Context context, int i9, long j10, String str, long j11, int i10, boolean z10) {
        this.d = i9;
        this.c = j10;
        this.f = j11;
        this.e = i10;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    public /* synthetic */ pb(MessagesController messagesController, long j10, int i9, int i10, long j11, boolean z10, Runnable runnable) {
        this.b = messagesController;
        this.c = j10;
        this.d = i9;
        this.e = i10;
        this.f = j11;
        this.g = z10;
        this.h = runnable;
    }
}
