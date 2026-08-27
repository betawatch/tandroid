package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nj0 implements s9 {
    public final /* synthetic */ oj0 a;

    public nj0(oj0 oj0Var) {
        this.a = oj0Var;
    }

    @Override // org.telegram.ui.s9
    public final void C(String str) {
        int i10;
        String b10 = we.e.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(28));
        } else {
            i10 = ((org.telegram.ui.ActionBar.e3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new j4.w0(11));
        }
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.s9
    public final /* synthetic */ void onDismiss() {
    }
}
