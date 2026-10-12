package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ oi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$performSendMessageRequestMulti$72(this.c, this.d);
                break;
            case 1:
                this.b.lambda$performSendMessageRequest$100(this.c, this.d);
                break;
            default:
                this.b.lambda$sendMessage$14(this.c, this.d);
                break;
        }
    }
}
