package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qw extends dv {
    public final /* synthetic */ TLRPC.StickerSet S;
    public final /* synthetic */ wy T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(wy wyVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(o2Var, context, b6Var, arrayList);
        this.T = wyVar;
        this.S = stickerSet;
    }

    @Override // org.telegram.ui.Components.dv
    public final void W(boolean z10) {
        wy wyVar = this.T;
        ArrayList arrayList = wyVar.l1;
        TLRPC.StickerSet stickerSet = this.S;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        wyVar.U();
    }

    @Override // org.telegram.ui.Components.dv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        this.T.s2 = false;
        super.dismiss();
    }
}
