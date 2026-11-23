package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ hh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        si siVar = this.b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.i1(this.c.id, false);
                break;
            default:
                siVar.j1(this.c.id, false);
                break;
        }
    }
}
