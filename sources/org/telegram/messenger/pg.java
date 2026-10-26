package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pg(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putContacts$149(this.d, this.c);
                break;
            default:
                this.b.lambda$putEphemeralMessages$207(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ pg(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.d = z10;
        this.c = arrayList;
    }
}
