package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bx0 extends i71 {
    public final /* synthetic */ ai.m0 d2;
    public final /* synthetic */ z61[] e2;
    public final /* synthetic */ PremiumPreviewFragment f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, ai.m0 m0Var, z61[] z61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f2 = premiumPreviewFragment;
        this.d2 = m0Var;
        this.e2 = z61VarArr;
    }

    @Override // org.telegram.ui.i71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.i71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(l4, num);
        z61 z61Var = this.e2[0];
        if (z61Var != null) {
            this.f2.s0 = null;
            z61Var.dismiss();
        }
    }
}
