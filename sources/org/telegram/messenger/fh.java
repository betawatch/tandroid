package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ fh(ui uiVar, TLRPC.StickerSet stickerSet, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        ui uiVar = this.b;
        uiVar.getClass();
        switch (i10) {
            case 0:
                uiVar.f1(this.c.id, false);
                break;
            default:
                uiVar.g1(this.c.id, false);
                break;
        }
    }
}
