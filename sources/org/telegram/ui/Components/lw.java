package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class lw extends bv {
    public final /* synthetic */ TLRPC.StickerSet R1;
    public final /* synthetic */ ry S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(ry ryVar, org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(h2Var, context, i6Var, arrayList);
        this.S1 = ryVar;
        this.R1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.bv
    public final void L0(boolean z10) {
        ry ryVar = this.S1;
        ArrayList arrayList = ryVar.q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        ryVar.U();
    }

    @Override // org.telegram.ui.Components.bv, org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        this.S1.x2 = false;
        super.dismiss();
    }
}
