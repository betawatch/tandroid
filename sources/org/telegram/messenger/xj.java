package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ hp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ xj(hp hpVar, long j10, long j11, ArrayList arrayList) {
        this.b = hpVar;
        this.d = j10;
        this.e = j11;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                qr messagesStorage = hpVar.getMessagesStorage();
                int i10 = (int) this.e;
                long j10 = this.d;
                ArrayList arrayList = this.c;
                hpVar.getMessagesStorage().R1(j10, -j10, arrayList, messagesStorage.P0(j10, arrayList, false, true, 5, i10));
                break;
            case 1:
                hp hpVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j11 = this.d;
                g0.h3(new wj(hpVar2, arrayList2, j11, 1));
                qr messagesStorage2 = hpVar2.getMessagesStorage();
                long j12 = this.e;
                messagesStorage2.E(arrayList2, j12);
                hpVar2.getMessagesStorage().R1(j12, j11, arrayList2, hpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                break;
            default:
                c00 c00Var = hpVar.getMessagesController().q7;
                long j13 = this.d;
                long j14 = this.e;
                c00Var.B(0, j13, j14, false);
                hpVar.getMessagesStorage().h2(0, j13, j14, false);
                hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(j13), Long.valueOf(j14), 0, this.c);
                break;
        }
    }

    public /* synthetic */ xj(hp hpVar, long j10, ArrayList arrayList, long j11) {
        this.b = hpVar;
        this.d = j10;
        this.c = arrayList;
        this.e = j11;
    }

    public /* synthetic */ xj(hp hpVar, ArrayList arrayList, long j10, long j11) {
        this.b = hpVar;
        this.c = arrayList;
        this.d = j10;
        this.e = j11;
    }
}
