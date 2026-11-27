// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i3c extends r3c {
    public final /* synthetic */ gn1 T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3c(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, gn1 gn1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = gn1Var;
    }

    @Override // r3c, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
