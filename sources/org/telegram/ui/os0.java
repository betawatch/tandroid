package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class os0 extends s11 {
    public final /* synthetic */ bi.p5 e2;
    public final /* synthetic */ j11[] f2;
    public final /* synthetic */ PremiumPreviewFragment g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, bi.p5 p5Var, j11[] j11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, g6Var, i10);
        this.g2 = premiumPreviewFragment;
        this.e2 = p5Var;
        this.f2 = j11VarArr;
    }

    @Override // org.telegram.ui.s11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.s11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(l10, num);
        j11 j11Var = this.f2[0];
        if (j11Var != null) {
            this.g2.u0 = null;
            j11Var.dismiss();
        }
    }
}
