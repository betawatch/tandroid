package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jx extends wv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ rz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(rz rzVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(p2Var, context, f6Var, arrayList);
        this.X = rzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.wv
    public final void X(boolean z10) {
        rz rzVar = this.X;
        ArrayList arrayList = rzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        rzVar.V();
    }

    @Override // org.telegram.ui.Components.wv, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        this.X.w2 = false;
        super.dismiss();
    }
}
