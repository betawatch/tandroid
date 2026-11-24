// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class loa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ q41[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ loa(p pVar, q41[] q41VarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = q41VarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        q41[] q41VarArr = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.a(q41VarArr[0], k96.a0(null, null, 2131749404, ci0.h().e(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                pVar.a(q41VarArr[0], k96.a0(null, null, 2131749412, ci0.h().e(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
