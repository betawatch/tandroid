package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class fx extends vv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ mz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(mz mzVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, d6Var, arrayList);
        this.X = mzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.vv
    public final void X(boolean z10) {
        mz mzVar = this.X;
        ArrayList arrayList = mzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        mzVar.T();
    }

    @Override // org.telegram.ui.Components.vv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
