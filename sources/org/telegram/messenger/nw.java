package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ zi r;
    public final /* synthetic */ int s;

    public /* synthetic */ nw(yy yyVar, ArrayList arrayList, int i3, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, zi ziVar, int i12, int i13) {
        this.a = i13;
        this.b = yyVar;
        this.c = arrayList;
        this.d = i3;
        this.e = i10;
        this.f = message;
        this.h = i11;
        this.n = message2;
        this.r = ziVar;
        this.s = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.getMessagesStorage().a.c(new nw(yyVar, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, 1));
                break;
            default:
                final yy yyVar2 = this.b;
                qr messagesStorage = yyVar2.getMessagesStorage();
                ArrayList arrayList = this.c;
                final int i3 = this.d;
                messagesStorage.j1(arrayList, true, false, false, 0, false, i3, 0L);
                final int i10 = this.e;
                final TLRPC.Message message = this.f;
                final int i11 = this.h;
                final TLRPC.Message message2 = this.n;
                final zi ziVar = this.r;
                final int i12 = this.s;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.bx
                    @Override // java.lang.Runnable
                    public final void run() {
                        yy yyVar3 = yy.this;
                        yyVar3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = i10;
                        arrayList2.add(Integer.valueOf(i13));
                        hp messagesController = yyVar3.getMessagesController();
                        TLRPC.Message message3 = message;
                        long j10 = message3.dialog_id;
                        int i14 = i3;
                        boolean z10 = true;
                        messagesController.b0(arrayList2, null, null, j10, false, i11, false, 0L, null, 0, i14 == 1, message2.id);
                        ArrayList arrayList3 = new ArrayList();
                        zi ziVar2 = ziVar;
                        arrayList3.add(new zi(ziVar2.I1, ziVar2.k, true, true));
                        yyVar3.getMessagesController().l5(i14, message3.dialog_id, arrayList3);
                        yyVar3.getMediaDataController().w0(message3.dialog_id);
                        yyVar3.d0(i13);
                        if (i12 == 0) {
                            z10 = false;
                        }
                        yyVar3.i0(i13, z10);
                    }
                });
                break;
        }
    }
}
