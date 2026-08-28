package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ eb(MessagesController messagesController, long j10, int i9, int i10, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.c = j10;
        this.b = i9;
        this.e = i10;
        this.d = j11;
        this.n = tL_messages_affectedHistory;
        this.f = z10;
        this.r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.c, this.b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.n, this.f, (Runnable) this.r);
                break;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.b, this.c, this.d, this.e, this.f, (Context) this.n, (String) this.r);
                break;
        }
    }

    public /* synthetic */ eb(TLObject tLObject, int i9, long j10, long j11, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.b = i9;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = z10;
        this.n = context;
        this.r = str;
    }
}
