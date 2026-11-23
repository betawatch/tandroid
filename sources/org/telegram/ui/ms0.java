package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ms0 extends q11 {
    public final /* synthetic */ bi.r6 f2;
    public final /* synthetic */ h11[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, bi.r6 r6Var, h11[] h11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, i6Var, i10);
        this.h2 = premiumPreviewFragment;
        this.f2 = r6Var;
        this.g2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l10, num);
        h11 h11Var = this.g2[0];
        if (h11Var != null) {
            this.h2.v0 = null;
            h11Var.dismiss();
        }
    }
}
