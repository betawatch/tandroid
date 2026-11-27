// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class jsc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new jsc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ksc kscVar = (ksc) view;
        wsc wscVar = kscVar.y0;
        if (wscVar != null) {
            wscVar.h.remove(kscVar);
        }
        ValueAnimator valueAnimator = kscVar.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kscVar.z0 = 1.0f;
        kscVar.E.setAlpha(1.0f);
        kscVar.x0 = (TL_wallet.nftItem) b8cVar.H;
        kscVar.y0 = (wsc) b8cVar.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = kscVar.x0.gift;
        kscVar.k(false, true, 0.0f);
        kscVar.i(savedStarGift, true, false);
        wsc wscVar2 = kscVar.y0;
        if (wscVar2 != null) {
            wscVar2.i(kscVar);
        }
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        ksc kscVar = new ksc(i, vnbVar, context);
        kscVar.z0 = 1.0f;
        kscVar.setStateListAnimator(null);
        kscVar.setWillNotDraw(false);
        return kscVar;
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return TextUtils.equals(((TL_wallet.nftItem) b8cVar.H).address, ((TL_wallet.nftItem) b8cVar2.H).address);
    }

    @Override // a8c
    public final boolean f() {
        return true;
    }
}
