package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mj0 implements r9 {
    public final /* synthetic */ nj0 a;

    public mj0(nj0 nj0Var) {
        this.a = nj0Var;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public final void K(String str) {
        int i9;
        String b10 = ve.e.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(29));
        } else {
            i9 = ((org.telegram.ui.ActionBar.f3) this.a).currentAccount;
            MessagesController.getInstance(i9).getUserNameResolver().resolve(b10, new ih.e(11));
        }
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void onDismiss() {
    }
}
