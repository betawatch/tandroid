package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
