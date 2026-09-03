package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k21 implements w9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public k21(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.w9
    public final void K(String str) {
        String b10 = ze.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new j21(0));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new xb(this.b, 4));
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ boolean a1(String str, o9 o9Var) {
        return false;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void onDismiss() {
    }
}
