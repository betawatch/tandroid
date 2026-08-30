package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ lb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z4, Runnable runnable) {
        this.h = messagesController;
        this.c = j10;
        this.b = i10;
        this.e = i11;
        this.d = j11;
        this.n = tL_messages_affectedHistory;
        this.f = z4;
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

    public /* synthetic */ lb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        this.h = tLObject;
        this.b = i10;
        this.c = j10;
        this.d = j11;
        this.e = i11;
        this.f = z4;
        this.n = context;
        this.r = str;
    }
}
