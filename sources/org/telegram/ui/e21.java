package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e21 extends b61 {
    public final /* synthetic */ g21 Z1;
    public final /* synthetic */ s51[] a2;
    public final /* synthetic */ h21 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(h21 h21Var, h21 h21Var2, Activity activity, Integer num, g21 g21Var, s51[] s51VarArr) {
        super(h21Var2, activity, false, num, 2, null);
        this.b2 = h21Var;
        this.Z1 = g21Var;
        this.a2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i9;
        if (l10 == null) {
            return;
        }
        h21 h21Var = this.b2;
        i9 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        MediaDataController.getInstance(i9).setDoubleTapReaction("animated_" + l10);
        g21 g21Var = this.Z1;
        if (g21Var != null) {
            g21Var.a(true);
        }
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            h21Var.n = null;
            s51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.b61
    public final void r(k51 k51Var, hg.r0 r0Var) {
        int i9;
        h21 h21Var = this.b2;
        i9 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        MediaDataController.getInstance(i9).setDoubleTapReaction(r0Var.f);
        g21 g21Var = this.Z1;
        if (g21Var != null) {
            g21Var.a(true);
        }
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            h21Var.n = null;
            s51Var.dismiss();
        }
    }
}
