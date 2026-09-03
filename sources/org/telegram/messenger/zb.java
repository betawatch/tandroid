package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ zb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z4, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = arrayList;
        this.e = z4;
        this.f = tL_messages_peerDialogs;
        this.h = hVar;
        this.n = tL_messages_dialogs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadPinnedDialogs$366(this.c, this.d, this.e, this.f, this.h, this.n);
                break;
            default:
                this.b.lambda$loadPinnedDialogs$365(this.c, this.d, this.e, this.f, this.h, this.n);
                break;
        }
    }
}
