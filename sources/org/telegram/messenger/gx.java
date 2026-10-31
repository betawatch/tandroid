package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ jj r;
    public final /* synthetic */ int s;

    public /* synthetic */ gx(qz qzVar, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, jj jjVar, int i13, int i14) {
        this.a = i14;
        this.b = qzVar;
        this.c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f = message;
        this.h = i12;
        this.n = message2;
        this.r = jjVar;
        this.s = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz qzVar = this.b;
                qzVar.getMessagesStorage().a.c(new gx(qzVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, 1));
                break;
            default:
                final qz qzVar2 = this.b;
                hs messagesStorage = qzVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                final int i10 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i10, 0L);
                final int i11 = this.e;
                final TLRPC.Message message = this.f;
                final int i12 = this.h;
                final TLRPC.Message message2 = this.n;
                final jj jjVar = this.r;
                final int i13 = this.s;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.ux
                    @Override // java.lang.Runnable
                    public final void run() {
                        qz qzVar3 = qz.this;
                        qzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = i11;
                        arrayList2.add(Integer.valueOf(i14));
                        vp messagesController = qzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i15 = i10;
                        boolean z10 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i12, false, 0L, null, 0, i15 == 1, message2.id);
                        ArrayList arrayList3 = new ArrayList();
                        jj jjVar2 = jjVar;
                        arrayList3.add(new jj(jjVar2.I1, jjVar2.k, true, true));
                        qzVar3.getMessagesController().i5(i15, message3.dialog_id, arrayList3);
                        qzVar3.getMediaDataController().w0(message3.dialog_id);
                        qzVar3.d0(i14);
                        if (i13 == 0) {
                            z10 = false;
                        }
                        qzVar3.i0(i14, z10);
                    }
                });
                break;
        }
    }
}
