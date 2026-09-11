package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadMessageAttachPaths$235(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processAnchoredEphemeralMessages$203(this.c, this.d);
                break;
            case 2:
                this.b.lambda$processEphemeralMessages$201(this.c, this.d);
                break;
            case 3:
                this.b.lambda$checkLoadedRemoteFilters$69(this.c, this.d);
                break;
            default:
                this.b.lambda$processEphemeralEditedMessages$202(this.c, this.d);
                break;
        }
    }
}
