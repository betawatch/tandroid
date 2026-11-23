package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ek implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ np b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ ek(np npVar, long j3, long j10, ArrayList arrayList) {
        this.b = npVar;
        this.d = j3;
        this.e = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        np npVar = this.b;
        switch (i7) {
            case 0:
                ur messagesStorage = npVar.getMessagesStorage();
                int i10 = (int) this.e;
                long j3 = this.d;
                ArrayList arrayList = this.c;
                npVar.getMessagesStorage().R1(j3, -j3, arrayList, messagesStorage.P0(j3, arrayList, false, true, 5, i10));
                break;
            case 1:
                np npVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j10 = this.d;
                g0.g3(new dk(npVar2, arrayList2, j10, 1));
                ur messagesStorage2 = npVar2.getMessagesStorage();
                long j11 = this.e;
                messagesStorage2.E(arrayList2, j11);
                npVar2.getMessagesStorage().R1(j11, j10, arrayList2, npVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                break;
            default:
                f00 f00Var = npVar.getMessagesController().t7;
                long j12 = this.d;
                long j13 = this.e;
                f00Var.B(0, j12, j13, false);
                npVar.getMessagesStorage().h2(0, j12, j13, false);
                npVar.getNotificationCenter().k(ls.c5, Long.valueOf(j12), Long.valueOf(j13), 0, this.c);
                break;
        }
    }

    public /* synthetic */ ek(np npVar, long j3, ArrayList arrayList, long j10) {
        this.b = npVar;
        this.d = j3;
        this.c = arrayList;
        this.e = j10;
    }

    public /* synthetic */ ek(np npVar, ArrayList arrayList, long j3, long j10) {
        this.b = npVar;
        this.c = arrayList;
        this.d = j3;
        this.e = j10;
    }
}
