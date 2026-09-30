package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.b = messagesStorage;
        this.d = arrayList;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putEphemeralMessages$204(this.d, this.c);
                break;
            default:
                this.b.lambda$putContacts$146(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = arrayList;
    }
}
