package org.telegram.messenger;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class kj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ kj(SendMessagesHelper sendMessagesHelper, String str, List list, int i9) {
        this.a = i9;
        this.b = sendMessagesHelper;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendNotificationCallback$28(this.c, this.d);
                break;
            default:
                this.b.lambda$sendCallback$38(this.c, this.d);
                break;
        }
    }
}
