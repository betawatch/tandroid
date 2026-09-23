package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dx extends tv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ lz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(lz lzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, d6Var, arrayList);
        this.X = lzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.tv
    public final void X(boolean z10) {
        lz lzVar = this.X;
        ArrayList arrayList = lzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        lzVar.T();
    }

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
