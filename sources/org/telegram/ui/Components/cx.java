package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cx extends sv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ kz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(kz kzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, f6Var, arrayList);
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

    @Override // org.telegram.ui.Components.sv, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
