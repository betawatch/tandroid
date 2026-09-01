package ig;

import hg.d1;
import org.telegram.messenger.y3;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
