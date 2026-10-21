package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class ii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ii(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
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
