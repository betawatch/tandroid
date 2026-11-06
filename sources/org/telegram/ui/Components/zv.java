package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zv extends qu {
    public final /* synthetic */ TLRPC.StickerSet N1;
    public final /* synthetic */ gy O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(gy gyVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(f2Var, context, f6Var, arrayList);
        this.O1 = gyVar;
        this.N1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.qu
    public final void K0(boolean z9) {
        gy gyVar = this.O1;
        ArrayList arrayList = gyVar.p1;
        TLRPC.StickerSet stickerSet = this.N1;
        if (!z9) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        gyVar.T();
    }

    @Override // org.telegram.ui.Components.qu, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        this.O1.w2 = false;
        super.dismiss();
    }
}
