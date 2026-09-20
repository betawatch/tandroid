package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ek0 implements u9 {
    public final /* synthetic */ fk0 a;

    public ek0(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        int i10;
        String b10 = nf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(26));
        } else {
            i10 = ((org.telegram.ui.ActionBar.f3) this.a).currentAccount;
            MessagesController.getInstance(i10).getUserNameResolver().resolve(b10, new ai.i(27));
        }
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
