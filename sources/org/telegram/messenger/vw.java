package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class vw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ ij r;
    public final /* synthetic */ int s;

    public /* synthetic */ vw(gz gzVar, ArrayList arrayList, int i7, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, ij ijVar, int i12, int i13) {
        this.a = i13;
        this.b = gzVar;
        this.c = arrayList;
        this.d = i7;
        this.e = i10;
        this.f = message;
        this.h = i11;
        this.n = message2;
        this.r = ijVar;
        this.s = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz gzVar = this.b;
                gzVar.getMessagesStorage().a.c(new vw(gzVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, 1));
                break;
            default:
                final gz gzVar2 = this.b;
                yr messagesStorage = gzVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                final int i7 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i7, 0L);
                final int i10 = this.e;
                final TLRPC.Message message = this.f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.n;
                final ij ijVar = this.r;
                final int i12 = this.s;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.jx
                    @Override // java.lang.Runnable
                    public final void run() {
                        gz gzVar3 = gz.this;
                        gzVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        qp messagesController = gzVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j3 = message3.dialog_id;
                        int i14 = i7;
                        boolean z9 = true;
                        messagesController.b0(arrayList2, null, null, j3, false, i11, false, 0L, null, 0, i14 == 1, message2.id);
                        ArrayList arrayList3 = new ArrayList();
                        ij ijVar2 = ijVar;
                        arrayList3.add(new ij(ijVar2.I1, ijVar2.k, true, true));
                        gzVar3.getMessagesController().l5(i14, message3.dialog_id, arrayList3);
                        gzVar3.getMediaDataController().w0(message3.dialog_id);
                        gzVar3.d0(i13);
                        if (i12 == 0) {
                            z9 = false;
                        }
                        gzVar3.i0(i13, z9);
                    }
                });
                break;
        }
    }
}
