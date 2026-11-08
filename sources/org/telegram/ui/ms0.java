package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ms0 extends q11 {
    public final /* synthetic */ bi.p5 e2;
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ PremiumPreviewFragment g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, bi.p5 p5Var, h11[] h11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, f6Var, i10);
        this.g2 = premiumPreviewFragment;
        this.e2 = p5Var;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(l10, num);
        h11 h11Var = this.f2[0];
        if (h11Var != null) {
            this.g2.u0 = null;
            h11Var.dismiss();
        }
    }
}
