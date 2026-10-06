package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class gx extends wv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ nz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(nz nzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, d6Var, arrayList);
        this.X = nzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.wv
    public final void W(boolean z10) {
        nz nzVar = this.X;
        ArrayList arrayList = nzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        nzVar.R();
    }

    @Override // org.telegram.ui.Components.wv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
