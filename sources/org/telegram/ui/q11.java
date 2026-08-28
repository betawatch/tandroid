package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q11 implements r9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public q11(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public final void K(String str) {
        String b10 = ve.e.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new lj0(2));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new sb(this.b, 4));
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
