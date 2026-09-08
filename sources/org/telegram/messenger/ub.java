package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class ub implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.b = messagesController;
        this.c = j3;
        this.f = j10;
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

    public /* synthetic */ ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.c = j3;
        this.f = j10;
        this.e = i11;
        this.g = z10;
        this.b = context;
        this.h = str;
    }

    public /* synthetic */ ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.b = messagesController;
        this.c = j3;
        this.d = i10;
        this.e = i11;
        this.f = j10;
        this.g = z10;
        this.h = runnable;
    }
}
