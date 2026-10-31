package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ vp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ pk(vp vpVar, long j10, long j11, ArrayList arrayList) {
        this.b = vpVar;
        this.d = j10;
        this.e = j11;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                hs messagesStorage = vpVar.getMessagesStorage();
                int i11 = (int) this.e;
                long j10 = this.d;
                ArrayList arrayList = this.c;
                vpVar.getMessagesStorage().R1(j10, -j10, arrayList, messagesStorage.P0(j10, arrayList, false, true, 5, i11));
                break;
            case 1:
                vp vpVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j11 = this.d;
                i0.g3(new ok(vpVar2, arrayList2, j11, 1));
                hs messagesStorage2 = vpVar2.getMessagesStorage();
                long j12 = this.e;
                messagesStorage2.E(arrayList2, j12);
                vpVar2.getMessagesStorage().R1(j12, j11, arrayList2, vpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                break;
            default:
                x00 x00Var = vpVar.getMessagesController().r7;
                long j13 = this.d;
                long j14 = this.e;
                x00Var.B(0, j13, j14, false);
                vpVar.getMessagesStorage().h2(0, j13, j14, false);
                vpVar.getNotificationCenter().k(zs.Z4, Long.valueOf(j13), Long.valueOf(j14), 0, this.c);
                break;
        }
    }

    public /* synthetic */ pk(vp vpVar, long j10, ArrayList arrayList, long j11) {
        this.b = vpVar;
        this.d = j10;
        this.c = arrayList;
        this.e = j11;
    }

    public /* synthetic */ pk(vp vpVar, ArrayList arrayList, long j10, long j11) {
        this.b = vpVar;
        this.c = arrayList;
        this.d = j10;
        this.e = j11;
    }
}
