// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ x51[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ lqa(p pVar, x51[] x51VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = x51VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        x51[] x51VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(x51VarArr[0], jb6.a0(null, null, 2131749353, cj0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                pVar.a(x51VarArr[0], jb6.a0(null, null, 2131749361, cj0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
