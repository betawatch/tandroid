package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class qe implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
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

    public /* synthetic */ qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = arrayList;
    }
}
