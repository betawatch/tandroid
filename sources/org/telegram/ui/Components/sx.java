package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sx extends iw {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ a00 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(a00 a00Var, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, e6Var, arrayList);
        this.X = a00Var;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.iw
    public final void Y(boolean z10) {
        a00 a00Var = this.X;
        ArrayList arrayList = a00Var.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        a00Var.T();
    }

    @Override // org.telegram.ui.Components.iw, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
