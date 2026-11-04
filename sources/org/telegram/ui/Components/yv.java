package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yv extends pu {
    public final /* synthetic */ TLRPC.StickerSet O1;
    public final /* synthetic */ ey P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(ey eyVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(d2Var, context, e6Var, arrayList);
        this.P1 = eyVar;
        this.O1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.pu
    public final void K0(boolean z10) {
        ey eyVar = this.P1;
        ArrayList arrayList = eyVar.q1;
        TLRPC.StickerSet stickerSet = this.O1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        eyVar.T();
    }

    @Override // org.telegram.ui.Components.pu, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        this.P1.x2 = false;
        super.dismiss();
    }
}
