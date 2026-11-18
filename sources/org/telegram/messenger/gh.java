package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ gh(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = i7;
        this.b = riVar;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        ri riVar = this.b;
        riVar.getClass();
        switch (i7) {
            case 0:
                riVar.i1(this.c.id, false);
                break;
            default:
                riVar.j1(this.c.id, false);
                break;
        }
    }
}
