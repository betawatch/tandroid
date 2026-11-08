package bi;

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ org.telegram.ui.Components.jc[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ o3(t0 t0Var, org.telegram.ui.Components.jc[] jcVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i7) {
        this.a = i7;
        this.b = t0Var;
        this.c = jcVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        org.telegram.ui.Components.jc[] jcVarArr = this.c;
        t0 t0Var = this.b;
        switch (i7) {
            case 0:
                t0Var.a(jcVarArr[0], org.telegram.messenger.id.a0(null, null, 2131749580, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                t0Var.a(jcVarArr[0], org.telegram.messenger.id.a0(null, null, 2131749588, org.telegram.messenger.r1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
