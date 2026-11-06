package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ rw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = gzVar;
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
