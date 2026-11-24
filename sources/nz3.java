// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nz3 extends qx3 {
    public final /* synthetic */ TLRPC.StickerSet Q1;
    public final /* synthetic */ t14 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz3(t14 t14Var, d dVar, Context context, wjb wjbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(dVar, context, wjbVar, arrayList);
        this.R1 = t14Var;
        this.Q1 = stickerSet;
    }

    @Override // qx3
    public final void F0(boolean z) {
        t14 t14Var = this.R1;
        ArrayList arrayList = t14Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (!z) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        t14Var.U();
    }

    @Override // qx3, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
