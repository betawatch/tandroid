package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zv extends qu {
    public final /* synthetic */ TLRPC.StickerSet Q1;
    public final /* synthetic */ gy R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(gy gyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, h6Var, arrayList);
        this.R1 = gyVar;
        this.Q1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.qu
    public final void K0(boolean z9) {
        gy gyVar = this.R1;
        ArrayList arrayList = gyVar.p1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (!z9) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        gyVar.T();
    }

    @Override // org.telegram.ui.Components.qu, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
