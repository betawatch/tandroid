package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class si implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ si(SendMessagesHelper sendMessagesHelper, long j3, ArrayList arrayList, int i10) {
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
