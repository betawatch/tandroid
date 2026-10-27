package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jx extends aw {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ sz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(sz szVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(r2Var, context, u6Var, arrayList);
        this.X = szVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        this.X.w2 = false;
        super.dismiss();
    }

    @Override // org.telegram.ui.Components.aw
    public final void h0(boolean z10) {
        sz szVar = this.X;
        ArrayList arrayList = szVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        szVar.U();
    }
}
