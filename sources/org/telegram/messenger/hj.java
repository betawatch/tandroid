package org.telegram.messenger;

import java.util.List;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class hj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ hj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendNotificationCallback$31(this.c, this.d);
                break;
            default:
                this.b.lambda$sendCallback$41(this.c, this.d);
                break;
        }
    }
}
