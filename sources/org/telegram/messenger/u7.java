package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ u7(MediaDataController mediaDataController, ArrayList arrayList, int i10) {
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
