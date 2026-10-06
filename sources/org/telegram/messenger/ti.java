package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ti(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = j3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendMessage$11(this.c, this.d);
                break;
            case 1:
                this.b.lambda$performSendMessageRequestMulti$69(this.c, this.d);
                break;
            default:
                this.b.lambda$performSendMessageRequest$97(this.c, this.d);
                break;
        }
    }
}
