package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ kw(az azVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = azVar;
        this.c = j3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
        }
    }
}
