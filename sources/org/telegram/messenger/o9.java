package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ BaseController f;
    public final /* synthetic */ Object h;

    public /* synthetic */ o9(MediaDataController mediaDataController, boolean z10, int i10, ArrayList arrayList, boolean z11, int i11) {
        this.f = mediaDataController;
        this.c = z10;
        this.b = i10;
        this.h = arrayList;
        this.d = z11;
        this.e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.f).lambda$processLoadedRecentDocuments$52(this.c, this.b, (ArrayList) this.h, this.d, this.e);
                break;
            default:
                ((MessagesController) this.f).lambda$processLoadedMessages$188(this.b, (TLRPC.messages_Messages) this.h, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ o9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i11) {
        this.f = messagesController;
        this.b = i10;
        this.h = messages_messages;
        this.c = z10;
        this.d = z11;
        this.e = i11;
    }
}
