package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.i h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ xb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f = tL_messages_peerDialogs;
        this.h = iVar;
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
