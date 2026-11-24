// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class izb extends rzb {
    public final /* synthetic */ vm1 T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izb(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, vm1 vm1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = vm1Var;
    }

    @Override // rzb, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
