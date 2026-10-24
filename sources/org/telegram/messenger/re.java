package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ re(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
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

    public /* synthetic */ re(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = arrayList;
    }
}
