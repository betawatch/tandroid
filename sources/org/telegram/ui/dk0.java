package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class dk0 implements t9 {
    public final /* synthetic */ ek0 a;

    public dk0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.t9
    public final void K(String str) {
        int i10;
        String b10 = of.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(25));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new bi.f(27));
        }
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String K0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ boolean f1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
