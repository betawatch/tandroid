package hg;

import gg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                StringBuilder sb = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.b;
                sb.append(eVar.h);
                String sb2 = sb.toString();
                qy qyVar = new qy(y3.e(3, "onlySelect", "dialogsType", true));
                qyVar.z2 = new c1.b(17, eVar, sb2);
                eVar.e.presentFragment(qyVar);
                ((d1) eVar).r.dismiss();
                break;
        }
    }
}
