package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c31 implements y9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public c31(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.y9
    public final void K(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new b31(0));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new v3(this.b, 21));
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ boolean d1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void V0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.y9
    public final /* synthetic */ void onDismiss() {
    }
}
