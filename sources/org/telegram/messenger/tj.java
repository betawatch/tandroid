package org.telegram.messenger;

import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ tj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
        this.a = i10;
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
