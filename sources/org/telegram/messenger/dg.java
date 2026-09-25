package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ dg(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10) {
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
