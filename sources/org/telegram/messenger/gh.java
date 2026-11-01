package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ gh(vi viVar, TLRPC.StickerSet stickerSet, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        vi viVar = this.b;
        viVar.getClass();
        switch (i10) {
            case 0:
                viVar.f1(this.c.id, false);
                break;
            default:
                viVar.g1(this.c.id, false);
                break;
        }
    }
}
