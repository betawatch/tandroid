package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gk0 implements y9 {
    public final /* synthetic */ hk0 a;

    public gk0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.y9
    public final void K(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(27));
        } else {
            i10 = ((org.telegram.ui.ActionBar.e3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new bi.f(18));
        }
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void onDismiss() {
    }
}
