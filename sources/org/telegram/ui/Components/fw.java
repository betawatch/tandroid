package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fw extends wu {
    public final /* synthetic */ TLRPC.StickerSet R1;
    public final /* synthetic */ ly S1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(ly lyVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(e2Var, context, e6Var, arrayList);
        this.S1 = lyVar;
        this.R1 = stickerSet;
    }

    @Override // org.telegram.ui.Components.wu
    public final void K0(boolean z10) {
        ly lyVar = this.S1;
        ArrayList arrayList = lyVar.q1;
        TLRPC.StickerSet stickerSet = this.R1;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        lyVar.U();
    }

    @Override // org.telegram.ui.Components.wu, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        this.S1.x2 = false;
        super.dismiss();
    }
}
