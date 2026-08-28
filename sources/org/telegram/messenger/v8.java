package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ BaseController n;
    public final /* synthetic */ Object r;

    public /* synthetic */ v8(MediaDataController mediaDataController, int i9, ArrayList arrayList, boolean z10, long j10, int i10, int i11, long j11) {
        this.n = mediaDataController;
        this.b = i9;
        this.r = arrayList;
        this.h = z10;
        this.c = j10;
        this.e = i10;
        this.f = i11;
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

    public /* synthetic */ v8(MessagesStorage messagesStorage, int i9, TLRPC.messages_Messages messages_messages, long j10, long j11, int i10, int i11, boolean z10) {
        this.n = messagesStorage;
        this.b = i9;
        this.r = messages_messages;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = i11;
        this.h = z10;
    }
}
