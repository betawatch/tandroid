package ig;

import hg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                py pyVar = new py(y3.e(3, "onlySelect", "dialogsType", true));
                pyVar.z2 = new c1.b(17, eVar, sb2);
                eVar.e.presentFragment(pyVar);
                ((d1) eVar).r.dismiss();
                break;
        }
    }
}
