package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nw extends ev {
    public final /* synthetic */ TLRPC.StickerSet R1;
    public final /* synthetic */ ty S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ty tyVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(g2Var, context, h6Var, arrayList);
        this.S1 = tyVar;
        this.R1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.ev
    public final void L0(boolean z10) {
        ty tyVar = this.S1;
        ArrayList arrayList = tyVar.q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        tyVar.U();
    }

    @Override // org.telegram.ui.Components.ev, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        this.S1.x2 = false;
        super.dismiss();
    }
}
