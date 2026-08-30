package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d21 implements u9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public d21(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String G0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void K(String str) {
        String b10 = af.g.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new c21(0));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new vb(this.b, 4));
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ boolean f1(String str, m9 m9Var) {
        return false;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
