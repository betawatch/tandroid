package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nw extends cv {
    public final /* synthetic */ TLRPC.StickerSet N1;
    public final /* synthetic */ vy O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(vy vyVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(k2Var, context, p6Var, arrayList);
        this.O1 = vyVar;
        this.N1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.cv
    public final void K0(boolean z10) {
        vy vyVar = this.O1;
        ArrayList arrayList = vyVar.p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        vyVar.U();
    }

    @Override // org.telegram.ui.Components.cv, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        this.O1.w2 = false;
        super.dismiss();
    }
}
