package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ex extends tv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ lz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(lz lzVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, d6Var, arrayList);
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

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
