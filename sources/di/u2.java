package di;

import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.h0 b;
    public final /* synthetic */ org.telegram.ui.Components.ec[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ u2(bi.h0 h0Var, org.telegram.ui.Components.ec[] ecVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.a = i7;
        this.b = h0Var;
        this.c = ecVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.ec[] ecVarArr = this.c;
        bi.h0 h0Var = this.b;
        switch (i7) {
            case 0:
                h0Var.a(ecVarArr[0], hd.a0(null, null, 2131749579, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                h0Var.a(ecVarArr[0], hd.a0(null, null, 2131749587, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
