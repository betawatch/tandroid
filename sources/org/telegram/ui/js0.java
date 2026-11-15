package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class js0 extends n11 {
    public final /* synthetic */ bi.e4 f2;
    public final /* synthetic */ e11[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, bi.e4 e4Var, e11[] e11VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i7, true, e6Var, i10);
        this.h2 = premiumPreviewFragment;
        this.f2 = e4Var;
        this.g2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l10, num);
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            this.h2.v0 = null;
            e11Var.dismiss();
        }
    }
}
