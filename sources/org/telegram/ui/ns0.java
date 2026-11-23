package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ns0 extends s11 {
    public final /* synthetic */ bi.o6 f2;
    public final /* synthetic */ j11[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, bi.o6 o6Var, j11[] j11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, h6Var, i10);
        this.h2 = premiumPreviewFragment;
        this.f2 = o6Var;
        this.g2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l10, num);
        j11 j11Var = this.g2[0];
        if (j11Var != null) {
            this.h2.v0 = null;
            j11Var.dismiss();
        }
    }
}
