package org.telegram.messenger;

import java.util.List;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class gj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ gj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
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
