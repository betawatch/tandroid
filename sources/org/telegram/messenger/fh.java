package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ fh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        si siVar = this.b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.f1(this.c.id, false);
                break;
            default:
                siVar.g1(this.c.id, false);
                break;
        }
    }
}
