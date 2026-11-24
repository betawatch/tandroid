// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hzb extends rzb {
    public final /* synthetic */ Runnable T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzb(Activity activity, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, Runnable runnable) {
        super(activity, str, str2, charSequence, inputPeer, i, z, null);
        this.T1 = runnable;
    }

    @Override // rzb, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
