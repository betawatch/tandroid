package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.jj d;
    public final /* synthetic */ org.telegram.ui.Cells.q1 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ bv0(TLRPC.Document document, int i10, org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.a = i11;
        this.b = document;
        this.c = i10;
        this.d = jjVar;
        this.e = q1Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.b;
                String r10 = org.telegram.messenger.b8.r(null, document);
                int i10 = this.c;
                org.telegram.messenger.b6.q(i10).a(r10, this.d, this.e);
                org.telegram.messenger.b8.G(i10).X(document, this.f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.b;
                String r11 = org.telegram.messenger.b8.r(null, document2);
                int i11 = this.c;
                org.telegram.messenger.b6.q(i11).a(r11, this.d, this.e);
                org.telegram.messenger.b8.G(i11).X(document2, this.f, 1, 1);
                break;
        }
    }
}
