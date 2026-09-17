package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ BaseController n;
    public final /* synthetic */ Object r;

    public /* synthetic */ w8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.n = mediaDataController;
        this.b = i10;
        this.r = arrayList;
        this.h = z10;
        this.c = j3;
        this.e = i11;
        this.f = i12;
        this.d = j10;
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

    public /* synthetic */ w8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.n = messagesStorage;
        this.b = i10;
        this.r = messages_messages;
        this.c = j3;
        this.d = j10;
        this.e = i11;
        this.f = i12;
        this.h = z10;
    }
}
