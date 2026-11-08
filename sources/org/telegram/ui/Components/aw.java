package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class aw extends ru {
    public final /* synthetic */ TLRPC.StickerSet N1;
    public final /* synthetic */ hy O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(hy hyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, f6Var, arrayList);
        this.O1 = hyVar;
        this.N1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.ru
    public final void K0(boolean z9) {
        hy hyVar = this.O1;
        ArrayList arrayList = hyVar.p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (!z9) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        hyVar.T();
    }

    @Override // org.telegram.ui.Components.ru, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        this.O1.w2 = false;
        super.dismiss();
    }
}
