package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                this.b.lambda$loadMessageAttachPaths$238(this.c, this.d);
                break;
            case 1:
                this.b.lambda$processAnchoredEphemeralMessages$206(this.c, this.d);
                break;
            case 2:
                this.b.lambda$processEphemeralMessages$204(this.c, this.d);
                break;
            case 3:
                this.b.lambda$checkLoadedRemoteFilters$72(this.c, this.d);
                break;
            default:
                this.b.lambda$processEphemeralEditedMessages$205(this.c, this.d);
                break;
        }
    }
}
