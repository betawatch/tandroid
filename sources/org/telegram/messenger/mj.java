package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class mj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ int s;

    public /* synthetic */ mj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, MessageObject messageObject, int i13, int i14) {
        this.a = i14;
        this.b = sendMessagesHelper;
        this.c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f = message;
        this.h = i12;
        this.n = message2;
        this.r = messageObject;
        this.s = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendMessage$9(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
            default:
                this.b.lambda$sendMessage$10(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
        }
    }
}
