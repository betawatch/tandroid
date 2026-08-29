package fg;

import a9.s;
import eg.e1;
import org.telegram.messenger.x3;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                fy fyVar = new fy(x3.e(3, "onlySelect", "dialogsType", true));
                fyVar.y2 = new s(17, eVar, sb3);
                eVar.e.presentFragment(fyVar);
                ((e1) eVar).r.dismiss();
                break;
        }
    }
}
