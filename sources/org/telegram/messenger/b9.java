package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ BaseController n;
    public final /* synthetic */ Object r;

    public /* synthetic */ b9(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z4, long j10, int i11, int i12, long j11) {
        this.n = mediaDataController;
        this.b = i10;
        this.r = arrayList;
        this.h = z4;
        this.c = j10;
        this.e = i11;
        this.f = i12;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.n).lambda$putMediaDatabase$140(this.b, (ArrayList) this.r, this.h, this.c, this.e, this.f, this.d);
                break;
            default:
                ((MessagesStorage) this.n).lambda$putMessages$238(this.b, (TLRPC.messages_Messages) this.r, this.c, this.d, this.e, this.f, this.h);
                break;
        }
    }

    public /* synthetic */ b9(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z4) {
        this.n = messagesStorage;
        this.b = i10;
        this.r = messages_messages;
        this.c = j10;
        this.d = j11;
        this.e = i11;
        this.f = i12;
        this.h = z4;
    }
}
