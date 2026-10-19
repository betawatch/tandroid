package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class ne implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ne(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
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

    public /* synthetic */ ne(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.b = messagesStorage;
        this.c = z10;
        this.d = arrayList;
    }
}
