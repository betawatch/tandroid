package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ mp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ dk(mp mpVar, long j3, long j10, ArrayList arrayList) {
        this.b = mpVar;
        this.d = j3;
        this.e = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                tr messagesStorage = mpVar.getMessagesStorage();
                int i10 = (int) this.e;
                long j3 = this.d;
                ArrayList arrayList = this.c;
                mpVar.getMessagesStorage().R1(j3, -j3, arrayList, messagesStorage.P0(j3, arrayList, false, true, 5, i10));
                break;
            case 1:
                mp mpVar2 = this.b;
                ArrayList arrayList2 = this.c;
                long j10 = this.d;
                g0.g3(new ck(mpVar2, arrayList2, j10, 1));
                tr messagesStorage2 = mpVar2.getMessagesStorage();
                long j11 = this.e;
                messagesStorage2.E(arrayList2, j11);
                mpVar2.getMessagesStorage().R1(j11, j10, arrayList2, mpVar2.getMessagesStorage().P0(j11, arrayList2, false, true, 0, 0));
                break;
            default:
                e00 e00Var = mpVar.getMessagesController().t7;
                long j12 = this.d;
                long j13 = this.e;
                e00Var.B(0, j12, j13, false);
                mpVar.getMessagesStorage().h2(0, j12, j13, false);
                mpVar.getNotificationCenter().k(ks.c5, Long.valueOf(j12), Long.valueOf(j13), 0, this.c);
                break;
        }
    }

    public /* synthetic */ dk(mp mpVar, long j3, ArrayList arrayList, long j10) {
        this.b = mpVar;
        this.d = j3;
        this.c = arrayList;
        this.e = j10;
    }

    public /* synthetic */ dk(mp mpVar, ArrayList arrayList, long j3, long j10) {
        this.b = mpVar;
        this.c = arrayList;
        this.d = j3;
        this.e = j10;
    }
}
