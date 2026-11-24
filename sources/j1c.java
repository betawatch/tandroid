// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j1c extends s1c {
    public final /* synthetic */ ho1 T1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1c(Activity activity, String str, String str2, TLRPC.InputPeer inputPeer, int i, TL_iv.RichMessage richMessage, ho1 ho1Var) {
        super(activity, str, str2, null, inputPeer, i, false, richMessage);
        this.T1 = ho1Var;
    }

    @Override // s1c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.T1.run();
    }
}
