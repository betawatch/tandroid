package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ z7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$loadRepliesOfDraftReplies$0(this.c);
                break;
            default:
                this.b.lambda$broadcastPinnedMessage$168(this.c);
                break;
        }
    }
}
