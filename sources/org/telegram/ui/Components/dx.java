package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class dx extends sv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ kz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(kz kzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, e6Var, arrayList);
        this.X = kzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.sv
    public final void X(boolean z10) {
        kz kzVar = this.X;
        ArrayList arrayList = kzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        kzVar.T();
    }

    @Override // org.telegram.ui.Components.sv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
