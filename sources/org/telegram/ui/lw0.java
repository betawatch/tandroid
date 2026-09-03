package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lw0 extends w61 {
    public final /* synthetic */ eh.w a2;
    public final /* synthetic */ n61[] b2;
    public final /* synthetic */ PremiumPreviewFragment c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, eh.w wVar, n61[] n61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.c2 = premiumPreviewFragment;
        this.a2 = wVar;
        this.b2 = n61VarArr;
    }

    @Override // org.telegram.ui.w61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.w61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(l10, num);
        n61 n61Var = this.b2[0];
        if (n61Var != null) {
            this.c2.p0 = null;
            n61Var.dismiss();
        }
    }
}
