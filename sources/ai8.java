// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ai8 extends tx9 {
    public final /* synthetic */ w77 f2;
    public final /* synthetic */ kx9[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai8(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i, wjb wjbVar, int i2, w77 w77Var, kx9[] kx9VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i, true, wjbVar, i2);
        this.h2 = premiumPreviewFragment;
        this.f2 = w77Var;
        this.g2 = kx9VarArr;
    }

    @Override // tx9
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l, num);
        kx9 kx9Var = this.g2[0];
        if (kx9Var != null) {
            this.h2.v0 = null;
            kx9Var.dismiss();
        }
    }
}
