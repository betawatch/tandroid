package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class nj0 implements x9 {
    public final /* synthetic */ oj0 a;

    public nj0(oj0 oj0Var) {
        this.a = oj0Var;
    }

    @Override // org.telegram.ui.x9
    public final void E(String str) {
        int i10;
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ff0(1));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ci.e(18));
        }
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }
}
