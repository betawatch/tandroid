package org.telegram.messenger;

import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ vj(SendMessagesHelper sendMessagesHelper, String str, List list, int i10) {
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
