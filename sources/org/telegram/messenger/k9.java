package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ BaseController f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k9(MediaDataController mediaDataController, boolean z10, int i9, ArrayList arrayList, boolean z11, int i10) {
        this.f = mediaDataController;
        this.c = z10;
        this.b = i9;
        this.h = arrayList;
        this.d = z11;
        this.e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.f).lambda$processLoadedRecentDocuments$52(this.c, this.b, (ArrayList) this.h, this.d, this.e);
                break;
            default:
                ((MessagesController) this.f).lambda$processLoadedMessages$189(this.b, (TLRPC.messages_Messages) this.h, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ k9(MessagesController messagesController, int i9, TLRPC.messages_Messages messages_messages, boolean z10, boolean z11, int i10) {
        this.f = messagesController;
        this.b = i9;
        this.h = messages_messages;
        this.c = z10;
        this.d = z11;
        this.e = i10;
    }
}
