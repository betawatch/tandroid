package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kx extends aw {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ tz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(tz tzVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, g6Var, arrayList);
        this.X = tzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.aw, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        this.X.w2 = false;
        super.dismiss();
    }

    @Override // org.telegram.ui.Components.aw
    public final void h0(boolean z10) {
        tz tzVar = this.X;
        ArrayList arrayList = tzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        tzVar.T();
    }
}
