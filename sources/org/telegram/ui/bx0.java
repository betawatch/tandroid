package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bx0 extends l71 {
    public final /* synthetic */ bi.k6 d2;
    public final /* synthetic */ c71[] e2;
    public final /* synthetic */ PremiumPreviewFragment f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, bi.k6 k6Var, c71[] c71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f2 = premiumPreviewFragment;
        this.d2 = k6Var;
        this.e2 = c71VarArr;
    }

    @Override // org.telegram.ui.l71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.l71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(l4, num);
        c71 c71Var = this.e2[0];
        if (c71Var != null) {
            this.f2.s0 = null;
            c71Var.dismiss();
        }
    }
}
