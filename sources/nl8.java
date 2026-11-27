// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nl8 extends n1a {
    public final /* synthetic */ ia7 f2;
    public final /* synthetic */ d1a[] g2;
    public final /* synthetic */ PremiumPreviewFragment h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl8(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i, vnb vnbVar, int i2, ia7 ia7Var, d1a[] d1aVarArr) {
        super(premiumPreviewFragment2, activity, true, num, i, true, vnbVar, i2);
        this.h2 = premiumPreviewFragment;
        this.f2 = ia7Var;
        this.g2 = d1aVarArr;
    }

    @Override // n1a
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(l, num);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            this.h2.v0 = null;
            d1aVar.dismiss();
        }
    }
}
