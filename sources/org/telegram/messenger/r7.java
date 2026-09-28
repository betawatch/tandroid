package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ r7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
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
