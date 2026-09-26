package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m21 implements t9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public m21(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final void K(String str) {
        String b10 = nf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(29));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new t3(this.b, 21));
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
