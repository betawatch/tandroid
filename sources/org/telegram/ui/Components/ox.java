package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ox extends ew {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ wz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(wz wzVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(m2Var, context, c6Var, arrayList);
        this.X = wzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.ew
    public final void Y(boolean z10) {
        wz wzVar = this.X;
        ArrayList arrayList = wzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        wzVar.T();
    }

    @Override // org.telegram.ui.Components.ew, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
