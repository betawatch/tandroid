// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i04 extends ly3 {
    public final /* synthetic */ TLRPC.StickerSet Q1;
    public final /* synthetic */ o24 R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i04(o24 o24Var, e eVar, Context context, vnb vnbVar, ArrayList arrayList, TLRPC.StickerSet stickerSet) {
        super(eVar, context, vnbVar, arrayList);
        this.R1 = o24Var;
        this.Q1 = stickerSet;
    }

    @Override // ly3
    public final void G0(boolean z) {
        o24 o24Var = this.R1;
        ArrayList arrayList = o24Var.q1;
        TLRPC.StickerSet stickerSet = this.Q1;
        if (!z) {
            arrayList.remove(Long.valueOf(stickerSet.id));
        } else if (!arrayList.contains(Long.valueOf(stickerSet.id))) {
            arrayList.add(Long.valueOf(stickerSet.id));
        }
        o24Var.T();
    }

    @Override // ly3, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        this.R1.w2 = false;
        super.dismiss();
    }
}
