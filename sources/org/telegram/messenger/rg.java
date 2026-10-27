package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rg(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putContacts$150(this.d, this.c);
                break;
            default:
                this.b.lambda$putEphemeralMessages$208(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ rg(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.d = z10;
        this.c = arrayList;
    }
}
