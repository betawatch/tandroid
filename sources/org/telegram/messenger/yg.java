package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yg implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ yg(li liVar, TLRPC.StickerSet stickerSet, int i3) {
        this.a = i3;
        this.b = liVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        li liVar = this.b;
        liVar.getClass();
        switch (i3) {
            case 0:
                liVar.f1(this.c.id, false);
                break;
            default:
                liVar.g1(this.c.id, false);
                break;
        }
    }
}
