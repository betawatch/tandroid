package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nw0 extends f61 {
    public final /* synthetic */ bi.m5 e2;
    public final /* synthetic */ w51[] f2;
    public final /* synthetic */ PremiumPreviewFragment g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, bi.m5 m5Var, w51[] w51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, u6Var, i11);
        this.g2 = premiumPreviewFragment;
        this.e2 = m5Var;
        this.f2 = w51VarArr;
    }

    @Override // org.telegram.ui.f61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.f61
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.run(l4, num);
        w51 w51Var = this.f2[0];
        if (w51Var != null) {
            this.g2.v0 = null;
            w51Var.dismiss();
        }
    }
}
