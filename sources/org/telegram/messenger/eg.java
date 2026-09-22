package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ eg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setDialogsPinned$252(this.c, this.d);
                break;
            default:
                this.b.lambda$loadTopics$50(this.c, this.d);
                break;
        }
    }
}
