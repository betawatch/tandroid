// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h3c extends r3c {
    public final /* synthetic */ Runnable T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3c(Activity activity, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, Runnable runnable) {
        super(activity, str, str2, charSequence, inputPeer, i, z, null);
        this.T1 = runnable;
    }

    @Override // r3c, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
