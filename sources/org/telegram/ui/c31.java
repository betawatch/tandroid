package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class c31 extends c71 {
    public final /* synthetic */ e31 d2;
    public final /* synthetic */ t61[] e2;
    public final /* synthetic */ f31 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c31(f31 f31Var, f31 f31Var2, Activity activity, Integer num, e31 e31Var, t61[] t61VarArr) {
        super(f31Var2, activity, false, num, 2, null);
        this.f2 = f31Var;
        this.d2 = e31Var;
        this.e2 = t61VarArr;
    }

    @Override // org.telegram.ui.c71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        f31 f31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        e31 e31Var = this.d2;
        if (e31Var != null) {
            e31Var.a(true);
        }
        t61 t61Var = this.e2[0];
        if (t61Var != null) {
            f31Var.n = null;
            t61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.c71
    public final void r(l61 l61Var, zg.o0 o0Var) {
        int i10;
        f31 f31Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) f31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(o0Var.f);
        e31 e31Var = this.d2;
        if (e31Var != null) {
            e31Var.a(true);
        }
        t61 t61Var = this.e2[0];
        if (t61Var != null) {
            f31Var.n = null;
            t61Var.dismiss();
        }
    }
}
