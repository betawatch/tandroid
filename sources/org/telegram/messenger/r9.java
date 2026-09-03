package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ BaseController f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r9(MediaDataController mediaDataController, boolean z4, int i10, ArrayList arrayList, boolean z10, int i11) {
        this.f = mediaDataController;
        this.c = z4;
        this.b = i10;
        this.h = arrayList;
        this.d = z10;
        this.e = i11;
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

    public /* synthetic */ r9(MessagesController messagesController, int i10, TLRPC.messages_Messages messages_messages, boolean z4, boolean z10, int i11) {
        this.f = messagesController;
        this.b = i10;
        this.h = messages_messages;
        this.c = z4;
        this.d = z10;
        this.e = i11;
    }
}
