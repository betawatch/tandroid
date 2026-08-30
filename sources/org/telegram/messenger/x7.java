package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ x7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
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
