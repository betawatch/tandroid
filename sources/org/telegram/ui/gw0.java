package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gw0 extends r61 {
    public final /* synthetic */ eh.w a2;
    public final /* synthetic */ i61[] b2;
    public final /* synthetic */ PremiumPreviewFragment c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, eh.w wVar, i61[] i61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, g6Var, i11);
        this.c2 = premiumPreviewFragment;
        this.a2 = wVar;
        this.b2 = i61VarArr;
    }

    @Override // org.telegram.ui.r61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.a2.run(l10, num);
        i61 i61Var = this.b2[0];
        if (i61Var != null) {
            this.c2.p0 = null;
            i61Var.dismiss();
        }
    }
}
