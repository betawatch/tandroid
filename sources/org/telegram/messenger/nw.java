package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class nw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ nw(ez ezVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = j3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
        }
    }
}
