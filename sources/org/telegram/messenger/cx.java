package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class cx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ cx(qz qzVar, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = qzVar;
        this.c = j10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().j3(this.d, this.c);
                break;
        }
    }
}
