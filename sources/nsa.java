// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ y41[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ nsa(p pVar, y41[] y41VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = y41VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        y41[] y41VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(y41VarArr[0], ob6.a0(null, null, 2131749350, di0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                pVar.a(y41VarArr[0], ob6.a0(null, null, 2131749358, di0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
