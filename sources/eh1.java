// default package

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class eh1 extends n1a {
    public final /* synthetic */ zg1 f2;
    public final /* synthetic */ d1a[] g2;
    public final /* synthetic */ wh1 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(wh1 wh1Var, wh1 wh1Var2, Activity activity, Integer num, int i, vnb vnbVar, int i2, int i3, zg1 zg1Var, d1a[] d1aVarArr) {
        super(wh1Var2, activity, true, num, i, true, vnbVar, i2, i3);
        this.h2 = wh1Var;
        this.f2 = zg1Var;
        this.g2 = d1aVarArr;
    }

    @Override // n1a
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // n1a
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l == null ? 0L : l.longValue()), num, tL_starGiftUnique);
        d1a d1aVar = this.g2[0];
        if (d1aVar != null) {
            this.h2.R = null;
            d1aVar.dismiss();
        }
    }
}
