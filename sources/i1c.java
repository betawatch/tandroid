// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i1c extends s1c {
    public final /* synthetic */ Runnable T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1c(Activity activity, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, Runnable runnable) {
        super(activity, str, str2, charSequence, inputPeer, i, z, null);
        this.T1 = runnable;
    }

    @Override // s1c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
