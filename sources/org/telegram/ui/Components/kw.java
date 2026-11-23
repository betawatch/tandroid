package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kw extends bv {
    public final /* synthetic */ TLRPC.StickerSet R1;
    public final /* synthetic */ qy S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(qy qyVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(g2Var, context, i6Var, arrayList);
        this.S1 = qyVar;
        this.R1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.bv
    public final void L0(boolean z10) {
        qy qyVar = this.S1;
        ArrayList arrayList = qyVar.q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        qyVar.U();
    }

    @Override // org.telegram.ui.Components.bv, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        this.S1.x2 = false;
        super.dismiss();
    }
}
