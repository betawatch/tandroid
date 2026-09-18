package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dk0 implements v9 {
    public final /* synthetic */ ek0 a;

    public dk0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(24));
        } else {
            i10 = ((org.telegram.ui.ActionBar.g3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(27));
        }
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ boolean e1(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void onDismiss() {
    }
}
