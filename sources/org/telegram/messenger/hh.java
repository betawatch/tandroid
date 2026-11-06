package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ hh(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = i7;
        this.b = uiVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        ui uiVar = this.b;
        uiVar.getClass();
        switch (i7) {
            case 0:
                uiVar.f1(this.c.id, false);
                break;
            default:
                uiVar.g1(this.c.id, false);
                break;
        }
    }
}
