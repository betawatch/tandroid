package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.messenger.ij d;
    public final /* synthetic */ org.telegram.ui.Cells.q1 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ yt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.a = i10;
        this.b = document;
        this.c = i7;
        this.d = ijVar;
        this.e = q1Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.e);
                org.telegram.messenger.w7.G(i7).W(document, this.f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f, 1, 1);
                break;
        }
    }
}
