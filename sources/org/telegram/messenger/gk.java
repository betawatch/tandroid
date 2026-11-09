package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ qp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ gk(qp qpVar, long j3, long j10, ArrayList arrayList) {
        this.b = qpVar;
        this.d = j3;
        this.e = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                yr messagesStorage = qpVar.getMessagesStorage();
                int i10 = (int) this.e;
                long j3 = this.d;
                ArrayList arrayList = this.c;
                qpVar.getMessagesStorage().R1(j3, -j3, arrayList, messagesStorage.P0(j3, arrayList, false, true, 5, i10));
                break;
            case 1:
                qp qpVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j10 = this.d;
                g0.h3(new fk(qpVar2, arrayList2, j10, 1));
                yr messagesStorage2 = qpVar2.getMessagesStorage();
                long j11 = this.e;
                messagesStorage2.E(arrayList2, j11);
                qpVar2.getMessagesStorage().R1(j11, j10, arrayList2, qpVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                break;
            default:
                k00 k00Var = qpVar.getMessagesController().q7;
                long j12 = this.d;
                long j13 = this.e;
                k00Var.B(0, j12, j13, false);
                qpVar.getMessagesStorage().h2(0, j12, j13, false);
                qpVar.getNotificationCenter().k(qs.Z4, Long.valueOf(j12), Long.valueOf(j13), 0, this.c);
                break;
        }
    }

    public /* synthetic */ gk(qp qpVar, long j3, ArrayList arrayList, long j10) {
        this.b = qpVar;
        this.d = j3;
        this.c = arrayList;
        this.e = j10;
    }

    public /* synthetic */ gk(qp qpVar, ArrayList arrayList, long j3, long j10) {
        this.b = qpVar;
        this.c = arrayList;
        this.d = j3;
        this.e = j10;
    }
}
