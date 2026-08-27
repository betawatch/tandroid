package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qw extends cv {
    public final /* synthetic */ TLRPC.StickerSet S;
    public final /* synthetic */ yy T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(yy yyVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, c6Var, arrayList);
        this.T = yyVar;
        this.S = stickerSet;
    }

    @Override // org.telegram.ui.Components.cv
    public final void X(boolean z10) {
        yy yyVar = this.T;
        ArrayList arrayList = yyVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        yyVar.V();
    }

    @Override // org.telegram.ui.Components.cv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.T.s2 = false;
        super.dismiss();
    }
}
