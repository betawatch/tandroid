package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ow implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ gj r;
    public final /* synthetic */ int s;

    public /* synthetic */ ow(az azVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, gj gjVar, int i12, int i13) {
        this.a = i13;
        this.b = azVar;
        this.c = arrayList;
        this.d = i7;
        this.e = i10;
        this.f = message;
        this.h = i11;
        this.n = message2;
        this.r = gjVar;
        this.s = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                az azVar = this.b;
                azVar.getMessagesStorage().a.c(new ow(azVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, 1));
                break;
            default:
                final az azVar2 = this.b;
                ur messagesStorage = azVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.e;
                final TLRPC.Message message = this.f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.n;
                final gj gjVar = this.r;
                final int i12 = this.s;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.cx
                    @Override // java.lang.Runnable
                    public final void run() {
                        az azVar3 = az.this;
                        azVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        np messagesController = azVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        boolean z10 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, i14 == 1, message2.id);
                        ArrayList arrayList3 = new ArrayList();
                        gj gjVar2 = gjVar;
                        arrayList3.add(new gj(gjVar2.K1, gjVar2.k, true, true));
                        azVar3.getMessagesController().x5(i14, message3.dialog_id, arrayList3);
                        azVar3.getMediaDataController().y0(message3.dialog_id);
                        azVar3.d0(i13);
                        if (i12 == 0) {
                            z10 = false;
                        }
                        azVar3.i0(i13, z10);
                    }
                });
                break;
        }
    }
}
