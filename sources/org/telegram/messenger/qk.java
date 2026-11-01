package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class qk implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ wp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ qk(wp wpVar, long j10, long j11, ArrayList arrayList) {
        this.b = wpVar;
        this.d = j10;
        this.e = j11;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                is messagesStorage = wpVar.getMessagesStorage();
                int i11 = (int) this.e;
                long j10 = this.d;
                ArrayList arrayList = this.c;
                wpVar.getMessagesStorage().R1(j10, -j10, arrayList, messagesStorage.P0(j10, arrayList, false, true, 5, i11));
                break;
            case 1:
                wp wpVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j11 = this.d;
                i0.g3(new pk(wpVar2, arrayList2, j11, 1));
                is messagesStorage2 = wpVar2.getMessagesStorage();
                long j12 = this.e;
                messagesStorage2.E(arrayList2, j12);
                wpVar2.getMessagesStorage().R1(j12, j11, arrayList2, wpVar2.getMessagesStorage().P0(j12, arrayList2, false, true, 0, 0));
                break;
            default:
                y00 y00Var = wpVar.getMessagesController().r7;
                long j13 = this.d;
                long j14 = this.e;
                y00Var.B(0, j13, j14, false);
                wpVar.getMessagesStorage().h2(0, j13, j14, false);
                wpVar.getNotificationCenter().k(at.Z4, Long.valueOf(j13), Long.valueOf(j14), 0, this.c);
                break;
        }
    }

    public /* synthetic */ qk(wp wpVar, long j10, ArrayList arrayList, long j11) {
        this.b = wpVar;
        this.d = j10;
        this.c = arrayList;
        this.e = j11;
    }

    public /* synthetic */ qk(wp wpVar, ArrayList arrayList, long j10, long j11) {
        this.b = wpVar;
        this.c = arrayList;
        this.d = j10;
        this.e = j11;
    }
}
