package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ wf(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i9) {
        this.a = i9;
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
