package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ s7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
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
