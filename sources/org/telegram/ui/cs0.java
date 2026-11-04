package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cs0 extends g11 {
    public final /* synthetic */ ai.q4 f2;
    public final /* synthetic */ x01[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, ai.q4 q4Var, x01[] x01VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i3, true, e6Var, i10);
        this.h2 = premiumPreviewFragment;
        this.f2 = q4Var;
        this.g2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l10, num);
        x01 x01Var = this.g2[0];
        if (x01Var != null) {
            this.h2.v0 = null;
            x01Var.dismiss();
        }
    }
}
