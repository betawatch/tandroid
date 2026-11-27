// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
