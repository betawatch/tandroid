package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ck0 implements u9 {
    public final /* synthetic */ dk0 a;

    public ck0(dk0 dk0Var) {
        this.a = dk0Var;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        int i10;
        String b10 = of.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(26));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(18));
        }
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String z0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
