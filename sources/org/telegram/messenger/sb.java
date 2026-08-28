package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ sb(MessagesController messagesController, int i9, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = i9;
        this.d = arrayList;
        this.e = z10;
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
