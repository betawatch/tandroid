package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadMessageAttachPaths$239(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processAnchoredEphemeralMessages$207(this.c, this.d);
                break;
            case 2:
                this.b.lambda$processEphemeralMessages$205(this.c, this.d);
                break;
            case 3:
                this.b.lambda$checkLoadedRemoteFilters$72(this.c, this.d);
                break;
            default:
                this.b.lambda$processEphemeralEditedMessages$206(this.c, this.d);
                break;
        }
    }
}
