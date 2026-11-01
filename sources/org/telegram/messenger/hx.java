package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ kj r;
    public final /* synthetic */ int s;

    public /* synthetic */ hx(rz rzVar, ArrayList arrayList, int i10, int i11, TLRPC.Message message, int i12, TLRPC.Message message2, kj kjVar, int i13, int i14) {
        this.a = i14;
        this.b = rzVar;
        this.c = arrayList;
        this.d = i10;
        this.e = i11;
        this.f = message;
        this.h = i12;
        this.n = message2;
        this.r = kjVar;
        this.s = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rz rzVar = this.b;
                rzVar.getMessagesStorage().a.c(new hx(rzVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, 1));
                break;
            default:
                final rz rzVar2 = this.b;
                is messagesStorage = rzVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                final int i10 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i10, 0L);
                final int i11 = this.e;
                final TLRPC.Message message = this.f;
                final int i12 = this.h;
                final TLRPC.Message message2 = this.n;
                final kj kjVar = this.r;
                final int i13 = this.s;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.vx
                    @Override // java.lang.Runnable
                    public final void run() {
                        rz rzVar3 = rz.this;
                        rzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = i11;
                        arrayList2.add(Integer.valueOf(i14));
                        wp messagesController = rzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i15 = i10;
                        boolean z10 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i12, false, 0L, null, 0, i15 == 1, message2.id);
                        ArrayList arrayList3 = new ArrayList();
                        kj kjVar2 = kjVar;
                        arrayList3.add(new kj(kjVar2.I1, kjVar2.k, true, true));
                        rzVar3.getMessagesController().i5(i15, message3.dialog_id, arrayList3);
                        rzVar3.getMediaDataController().w0(message3.dialog_id);
                        rzVar3.d0(i14);
                        if (i13 == 0) {
                            z10 = false;
                        }
                        rzVar3.i0(i14, z10);
                    }
                });
                break;
        }
    }
}
