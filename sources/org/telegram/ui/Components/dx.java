package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dx extends tv {
    public final /* synthetic */ TLRPC.StickerSet W;
    public final /* synthetic */ kz X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(kz kzVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(n2Var, context, f6Var, arrayList);
        this.X = kzVar;
        this.W = stickerSet;
    }

    @Override // org.telegram.ui.Components.tv
    public final void X(boolean z10) {
        kz kzVar = this.X;
        ArrayList arrayList = kzVar.p1;
        TLRPC.StickerSet stickerSet = this.W;
        if (!z10) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        kzVar.T();
    }

    @Override // org.telegram.ui.Components.tv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        this.X.v2 = false;
        super.dismiss();
    }
}
