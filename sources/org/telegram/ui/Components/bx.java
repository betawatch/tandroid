package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bx extends mv {
    public final /* synthetic */ TLRPC.StickerSet T;
    public final /* synthetic */ kz U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(kz kzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, f6Var, arrayList);
        this.U = kzVar;
        this.T = stickerSet;
    }

    @Override // org.telegram.ui.Components.mv
    public final void X(boolean z4) {
        kz kzVar = this.U;
        ArrayList arrayList = kzVar.m1;
        TLRPC.StickerSet stickerSet = this.T;
        if (!z4) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        kzVar.V();
    }

    @Override // org.telegram.ui.Components.mv, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        this.U.t2 = false;
        super.dismiss();
    }
}
