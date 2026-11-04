package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.zi d;
    public final /* synthetic */ org.telegram.ui.Cells.q1 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ xt0(TLRPC.Document document, int i3, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.a = i10;
        this.b = document;
        this.c = i3;
        this.d = ziVar;
        this.e = q1Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.b;
                String r5 = org.telegram.messenger.w7.r(null, document);
                int i3 = this.c;
                org.telegram.messenger.z5.q(i3).a(r5, this.d, this.e);
                org.telegram.messenger.w7.G(i3).X(document, this.f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.b;
                String r9 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.c;
                org.telegram.messenger.z5.q(i10).a(r9, this.d, this.e);
                org.telegram.messenger.w7.G(i10).X(document2, this.f, 1, 1);
                break;
        }
    }
}
