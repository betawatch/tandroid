package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class hi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ hi(SendMessagesHelper sendMessagesHelper, long j10, ArrayList arrayList, int i10) {
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
