package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ hb(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.c = j3;
        this.b = i10;
        this.e = i11;
        this.d = j10;
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

    public /* synthetic */ hb(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.b = i10;
        this.c = j3;
        this.d = j10;
        this.e = i11;
        this.f = z10;
        this.n = context;
        this.r = str;
    }
}
