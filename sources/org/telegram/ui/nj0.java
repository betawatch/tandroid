package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nj0 implements x9 {
    public final /* synthetic */ oj0 a;

    public nj0(oj0 oj0Var) {
        this.a = oj0Var;
    }

    @Override // org.telegram.ui.x9
    public final void H(String str) {
        int i10;
        String b10 = qf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new u90(4));
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
