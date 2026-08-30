package hg;

import gg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                oy oyVar = new oy(y3.e(3, "onlySelect", "dialogsType", true));
                oyVar.z2 = new c1.b(17, eVar, sb2);
                eVar.e.presentFragment(oyVar);
                ((d1) eVar).r.dismiss();
                break;
        }
    }
}
