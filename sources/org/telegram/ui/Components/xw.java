package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xw extends jv {
    public final /* synthetic */ TLRPC.StickerSet S;
    public final /* synthetic */ fz T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(fz fzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, c6Var, arrayList);
        this.T = fzVar;
        this.S = stickerSet;
    }

    @Override // org.telegram.ui.Components.jv
    public final void X(boolean z10) {
        fz fzVar = this.T;
        ArrayList arrayList = fzVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        fzVar.V();
    }

    @Override // org.telegram.ui.Components.jv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        this.T.s2 = false;
        super.dismiss();
    }
}
