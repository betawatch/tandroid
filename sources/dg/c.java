package dg;

import ag.h0;
import cg.f1;
import org.telegram.messenger.y1;
import org.telegram.ui.gy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i10) {
        this.a = i10;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                gy gyVar = new gy(y1.e(3, "onlySelect", "dialogsType", true));
                gyVar.y2 = new h0(15, eVar, sb3);
                eVar.e.presentFragment(gyVar);
                ((f1) eVar).r.dismiss();
                break;
        }
    }
}
