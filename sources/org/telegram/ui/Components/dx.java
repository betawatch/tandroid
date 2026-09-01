package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dx extends ov {
    public final /* synthetic */ TLRPC.StickerSet T;
    public final /* synthetic */ mz U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(mz mzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, g6Var, arrayList);
        this.U = mzVar;
        this.T = stickerSet;
    }

    @Override // org.telegram.ui.Components.ov
    public final void X(boolean z4) {
        mz mzVar = this.U;
        ArrayList arrayList = mzVar.m1;
        TLRPC.StickerSet stickerSet = this.T;
        if (!z4) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        mzVar.V();
    }

    @Override // org.telegram.ui.Components.ov, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        this.U.t2 = false;
        super.dismiss();
    }
}
