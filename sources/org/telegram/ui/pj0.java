package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pj0 implements x9 {
    public final /* synthetic */ qj0 a;

    public pj0(qj0 qj0Var) {
        this.a = qj0Var;
    }

    @Override // org.telegram.ui.x9
    public final void H(String str) {
        int i10;
        String b10 = qf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new w90(4));
        } else {
            i10 = ((org.telegram.ui.ActionBar.k3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new di.e(18));
        }
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String H0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ boolean d1(String str, p9 p9Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void R0(MrzRecognizer.Result result) {
    }
}
